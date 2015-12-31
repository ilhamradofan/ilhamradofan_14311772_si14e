/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

/**
 *
 * @author owner
 */
 class yamaha {
public void tampilkan(){
 double besarsilinder;
 String bahanbakar;
 String kategori;

 besarsilinder=32.5;
 bahanbakar="bensin";
 kategori="road";

 motor m = new motor();

 m.inputData("NINJA", "Merah", "Ekonomis", 2);
 m.tampilkandata();

   System.out.println("silinder :"+besarsilinder);
   System.out.println("jenis bahan bakar :"+bahanbakar);
   System.out.println("jenis kategori :"+kategori);
}
   
    
}
