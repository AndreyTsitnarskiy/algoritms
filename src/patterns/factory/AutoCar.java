package patterns.factory;

public class AutoCar implements Car{

    @Override
    public void createCar() {
        System.out.println("Create auto car");
    }
}
