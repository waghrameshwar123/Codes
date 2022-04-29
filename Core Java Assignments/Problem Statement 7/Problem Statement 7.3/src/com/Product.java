package com;

import java.util.*;

class Product implements java.io.Serializable{
  	private int m_prodID;
	private String m_prodName;
	
	Product() 
	{
		m_prodID = -1;		
		m_prodName = "";
	}
	Product(int newID, String newName)
	{
		m_prodID = newID;
		m_prodName = newName;
	}

	
	public int GetID()  {
		return m_prodID;
	}
	public String GetName() {
		return m_prodName;
	}
	public void SetID(int newID) {
		m_prodID = newID;
	}
	public void SetName(String newName) {
		m_prodName = newName;
	}

	// Method to print out our data
	public void PrintValues() {
		System.out.println(m_prodID + " " + m_prodName);
	}

	
	public boolean equals(Object otherProduct)
	{
		Product p = (Product) otherProduct;
		return (this.m_prodID == p.m_prodID);
	}
}

class Products
{
	private Vector m_vProds;

	public Products()
	{
		// Constructor just allocates new vector
		m_vProds = new Vector();
	}

	public void AddProduct(int newID, String newName)
	{
		int i;
		Product p;
		
		
		for (i=0; i < m_vProds.size(); i++) {
			p = (Product) m_vProds.elementAt(i);
			if (p.GetID() > newID) {
				break;	// insert at position i
			}
		}

		if (i==m_vProds.size()) {
			m_vProds.addElement(new Product(newID, newName));
		}
		else {
			m_vProds.insertElementAt(new Product(newID, newName), i);
		}
	}

	public void DeleteProduct(int targetID)
	{
		int i;
		i = m_vProds.indexOf(new Product(targetID,""));
		if (i<0) return;		
		m_vProds.removeElementAt(i);	
	}
	public String FindProductName(int targetID)
	{
		int i;
		String s= "";
		i = m_vProds.indexOf(new Product(targetID,""));
		if (i>=0) s = ((Product) m_vProds.elementAt(i)).GetName();
		return s;
	}

	public void PrintProducts()
	{
		Product p;
		for (int i=0; i<m_vProds.size(); i++) {
			p = (Product) m_vProds.elementAt(i);
			p.PrintValues();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Products p = new Products();
        System.out.println("List of the Product:");
		p.AddProduct(1001, "Maruti 800");
		p.AddProduct(2002, "Maruti Zen");
		p.AddProduct(3003, "Maruti Dezire");
		p.AddProduct(4004, "Maruti Alto");

		p.PrintProducts();	// Prints list in order of ID

		System.out.println("After deletion of the product the new List :");
		p.DeleteProduct(3);
		System.out.println("Object has been deserialized ");
		System.out.println("List of the Product:");
		p.PrintProducts();

	}

}

