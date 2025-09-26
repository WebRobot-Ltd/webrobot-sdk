/**
 * null
 */
package WebRobot.Cli.Sdk;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import WebRobot.Cli.Sdk.custom.ApiGatewayProtocolFactoryImplTest;
import WebRobot.Cli.Sdk.custom.SdkClientHandlerTest;
import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import WebRobot.Cli.Sdk.model.*;
import WebRobot.Cli.Sdk.model.transform.*;

/**
 * Client for accessing WebRobotCliSdk. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class WebRobotCliSdkClient implements WebRobotCliSdk {

    private final ClientHandler clientHandler;

    private static final ApiGatewayProtocolFactoryImplTest protocolFactory = new ApiGatewayProtocolFactoryImplTest(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(WebRobot.Cli.Sdk.model.WebRobotCliSdkException.class));

    /**
     * Constructs a new client to invoke service methods on WebRobotCliSdk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    WebRobotCliSdkClient(AwsSyncClientParams clientParams) {

        this.clientHandler = new SdkClientHandlerTest(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param add_attributesRequest
     * @return Result of the add_attributes operation returned by the service.
     * @sample WebRobotCliSdk.add_attributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/add_attributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Add_attributesResult add_attributes(Add_attributesRequest add_attributesRequest) {
        HttpResponseHandler<Add_attributesResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Add_attributesResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Add_attributesRequest, Add_attributesResult>()
                .withMarshaller(new Add_attributesRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(add_attributesRequest));
    }

    /**
     * @param add_datasetRequest
     * @return Result of the add_dataset operation returned by the service.
     * @sample WebRobotCliSdk.add_dataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/add_dataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Add_datasetResult add_dataset(Add_datasetRequest add_datasetRequest) {
        HttpResponseHandler<Add_datasetResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Add_datasetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Add_datasetRequest, Add_datasetResult>()
                .withMarshaller(new Add_datasetRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(add_datasetRequest));
    }

    /**
     * @param add_scriptRequest
     * @return Result of the add_script operation returned by the service.
     * @sample WebRobotCliSdk.add_script
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/add_script" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Add_scriptResult add_script(Add_scriptRequest add_scriptRequest) {
        HttpResponseHandler<Add_scriptResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Add_scriptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Add_scriptRequest, Add_scriptResult>()
                .withMarshaller(new Add_scriptRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(add_scriptRequest));
    }

    /**
     * @param create_botRequest
     * @return Result of the create_bot operation returned by the service.
     * @sample WebRobotCliSdk.create_bot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_bot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Create_botResult create_bot(Create_botRequest create_botRequest) {
        HttpResponseHandler<Create_botResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Create_botResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Create_botRequest, Create_botResult>()
                .withMarshaller(new Create_botRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(create_botRequest));
    }

    /**
     * @param create_conceptRequest
     * @return Result of the create_concept operation returned by the service.
     * @sample WebRobotCliSdk.create_concept
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_concept" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Create_conceptResult create_concept(Create_conceptRequest create_conceptRequest) {
        HttpResponseHandler<Create_conceptResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Create_conceptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Create_conceptRequest, Create_conceptResult>()
                .withMarshaller(new Create_conceptRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(create_conceptRequest));
    }

    /**
     * @param create_jobRequest
     * @return Result of the create_job operation returned by the service.
     * @sample WebRobotCliSdk.create_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_job" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Create_jobResult create_job(Create_jobRequest create_jobRequest) {
        HttpResponseHandler<Create_jobResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Create_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Create_jobRequest, Create_jobResult>()
                .withMarshaller(new Create_jobRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(create_jobRequest));
    }

    /**
     * @param create_pageRequest
     * @return Result of the create_page operation returned by the service.
     * @sample WebRobotCliSdk.create_page
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_page" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Create_pageResult create_page(Create_pageRequest create_pageRequest) {
        HttpResponseHandler<Create_pageResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Create_pageResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Create_pageRequest, Create_pageResult>()
                .withMarshaller(new Create_pageRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(create_pageRequest));
    }

    /**
     * @param create_projectRequest
     * @return Result of the create_project operation returned by the service.
     * @sample WebRobotCliSdk.create_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/create_project" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Create_projectResult create_project(Create_projectRequest create_projectRequest) {
        HttpResponseHandler<Create_projectResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Create_projectResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Create_projectRequest, Create_projectResult>()
                .withMarshaller(new Create_projectRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(create_projectRequest));
    }

    /**
     * @param deleteDatasetFromIdRequest
     * @return Result of the delete dataset from id operation returned by the service.
     * @sample WebRobotCliSdk.delete dataset from id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete dataset from id" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDatasetFromIdResult deletedatasetfromid(DeleteDatasetFromIdRequest deleteDatasetFromIdRequest) {
        HttpResponseHandler<DeleteDatasetFromIdResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetFromIdResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<DeleteDatasetFromIdRequest, DeleteDatasetFromIdResult>()
                .withMarshaller(new DeleteDatasetFromIdRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(deleteDatasetFromIdRequest));
    }

    /**
     * @param delete_attributeRequest
     * @return Result of the delete_attribute operation returned by the service.
     * @sample WebRobotCliSdk.delete_attribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_attribute" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Delete_attributeResult delete_attribute(Delete_attributeRequest delete_attributeRequest) {
        HttpResponseHandler<Delete_attributeResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Delete_attributeResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Delete_attributeRequest, Delete_attributeResult>()
                .withMarshaller(new Delete_attributeRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(delete_attributeRequest));
    }

    /**
     * @param delete_botRequest
     * @return Result of the delete_bot operation returned by the service.
     * @sample WebRobotCliSdk.delete_bot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_bot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Delete_botResult delete_bot(Delete_botRequest delete_botRequest) {
        HttpResponseHandler<Delete_botResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Delete_botResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Delete_botRequest, Delete_botResult>()
                .withMarshaller(new Delete_botRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(delete_botRequest));
    }

    /**
     * @param delete_conceptRequest
     * @return Result of the delete_concept operation returned by the service.
     * @sample WebRobotCliSdk.delete_concept
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_concept" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Delete_conceptResult delete_concept(Delete_conceptRequest delete_conceptRequest) {
        HttpResponseHandler<Delete_conceptResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Delete_conceptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Delete_conceptRequest, Delete_conceptResult>()
                .withMarshaller(new Delete_conceptRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(delete_conceptRequest));
    }

    /**
     * @param delete_dataset_version__from_idRequest
     * @return Result of the delete_dataset_version__from_id operation returned by the service.
     * @sample WebRobotCliSdk.delete_dataset_version__from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_dataset_version__from_id"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Delete_dataset_version__from_idResult delete_dataset_version__from_id(Delete_dataset_version__from_idRequest delete_dataset_version__from_idRequest) {
        HttpResponseHandler<Delete_dataset_version__from_idResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Delete_dataset_version__from_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Delete_dataset_version__from_idRequest, Delete_dataset_version__from_idResult>()
                .withMarshaller(new Delete_dataset_version__from_idRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(delete_dataset_version__from_idRequest));
    }

    /**
     * @param delete_jobRequest
     * @return Result of the delete_job operation returned by the service.
     * @sample WebRobotCliSdk.delete_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_job" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Delete_jobResult delete_job(Delete_jobRequest delete_jobRequest) {
        HttpResponseHandler<Delete_jobResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Delete_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Delete_jobRequest, Delete_jobResult>()
                .withMarshaller(new Delete_jobRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(delete_jobRequest));
    }

    /**
     * @param delete_page_from_idRequest
     * @return Result of the delete_page_from_id operation returned by the service.
     * @sample WebRobotCliSdk.delete_page_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_page_from_id" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Delete_page_from_idResult delete_page_from_id(Delete_page_from_idRequest delete_page_from_idRequest) {
        HttpResponseHandler<Delete_page_from_idResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Delete_page_from_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Delete_page_from_idRequest, Delete_page_from_idResult>()
                .withMarshaller(new Delete_page_from_idRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(delete_page_from_idRequest));
    }

    /**
     * @param delete_projectRequest
     * @return Result of the delete_project operation returned by the service.
     * @sample WebRobotCliSdk.delete_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_project" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Delete_projectResult delete_project(Delete_projectRequest delete_projectRequest) {
        HttpResponseHandler<Delete_projectResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Delete_projectResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Delete_projectRequest, Delete_projectResult>()
                .withMarshaller(new Delete_projectRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(delete_projectRequest));
    }

    /**
     * @param delete_scriptRequest
     * @return Result of the delete_script operation returned by the service.
     * @sample WebRobotCliSdk.delete_script
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/delete_script" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Delete_scriptResult delete_script(Delete_scriptRequest delete_scriptRequest) {
        HttpResponseHandler<Delete_scriptResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Delete_scriptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Delete_scriptRequest, Delete_scriptResult>()
                .withMarshaller(new Delete_scriptRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(delete_scriptRequest));
    }

    /**
     * @param export_allRequest
     * @return Result of the export_all operation returned by the service.
     * @sample WebRobotCliSdk.export_all
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/export_all" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Export_allResult export_all(Export_allRequest export_allRequest) {
        HttpResponseHandler<Export_allResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Export_allResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Export_allRequest, Export_allResult>()
                .withMarshaller(new Export_allRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(export_allRequest));
    }

    /**
     * @param export_projectRequest
     * @return Result of the export_project operation returned by the service.
     * @sample WebRobotCliSdk.export_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/export_project" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Export_projectResult export_project(Export_projectRequest export_projectRequest) {
        HttpResponseHandler<Export_projectResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Export_projectResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Export_projectRequest, Export_projectResult>()
                .withMarshaller(new Export_projectRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(export_projectRequest));
    }

    /**
     * @param getBotFromIdRequest
     * @return Result of the get bot from id operation returned by the service.
     * @sample WebRobotCliSdk.get bot from id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get bot from id" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBotFromIdResult getbotfromid(GetBotFromIdRequest getBotFromIdRequest) {
        HttpResponseHandler<GetBotFromIdResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetBotFromIdResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetBotFromIdRequest, GetBotFromIdResult>()
                .withMarshaller(new GetBotFromIdRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getBotFromIdRequest));
    }

    /**
     * @param getBotFromNameRequest
     * @return Result of the get bot from name operation returned by the service.
     * @sample WebRobotCliSdk.get bot from name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get bot from name" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBotFromNameResult getbotfromname(GetBotFromNameRequest getBotFromNameRequest) {
        HttpResponseHandler<GetBotFromNameResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetBotFromNameResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetBotFromNameRequest, GetBotFromNameResult>()
                .withMarshaller(new GetBotFromNameRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getBotFromNameRequest));
    }

    /**
     * @param getScriptRequest
     * @return Result of the get script operation returned by the service.
     * @sample WebRobotCliSdk.get script
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get script" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetScriptResult getscript(GetScriptRequest getScriptRequest) {
        HttpResponseHandler<GetScriptResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetScriptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetScriptRequest, GetScriptResult>()
                .withMarshaller(new GetScriptRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getScriptRequest));
    }

    /**
     * @param get_all_attributesRequest
     * @return Result of the get_all_attributes operation returned by the service.
     * @sample WebRobotCliSdk.get_all_attributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_attributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_all_attributesResult get_all_attributes(Get_all_attributesRequest get_all_attributesRequest) {
        HttpResponseHandler<Get_all_attributesResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_all_attributesResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_all_attributesRequest, Get_all_attributesResult>()
                .withMarshaller(new Get_all_attributesRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_all_attributesRequest));
    }

    /**
     * @param get_all_botsRequest
     * @return Result of the get_all_bots operation returned by the service.
     * @sample WebRobotCliSdk.get_all_bots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_bots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_all_botsResult get_all_bots(Get_all_botsRequest get_all_botsRequest) {
        HttpResponseHandler<Get_all_botsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_all_botsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_all_botsRequest, Get_all_botsResult>()
                .withMarshaller(new Get_all_botsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_all_botsRequest));
    }

    /**
     * @param get_all_conceptsRequest
     * @return Result of the get_all_concepts operation returned by the service.
     * @sample WebRobotCliSdk.get_all_concepts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_concepts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_all_conceptsResult get_all_concepts(Get_all_conceptsRequest get_all_conceptsRequest) {
        HttpResponseHandler<Get_all_conceptsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_all_conceptsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_all_conceptsRequest, Get_all_conceptsResult>()
                .withMarshaller(new Get_all_conceptsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_all_conceptsRequest));
    }

    /**
     * @param get_all_datasetsRequest
     * @return Result of the get_all_datasets operation returned by the service.
     * @sample WebRobotCliSdk.get_all_datasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_datasets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_all_datasetsResult get_all_datasets(Get_all_datasetsRequest get_all_datasetsRequest) {
        HttpResponseHandler<Get_all_datasetsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_all_datasetsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_all_datasetsRequest, Get_all_datasetsResult>()
                .withMarshaller(new Get_all_datasetsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_all_datasetsRequest));
    }

    /**
     * @param get_all_jobsRequest
     * @return Result of the get_all_jobs operation returned by the service.
     * @sample WebRobotCliSdk.get_all_jobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_jobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_all_jobsResult get_all_jobs(Get_all_jobsRequest get_all_jobsRequest) {
        HttpResponseHandler<Get_all_jobsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_all_jobsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_all_jobsRequest, Get_all_jobsResult>()
                .withMarshaller(new Get_all_jobsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_all_jobsRequest));
    }

    /**
     * @param get_all_pagesRequest
     * @return Result of the get_all_pages operation returned by the service.
     * @sample WebRobotCliSdk.get_all_pages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_pages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_all_pagesResult get_all_pages(Get_all_pagesRequest get_all_pagesRequest) {
        HttpResponseHandler<Get_all_pagesResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_all_pagesResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_all_pagesRequest, Get_all_pagesResult>()
                .withMarshaller(new Get_all_pagesRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_all_pagesRequest));
    }

    /**
     * @param get_all_projectsRequest
     * @return Result of the get_all_projects operation returned by the service.
     * @sample WebRobotCliSdk.get_all_projects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_all_projects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_all_projectsResult get_all_projects(Get_all_projectsRequest get_all_projectsRequest) {
        HttpResponseHandler<Get_all_projectsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_all_projectsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_all_projectsRequest, Get_all_projectsResult>()
                .withMarshaller(new Get_all_projectsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_all_projectsRequest));
    }

    /**
     * @param get_attribute_from_idRequest
     * @return Result of the get_attribute_from_id operation returned by the service.
     * @sample WebRobotCliSdk.get_attribute_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_attribute_from_id" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_attribute_from_idResult get_attribute_from_id(Get_attribute_from_idRequest get_attribute_from_idRequest) {
        HttpResponseHandler<Get_attribute_from_idResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_attribute_from_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_attribute_from_idRequest, Get_attribute_from_idResult>()
                .withMarshaller(new Get_attribute_from_idRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_attribute_from_idRequest));
    }

    /**
     * @param get_attribute_from_nameRequest
     * @return Result of the get_attribute_from_name operation returned by the service.
     * @sample WebRobotCliSdk.get_attribute_from_name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_attribute_from_name" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_attribute_from_nameResult get_attribute_from_name(Get_attribute_from_nameRequest get_attribute_from_nameRequest) {
        HttpResponseHandler<Get_attribute_from_nameResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_attribute_from_nameResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_attribute_from_nameRequest, Get_attribute_from_nameResult>()
                .withMarshaller(new Get_attribute_from_nameRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_attribute_from_nameRequest));
    }

    /**
     * @param get_attribute_from_pageRequest
     * @return Result of the get_attribute_from_page operation returned by the service.
     * @sample WebRobotCliSdk.get_attribute_from_page
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_attribute_from_page" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_attribute_from_pageResult get_attribute_from_page(Get_attribute_from_pageRequest get_attribute_from_pageRequest) {
        HttpResponseHandler<Get_attribute_from_pageResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_attribute_from_pageResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_attribute_from_pageRequest, Get_attribute_from_pageResult>()
                .withMarshaller(new Get_attribute_from_pageRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_attribute_from_pageRequest));
    }

    /**
     * @param get_concept_attribute_from_nameRequest
     * @return Result of the get_concept_attribute_from_name operation returned by the service.
     * @sample WebRobotCliSdk.get_concept_attribute_from_name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_concept_attribute_from_name"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Get_concept_attribute_from_nameResult get_concept_attribute_from_name(Get_concept_attribute_from_nameRequest get_concept_attribute_from_nameRequest) {
        HttpResponseHandler<Get_concept_attribute_from_nameResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_concept_attribute_from_nameResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_concept_attribute_from_nameRequest, Get_concept_attribute_from_nameResult>()
                .withMarshaller(new Get_concept_attribute_from_nameRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_concept_attribute_from_nameRequest));
    }

    /**
     * @param get_concept_from_idRequest
     * @return Result of the get_concept_from_id operation returned by the service.
     * @sample WebRobotCliSdk.get_concept_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_concept_from_id" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_concept_from_idResult get_concept_from_id(Get_concept_from_idRequest get_concept_from_idRequest) {
        HttpResponseHandler<Get_concept_from_idResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_concept_from_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_concept_from_idRequest, Get_concept_from_idResult>()
                .withMarshaller(new Get_concept_from_idRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_concept_from_idRequest));
    }

    /**
     * @param get_concept_from_nameRequest
     * @return Result of the get_concept_from_name operation returned by the service.
     * @sample WebRobotCliSdk.get_concept_from_name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_concept_from_name" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_concept_from_nameResult get_concept_from_name(Get_concept_from_nameRequest get_concept_from_nameRequest) {
        HttpResponseHandler<Get_concept_from_nameResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_concept_from_nameResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_concept_from_nameRequest, Get_concept_from_nameResult>()
                .withMarshaller(new Get_concept_from_nameRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_concept_from_nameRequest));
    }

    /**
     * @param get_datasetRequest
     * @return Result of the get_dataset operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_datasetResult get_dataset(Get_datasetRequest get_datasetRequest) {
        HttpResponseHandler<Get_datasetResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_datasetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_datasetRequest, Get_datasetResult>()
                .withMarshaller(new Get_datasetRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_datasetRequest));
    }

    /**
     * @param get_dataset_input_fileRequest
     * @return Result of the get_dataset_input_file operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_input_file
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_input_file" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_dataset_input_fileResult get_dataset_input_file(Get_dataset_input_fileRequest get_dataset_input_fileRequest) {
        HttpResponseHandler<Get_dataset_input_fileResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_input_fileResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_input_fileRequest, Get_dataset_input_fileResult>()
                .withMarshaller(new Get_dataset_input_fileRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_input_fileRequest));
    }

    /**
     * @param get_dataset_input_file_paginationRequest
     * @return Result of the get_dataset_input_file_pagination operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_input_file_pagination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_input_file_pagination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Get_dataset_input_file_paginationResult get_dataset_input_file_pagination(
            Get_dataset_input_file_paginationRequest get_dataset_input_file_paginationRequest) {
        HttpResponseHandler<Get_dataset_input_file_paginationResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_input_file_paginationResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_input_file_paginationRequest, Get_dataset_input_file_paginationResult>()
                .withMarshaller(new Get_dataset_input_file_paginationRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_input_file_paginationRequest));
    }

    /**
     * @param get_dataset_input_sizeRequest
     * @return Result of the get_dataset_input_size operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_input_size
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_input_size" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_dataset_input_sizeResult get_dataset_input_size(Get_dataset_input_sizeRequest get_dataset_input_sizeRequest) {
        HttpResponseHandler<Get_dataset_input_sizeResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_input_sizeResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_input_sizeRequest, Get_dataset_input_sizeResult>()
                .withMarshaller(new Get_dataset_input_sizeRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_input_sizeRequest));
    }

    /**
     * @param get_dataset_statusRequest
     * @return Result of the get_dataset_status operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_status
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_status" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_dataset_statusResult get_dataset_status(Get_dataset_statusRequest get_dataset_statusRequest) {
        HttpResponseHandler<Get_dataset_statusResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_dataset_statusResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_statusRequest, Get_dataset_statusResult>()
                .withMarshaller(new Get_dataset_statusRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_statusRequest));
    }

    /**
     * @param get_dataset_versionRequest
     * @return Result of the get_dataset_version operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_dataset_versionResult get_dataset_version(Get_dataset_versionRequest get_dataset_versionRequest) {
        HttpResponseHandler<Get_dataset_versionResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_versionResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_versionRequest, Get_dataset_versionResult>()
                .withMarshaller(new Get_dataset_versionRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_versionRequest));
    }

    /**
     * @param get_dataset_version_baseRequest
     * @return Result of the get_dataset_version_base operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_base
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_base" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_dataset_version_baseResult get_dataset_version_base(Get_dataset_version_baseRequest get_dataset_version_baseRequest) {
        HttpResponseHandler<Get_dataset_version_baseResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_version_baseResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_version_baseRequest, Get_dataset_version_baseResult>()
                .withMarshaller(new Get_dataset_version_baseRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_version_baseRequest));
    }

    /**
     * @param get_dataset_version_fileRequest
     * @return Result of the get_dataset_version_file operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_file
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_file" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_dataset_version_fileResult get_dataset_version_file(Get_dataset_version_fileRequest get_dataset_version_fileRequest) {
        HttpResponseHandler<Get_dataset_version_fileResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_version_fileResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_version_fileRequest, Get_dataset_version_fileResult>()
                .withMarshaller(new Get_dataset_version_fileRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_version_fileRequest));
    }

    /**
     * @param get_dataset_version_file_paginationRequest
     * @return Result of the get_dataset_version_file_pagination operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_file_pagination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_file_pagination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Get_dataset_version_file_paginationResult get_dataset_version_file_pagination(
            Get_dataset_version_file_paginationRequest get_dataset_version_file_paginationRequest) {
        HttpResponseHandler<Get_dataset_version_file_paginationResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_version_file_paginationResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_version_file_paginationRequest, Get_dataset_version_file_paginationResult>()
                .withMarshaller(new Get_dataset_version_file_paginationRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_version_file_paginationRequest));
    }

    /**
     * @param get_dataset_version_from_idRequest
     * @return Result of the get_dataset_version_from_id operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_from_id"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Get_dataset_version_from_idResult get_dataset_version_from_id(Get_dataset_version_from_idRequest get_dataset_version_from_idRequest) {
        HttpResponseHandler<Get_dataset_version_from_idResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_version_from_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_version_from_idRequest, Get_dataset_version_from_idResult>()
                .withMarshaller(new Get_dataset_version_from_idRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_version_from_idRequest));
    }

    /**
     * @param get_dataset_version_of_tasksRequest
     * @return Result of the get_dataset_version_of_tasks operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_version_of_tasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_version_of_tasks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Get_dataset_version_of_tasksResult get_dataset_version_of_tasks(Get_dataset_version_of_tasksRequest get_dataset_version_of_tasksRequest) {
        HttpResponseHandler<Get_dataset_version_of_tasksResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_version_of_tasksResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_version_of_tasksRequest, Get_dataset_version_of_tasksResult>()
                .withMarshaller(new Get_dataset_version_of_tasksRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_version_of_tasksRequest));
    }

    /**
     * @param get_dataset_versionsRequest
     * @return Result of the get_dataset_versions operation returned by the service.
     * @sample WebRobotCliSdk.get_dataset_versions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_dataset_versions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_dataset_versionsResult get_dataset_versions(Get_dataset_versionsRequest get_dataset_versionsRequest) {
        HttpResponseHandler<Get_dataset_versionsResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_dataset_versionsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_dataset_versionsRequest, Get_dataset_versionsResult>()
                .withMarshaller(new Get_dataset_versionsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_dataset_versionsRequest));
    }

    /**
     * @param get_jobRequest
     * @return Result of the get_job operation returned by the service.
     * @sample WebRobotCliSdk.get_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_job" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_jobResult get_job(Get_jobRequest get_jobRequest) {
        HttpResponseHandler<Get_jobResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_jobRequest, Get_jobResult>()
                .withMarshaller(new Get_jobRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_jobRequest));
    }

    /**
     * @param get_list_versions_jobRequest
     * @return Result of the get_list_versions_job operation returned by the service.
     * @sample WebRobotCliSdk.get_list_versions_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_list_versions_job" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_list_versions_jobResult get_list_versions_job(Get_list_versions_jobRequest get_list_versions_jobRequest) {
        HttpResponseHandler<Get_list_versions_jobResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_list_versions_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_list_versions_jobRequest, Get_list_versions_jobResult>()
                .withMarshaller(new Get_list_versions_jobRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_list_versions_jobRequest));
    }

    /**
     * @param get_list_versions_job_intervalRequest
     * @return Result of the get_list_versions_job_interval operation returned by the service.
     * @sample WebRobotCliSdk.get_list_versions_job_interval
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_list_versions_job_interval"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Get_list_versions_job_intervalResult get_list_versions_job_interval(Get_list_versions_job_intervalRequest get_list_versions_job_intervalRequest) {
        HttpResponseHandler<Get_list_versions_job_intervalResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_list_versions_job_intervalResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_list_versions_job_intervalRequest, Get_list_versions_job_intervalResult>()
                .withMarshaller(new Get_list_versions_job_intervalRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_list_versions_job_intervalRequest));
    }

    /**
     * @param get_output_fileRequest
     * @return Result of the get_output_file operation returned by the service.
     * @sample WebRobotCliSdk.get_output_file
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_output_file" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_output_fileResult get_output_file(Get_output_fileRequest get_output_fileRequest) {
        HttpResponseHandler<Get_output_fileResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_output_fileResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_output_fileRequest, Get_output_fileResult>()
                .withMarshaller(new Get_output_fileRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_output_fileRequest));
    }

    /**
     * @param get_output_file_paginationRequest
     * @return Result of the get_output_file_pagination operation returned by the service.
     * @sample WebRobotCliSdk.get_output_file_pagination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_output_file_pagination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Get_output_file_paginationResult get_output_file_pagination(Get_output_file_paginationRequest get_output_file_paginationRequest) {
        HttpResponseHandler<Get_output_file_paginationResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_output_file_paginationResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_output_file_paginationRequest, Get_output_file_paginationResult>()
                .withMarshaller(new Get_output_file_paginationRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_output_file_paginationRequest));
    }

    /**
     * @param get_output_sizeRequest
     * @return Result of the get_output_size operation returned by the service.
     * @sample WebRobotCliSdk.get_output_size
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_output_size" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_output_sizeResult get_output_size(Get_output_sizeRequest get_output_sizeRequest) {
        HttpResponseHandler<Get_output_sizeResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_output_sizeResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_output_sizeRequest, Get_output_sizeResult>()
                .withMarshaller(new Get_output_sizeRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_output_sizeRequest));
    }

    /**
     * @param get_page_from_idRequest
     * @return Result of the get_page_from_id operation returned by the service.
     * @sample WebRobotCliSdk.get_page_from_id
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_page_from_id" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_page_from_idResult get_page_from_id(Get_page_from_idRequest get_page_from_idRequest) {
        HttpResponseHandler<Get_page_from_idResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_page_from_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_page_from_idRequest, Get_page_from_idResult>()
                .withMarshaller(new Get_page_from_idRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_page_from_idRequest));
    }

    /**
     * @param get_projectRequest
     * @return Result of the get_project operation returned by the service.
     * @sample WebRobotCliSdk.get_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_project" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_projectResult get_project(Get_projectRequest get_projectRequest) {
        HttpResponseHandler<Get_projectResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_projectResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_projectRequest, Get_projectResult>()
                .withMarshaller(new Get_projectRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_projectRequest));
    }

    /**
     * @param get_project_from_nameRequest
     * @return Result of the get_project_from_name operation returned by the service.
     * @sample WebRobotCliSdk.get_project_from_name
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_project_from_name" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Get_project_from_nameResult get_project_from_name(Get_project_from_nameRequest get_project_from_nameRequest) {
        HttpResponseHandler<Get_project_from_nameResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new Get_project_from_nameResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_project_from_nameRequest, Get_project_from_nameResult>()
                .withMarshaller(new Get_project_from_nameRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_project_from_nameRequest));
    }

    /**
     * @param get_scriptsRequest
     * @return Result of the get_scripts operation returned by the service.
     * @sample WebRobotCliSdk.get_scripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_scripts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_scriptsResult get_scripts(Get_scriptsRequest get_scriptsRequest) {
        HttpResponseHandler<Get_scriptsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_scriptsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_scriptsRequest, Get_scriptsResult>()
                .withMarshaller(new Get_scriptsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_scriptsRequest));
    }

    /**
     * @param get_status_jobRequest
     * @return Result of the get_status_job operation returned by the service.
     * @sample WebRobotCliSdk.get_status_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_status_job" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_status_jobResult get_status_job(Get_status_jobRequest get_status_jobRequest) {
        HttpResponseHandler<Get_status_jobResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_status_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_status_jobRequest, Get_status_jobResult>()
                .withMarshaller(new Get_status_jobRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_status_jobRequest));
    }

    /**
     * @param get_url_downloadRequest
     * @return Result of the get_url_download operation returned by the service.
     * @sample WebRobotCliSdk.get_url_download
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_url_download" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_url_downloadResult get_url_download(Get_url_downloadRequest get_url_downloadRequest) {
        HttpResponseHandler<Get_url_downloadResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_url_downloadResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_url_downloadRequest, Get_url_downloadResult>()
                .withMarshaller(new Get_url_downloadRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_url_downloadRequest));
    }

    /**
     * @param get_url_uploadRequest
     * @return Result of the get_url_upload operation returned by the service.
     * @sample WebRobotCliSdk.get_url_upload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/get_url_upload" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Get_url_uploadResult get_url_upload(Get_url_uploadRequest get_url_uploadRequest) {
        HttpResponseHandler<Get_url_uploadResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Get_url_uploadResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Get_url_uploadRequest, Get_url_uploadResult>()
                .withMarshaller(new Get_url_uploadRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(get_url_uploadRequest));
    }

    /**
     * @param import_allRequest
     * @return Result of the import_all operation returned by the service.
     * @sample WebRobotCliSdk.import_all
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/import_all" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Import_allResult import_all(Import_allRequest import_allRequest) {
        HttpResponseHandler<Import_allResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Import_allResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Import_allRequest, Import_allResult>()
                .withMarshaller(new Import_allRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(import_allRequest));
    }

    /**
     * @param import_projectRequest
     * @return Result of the import_project operation returned by the service.
     * @sample WebRobotCliSdk.import_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/import_project" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Import_projectResult import_project(Import_projectRequest import_projectRequest) {
        HttpResponseHandler<Import_projectResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Import_projectResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Import_projectRequest, Import_projectResult>()
                .withMarshaller(new Import_projectRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(import_projectRequest));
    }

    /**
     * @param start_jobRequest
     * @return Result of the start_job operation returned by the service.
     * @sample WebRobotCliSdk.start_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/start_job" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Start_jobResult start_job(Start_jobRequest start_jobRequest) {
        HttpResponseHandler<Start_jobResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Start_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Start_jobRequest, Start_jobResult>()
                .withMarshaller(new Start_jobRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(start_jobRequest));
    }

    /**
     * @param stop_jobRequest
     * @return Result of the stop_job operation returned by the service.
     * @sample WebRobotCliSdk.stop_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/stop_job" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Stop_jobResult stop_job(Stop_jobRequest stop_jobRequest) {
        HttpResponseHandler<Stop_jobResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Stop_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Stop_jobRequest, Stop_jobResult>()
                .withMarshaller(new Stop_jobRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(stop_jobRequest));
    }

    /**
     * @param update_attributeRequest
     * @return Result of the update_attribute operation returned by the service.
     * @sample WebRobotCliSdk.update_attribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_attribute" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Update_attributeResult update_attribute(Update_attributeRequest update_attributeRequest) {
        HttpResponseHandler<Update_attributeResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Update_attributeResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Update_attributeRequest, Update_attributeResult>()
                .withMarshaller(new Update_attributeRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(update_attributeRequest));
    }

    /**
     * @param update_botRequest
     * @return Result of the update_bot operation returned by the service.
     * @sample WebRobotCliSdk.update_bot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_bot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Update_botResult update_bot(Update_botRequest update_botRequest) {
        HttpResponseHandler<Update_botResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Update_botResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Update_botRequest, Update_botResult>()
                .withMarshaller(new Update_botRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(update_botRequest));
    }

    /**
     * @param update_conceptRequest
     * @return Result of the update_concept operation returned by the service.
     * @sample WebRobotCliSdk.update_concept
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_concept" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Update_conceptResult update_concept(Update_conceptRequest update_conceptRequest) {
        HttpResponseHandler<Update_conceptResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Update_conceptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Update_conceptRequest, Update_conceptResult>()
                .withMarshaller(new Update_conceptRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(update_conceptRequest));
    }

    /**
     * @param update_jobRequest
     * @return Result of the update_job operation returned by the service.
     * @sample WebRobotCliSdk.update_job
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_job" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Update_jobResult update_job(Update_jobRequest update_jobRequest) {
        HttpResponseHandler<Update_jobResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Update_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Update_jobRequest, Update_jobResult>()
                .withMarshaller(new Update_jobRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(update_jobRequest));
    }

    /**
     * @param update_pageRequest
     * @return Result of the update_page operation returned by the service.
     * @sample WebRobotCliSdk.update_page
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_page" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Update_pageResult update_page(Update_pageRequest update_pageRequest) {
        HttpResponseHandler<Update_pageResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Update_pageResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Update_pageRequest, Update_pageResult>()
                .withMarshaller(new Update_pageRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(update_pageRequest));
    }

    /**
     * @param update_projectRequest
     * @return Result of the update_project operation returned by the service.
     * @sample WebRobotCliSdk.update_project
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_project" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Update_projectResult update_project(Update_projectRequest update_projectRequest) {
        HttpResponseHandler<Update_projectResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Update_projectResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Update_projectRequest, Update_projectResult>()
                .withMarshaller(new Update_projectRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(update_projectRequest));
    }

    /**
     * @param update_scriptRequest
     * @return Result of the update_script operation returned by the service.
     * @sample WebRobotCliSdk.update_script
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/update_script" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Update_scriptResult update_script(Update_scriptRequest update_scriptRequest) {
        HttpResponseHandler<Update_scriptResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Update_scriptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Update_scriptRequest, Update_scriptResult>()
                .withMarshaller(new Update_scriptRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(update_scriptRequest));
    }

    /**
     * @param upload_fileRequest
     * @return Result of the upload_file operation returned by the service.
     * @sample WebRobotCliSdk.upload_file
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/upload_file" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Upload_fileResult upload_file(Upload_fileRequest upload_fileRequest) {
        HttpResponseHandler<Upload_fileResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new Upload_fileResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<Upload_fileRequest, Upload_fileResult>()
                .withMarshaller(new Upload_fileRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(upload_fileRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override

    public void shutdown() {
        clientHandler.shutdown();
    }

}
