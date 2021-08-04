import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("1.Palindrome number "
				+ "2.Prints the pattern of stars in decreasing order "+"3. check Prime number"+"  4. Print Fibonacci series");
		int programs=in.nextInt();
		switch (programs) {
		case 0: System.out.println("Not valid"); break;
		case 1: {
			    Scanner inp= new Scanner(System.in);
			    System.out.print("Enter the number: ");
			    int num= inp.nextInt();
			  
			    int reverse=0, element, remainder; 
			    element = num;
			  
			    while(num!=0){
			      remainder= num % 10;
			      reverse = (reverse * 10) + remainder;
			      num = num / 10;
			    }
			  
			    if (element == reverse){
			      System.out.println("Yes, it is palindrome");
			    }
			    else{
			      System.out.println("No, it is not palindrome");
			    }
			  	}; break;
		case 2: {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number of rows: ");
		 
		    int rows = sc.nextInt();        
		    for (int i= 0; i<= rows-1 ; i++)
		    {
		        for (int j=0; j<=i; j++)
		        {
		            System.out.print(" ");
		        }
		        for (int k=0; k<=rows-1-i; k++)
		        {
		            System.out.print("*" + " ");
		        }
		        System.out.println();
		    }
		    sc.close();
			}; break;
		case 3: {    
			 Scanner pm = new Scanner(System.in);
			 System.out.println("Write the number");
			 int n= pm.nextInt();
			 
		  int i,m=0,flag=0;      
		  
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }
		}    
		 
; break;
		case 4: Scanner fir = new Scanner(System.in);
		System.out.println("Write the count");
		int count=fir.nextInt();
		
		int n1=0,n2=1,n3,i;    
		
		 System.out.print(n1+" "+n2);
		    
		 for(i=2;i<count;++i)  
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	; break;
		default : System.out.println("Error");
		}
		

	}

}
