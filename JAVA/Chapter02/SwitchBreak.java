package JAVA.Chapter02;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("Man");
                break;
            case 2:
                System.out.println("Java");
                break;
            case 3:
                System.out.println("Sejong");
                break;
            default:
                System.out.println("Default");
        }
        System.out.println("BYEBYE");


    }
}
