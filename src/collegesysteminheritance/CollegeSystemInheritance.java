/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesysteminheritance;

/**
 *
 * @author moxdroid
 */
public class CollegeSystemInheritance {

    /**
     * @param args the command line arguments
     */
    
    public void main()
    {
        
    }
    public static void main(String[] args) {
        
        
        Student s1 = new Student();
        s1.display();
        String t = Student.NAME;
        t = s1.NAME;
        Person p1 = new Person();
        p1.display();
        
        //Runtime binding
        p1 = s1;
        p1.display();
        
        Student.test();
        s1.test();
        
        //Employee e = new Employee();
        //e.print();
        // Hii.. Comment added by Sonia
        
    }
    
}
