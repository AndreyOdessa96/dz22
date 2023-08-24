package car;

public class SportsCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildMake() {
        car.setMake("Ferrari");
    }

    @Override
    public void buildModel() {
        car.setModel("488 GTB");
    }

    @Override
    public void buildYear() {
        car.setYear(2023);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
