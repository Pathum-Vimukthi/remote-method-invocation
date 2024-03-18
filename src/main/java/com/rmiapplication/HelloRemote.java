package com.rmiapplication;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemote extends UnicastRemoteObject implements Hello {
    public HelloRemote() throws RemoteException {
        super();
    }

    public String printHello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        try {
            HelloRemote obj = new HelloRemote();
            Naming.rebind("HelloServer", obj);
        } catch (Exception e) {
            System.out.println("HelloRemote err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
