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
abstract public class Employee implements IDisplay{
    int A = 500;
    
    public void print()
    {
        System.out.println(X);
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   abstract public void set();
    
}
