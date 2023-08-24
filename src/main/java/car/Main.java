package car;

public class Main {
    public static void main(String[] args) {
        CarBuilder sedanBuilder = new SedanCarBuilder();
        CarBuilder sportsCarBuilder = new SportsCarBuilder();

        CarDirector director = new CarDirector(sedanBuilder);
        Car sedanCar = director.buildCar();
        System.out.println("Sedan car: " + sedanCar.getDetails());

        director = new CarDirector(sportsCarBuilder);
        Car sportsCar = director.buildCar();
        System.out.println("Sports car: " + sportsCar.getDetails());
    }
}
