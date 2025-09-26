/**
 * null
 */
package WebRobot.Cli.Sdk;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link WebRobot.Cli.Sdk.WebRobotCliSdk}.
 * 
 * @see WebRobot.Cli.Sdk.WebRobotCliSdk#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class WebRobotCliSdkClientBuilder extends SdkSyncClientBuilder<WebRobotCliSdkClientBuilder, WebRobotCliSdk> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("rgodb61otb.execute-api.eu-west-2.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "eu-west-2";

    /**
     * Package private constructor - builder should be created via {@link WebRobotCliSdk#builder()}
     */
    WebRobotCliSdkClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of WebRobotCliSdk using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of WebRobotCliSdk.
     */
    @Override
    protected WebRobotCliSdk build(AwsSyncClientParams params) {
        return new WebRobotCliSdkClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
