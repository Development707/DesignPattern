package Singleton;

public class EagerSingleton {
    private static EagerSingleton instance;

    private EagerSingleton() {
    }

    static {
        try {
            instance = new EagerSingleton();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
