package dev.mohammad.mirzakhani;

public class SingletonObject {

    public static SingletonObject instance;

    private SingletonObject() {}

    public static SingletonObject getInstance() {

        if (instance == null) {
            synchronized (SingletonObject.class) {
                if (instance == null) {
                    instance = new SingletonObject();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
