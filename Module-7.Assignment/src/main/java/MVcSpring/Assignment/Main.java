//Q.1.Write a program to demonstrate the setter based dependency injection. 
package MVcSpring.Assignment;

public class Main {
    public static void main(String[] args) {
        // Create an engine instance
        Engine engine = new Engine();

        // Create a car instance
        Car car = new Car();

        // Inject the engine into the car
        car.setEngine(engine);

        // Start the car
        System.out.println(car.start()); // Output: Engine started.
    }
}
