package singleton;
//Simplest implementation of Singleton
//Not Thread Safe
public class DbSingleton {
    private static DbSingleton instance = new DbSingleton();

    private DbSingleton() {}

    public static DbSingleton getInstance() {
        return instance;
    }

}
