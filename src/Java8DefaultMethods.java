/**
 * Java 8 introduces a new concept of default method implementation
 * For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method declaration. Thus, adding such method will simply break the collection framework implementations.
 * Java 8 introduces default method so that List/Collection interface can have a default implementation of forEach method,
 * and the class implementing these interfaces need not implement the same.
 * With default functions in interfaces, there is a possibility that a class is implementing two interfaces with same default methods.
 */

public class Java8DefaultMethods {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle vehicle = new Car();
        vehicle.print();

    }
}
interface Vehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler {

    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}



