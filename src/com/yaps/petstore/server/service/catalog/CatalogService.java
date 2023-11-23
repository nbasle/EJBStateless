/*
 * Created on 14 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.yaps.petstore.server.service.catalog;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.EJBObject;

import com.yaps.petstore.common.dto.CategoryDTO;
import com.yaps.petstore.common.dto.ItemDTO;
import com.yaps.petstore.common.dto.ProductDTO;
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
public interface CatalogService extends EJBObject {
//	 ======================================
    // =      Category Business methods     =
    // ======================================
    public CategoryDTO createCategory(final CategoryDTO categoryDTO) throws CreateException, CheckException, RemoteException;

    public CategoryDTO findCategory(final String categoryId) throws FinderException, CheckException , RemoteException;

    public void deleteCategory(final String categoryId) throws RemoveException, CheckException , RemoteException;

    public void updateCategory(final CategoryDTO categoryDTO) throws UpdateException, CheckException , RemoteException;

    public Collection findCategories() throws FinderException , RemoteException;

    // ======================================
    // =      Product Business methods     =
    // ======================================
    public ProductDTO createProduct(final ProductDTO productDTO) throws CreateException, CheckException , RemoteException;

    public ProductDTO findProduct(final String productId) throws FinderException, CheckException , RemoteException;

    public void deleteProduct(final String productId) throws RemoveException, CheckException , RemoteException;

    public void updateProduct(final ProductDTO productDTO) throws UpdateException, CheckException , RemoteException;

    public Collection findProducts() throws FinderException , RemoteException;

    public Collection findProducts(String categoryId) throws FinderException , RemoteException;

    // ======================================
    // =        Item Business methods       =
    // ======================================
    public ItemDTO createItem(final ItemDTO itemDTO) throws CreateException, CheckException , RemoteException;

    public ItemDTO findItem(final String itemId) throws FinderException, CheckException , RemoteException;

    public void deleteItem(final String itemId) throws RemoveException, CheckException , RemoteException;

    public void updateItem(final ItemDTO itemDTO) throws UpdateException, CheckException , RemoteException;

    public Collection findItems() throws FinderException , RemoteException;

    public Collection findItems(final String productId) throws FinderException , RemoteException;
    public Collection searchItems(final String keyword) throws FinderException , RemoteException;

    
}
