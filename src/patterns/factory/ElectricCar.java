package patterns.factory;

public class ElectricCar implements Car{
    @Override
    public void createCar() {
        System.out.println("Create electric car");
    }
}
