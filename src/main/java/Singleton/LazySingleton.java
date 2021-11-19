package Singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null){
            synchronized (Singleton.LazySingleton.class){
                if (instance == null){
                    instance = new Singleton.LazySingleton();
                }
            }
        }
//        if (instance == null){
//            instance = new LazySingleton();
//        }
        return instance;
    }
}
