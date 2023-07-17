class M extends  Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(" Inside thread A: "+i);
        }

    }
}



public class SingleThread
{
    public static void main(String[] args) {
        M op=new M();
        op.start();

    }
}
