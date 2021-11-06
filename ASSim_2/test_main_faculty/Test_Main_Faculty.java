package test_main_faculty;
public class Test_Main_Faculty 
{
    public static void main(String[] args)
    {
       person p1=new person(" Khadiga " , "012343" , " nothing992@gmail.com ","minia ");
       System.out.println(p1.toString());
       student s1=new student(" alaa "  , " 011345 " , " hihsdasd@gmail.com ", " samalout ");
       System.out.println(s1.toString());   
       employee em1 = new employee(" Roka", " 0108344 " , " roo221@gmail.com " , " Egypt "  , " A " , 4000 , " 7/1/1995 ");
       System.out.println(em1.toString());
       faculty f1=new faculty( " Hend ", " 015342 " , " aa123@gmail.com " , " Alex " , "aa " , 3000,"2/5/2000",5,"11");
       System.out.println(f1.toString());
         
    }
    
}
