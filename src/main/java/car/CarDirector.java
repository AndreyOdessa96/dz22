package car;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar() {
        carBuilder.buildMake();
        carBuilder.buildModel();
        carBuilder.buildYear();
        return carBuilder.getCar();
    }
}
