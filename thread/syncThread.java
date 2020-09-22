class syncThread {
    int speed=0;
    synchronized void speedUp(){
        System.out.println("incrementing speed");
        speed++;
     
    }
    public static void main(String args[]){
        syncThread s1=new syncThread(); 
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++)s1.speedUp();
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++)s1.speedUp();
        });
        t1.start();
        t2.start();
        try{t1.join();t2.join();}catch(Exception e){}
        System.out.println(s1.speed);
    }
}
