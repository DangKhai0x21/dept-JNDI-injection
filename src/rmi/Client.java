package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client(){}

    public static void main(String[] args){
        try{
//            Registry reg = LocateRegistry.getRegistry("127.0.0.1",1112);
            Hello Stub = (Hello) Naming.lookup("rmi://127.0.0.1:1113/Exploit");
            String reponse = Stub.sayHello();
            System.out.println(reponse);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
