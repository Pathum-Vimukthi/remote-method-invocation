package com.rmiapplication;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemote extends UnicastRemoteObject implements Hello {
    public HelloRemote() throws RemoteException {
        super();
    }

    public String printHello() {
        return "Hello, world!";
    }
}
