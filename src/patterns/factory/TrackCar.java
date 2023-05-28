package patterns.factory;

public class TrackCar implements Car{
    @Override
    public void createCar() {
        System.out.println("Create track car");
    }
}
