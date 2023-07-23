
class A1 extends Thread{
    public  void run(){
        for(int i=0;i<=5;i++)
            System.out.println(" inside Thread A: i =" + i);
    }
}
class  B1 extends Thread{
    public  void run(){
        for(int j=0;j<=5;j++)
            System.out.println(" inside Thread b: j =" + j);
    }
}

public class ExampleThreads
{
    public static void main(String[] args) {
        A1 ob=new A1();
        //ob.setPriority(Thread.MAX_PRIORITY);
        System.out.println(" String Thread A");
        ob.start();
        B1 obj=new B1();
        //obj.setPriority(Thread.MIN_PRIORITY);
       System.out.println(" String Thread B");
        obj.start();


    }
}

