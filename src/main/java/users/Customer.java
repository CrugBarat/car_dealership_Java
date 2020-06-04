package users;

import behaviours.IBuy;
import behaviours.ISell;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy, ISell {

    private String name;
    private double cash;
    private ArrayList<Vehicle> carCollection;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.carCollection = new ArrayList<Vehicle>();
    }

    public String getName() {
        return this.name;
    }

    public double getCash() {
        return this.cash;
    }

    public int getCarCollectionSize() {
        return this.carCollection.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void addCar(Vehicle vehicle) {
        this.carCollection.add(vehicle);
    }

    public void removeCar(Vehicle vehicle) {
        this.carCollection.remove(vehicle);
    }

    public void addCash(double amount) {
        this.cash += amount;
    }

    public void removeCash(double amount) {
        this.cash -= amount;
    }

    public void buyCar(Vehicle vehicle) {
        addCar(vehicle);
        removeCash(vehicle.getPrice());
    }

    public void sellCar(Vehicle vehicle) {
        removeCar(vehicle);
        addCash(vehicle.getPrice());
    }
}
