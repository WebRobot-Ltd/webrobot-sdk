package WebRobot.Cli.Sdk.custom;

class UnreliableTestConfigTest {
    private int maxNumErrors = 1;
    private int bytesReadBeforeException = 100;
    private boolean isFakeIOException;
    private int resetIntervalBeforeException = 2;

    UnreliableTestConfigTest() {
    }

    int getMaxNumErrors() {
        return this.maxNumErrors;
    }

    int getBytesReadBeforeException() {
        return this.bytesReadBeforeException;
    }

    boolean isFakeIOException() {
        return this.isFakeIOException;
    }

    int getResetIntervalBeforeException() {
        return this.resetIntervalBeforeException;
    }

    UnreliableTestConfigTest withMaxNumErrors(int maxNumErrors) {
        this.maxNumErrors = maxNumErrors;
        return this;
    }

    UnreliableTestConfigTest withBytesReadBeforeException(int bytesReadBeforeException) {
        this.bytesReadBeforeException = bytesReadBeforeException;
        return this;
    }

    UnreliableTestConfigTest withFakeIOException(boolean isFakeIOException) {
        this.isFakeIOException = isFakeIOException;
        return this;
    }

    UnreliableTestConfigTest withResetIntervalBeforeException(int resetIntervalBeforeException) {
        this.resetIntervalBeforeException = resetIntervalBeforeException;
        return this;
    }
}
