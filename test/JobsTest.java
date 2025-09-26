import WebRobot.Cli.Sdk.Utils.Sha512Crypt;
import WebRobot.Cli.Sdk.model.*;
import WebRobot.Cli.Sdk.model.Get_dataset_input_fileResult;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class JobsTest  extends  TestBase {

    @Test
    public void getAllJobs()
    {
        Get_all_jobsRequest getAllJobs = new Get_all_jobsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        getAllJobs.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        getAllJobs.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        getAllJobs.setDatasetId("ddfb7e65-a14b-4869-a5c2-d47b6e69d84b");
        Get_all_jobsResult allJobs = sdkClient.get_all_jobs(getAllJobs);

    }


    @Test
    public void deleteJob()
    {

        Delete_jobRequest deleteJobRequest = new Delete_jobRequest();
        deleteJobRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        deleteJobRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        deleteJobRequest.setDatasetId("ddfb7e65-a14b-4869-a5c2-d47b6e69d84b");
        deleteJobRequest.setJobId("d5630fd4-f76f-468a-bbe8-2858d0dfd8d8");
        sdkClient.delete_job(deleteJobRequest);
    }



    @Test
    public void getListTaskInterval()
    {
        Get_list_versions_job_intervalRequest getListVersionJobRequest = new Get_list_versions_job_intervalRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        getListVersionJobRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        getListVersionJobRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        getListVersionJobRequest.setDatasetId("ddfb7e65-a14b-4869-a5c2-d47b6e69d84b");
        getListVersionJobRequest.setJobId("d5630fd4-f76f-468a-bbe8-2858d0dfd8d8");
        getListVersionJobRequest.setVersion("1.2");
        TimePeriod timePeriod = new TimePeriod();
        timePeriod.setStartTimePeriod("14_08_2021_05_20_PM");
        timePeriod.setEndTimePeriod("14_08_2021_05_30_PM");
        getListVersionJobRequest.setTimePeriod(timePeriod);
        Get_list_versions_job_intervalResult result = sdkClient.get_list_versions_job_interval(getListVersionJobRequest);
    }

    @Test
    public void getListAllTasks()
    {
        Get_list_versions_jobRequest getListVersionJobRequest = new Get_list_versions_jobRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        getListVersionJobRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        getListVersionJobRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        getListVersionJobRequest.setDatasetId("ddfb7e65-a14b-4869-a5c2-d47b6e69d84b");
        getListVersionJobRequest.setJobId("d5630fd4-f76f-468a-bbe8-2858d0dfd8d8");
        getListVersionJobRequest.setVersion("1.2");
        Get_list_versions_jobResult result = sdkClient.get_list_versions_job(getListVersionJobRequest);
    }


    @Test
    public  void getJobOutputFile()
    {
        Get_output_fileRequest outputFileRequest = new Get_output_fileRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        outputFileRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        outputFileRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        outputFileRequest.setDatasetId("ddfb7e65-a14b-4869-a5c2-d47b6e69d84b");
        outputFileRequest.setJobId("d5630fd4-f76f-468a-bbe8-2858d0dfd8d8");
        TimePeriod timePeriod = new TimePeriod();
        timePeriod.setStartTimePeriod("14_08_2021_05_20_PM");
        timePeriod.setEndTimePeriod("14_08_2021_05_30_PM");
        outputFileRequest.setTimePeriod(timePeriod);
        sdkClient.get_output_file(outputFileRequest);

    }

    @Test
    public  void getJobOutputPagination()
    {
        Get_output_file_paginationRequest outputFilePaginationRequest = new Get_output_file_paginationRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        outputFilePaginationRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        outputFilePaginationRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        outputFilePaginationRequest.setDatasetId("ddfb7e65-a14b-4869-a5c2-d47b6e69d84b");
        outputFilePaginationRequest.setJobId("d5630fd4-f76f-468a-bbe8-2858d0dfd8d8");
        TimePeriod timePeriod = new TimePeriod();
        timePeriod.setStartTimePeriod("14_08_2021_05_20_PM");
        timePeriod.setEndTimePeriod("14_08_2021_05_30_PM");
        outputFilePaginationRequest.setTimePeriod(timePeriod);
        outputFilePaginationRequest.setLimit("10");
        outputFilePaginationRequest.setOffset("0");
        sdkClient.get_output_file_pagination(outputFilePaginationRequest);
    }
    @Test
    public void testStartJob()
    {
        //TODO resolve athen problem with dataset binding first
        Start_jobRequest startJobRequest = new Start_jobRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        startJobRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        startJobRequest.setBotId("7e28dba-dab5-464f-82c8-96d4a13b2944");
        startJobRequest.setDatasetId("ddfb7e65-a14b-4869-a5c2-d47b6e69d84b");
        startJobRequest.setJobId("f5d3cf23-49df-45bd-80eb-47d472a54434");
        Start_jobResult startJobResult = sdkClient.start_job(startJobRequest);
    }

    @Test
    public void testGetStatusJob()
    {
        Get_status_jobRequest getStatusJobRequest = new Get_status_jobRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        getStatusJobRequest.setProjectId("0e6723b3-481b-4505-99b8-80d1d6dfe346");
        getStatusJobRequest.setBotId("f7e28dba-dab5-464f-82c8-96d4a13b2944");
        getStatusJobRequest.setDatasetId("ddfb7e65-a14b-4869-a5c2-d47b6e69d84b");
        getStatusJobRequest.setJobId("d5630fd4-f76f-468a-bbe8-2858d0dfd8d8");
        Get_status_jobResult jobStatusResult = sdkClient.get_status_job(getStatusJobRequest);
        StatusJob statusJob = jobStatusResult.getStatusJob();
        assertNotEquals("bug with status","", statusJob.getStatus());
    }

    @Test
    public void testUpdateJob()
    {
        Get_jobRequest getJobRequest = new Get_jobRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        getJobRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        getJobRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        getJobRequest.setDatasetId("b4ed4555-02d5-4d4b-b4b8-c40c51763852");
        getJobRequest.setJobId("78179283-d649-45a4-a300-7c91fdf023cb");
        Get_jobResult get_jobResult =  sdkClient.get_job(getJobRequest);
        Job job = get_jobResult.getJob();
        job.setScheduleInfo("cron(0 18 ? * MON-FRI *)");
        Update_jobRequest update_jobRequest = new Update_jobRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        update_jobRequest.setProjectId("b72bbe70-8667-4fbf-9928-b48fbd73eb71");
        update_jobRequest.setBotId("7bf28c9b-d21d-4c9c-bde2-7b0c0df7d433");
        update_jobRequest.setDatasetId("b4ed4555-02d5-4d4b-b4b8-c40c51763852");
        update_jobRequest.setJobId("78179283-d649-45a4-a300-7c91fdf023cb");
        update_jobRequest.setJob(job);
        Update_jobResult jobResult = sdkClient.update_job(update_jobRequest);
    }

    @Test
    public void testAddJob()
    {


        Create_jobRequest create_jobRequest = new Create_jobRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());
        create_jobRequest.setProjectId("ae0d26cd-e180-4d9c-bb85-a7fc7182badc");
        create_jobRequest.setBotId("a199f5a2-fde6-4320-9f0b-763be9b2c3aa");
        create_jobRequest.setDatasetId("fa3c0efa-fe0c-47f4-a9df-6f04c33ad9b7");


        Job job = new Job();
        job.setIsImmediate(false);
        job.setScheduleInfo("cron(0 16 ? * * *)");
        create_jobRequest.setJob(job);
        Create_jobResult jobResult = sdkClient.create_job(create_jobRequest);
        Get_all_jobsRequest get_all_jobsRequest = new Get_all_jobsRequest().sdkRequestConfig(this.getCustomSdkRequestConfig());;
        get_all_jobsRequest.setProjectId("ae0d26cd-e180-4d9c-bb85-a7fc7182badc");
        get_all_jobsRequest.setBotId("a199f5a2-fde6-4320-9f0b-763be9b2c3aa");
        get_all_jobsRequest.setDatasetId("fa3c0efa-fe0c-47f4-a9df-6f04c33ad9b7");
        Get_all_jobsResult jobsResult = sdkClient.get_all_jobs(get_all_jobsRequest);
        assertNotEquals("bugs with get list jobs", jobsResult.getListJobs().getJobs().size(),0);
    }
}
