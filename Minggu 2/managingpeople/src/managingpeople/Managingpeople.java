
package managingpeople;


public class Managingpeople {
    String Name; 
    int Age; 
    
    public Managingpeople (String name, int age) {
        this.Name = name;
        this.Age = age;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public static void main(String[] args) {
        Managingpeople p1 = new Managingpeople ("Arial", 37);
        Managingpeople p2 = new Managingpeople ("Joseph", 15);
        
        if(p1.getAge()==p2.getAge()) {
            System.out.println(p1.getName()+" is the same age as "+p2.getName());
        }
        
        else {
            System.out.println(p1.getName()+" is NOT the same age as "+p2.getName());
        }
    }
    
}
