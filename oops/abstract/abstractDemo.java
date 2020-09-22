abstract class vehicle{
    protected int speed;
    int wheels;
     void speedUp(int inc){
        speed+=inc;
        System.out.println("curr "+speed);
    }
    abstract void speedDown();
}

class bike extends vehicle{
     int speed=10;
      void speedUp(int inc) {
         speed += inc;
         System.out.println("extend " + speed);
     }
     void speedDown(){speed--;}
}

class Main {
    public static void main(String args[]){
        bike b=new bike();
        b.speedUp(4);
    }
}