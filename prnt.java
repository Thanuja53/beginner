class Prnt
 {   
    public static void recur(int n) 
    { 
     
      if(n <= 10) 
      {
         System.out.println(n); 
         recur(n+1);  
      }
    }
    public static void main(String args[]) 
    {
    recur(1); 
    }
 }
