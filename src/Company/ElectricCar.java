package Company;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerCharge;
    private int batterySize;

   public ElectricCar(String name,String description ,double avgKmPerCharge,int batterySize){
       super(name,description);
       this.avgKmPerCharge=avgKmPerCharge;
       this.batterySize=batterySize;

   }
    @Override
    public void startEngine() {
        System.out.println("ElectricCar engine is starting...");
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar car is in motion. Driving...");
        runEngine();
    }
}
