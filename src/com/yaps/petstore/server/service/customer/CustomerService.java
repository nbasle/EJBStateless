/*
 * Created on 14 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.yaps.petstore.server.service.customer;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.EJBObject;

import com.yaps.petstore.common.dto.CustomerDTO;
import com.yaps.petstore.common.exception.CheckException;
import com.yaps.petstore.common.exception.CreateException;
import com.yaps.petstore.common.exception.FinderException;
import com.yaps.petstore.common.exception.RemoveException;
import com.yaps.petstore.common.exception.UpdateException;

/**
 * @author Veronique
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface CustomerService extends EJBObject {
 CustomerDTO authenticate(String customerId, String password) throws FinderException, CheckException, RemoteException;
 
 CustomerDTO createCustomer(CustomerDTO customerDTO)throws CreateException, CheckException,RemoteException;
 
 CustomerDTO findCustomer(String customerId) throws FinderException, CheckException, RemoteException;
 
 void deleteCustomer(String customerId) throws RemoveException, CheckException, RemoteException;
 
 void updateCustomer(CustomerDTO customerDTO) throws UpdateException, CheckException, RemoteException;
 
  Collection findCustomers() throws FinderException, RemoteException;
 
}
