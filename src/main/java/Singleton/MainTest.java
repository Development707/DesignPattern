package Singleton;

public class MainTest {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton singleton4 = LazySingleton.getInstance();
                System.out.println(singleton4.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton singleton5 = LazySingleton.getInstance();
                System.out.println(singleton5.hashCode());
            }
        }).start();

    }
}
