package test_main_faculty;
public class faculty extends employee
{
    int office_hours;
    String rank;

    public faculty(String Name, String Phone, String Email, String Address, String OFfice, double SAlary, String Data_hired,int OFfice_Hour,String Rank)
    {
        super(Name, Phone, Email, Address, OFfice, SAlary, Data_hired);
        office_hours=OFfice_Hour;
        rank=Rank;
    }
    @Override
      public String to_String()
  {
      return "Faculty"+name;
  }
}
