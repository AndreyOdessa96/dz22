package car;

public interface CarBuilder {
    void buildMake();
    void buildModel();
    void buildYear();
    Car getCar();
}
