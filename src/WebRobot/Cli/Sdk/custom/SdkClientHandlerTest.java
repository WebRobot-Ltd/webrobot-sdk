package WebRobot.Cli.Sdk.custom;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.opensdk.BaseRequest;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;

@ThreadSafe
@Immutable
public class SdkClientHandlerTest extends ClientHandler {
    private final ClientHandler delegateHandler;

    public SdkClientHandlerTest(ClientHandlerParams handlerParams) {
        this.delegateHandler = new SdkClientHandler(handlerParams);
    }

    public <Input, Output> Output execute(ClientExecutionParams<Input, Output> executionParams) {
        return this.delegateHandler.execute(this.addRequestConfig(executionParams));
    }

    public void shutdown() {
        this.delegateHandler.shutdown();
    }

    private <Input, Output> ClientExecutionParams<Input, Output> addRequestConfig(ClientExecutionParams<Input, Output> params) {
        return params.withRequestConfig(new RequestConfigAdapterTest((BaseRequest)params.getInput()));
    }
}
