package patterns.factory;

public class CreateCarFactoryAuto implements CarFactory {
    @Override
    public Car createCarFactory() {
        return new AutoCar();
    }
}
