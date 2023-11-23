
import javax.ejb.SessionBean;
import javax.ejb.CreateException;
import javax.ejb.SessionContext;
import javax.ejb.EJBException;
import java.util.Date;

public class HelloBean implements SessionBean {

    public HelloBean() {
    }
    
    // ======================================
    // =     Category Business Methods      =
    // ======================================
    public String sayHello() {
        return "Hello Petstore !";
    }

    public Date today() {
        return new Date();
    }

    // ======================================
    // =            EJB callbacks           =
    // ======================================
    public void ejbCreate() throws CreateException {
    }

    public void setSessionContext(SessionContext sessionContext) throws EJBException {
    }

    public void ejbRemove() throws EJBException {
    }

    public void ejbActivate() throws EJBException {
    }

    public void ejbPassivate() throws EJBException {
    }
}
