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
final public class Student extends Person
{
    static String NAME = "HELLO";
    //So Sorry
    private float marks[];
    private float total;
    private float percentage;
    private String result; //PASS or FAIL

    public static void test()
    {
        
    }
    
    public Student() {
        super();
    }

    public Student(int id, String firstName, String lastName, String gender, String address, String city, float[] marks, float total, float percentage, String result) {
        super(id, firstName, lastName, gender, address, city);
        this.marks = marks;
        this.total = total;
        this.percentage = percentage;
        this.result = result;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    @Override
    public void display()
    {
        System.out.println("display of Student");
    }
    
    public void print()
    {
        
    }
}
