package vehicles;

import products.IProduct;

public class Kayak extends Vehicle implements IWaterVehicle{
    private String HullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
            this.HullType = "V Shaped";

        }

    @Override
    public String getHullType() {
        return null;
    }

    @Override
    public void setHullType(String typeOfHull) {

    }
}
