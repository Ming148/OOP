/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
public class Cat {
    private String name;
    private String color;
    public double height = 0;
    public double weight = 0;
    
    private void setWeight(double w){
        if (w > 0){
            weight = w;
        } else{
            System.out.println("Error");
        }
    }
    
    private void setHeight(double h){
        if (h > 0){
            height = h;
        } else{
            System.out.println("Error");
        }
    }
    
    private void setName(String n){
        
    }
    public static void main(String[] args) {
        
    }
}
