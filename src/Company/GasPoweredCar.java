package Company;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name,String description, double avgKmPerLitre,int cylinders){
        super(name, description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar engine is starting...");
    }

    // drive metodu override edildi
    @Override
    public void drive() {
        System.out.println("GasPoweredCar car is in motion. Driving...");
        runEngine();
    }
}
