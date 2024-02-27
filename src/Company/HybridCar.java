package Company;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;

    private int cylinders;

    public HybridCar(String name,String description,double avgKmPerLitre,int batterySize,int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid engine is starting...");
    }


    @Override
    public void drive() {
        System.out.println("Hybrid car is in motion. Driving...");
        runEngine();
    }

}
