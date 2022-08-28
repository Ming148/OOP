/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
public class camp {
    public static void main(String[] args) {
        int w = 4, k = 0;
        
        for (int i = w; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int v = (2 * k) + 1; v >= 1; v--){
                System.out.print("*");
            }
            ++k;
            System.out.println();
        }
    }
}
