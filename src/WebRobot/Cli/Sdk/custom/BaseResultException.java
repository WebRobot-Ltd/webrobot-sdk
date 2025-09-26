package WebRobot.Cli.Sdk.custom;
import java.io.Serializable;

public class BaseResultException extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {
    private Exception ex;
    private String message;
    public String getMessage()
    {
        return this.message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public Exception getException()
    {
        return this.ex;
    }
    public void setException(Exception ex)
    {
        this.ex = ex;
    }
}
