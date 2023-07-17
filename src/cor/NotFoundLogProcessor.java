package cor;

public class NotFoundLogProcessor extends LogProcessor {
    public NotFoundLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int logLevel, String message) {
        if(logLevel == NOT_FOUND){
            System.out.println("NOT_FOUND "+message);
        } else {
            super.log(logLevel, message);
        }
    }
}
