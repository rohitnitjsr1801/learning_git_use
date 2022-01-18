/* JAIKARA SHERAWAALI DA BOLO SACHE DARBAR KI JAI
   HAR HAR MAHADEV JAI BHOLENAATH
   Rohit Kumar

        "Everything in the universe is balanced. Every disappointment
                you face in life will be balanced by something good for you!
                        Keep going, never give up."
 
*/
 

import java.io.*;
import java.util.*;

public class Main {
    static class FastReader{

       BufferedReader br;
       StringTokenizer st;

       public FastReader(){

       br=new BufferedReader(new InputStreamReader(System.in));


       }

       String next(){

       while(st==null||!st.hasMoreTokens()){
         
         try{

          st=new StringTokenizer(br.readLine());

         }
         catch(IOException e){

            e.printStackTrace();
         }
           



       }
       return st.nextToken();}

      long nextLong(){ return Long.parseLong(next());}

      int nextInt(){ return Integer.parseInt(next());}
       

       }
     static int mod=(int)1e9+7;

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }


        FastReader sc = new FastReader();
        
        int tt=sc.nextInt();
        
        while(tt-->0)
        {
           int n=sc.nextInt();    
           int l=sc.nextInt();    
           int r=sc.nextInt();    
           int arr[]=new int[n];

           HashMap<Integer,Integer> hs=new HashMap<>();
           for(int i=0;i<n;i++)
           {
            arr[i]=sc.nextInt();
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
           }           
           for(int i=0;i<arr.length;i++)
           {
              
           }



        }



    }
    

    static <t>void print(t o){
    System.out.println(o);
   }

    static void reverse(int[] arr, int from, int till) {
        for (int i = from, j = till; i < j; i++, j--) {
            swap(arr, i, j);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    
    
    
    void sieveOfEratosthenes(int n)
    {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
    static long gcd(long a,long b)
    {
        if(b==0) return a;
        
        return gcd(b,a%b);
    }
    static boolean isprime(int n)
    {
        if(n<=1)
         return false;
        
        if(n<=3)
         return true;
        
        if(n%2==0||n%3==0)
         return false;
        
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0||n%(i+2)==0)
              return false;
        }
        return true;
    }

}