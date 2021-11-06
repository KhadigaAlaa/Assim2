package test_student;
public class Test_student 
{
    public static void main(String[] args) 
    {
        subject s1 = new subject(100," english " , 4);
        address a1 = new address(23,"minia","Egypt");
        student s2 = new student(" Khadiga " , 2 , s1 , a1);
        s2.set_Student_ID(123);
        s2.Display();
    }
    
}
