package java_assignements;

import java.util.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		int sum=num1+num2;
		if(sum==num3)
			System.out.println("TRUE...Sum of "+num1+" + "+num2+" = "+num3);
		else
			System.out.println("FALSE...Sum of "+num1+" + "+num2+" != "+num3);
	}

}
