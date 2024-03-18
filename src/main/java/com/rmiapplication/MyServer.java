package com.rmiapplication;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try{
            Hello skel = new HelloRemote();
            Registry registry = LocateRegistry.createRegistry(3445);
            registry.rebind("myfirst", skel);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
