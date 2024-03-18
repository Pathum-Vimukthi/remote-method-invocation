package com.rmiapplication;

import java.rmi.Naming;

public class MyServer {
    public static void main(String[] args) {
        try{
            Hello skel = new HelloRemote();
            Naming.rebind("rmi://localhost:3445/myfirst", skel);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
