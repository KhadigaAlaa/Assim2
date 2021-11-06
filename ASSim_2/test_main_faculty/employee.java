package test_main_faculty;
public class employee extends person
{
    String office ;
    double salary;
    String data_Hired;
    
    public employee(String Name, String Phone, String Email, String Address ,String OFfice ,double SAlary,String Data_hired)
  {
      super(Name,Phone,Email,Address);
      office=OFfice;
      salary=SAlary;
      data_Hired=Data_hired;
  } 
    @Override
    public String to_String()
  {
      return "employee"+name;
  }
}
