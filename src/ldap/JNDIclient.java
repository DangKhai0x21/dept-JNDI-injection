package ldap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.directory.InitialDirContext;

import com.sun.jndi.rmi.registry.RegistryContext;

import java.util.Hashtable;

public class JNDIclient {
    public static void main(String[] args) throws Exception{
        String url = "ldap://127.0.0.1:1039";
        Context ctx = new InitialContext();
        ctx.lookup(url);
    }
}
