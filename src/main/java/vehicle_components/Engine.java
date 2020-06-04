package vehicle_components;

public class Engine extends Component {

    private double litres;
    private int power;
    private int torque;

    public Engine(String brand, String model, String dimensions, int quantity, int warranty, double litres, int power, int torque) {
        super(brand, model, dimensions, quantity, warranty);
        this.litres = litres;
        this.power = power;
        this.torque = torque;
    }

    public double getLitres() {
        return this.litres;
    }

    public int getPower() {
        return this.power;
    }

    public int getTorque() {
        return this.torque;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

}
