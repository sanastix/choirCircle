package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextBigInteger()){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            if (a.gcd(b).equals(BigInteger.ONE)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }



}