package vehicles;

import products.IProduct;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised{

   private String HullType;

   public Speedboat(float weight, int maxSpeed, IProduct baseProduct, Motor motor){
       super(weight, maxSpeed, baseProduct);
       this.HullType = "Planing Hull";
   }

    @Override
    public String getHullType() {
        return HullType;
    }

    @Override
    public void setHullType(String hullType) {
        HullType = hullType;
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public void setFuel(int fuel) {

    }
}
