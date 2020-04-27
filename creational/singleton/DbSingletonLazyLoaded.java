package singleton;

//Should have better performance since this instance will be created only when getInstance is called
// Not thread safe
public class DbSingletonLazyLoaded {
    private static DbSingletonLazyLoaded instance = null;

    private DbSingletonLazyLoaded() {}

    public static DbSingletonLazyLoaded getInstance() {
        if (instance == null){
            instance = new DbSingletonLazyLoaded();
        }
        return instance;
    }
}
