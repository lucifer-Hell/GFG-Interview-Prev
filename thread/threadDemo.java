class dog extends Thread{
    @Override
    public void run(){
        for(int i=0;i<4;i++)System.out.println("woof woof ");
    }
}
class cat extends Thread{
    @Override
    public void run(){
        for(int i=0;i<4;i++)System.out.println("meow meow ");
    }
}
class Main{
    public static void main(String args[]){
        dog d=new dog();
        cat c=new cat();
        d.start();
    //    try{ d.join();}catch(Exception e){};
        c.start();
    }
}