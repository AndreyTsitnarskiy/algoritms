package patterns.factory;

public class CreateCarFactoryTrack implements CarFactory{
    @Override
    public Car createCarFactory() {
        return new TrackCar();
    }
}
