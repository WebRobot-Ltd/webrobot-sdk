/**
 * null
 */
package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import WebRobot.Cli.Sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimePeriodMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimePeriodMarshaller {

    private static final MarshallingInfo<String> ENDTIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTimePeriod").build();
    private static final MarshallingInfo<String> STARTTIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimePeriod").build();

    private static final TimePeriodMarshaller instance = new TimePeriodMarshaller();

    public static TimePeriodMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimePeriod timePeriod, ProtocolMarshaller protocolMarshaller) {

        if (timePeriod == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timePeriod.getEndTimePeriod(), ENDTIMEPERIOD_BINDING);
            protocolMarshaller.marshall(timePeriod.getStartTimePeriod(), STARTTIMEPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
