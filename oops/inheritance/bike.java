
public class bike {
    protected int gear;
    int maxSpeed;
    bike(int g){
        this.gear=0;
        this.maxSpeed=0;
        System.out.println("bike constructor is called");
    }
    void setMaxSpeed(int s){
        System.out.println(" called from bike");
        maxSpeed=1000;
    }
   

}

class raceBike extends bike{
   double gear;
    raceBike(){
        super(100);
        gear=1000;
        System.out.println("raceBike constructor is called");
        System.out.println(this.gear);

    }
    @Override
    void setMaxSpeed(int s){
        this.maxSpeed=10;
        System.out.println("called from racebike");
    }
  
}

class Main {
    public static void main(String args[]){
        raceBike r=new raceBike();
        r.setMaxSpeed(100);
    }
}