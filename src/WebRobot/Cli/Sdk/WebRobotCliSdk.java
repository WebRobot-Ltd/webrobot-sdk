/**
 * null
 */
package WebRobot.Cli.Sdk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import WebRobot.Cli.Sdk.model.*;

/**
 * Interface for accessing WebRobotCliSdk.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface WebRobotCliSdk {

    /**
     * @param add_attributesRequest
     * @return Result of the add_attributes operation returned by the service.
     * @sample WebRobotCliSdk.add_attributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/add_attributes" target="_top">AWS API
     *      Documentation</a>
     */
    Add_attributesResult add_attributes(Add_attributesRequest add_attributesRequest);

    /**
     * @param add_datasetRequest
     * @return Result of the add_dataset operation returned by the service.
     * @sample WebRobotCliSdk.add_dataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/add_dataset" target="_top">AWS API
     *      Documentation</a>
     */
    Add_datasetResult add_dataset(Add_datasetRequest add_datasetRequest);

    /**
     * @param add_scriptRequest
     * @return Result of the add_script operation returned by the service.
     * @sample WebRobotCliSdk.add_script
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/add_script" target="_top">AWS API
     *      Documentation</a>
     */
    Add_scriptResult add_script(Add_scriptRequest add_scriptRequest);

    /**
     * @param create_botRequest
     * @return Result of the create_bot operation returned by the service.
     * @sample WebRobotCliSdk.create_bot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_bot" target="_top">AWS API
     *      Documentation</a>
     */
    Create_botResult create_bot(Create_botRequest create_botRequest);

    /**
     * @param create_conceptRequest
     * @return Result of the create_concept operation returned by the service.
     * @sample WebRobotCliSdk.create_concept
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_concept" target="_top">AWS API
     *      Documentation</a>
     */
    Create_conceptResult create_concept(Create_conceptRequest create_conceptRequest);

    /**
     * @param create_jobRequest
     * @return Result of the create_job operation returned by the service.
     * @sample WebRobotCliSdk.create_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_job" target="_top">AWS API
     *      Documentation</a>
     */
    Create_jobResult create_job(Create_jobRequest create_jobRequest);

    /**
     * @param create_pageRequest
     * @return Result of the create_page operation returned by the service.
     * @sample WebRobotCliSdk.create_page
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_page" target="_top">AWS API
     *      Documentation</a>
     */
    Create_pageResult create_page(Create_pageRequest create_pageRequest);

    /**
     * @param create_projectRequest
     * @return Result of the create_project operation returned by the service.
     * @sample WebRobotCliSdk.create_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_project" target="_top">AWS API
     *      Documentation</a>
     */
    Create_projectResult create_project(Create_projectRequest create_projectRequest);

    /**
     * @param deleteDatasetFromIdRequest
     * @return Result of the delete dataset from id operation returned by the service.
     * @sample WebRobotCliSdk.delete dataset from id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete dataset from id" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDatasetFromIdResult deletedatasetfromid(DeleteDatasetFromIdRequest deleteDatasetFromIdRequest);

    /**
     * @param delete_attributeRequest
     * @return Result of the delete_attribute operation returned by the service.
     * @sample WebRobotCliSdk.delete_attribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_attribute" target="_top">AWS API
     *      Documentation</a>
     */
    Delete_attributeResult delete_attribute(Delete_attributeRequest delete_attributeRequest);

    /**
     * @param delete_botRequest
     * @return Result of the delete_bot operation returned by the service.
     * @sample WebRobotCliSdk.delete_bot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_bot" target="_top">AWS API
     *      Documentation</a>
     */
    Delete_botResult delete_bot(Delete_botRequest delete_botRequest);

    /**
     * @param delete_conceptRequest
     * @return Result of the delete_concept operation returned by the service.
     * @sample WebRobotCliSdk.delete_concept
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_concept" target="_top">AWS API
     *      Documentation</a>
     */
    Delete_conceptResult delete_concept(Delete_conceptRequest delete_conceptRequest);

    /**
     * @param delete_dataset_version__from_idRequest
     * @return Result of the delete_dataset_version__from_id operation returned by the service.
     * @sample WebRobotCliSdk.delete_dataset_version__from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_dataset_version__from_id"
     *      target="_top">AWS API Documentation</a>
     */
    Delete_dataset_version__from_idResult delete_dataset_version__from_id(Delete_dataset_version__from_idRequest delete_dataset_version__from_idRequest);

    /**
     * @param delete_jobRequest
     * @return Result of the delete_job operation returned by the service.
     * @sample WebRobotCliSdk.delete_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_job" target="_top">AWS API
     *      Documentation</a>
     */
    Delete_jobResult delete_job(Delete_jobRequest delete_jobRequest);

    /**
     * @param delete_page_from_idRequest
     * @return Result of the delete_page_from_id operation returned by the service.
     * @sample WebRobotCliSdk.delete_page_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_page_from_id" target="_top">AWS API
     *      Documentation</a>
     */
    Delete_page_from_idResult delete_page_from_id(Delete_page_from_idRequest delete_page_from_idRequest);

    /**
     * @param delete_projectRequest
     * @return Result of the delete_project operation returned by the service.
     * @sample WebRobotCliSdk.delete_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_project" target="_top">AWS API
     *      Documentation</a>
     */
    Delete_projectResult delete_project(Delete_projectRequest delete_projectRequest);

    /**
     * @param delete_scriptRequest
     * @return Result of the delete_script operation returned by the service.
     * @sample WebRobotCliSdk.delete_script
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_script" target="_top">AWS API
     *      Documentation</a>
     */
    Delete_scriptResult delete_script(Delete_scriptRequest delete_scriptRequest);

    /**
     * @param export_allRequest
     * @return Result of the export_all operation returned by the service.
     * @sample WebRobotCliSdk.export_all
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/export_all" target="_top">AWS API
     *      Documentation</a>
     */
    Export_allResult export_all(Export_allRequest export_allRequest);

    /**
     * @param export_projectRequest
     * @return Result of the export_project operation returned by the service.
     * @sample WebRobotCliSdk.export_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/export_project" target="_top">AWS API
     *      Documentation</a>
     */
    Export_projectResult export_project(Export_projectRequest export_projectRequest);

    /**
     * @param getBotFromIdRequest
     * @return Result of the get bot from id operation returned by the service.
     * @sample WebRobotCliSdk.get bot from id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get bot from id" target="_top">AWS API
     *      Documentation</a>
     */
    GetBotFromIdResult getbotfromid(GetBotFromIdRequest getBotFromIdRequest);

    /**
     * @param getBotFromNameRequest
     * @return Result of the get bot from name operation returned by the service.
     * @sample WebRobotCliSdk.get bot from name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get bot from name" target="_top">AWS API
     *      Documentation</a>
     */
    GetBotFromNameResult getbotfromname(GetBotFromNameRequest getBotFromNameRequest);

    /**
     * @param getScriptRequest
     * @return Result of the get script operation returned by the service.
     * @sample WebRobotCliSdk.get script
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get script" target="_top">AWS API
     *      Documentation</a>
     */
    GetScriptResult getscript(GetScriptRequest getScriptRequest);

    /**
     * @param get_all_attributesRequest
     * @return Result of the get_all_attributes operation returned by the service.
     * @sample WebRobotCliSdk.get_all_attributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_attributes" target="_top">AWS API
     *      Documentation</a>
     */
    Get_all_attributesResult get_all_attributes(Get_all_attributesRequest get_all_attributesRequest);

    /**
     * @param get_all_botsRequest
     * @return Result of the get_all_bots operation returned by the service.
     * @sample WebRobotCliSdk.get_all_bots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_bots" target="_top">AWS API
     *      Documentation</a>
     */
    Get_all_botsResult get_all_bots(Get_all_botsRequest get_all_botsRequest);

    /**
     * @param get_all_conceptsRequest
     * @return Result of the get_all_concepts operation returned by the service.
     * @sample WebRobotCliSdk.get_all_concepts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_concepts" target="_top">AWS API
     *      Documentation</a>
     */
    Get_all_conceptsResult get_all_concepts(Get_all_conceptsRequest get_all_conceptsRequest);

    /**
     * @param get_all_datasetsRequest
     * @return Result of the get_all_datasets operation returned by the service.
     * @sample WebRobotCliSdk.get_all_datasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_datasets" target="_top">AWS API
     *      Documentation</a>
     */
    Get_all_datasetsResult get_all_datasets(Get_all_datasetsRequest get_all_datasetsRequest);

    /**
     * @param get_all_jobsRequest
     * @return Result of the get_all_jobs operation returned by the service.
     * @sample WebRobotCliSdk.get_all_jobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_jobs" target="_top">AWS API
     *      Documentation</a>
     */
    Get_all_jobsResult get_all_jobs(Get_all_jobsRequest get_all_jobsRequest);

    /**
     * @param get_all_pagesRequest
     * @return Result of the get_all_pages operation returned by the service.
     * @sample WebRobotCliSdk.get_all_pages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_pages" target="_top">AWS API
     *      Documentation</a>
     */
    Get_all_pagesResult get_all_pages(Get_all_pagesRequest get_all_pagesRequest);

    /**
     * @param get_all_projectsRequest
     * @return Result of the get_all_projects operation returned by the service.
     * @sample WebRobotCliSdk.get_all_projects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_projects" target="_top">AWS API
     *      Documentation</a>
     */
    Get_all_projectsResult get_all_projects(Get_all_projectsRequest get_all_projectsRequest);

    /**
     * @param get_attribute_from_idRequest
     * @return Result of the get_attribute_from_id operation returned by the service.
     * @sample WebRobotCliSdk.get_attribute_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_attribute_from_id" target="_top">AWS
     *      API Documentation</a>
     */
    Get_attribute_from_idResult get_attribute_from_id(Get_attribute_from_idRequest get_attribute_from_idRequest);

    /**
     * @param get_attribute_from_nameRequest
     * @return Result of the get_attribute_from_name operation returned by the service.
     * @sample WebRobotCliSdk.get_attribute_from_name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_attribute_from_name" target="_top">AWS
     *      API Documentation</a>
     */
    Get_attribute_from_nameResult get_attribute_from_name(Get_attribute_from_nameRequest get_attribute_from_nameRequest);

    /**
     * @param get_attribute_from_pageRequest
     * @return Result of the get_attribute_from_page operation returned by the service.
     * @sample WebRobotCliSdk.get_attribute_from_page
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_attribute_from_page" target="_top">AWS
     *      API Documentation</a>
     */
    Get_attribute_from_pageResult get_attribute_from_page(Get_attribute_from_pageRequest get_attribute_from_pageRequest);

    /**
     * @param get_concept_attribute_from_nameRequest
     * @return Result of the get_concept_attribute_from_name operation returned by the service.
     * @sample WebRobotCliSdk.get_concept_attribute_from_name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_concept_attribute_from_name"
     *      target="_top">AWS API Documentation</a>
     */
    Get_concept_attribute_from_nameResult get_concept_attribute_from_name(Get_concept_attribute_from_nameRequest get_concept_attribute_from_nameRequest);

    /**
     * @param get_concept_from_idRequest
     * @return Result of the get_concept_from_id operation returned by the service.
     * @sample WebRobotCliSdk.get_concept_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_concept_from_id" target="_top">AWS API
     *      Documentation</a>
     */
    Get_concept_from_idResult get_concept_from_id(Get_concept_from_idRequest get_concept_from_idRequest);

    /**
     * @param get_concept_from_nameRequest
     * @return Result of the get_concept_from_name operation returned by the service.
     * @sample WebRobotCliSdk.get_concept_from_name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_concept_from_name" target="_top">AWS
     *      API Documentation</a>
     */
    Get_concept_from_nameResult get_concept_from_name(Get_concept_from_nameRequest get_concept_from_nameRequest);

    /**
     * @param get_datasetRequest
     * @return Result of the get_dataset operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset" target="_top">AWS API
     *      Documentation</a>
     */
    Get_datasetResult get_dataset(Get_datasetRequest get_datasetRequest);

    /**
     * @param get_dataset_input_fileRequest
     * @return Result of the get_dataset_input_file operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_input_file
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_input_file" target="_top">AWS
     *      API Documentation</a>
     */
    Get_dataset_input_fileResult get_dataset_input_file(Get_dataset_input_fileRequest get_dataset_input_fileRequest);

    /**
     * @param get_dataset_input_file_paginationRequest
     * @return Result of the get_dataset_input_file_pagination operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_input_file_pagination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_input_file_pagination"
     *      target="_top">AWS API Documentation</a>
     */
    Get_dataset_input_file_paginationResult get_dataset_input_file_pagination(Get_dataset_input_file_paginationRequest get_dataset_input_file_paginationRequest);

    /**
     * @param get_dataset_input_sizeRequest
     * @return Result of the get_dataset_input_size operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_input_size
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_input_size" target="_top">AWS
     *      API Documentation</a>
     */
    Get_dataset_input_sizeResult get_dataset_input_size(Get_dataset_input_sizeRequest get_dataset_input_sizeRequest);

    /**
     * @param get_dataset_statusRequest
     * @return Result of the get_dataset_status operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_status
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_status" target="_top">AWS API
     *      Documentation</a>
     */
    Get_dataset_statusResult get_dataset_status(Get_dataset_statusRequest get_dataset_statusRequest);

    /**
     * @param get_dataset_versionRequest
     * @return Result of the get_dataset_version operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version" target="_top">AWS API
     *      Documentation</a>
     */
    Get_dataset_versionResult get_dataset_version(Get_dataset_versionRequest get_dataset_versionRequest);

    /**
     * @param get_dataset_version_baseRequest
     * @return Result of the get_dataset_version_base operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_base
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_base" target="_top">AWS
     *      API Documentation</a>
     */
    Get_dataset_version_baseResult get_dataset_version_base(Get_dataset_version_baseRequest get_dataset_version_baseRequest);

    /**
     * @param get_dataset_version_fileRequest
     * @return Result of the get_dataset_version_file operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_file
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_file" target="_top">AWS
     *      API Documentation</a>
     */
    Get_dataset_version_fileResult get_dataset_version_file(Get_dataset_version_fileRequest get_dataset_version_fileRequest);

    /**
     * @param get_dataset_version_file_paginationRequest
     * @return Result of the get_dataset_version_file_pagination operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_file_pagination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_file_pagination"
     *      target="_top">AWS API Documentation</a>
     */
    Get_dataset_version_file_paginationResult get_dataset_version_file_pagination(
            Get_dataset_version_file_paginationRequest get_dataset_version_file_paginationRequest);

    /**
     * @param get_dataset_version_from_idRequest
     * @return Result of the get_dataset_version_from_id operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_from_id"
     *      target="_top">AWS API Documentation</a>
     */
    Get_dataset_version_from_idResult get_dataset_version_from_id(Get_dataset_version_from_idRequest get_dataset_version_from_idRequest);

    /**
     * @param get_dataset_version_of_tasksRequest
     * @return Result of the get_dataset_version_of_tasks operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_of_tasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_of_tasks"
     *      target="_top">AWS API Documentation</a>
     */
    Get_dataset_version_of_tasksResult get_dataset_version_of_tasks(Get_dataset_version_of_tasksRequest get_dataset_version_of_tasksRequest);

    /**
     * @param get_dataset_versionsRequest
     * @return Result of the get_dataset_versions operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_versions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_versions" target="_top">AWS API
     *      Documentation</a>
     */
    Get_dataset_versionsResult get_dataset_versions(Get_dataset_versionsRequest get_dataset_versionsRequest);

    /**
     * @param get_jobRequest
     * @return Result of the get_job operation returned by the service.
     * @sample WebRobotCliSdk.get_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_job" target="_top">AWS API
     *      Documentation</a>
     */
    Get_jobResult get_job(Get_jobRequest get_jobRequest);

    /**
     * @param get_list_versions_jobRequest
     * @return Result of the get_list_versions_job operation returned by the service.
     * @sample WebRobotCliSdk.get_list_versions_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_list_versions_job" target="_top">AWS
     *      API Documentation</a>
     */
    Get_list_versions_jobResult get_list_versions_job(Get_list_versions_jobRequest get_list_versions_jobRequest);

    /**
     * @param get_list_versions_job_intervalRequest
     * @return Result of the get_list_versions_job_interval operation returned by the service.
     * @sample WebRobotCliSdk.get_list_versions_job_interval
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_list_versions_job_interval"
     *      target="_top">AWS API Documentation</a>
     */
    Get_list_versions_job_intervalResult get_list_versions_job_interval(Get_list_versions_job_intervalRequest get_list_versions_job_intervalRequest);

    /**
     * @param get_output_fileRequest
     * @return Result of the get_output_file operation returned by the service.
     * @sample WebRobotCliSdk.get_output_file
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_output_file" target="_top">AWS API
     *      Documentation</a>
     */
    Get_output_fileResult get_output_file(Get_output_fileRequest get_output_fileRequest);

    /**
     * @param get_output_file_paginationRequest
     * @return Result of the get_output_file_pagination operation returned by the service.
     * @sample WebRobotCliSdk.get_output_file_pagination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_output_file_pagination"
     *      target="_top">AWS API Documentation</a>
     */
    Get_output_file_paginationResult get_output_file_pagination(Get_output_file_paginationRequest get_output_file_paginationRequest);

    /**
     * @param get_output_sizeRequest
     * @return Result of the get_output_size operation returned by the service.
     * @sample WebRobotCliSdk.get_output_size
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_output_size" target="_top">AWS API
     *      Documentation</a>
     */
    Get_output_sizeResult get_output_size(Get_output_sizeRequest get_output_sizeRequest);

    /**
     * @param get_page_from_idRequest
     * @return Result of the get_page_from_id operation returned by the service.
     * @sample WebRobotCliSdk.get_page_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_page_from_id" target="_top">AWS API
     *      Documentation</a>
     */
    Get_page_from_idResult get_page_from_id(Get_page_from_idRequest get_page_from_idRequest);

    /**
     * @param get_projectRequest
     * @return Result of the get_project operation returned by the service.
     * @sample WebRobotCliSdk.get_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_project" target="_top">AWS API
     *      Documentation</a>
     */
    Get_projectResult get_project(Get_projectRequest get_projectRequest);

    /**
     * @param get_project_from_nameRequest
     * @return Result of the get_project_from_name operation returned by the service.
     * @sample WebRobotCliSdk.get_project_from_name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_project_from_name" target="_top">AWS
     *      API Documentation</a>
     */
    Get_project_from_nameResult get_project_from_name(Get_project_from_nameRequest get_project_from_nameRequest);

    /**
     * @param get_scriptsRequest
     * @return Result of the get_scripts operation returned by the service.
     * @sample WebRobotCliSdk.get_scripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_scripts" target="_top">AWS API
     *      Documentation</a>
     */
    Get_scriptsResult get_scripts(Get_scriptsRequest get_scriptsRequest);

    /**
     * @param get_status_jobRequest
     * @return Result of the get_status_job operation returned by the service.
     * @sample WebRobotCliSdk.get_status_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_status_job" target="_top">AWS API
     *      Documentation</a>
     */
    Get_status_jobResult get_status_job(Get_status_jobRequest get_status_jobRequest);

    /**
     * @param get_url_downloadRequest
     * @return Result of the get_url_download operation returned by the service.
     * @sample WebRobotCliSdk.get_url_download
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_url_download" target="_top">AWS API
     *      Documentation</a>
     */
    Get_url_downloadResult get_url_download(Get_url_downloadRequest get_url_downloadRequest);

    /**
     * @param get_url_uploadRequest
     * @return Result of the get_url_upload operation returned by the service.
     * @sample WebRobotCliSdk.get_url_upload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_url_upload" target="_top">AWS API
     *      Documentation</a>
     */
    Get_url_uploadResult get_url_upload(Get_url_uploadRequest get_url_uploadRequest);

    /**
     * @param import_allRequest
     * @return Result of the import_all operation returned by the service.
     * @sample WebRobotCliSdk.import_all
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/import_all" target="_top">AWS API
     *      Documentation</a>
     */
    Import_allResult import_all(Import_allRequest import_allRequest);

    /**
     * @param import_projectRequest
     * @return Result of the import_project operation returned by the service.
     * @sample WebRobotCliSdk.import_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/import_project" target="_top">AWS API
     *      Documentation</a>
     */
    Import_projectResult import_project(Import_projectRequest import_projectRequest);

    /**
     * @param start_jobRequest
     * @return Result of the start_job operation returned by the service.
     * @sample WebRobotCliSdk.start_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/start_job" target="_top">AWS API
     *      Documentation</a>
     */
    Start_jobResult start_job(Start_jobRequest start_jobRequest);

    /**
     * @param stop_jobRequest
     * @return Result of the stop_job operation returned by the service.
     * @sample WebRobotCliSdk.stop_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/stop_job" target="_top">AWS API
     *      Documentation</a>
     */
    Stop_jobResult stop_job(Stop_jobRequest stop_jobRequest);

    /**
     * @param update_attributeRequest
     * @return Result of the update_attribute operation returned by the service.
     * @sample WebRobotCliSdk.update_attribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_attribute" target="_top">AWS API
     *      Documentation</a>
     */
    Update_attributeResult update_attribute(Update_attributeRequest update_attributeRequest);

    /**
     * @param update_botRequest
     * @return Result of the update_bot operation returned by the service.
     * @sample WebRobotCliSdk.update_bot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_bot" target="_top">AWS API
     *      Documentation</a>
     */
    Update_botResult update_bot(Update_botRequest update_botRequest);

    /**
     * @param update_conceptRequest
     * @return Result of the update_concept operation returned by the service.
     * @sample WebRobotCliSdk.update_concept
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_concept" target="_top">AWS API
     *      Documentation</a>
     */
    Update_conceptResult update_concept(Update_conceptRequest update_conceptRequest);

    /**
     * @param update_jobRequest
     * @return Result of the update_job operation returned by the service.
     * @sample WebRobotCliSdk.update_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_job" target="_top">AWS API
     *      Documentation</a>
     */
    Update_jobResult update_job(Update_jobRequest update_jobRequest);

    /**
     * @param update_pageRequest
     * @return Result of the update_page operation returned by the service.
     * @sample WebRobotCliSdk.update_page
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_page" target="_top">AWS API
     *      Documentation</a>
     */
    Update_pageResult update_page(Update_pageRequest update_pageRequest);

    /**
     * @param update_projectRequest
     * @return Result of the update_project operation returned by the service.
     * @sample WebRobotCliSdk.update_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_project" target="_top">AWS API
     *      Documentation</a>
     */
    Update_projectResult update_project(Update_projectRequest update_projectRequest);

    /**
     * @param update_scriptRequest
     * @return Result of the update_script operation returned by the service.
     * @sample WebRobotCliSdk.update_script
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_script" target="_top">AWS API
     *      Documentation</a>
     */
    Update_scriptResult update_script(Update_scriptRequest update_scriptRequest);

    /**
     * @param upload_fileRequest
     * @return Result of the upload_file operation returned by the service.
     * @sample WebRobotCliSdk.upload_file
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/upload_file" target="_top">AWS API
     *      Documentation</a>
     */
    Upload_fileResult upload_file(Upload_fileRequest upload_fileRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static WebRobotCliSdkClientBuilder builder() {
        return new WebRobotCliSdkClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
