/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;
import motor.honda;
import motor.yamaha;
/**
 *
 * @author owner
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("HONDA");

honda h = new honda();
h.tampilkan();

System.out.println("\nYAMAHA");

yamaha t = new yamaha();
t.tampilkan();

 }    
    
    
}
