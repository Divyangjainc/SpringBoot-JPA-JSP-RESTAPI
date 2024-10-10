//Q.1.Write a program to demonstrate the setter based dependency injection. 
package MVcSpring.Assignment;

class Engine {
    public String start() {
        return "Engine started.";
    }
}

// Car class
class Car {
    private Engine engine; // Dependency is not set initially

    // Setter method for dependency injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String start() {
        if (engine == null) {
            return "No engine installed!";
        }
        return engine.start();
    }
}

