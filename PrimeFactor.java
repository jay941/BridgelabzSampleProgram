package com.bridgelab.task;

import java.util.Scanner;

public class PrimeFactor 
{
public static void main(String[] args) 
{ Scanner sc=new Scanner(System.in);
int n;



System.out.println("  Enter the number to find the prime factors");
n=sc.nextInt();

System.out.print("The prime factorization of " + n + " is: ");

for (int i = 2; i*i <= n; i++) {

//checking prime factor
while (n % i == 0) {
    System.out.print(i + " "); 
    n = n / i;
}
}


if (n > 1) System.out.println(n);
else       System.out.println();
}

}
