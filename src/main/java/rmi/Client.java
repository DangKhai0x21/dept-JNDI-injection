package rmi;

import org.apache.naming.ResourceRef;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Hashtable;

public class Client {
    private Client(){}

    public static void main(String[] args){
        try{
//            Registry reg = LocateRegistry.getRegistry("127.0.0.1",1112);
//            Naming.lookup("mi://127.0.0.1:1092/Hello");
//            String reponse = Stub.sayHello();
//            System.out.println(reponse);
            Context ctx = new InitialContext();
            ctx.lookup("rmi://127.0.0.1:1092/Exploit");

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

