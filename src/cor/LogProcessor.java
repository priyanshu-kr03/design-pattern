package cor;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int NULL_POINT = 2;
    public static int NOT_FOUND = 3;
    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor=logProcessor;
    }

    public void log(int logLevel, String message) {
        if(this.nextLogProcessor != null){
            this.nextLogProcessor.log(logLevel, message);
        }
    }
}
