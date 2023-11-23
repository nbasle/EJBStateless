/*
 * Created on 14 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.yaps.petstore.server.service.creditcard;

import javax.ejb.EJBLocalObject;

import com.yaps.petstore.common.exception.CheckException;
import com.yaps.petstore.server.domain.CreditCard;

/**
 * @author Veronique
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface CreditCardServiceLocal extends EJBLocalObject {
	public void verifyCreditCard(CreditCard creditCard) throws CheckException;
}
