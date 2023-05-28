package patterns.factory;

public class CreateCarFactoryElectric implements CarFactory {
    @Override
    public Car createCarFactory() {
        return new ElectricCar();
    }
}
