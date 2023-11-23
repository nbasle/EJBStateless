
import javax.ejb.EJBObject;
import java.rmi.RemoteException;
import java.util.Date;

public interface Hello extends EJBObject {

    String sayHello() throws RemoteException;

    Date today() throws RemoteException;
}
