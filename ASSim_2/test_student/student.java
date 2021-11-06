package test_student;
public class student 
{
    
    String name;
    private int student_ID;
    int stud_gpa;
    subject subject;
    address address;

    public student(String Name, int student_GPA, subject Subject, address Address) 
    {
        name = Name;
        stud_gpa = student_GPA;
        subject = Subject;
        address = Address;
    }

    public void set_Student_ID(int studentID)
    {
        student_ID = studentID;
    }

    public int get_Student_ID() 
    {
        return student_ID;
    }
    public void Display()
    {
        System.out.println(" student name " + name + " student ID " + get_Student_ID() + " student GPA " + stud_gpa );
        System.out.println(" subject ID " + subject.subjectID + " subject name " + subject.subjectname + subject.subjecthours);
        System.out.println(" student address is " + address.city + " " + address.country + " " + address.NO_street);
    }
}
