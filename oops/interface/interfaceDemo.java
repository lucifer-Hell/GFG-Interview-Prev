interface vehicle{
    void speedUp();
}

class bike implements vehicle{
    int  wheels=2;
    int speed=20;
    @Override
    public void speedUp() {
        this.speed+=speed;
        System.out.println(speed);
    }
}
class Main{
    public static void main (String args[]){
        bike b=new bike();
        b.speedUp();
      
    }
}