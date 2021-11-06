package test_main_faculty;
public class student extends person
{
   // final  String [4] status ={"freshman","sophonemore ","junior "," senior"};
    final String Status_1="freshman"; 
    final String Status_2="sophonemore";
    
    final String Status_3="junior";  
    final String Status_4="senior";
    
  public student(String Name, String Phone, String Email, String Address )
  {
      super(Name,Phone,Email,Address);
  } 
    @Override
  public String to_String()
  {
      return "student"+name;
  }
}
