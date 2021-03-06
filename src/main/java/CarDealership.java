import behaviours.IBuy;
import behaviours.ISell;
import users.Customer;
import vehicles.Vehicle;

import java.util.ArrayList;

public class CarDealership implements IBuy, ISell {

    private String name;
    private double till;
    private ArrayList<Vehicle> carCollection;

    public CarDealership(String name, double till) {
        this.name = name;
        this.till = till;
        this.carCollection = new ArrayList<Vehicle>();
    }

    public String getName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }

    public int getCarCollectionSize() {
        return this.carCollection.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double cash) {
        this.till = cash;
    }

    public void addCar(Vehicle vehicle) {
        this.carCollection.add(vehicle);
    }

    public void removeCar(Vehicle vehicle) {
        this.carCollection.remove(vehicle);
    }

    public void addCash(double amount) {
        this.till += amount;
    }

    public void removeCash(double amount) {
        this.till -= amount;
    }

    public void buyCar(Vehicle vehicle) {
        addCar(vehicle);
        removeCash(vehicle.getPrice());
    }

    public void sellCar(Vehicle vehicle) {
        removeCar(vehicle);
        addCash(vehicle.getPrice());
    }

    public void buyCarFromCustomer(Vehicle vehicle, Customer customer) {
        buyCar(vehicle);
        customer.sellCar(vehicle);
    }

    public void sellCarToCustomer(Vehicle vehicle, Customer customer) {
        sellCar(vehicle);
        customer.buyCar(vehicle);
    }

    public void repair(Vehicle vehicle, double cost) {
        this.till -= cost;
        vehicle.setPrice(vehicle.getPrice() + cost);
    }
}
