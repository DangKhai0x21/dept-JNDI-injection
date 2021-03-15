package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class Server extends HelloImpl {
    public Server() throws RemoteException {
        super();
    }

    public static void main(String[] args){
        try{
            HelloImpl hello = new HelloImpl();
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",1112 );

            registry.bind("hello",hello);

            System.out.println("Server ready");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
