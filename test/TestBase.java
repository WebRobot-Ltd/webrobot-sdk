import WebRobot.Cli.Sdk.Utils.Sha512Crypt;
import WebRobot.Cli.Sdk.WebRobotCliSdk;
import com.amazonaws.opensdk.SdkRequestConfig;
import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;
import com.google.common.hash.Hashing;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
public class TestBase {
    protected WebRobotCliSdk sdkClient  = null;
    @Before
    public void setup () {

        sdkClient = WebRobotCliSdk.builder()
                .connectionConfiguration(
                        new ConnectionConfiguration()
                                .maxConnections(100)
                                .connectionMaxIdleMillis(1000))
                .timeoutConfiguration(
                        new TimeoutConfiguration()
                                .httpRequestTimeout(29000)
                                .totalExecutionTimeout(29000)
                                .socketTimeout(29000))
                .build();
    }


    protected void uploadFile(URL url, InputStream stream) throws IOException
    {

        // Create the connection and use it to upload the new object using the pre-signed URL.
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("PUT");
        IOUtils.copy(stream, connection.getOutputStream());

        // Check the HTTP response code. To complete the upload and make the object available,
        // you must interact with the connection object in some way.

        System.out.println("HTTP response code: " + connection.getResponseCode());
        System.out.println("HTTP response message: " + connection.getResponseMessage());

    }

    protected SdkRequestConfig getCustomSdkRequestConfig()
    {
        String headerApiKey = this.generateApiKeyHeader();
        String headerAuthHeader = this.generateAuthHeader();
        return SdkRequestConfig.builder().customHeader("x-api-key",headerApiKey).customHeader("Authorization",headerAuthHeader).build();
    }

    protected  String generateApiKeyHeader()
    {
        String apikey = "umGWhmzvGz50oRVFIxLkn3VOmWoZMOmU3CdYgH5s";

        return apikey;
    }

    protected String generateAuthHeader()
    {
        String apiKey =  "umGWhmzvGz50oRVFIxLkn3VOmWoZMOmU3CdYgH5s";
       String apiSecret = "e1rKfY9Ov$c3*ScZ6f!*ZB!8ehU&JnaiDR$9Tmq8";
       //String hashApiSecret = Sha512Crypt.Sha512_crypt(apiSecret,"salt",656000).toString();
       //String username_password = apiKey + ":" + hashApiSecret;
       //String encodedString = Base64.getEncoder().encodeToString(username_password.getBytes());
       return "Basic " + "dW1HV2htenZHejUwb1JWRkl4TGtuM1ZPbVdvWk1PbVUzQ2RZZ0g1czokNiRyb3VuZHM9NjU2MDAwJHNhbHQkb29ab2w1YTIxSU5mSWhvRjJHV0psWW0ydlN4ZjRjaUg0WmV5RVpOeE5oaGE1T21COFJWSzFicmdYTG9EemJvUXE4OWVURnY3Z1hybEowd3R2ZVJxLy8=";
       //return "Basic dW1HV2htenZHejUwb1JWRkl4TGtuM1ZPbVdvWk1PbVUzQ2RZZ0g1czokNiRyb3VuZHM9NjU2MDAwJHZzcWllM3VkNHp0dVVxZkEka3p1NHFQN2NCQXNrcGJWWDVWOGRRSlFXUTYwck44bjVPOFRHdWouT1djYXBmUHpRQWJpWS9XUUtGb3N5Rk94SW1LRGhZLkptdkRpdk9TcUl3Rk1mdTA=";

    }
}
