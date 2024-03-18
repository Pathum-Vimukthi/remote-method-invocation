package com.rmiapplication;

import java.rmi.Naming;

public class MyClient {
    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("rmi://localhost:3445/myfirst");
            System.out.println(obj.printHello());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
