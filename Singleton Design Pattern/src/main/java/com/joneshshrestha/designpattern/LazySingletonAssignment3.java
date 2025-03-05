package com.joneshshrestha.designpattern;
import java.text.SimpleDateFormat;
import java.util.Date;

// Public class LazySingletonAssignment3 with Lazy Singleton design pattern that allows for exactly three distinct instances that creates instances only when first requested
public class LazySingletonAssignment3 {
    // Three private static instances of type LazySingletonAssignment3
    // static modifier is used to ensure these variables are associated with the class itself rather than with individual objects
    private static LazySingletonAssignment3 instance1;
    private static LazySingletonAssignment3 instance2;
    private static LazySingletonAssignment3 instance3;

    // Private constructor so that no object can be instantiated outside of this class
    private LazySingletonAssignment3() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Instance created at:" + formattedDate);
    }

    // Static getter method of type LazySingletonAssignment3 that belongs to this class instead of the object, it takes in an argument instance which is of type integer
    public static LazySingletonAssignment3 getInstance(int instance) {
        // if-else condition that checks if the passed instance is 1,2 or 3. If it is either of the three valid (1,2 or 3), check if the instance is already created
        // If the instance is not already created, create a new instance, else return the previously created instance
        if (instance == 1) {
            if (instance1 == null) {
                instance1 = new LazySingletonAssignment3();
            }
            return instance1;
        } else if (instance == 2) {
            if (instance2 == null) {
                instance2 = new LazySingletonAssignment3();
            }
            return instance2;
        } else if (instance == 3) {
            if (instance3 == null) {
                instance3 = new LazySingletonAssignment3();
            }
            return instance3;
        } else {
            // If the instance passed as an argument is not valid throw illegal argument exception
            throw new IllegalArgumentException("Instance must be 1, 2, or 3.");
        }
    }
}

