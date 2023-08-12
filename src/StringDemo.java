public class StringDemo
{
    public static void main(String[] args) {
        String s,q,t;
        s=" Amar sonar Bangla ";
        q= " Ami tomai vlobashi";
        t=s+q;
        System.out.println(t);

        System.out.println(" Aaaa " + 5 + 3*2);// (*) Higher priority,(+) lower priority.
        System.out.println(" Aaaa " + 5 + 3);
    }
}
