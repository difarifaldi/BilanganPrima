public class BilanganPrima {
 public static void main (String args []){
 
  int hitung = 0; 
  int angka = 2; 
  
  
  while(hitung < 25){
   
  
   boolean prima = true;
   
   for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
    
    if (angka % pembagi == 0){
     prima = false;
     break;
    }
    
   }
   
   if(prima){
    
    hitung++;
    
    if(hitung % 100 == 0){
     System.out.println(angka);
 
    }
    
    else{
     System.out.print(angka + " ");
 
    }
   }
  
   angka++;
  }
 
  
 }
 
}