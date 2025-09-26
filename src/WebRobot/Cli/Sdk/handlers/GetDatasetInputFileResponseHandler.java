package WebRobot.Cli.Sdk.handlers;
import WebRobot.Cli.Sdk.model.Get_dataset_input_fileResult;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import org.apache.commons.io.FileUtils;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/*

public class GetDatasetInputFileResponseHandler implements HttpResponseHandler<Get_dataset_input_fileResult> {

    public GetDatasetInputFileResponseHandler() {

    }

    @Override
    public Get_dataset_input_fileResult handle(HttpResponse response) throws ClientProtocolException, IOException {
        InputStream source = response.getContent();
        Get_dataset_input_fileResult inputFileResult =  new Get_dataset_input_fileResult();
        inputFileResult.setInputStream(source);
        return inputFileResult;
    }

    @Override
    public boolean needsConnectionLeftOpen() {
        return false;
    }

}*/