/*
 * Created on 14 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.yaps.petstore.server.service.customer;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/**
 * @author Veronique
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface CustomerServiceHome extends EJBHome {
 static final String JNDI_NAME = "ejb/stateless/CustomerService";
 
 CustomerService create() throws RemoteException, CreateException;
}
