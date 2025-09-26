import WebRobot.Cli.Sdk.Utils.Sha512Crypt;
import WebRobot.Cli.Sdk.model.*;
import WebRobot.Cli.Sdk.model.Get_dataset_input_fileResult;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DatasetTests extends  TestBase {

    @Test
    public void testGetDatasetInputPagination()
    {
        Get_dataset_input_file_paginationRequest inputPaginationRequest = new Get_dataset_input_file_paginationRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        inputPaginationRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        inputPaginationRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        inputPaginationRequest.setDatasetId("1e22080e-0c9f-411d-aa30-93d25ef99561");
        inputPaginationRequest.setLimit("10");
        inputPaginationRequest.setOffset("0");
        Get_dataset_input_file_paginationResult result = sdkClient.get_dataset_input_file_pagination(inputPaginationRequest);
        assertNotEquals("problem with list records", result.getListRecords().getRecords().size(),0);
    }

    @Test
    public void testGetDatasetInputFile() {

        Get_dataset_input_fileRequest inputFileRequest = new Get_dataset_input_fileRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        inputFileRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        inputFileRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        inputFileRequest.setDatasetId("1e22080e-0c9f-411d-aa30-93d25ef99561");
        Get_dataset_input_fileResult result = sdkClient.get_dataset_input_file(inputFileRequest);
        String url = result.getStringResult().getResult();


    }

    @Test
    public void testGetAllDatasetsVersions() {
        Get_dataset_versionsRequest get_dataset_versionsRequest = new Get_dataset_versionsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        get_dataset_versionsRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        get_dataset_versionsRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        get_dataset_versionsRequest.setDatasetId("1e22080e-0c9f-411d-aa30-93d25ef99561");
        Get_dataset_versionsResult allDatasetResult = sdkClient.get_dataset_versions(get_dataset_versionsRequest);
        assertNotEquals("bot list problems", allDatasetResult.getListDatasetVersions().getVersions().size(), 0);
    }


    @Test
    public void testGetDatasetVersion()
    {
        Get_dataset_versionRequest datasetVersionRequest = new Get_dataset_versionRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        datasetVersionRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        datasetVersionRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        datasetVersionRequest.setDatasetId("1e22080e-0c9f-411d-aa30-93d25ef99561");
        datasetVersionRequest.setVersion("0.3");

        TimePeriod timePeriod = new TimePeriod();
        timePeriod.setStartTimePeriod("01_01_1900_11_00_00");
        timePeriod.setEndTimePeriod("01_01_1900_13_00_00");
        datasetVersionRequest.setTimePeriod(timePeriod);

        Get_dataset_versionResult datasetVersionResult = sdkClient.get_dataset_version(datasetVersionRequest);
        assertEquals("problem with dataset", datasetVersionResult.getDatasetVersion().getDatasetId(),"bf9c64c5-0e32-494e-b264-5c8009a2ec01");
    }


    @Test
    public void testGetDataset()
    {
        Get_datasetRequest get_datasetRequest = new Get_datasetRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        get_datasetRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        get_datasetRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        get_datasetRequest.setDatasetId("b4ed4555-02d5-4d4b-b4b8-c40c51763852");
        Get_datasetResult datasetResult = sdkClient.get_dataset(get_datasetRequest);
        assertEquals("problem with dataset", datasetResult.getDataset().getId(),"b4ed4555-02d5-4d4b-b4b8-c40c51763852");
    }

    @Test
    public void testGetAllDatasets() {
        Get_all_datasetsRequest allDatasetsRequest = new Get_all_datasetsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());

        allDatasetsRequest.setProjectId("2db94a15-367b-4fb5-8db2-4c9dcfc4fbeb");
        allDatasetsRequest.setBotId("82146b49-e64c-46e6-8dfd-5c20cd05bda3");

        Get_all_datasetsResult allDatasetResult = sdkClient.get_all_datasets(allDatasetsRequest);
        assertEquals("bot list problems", allDatasetResult.getListDatasets().getDatasets().size(), 2);
    }

    @Test
    public void AddDataset() throws MalformedURLException, IOException
    {

        Upload_fileRequest uploadFileRequest = new Upload_fileRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        uploadFileRequest.setProjectId("2db94a15-367b-4fb5-8db2-4c9dcfc4fbeb");
        uploadFileRequest.setBotId("82146b49-e64c-46e6-8dfd-5c20cd05bda3");
        uploadFileRequest.setAttachmentName("testdataset");
        Upload_fileResult uploadFileResult =  sdkClient.upload_file(uploadFileRequest);
        String url = uploadFileResult.getStringResult().getResult();
        InputStream inputStream = new FileInputStream("TestDataset.csv");
        uploadFile(new URL(url),inputStream);

        Add_datasetRequest addDataset = new Add_datasetRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        addDataset.setProjectId("2db94a15-367b-4fb5-8db2-4c9dcfc4fbeb");
        addDataset.setBotId("82146b49-e64c-46e6-8dfd-5c20cd05bda3");
        Dataset dataset = new Dataset();
        dataset.setName("TestDataset");
        dataset.setHeaderline("cosa|dove");
        dataset.setVersion("0.1");
        dataset.setAttachmentName("testdataset");
        dataset.setComments("test dataset");


        addDataset.setDataset(dataset);
        Add_datasetResult datasetResult = sdkClient.add_dataset(addDataset);

        Get_all_datasetsRequest allDatasetsRequest = new Get_all_datasetsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());

        allDatasetsRequest.setProjectId("2db94a15-367b-4fb5-8db2-4c9dcfc4fbeb");
        allDatasetsRequest.setBotId("82146b49-e64c-46e6-8dfd-5c20cd05bda3");

        Get_all_datasetsResult allDatasetResult = sdkClient.get_all_datasets(allDatasetsRequest);
        assertEquals("dataset list problems", allDatasetResult.getListDatasets().getDatasets().size(),1);


    }
}


