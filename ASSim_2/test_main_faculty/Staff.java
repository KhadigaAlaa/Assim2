package test_main_faculty;
public class Staff extends employee
{
String title;

    public Staff(String Title,String Name, String Phone, String Email, String Address, String OFfice, String Data_hired, double SAlary)
    {
        super(Name, Phone, Email, Address, OFfice, SAlary, Data_hired);
        title=Title;
    }
@Override
      public String to_String()
  {
      return "Staff"+name;
  }
}
