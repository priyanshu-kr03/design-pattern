package singleton;

public class Singleton {
    // by adding volatile we ensure all the threads who are using instance must be updated
    private static volatile Singleton instance;
    private String data;
    private Singleton(String data) {
        this.data=data;
    }

    public static Singleton getInstance(String data) {
        if(instance==null) {
            synchronized (Singleton.class) {
                if(instance==null) {
                    instance = new Singleton(data);
                }
            }
        }
        System.out.println(data);
        return instance;
    }
}
