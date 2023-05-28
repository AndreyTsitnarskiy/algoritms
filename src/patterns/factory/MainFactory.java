package patterns.factory;

public class MainFactory {
    public static void main(String[] args) {
        CarFactory carFactory = createCarFactoryBySpeciality("auto");
        Car car = carFactory.createCarFactory();
        car.createCar();
    }

    static CarFactory createCarFactoryBySpeciality(String speciality) {
        if(speciality.equalsIgnoreCase("electric")) {
            return new CreateCarFactoryElectric();
        } else if(speciality.equalsIgnoreCase("track")) {
            return new CreateCarFactoryTrack();
        } else if(speciality.equalsIgnoreCase("auto")) {
            return new CreateCarFactoryAuto();
        } else {
            throw new IllegalArgumentException("Unknown speciality");
        }
    }
}
