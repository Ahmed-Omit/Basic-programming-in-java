public class Student{
    String name,department,university,gender;
    int roll;

    public static void main(String[] args)
    {
        Student t1;
        t1=new Student();
        t1.name=" Ahmed Omit";
        t1.department=" Computer science";
        t1.university=" University of British Columbia";
        t1.gender=" mail";
        t1.roll=12345;
        System.out.println(" Name : " + t1.name);
        System.out.println(" department : " + t1.department);
        System.out.println(" university : " + t1.university);
        System.out.println("  mail : " + t1.gender);
        System.out.println(" Name : " + t1.roll);
    }
}
// Use object and class