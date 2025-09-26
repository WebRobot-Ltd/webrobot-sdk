import WebRobot.Cli.Sdk.model.*;
import WebRobot.Cli.Sdk.model.transform.Import_projectRequestProtocolMarshaller;
import com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl;
import com.amazonaws.protocol.json.JsonClientMetadata;
import WebRobot.Cli.Sdk.custom.AmazonHttpClientTest;
import org.junit.Test;

import java.net.URL;

public class PackageTest  extends  TestBase {

    @Test
    public void importAll()
    {
        Get_url_uploadRequest urlUploadRequest = new Get_url_uploadRequest();
        Get_url_uploadResult ulrUploadResult = sdkClient.get_url_upload(urlUploadRequest);
        try {
            this.uploadFile(new URL(ulrUploadResult.getStringResult().getResult()), this.getClass().getResourceAsStream("compress.zip"));
        }
        catch(Exception ignored) {
        }
        String urlUpload = ulrUploadResult.getStringResult().getResult();
        Import_allRequest import_allRequest = new Import_allRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;

        sdkClient.import_all(import_allRequest);
    }

    @Test
    public void exportAll()
    {
        Export_allRequest export_allRequest = new Export_allRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        Export_allResult result = sdkClient.export_all(export_allRequest);
        String url = result.getStringResult().getResult();
    }

    @Test
    public void importPackage()
    {

        Get_url_uploadRequest urlUploadRequest = new Get_url_uploadRequest();
        Get_url_uploadResult ulrUploadResult = sdkClient.get_url_upload(urlUploadRequest);
        try {
            this.uploadFile(new URL(ulrUploadResult.getStringResult().getResult()), this.getClass().getResourceAsStream("compress.zip"));
        }
        catch(Exception ignored) {
        }
        String urlUpload = ulrUploadResult.getStringResult().getResult();

        Import_projectRequest importProjectRequest = new Import_projectRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        importProjectRequest.setProjectId("1");
        sdkClient.import_project(importProjectRequest);


    }

    @Test
    public void exportPackage()
    {
        Export_projectRequest exportProjectRequest = new Export_projectRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        exportProjectRequest.setProjectId("e05214f5-4075-4cb2-8b24-1f0b95a245fa");
        Export_projectResult exportProjectResult = sdkClient.export_project(exportProjectRequest);
       String urlResult = exportProjectResult.getStringResult().getResult();


    }
}
