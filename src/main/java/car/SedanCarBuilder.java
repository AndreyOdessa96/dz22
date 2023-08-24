package car;

public class SedanCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildMake() {
        car.setMake("Toyota");
    }

    @Override
    public void buildModel() {
        car.setModel("Camry");
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
