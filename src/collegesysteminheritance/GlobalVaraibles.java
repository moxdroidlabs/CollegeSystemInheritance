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
public class GlobalVaraibles {
    
    
    public static void main(String args[])
    {
        Global g = new Global();
        System.out.println(g.NAME);
        g.NAME = "TEST NAME";
        System.out.println(Global.NAME);
    }
}
