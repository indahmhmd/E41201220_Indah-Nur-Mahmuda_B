
package person;

class orang{
    String fName;
    String IName;
    int stuId;
    String stuStatus;
}

public class Person {

    public static void main(String[] args){
        
        orang person1;
        person1 = new orang();
        
        person1.fName = "Lisa Pambolo";
        person1.IName = "Lisa";
        person1.stuId = 123456789;
        person1.stuStatus = "Active";
        
      
        System.out.println("Student Name = " + person1.fName);
        System.out.println("Nickname = " + person1.IName);
        System.out.println("Student ID = " + person1.stuId);
        System.out.println("Student Status = " + person1.stuStatus);
    }
    
}
