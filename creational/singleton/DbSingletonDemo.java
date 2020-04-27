package singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args){
        // Singleton Examples
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);


        DbSingletonLazyLoaded instanceLL = DbSingletonLazyLoaded.getInstance();

        System.out.println(instanceLL);

        DbSingletonLazyLoaded anotherInstanceLL = DbSingletonLazyLoaded.getInstance();

        System.out.println(anotherInstanceLL);


        DbSingletonThreadSafe instanceTR = DbSingletonThreadSafe.getInstance();

        System.out.println(instanceTR);

        DbSingletonThreadSafe anotherInstanceTR = DbSingletonThreadSafe.getInstance();

        System.out.println(anotherInstanceTR);


    }
}
