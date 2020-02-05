package by.shakhrai.exceptoin;

public class InputFileReaderException extends Exception{
    public InputFileReaderException() {
    }

    public InputFileReaderException(String message) {
        super(message);
    }

    public InputFileReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public InputFileReaderException(Throwable cause) {
        super(cause);
    }
}
