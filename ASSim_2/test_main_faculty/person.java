package test_main_faculty;
public class person 
{
 String name;
 String address;
 String phone;
 String email;
 public person()
    {
        name = null;
        address = null;
        phone =null;
        email =null;
    }
  public person(String Name, String Phone, String Email, String Address )
  {
        name = Name;
        address = Address;
        phone = Phone;
        email = Email;
    }
  public String to_String()
  {
      return "person"+name;
  }
}
