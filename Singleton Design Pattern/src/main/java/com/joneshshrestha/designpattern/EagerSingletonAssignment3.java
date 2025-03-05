package com.joneshshrestha.designpattern;

import java.text.SimpleDateFormat;
import java.util.Date;

// Public class EagerSingletonAssignment3 with Eager Singleton design pattern that allows for exactly three distinct instances that creates instances as soon as the class is loaded
public class EagerSingletonAssignment3 {
    // Three private static instances of type EagerSingletonAssignment3
    // static modifier is used to ensure these variables are associated with the class itself rather than with individual objects
    private static final EagerSingletonAssignment3 instance1 = new EagerSingletonAssignment3();
    private static final EagerSingletonAssignment3 instance2 = new EagerSingletonAssignment3();
    private static final EagerSingletonAssignment3 instance3 = new EagerSingletonAssignment3();

    // Private constructor so that no object can be instantiated outside of this class
    private EagerSingletonAssignment3() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Instance created at:" + formattedDate);
    }

    // Static getter method of type EagerSingletonAssignment3 that belongs to this class instead of the object, it takes in an argument instance which is of type integer
    public static EagerSingletonAssignment3 getInstance(int instance) {
        // if-else condition that checks if the passed instance is 1,2 or 3. If it is either of the three valid (1,2 or 3),
        // return that specific instance associated with that passed argument, since all the instances are already created
        if (instance == 1) {
            return instance1;
        } else if (instance == 2) {
            return instance2;
        } else if (instance == 3) {
            return instance3;
        } else {
            // If the instance passed as an argument is not valid throw illegal argument exception
            throw new IllegalArgumentException("Instance must be 1, 2, or 3.");
        }
    }
}
