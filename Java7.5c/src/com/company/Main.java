package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,b,k,i;
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[50];
        System.out.print("Introduceti nr de elemente al tabloului: ");
        n=scanner.nextInt();
        int[] v = new int[n];
        for (i=0;i<n;i++)
        {
            System.out.print("v["+i+"]=");
            v[i] = scanner.nextInt();
        }
        System.out.print("Introduceti baza in care doriti sa transformati elementele tabloului: ");
        b=scanner.nextInt();
        for(i=0;i<n;i++)
        {
            k = 0;
            System.out.print(v[i] + " in baza " + b + " este: ");
            baza_b(a, v[i], b, k);
            System.out.print("\n");
        }
    }
    public static void baza_b (int[] a, int m, int b, int k)
    {
        if(m>0)
        {
            a[k]=m % b;
            k++;
            baza_b(a,m/b,b,k);
        }
        else
        {
            for(int i=k-1;i>=0;i--)
                System.out.print(a[i]);
        }
    }
}
