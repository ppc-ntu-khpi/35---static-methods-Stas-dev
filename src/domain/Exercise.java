package domain;
import java.util.ArrayList;


// Завдання -  знайти усі прості дільники заданого шестизначного числа
public class Exercise {
    
    public static String  Calculate(int number ){ 
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        String outline = " " ;
        foo(number, primeNumbers);
        
        for(int j =0; j<primeNumbers.size(); j++){
        
        outline += "  " + Integer.toString(primeNumbers.get(j));
        
        }
        
       
        
        
      
        return outline;
        
       
      }
    
    public static ArrayList<Integer> foo (int number,  ArrayList<Integer> primeNumbers ){
    
    int ctr = 0;
   
   
    for(int  i  = number - 1; i!=1 ; i--){
        ctr = 0;
        if(number%i == 0 ){
             for(int j = i -1; j !=1; j--){
                  if(i % j == 0){
                   ctr ++; 
                  } 
            }
                if(ctr == 0 ){
                    primeNumbers.add(i);
                
            }
        } 
    
     }
   return  primeNumbers;  
    }
   

 
}    