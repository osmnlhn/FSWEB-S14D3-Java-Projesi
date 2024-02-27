package Brand;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders,String name ){
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi engine is starting";

    }

    @Override
    public String accelerate(){
        return "Mitsubishi engine is accelerating";

    }

    @Override
    public String brake(){
        return "Mitsubishi engine is braking";

    }

}
