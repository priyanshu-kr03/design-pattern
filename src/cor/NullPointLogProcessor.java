package cor;

public class NullPointLogProcessor extends LogProcessor{
    public NullPointLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int logLevel, String message) {
        if(logLevel == NULL_POINT){
            System.out.println("NULL_POINT "+message);
        } else {
            super.log(logLevel, message);
        }
    }
}
