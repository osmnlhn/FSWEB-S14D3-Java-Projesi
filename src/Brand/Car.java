package Brand;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;

    private int wheels;

    public Car(int cylinders,String name){

        this.cylinders=cylinders;
        this.name=name;

        this.engine=true;
        this.wheels=4;

    }

    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public String startEngine(){
        String message=getClass().getSimpleName()+"the car's engine is starting";
        System.out.println(message);

        return message;
    }

    public String accelerate(){
        String message=getClass().getSimpleName()+"the car is accelerating";
        System.out.println(message);
        return message;
    }

    public String brake(){

        String message=getClass().getSimpleName()+"the car is braking";
        System.out.println(message);
        return message;
    }


}
