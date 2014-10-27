/**
 * @(#)ShoppingCart.java
 *
 *
 * @author 
 * @version 1.00 2014/10/24
 */
import java.util.*;
import java.text.*;

public class ShoppingCart {

	ArrayList items;
	NumberFormat format = NumberFormat.getCurrencyInstance();

    public ShoppingCart() {
    	items = new ArrayList();
    }
    
    public void addItem(Item item){
    	items.add(item);
    }
    
    public double getTotalPrice(){
    	double sum = 0.0D;
    	
    	for(Object obj : items){
    		Item item = (Item) obj;
    		
    		sum += item.getTotalPrice();
    	}
    	
    	return sum;
    }
    
    public String getTotalPriceFormatted(){
    	return format.format(getTotalPrice());
    }
    
    public int getTotalItems(){
    	int sum = 0;
    	
    	for(Object obj : items){
    		sum += ((Item) obj).getQuantity();
    	}
    	
    	return sum;
    }
    
    public String toString(){
    	String builder = "Item Name \t Price \t Quantity \t Total Price\n\n";
    
    	for(Object obj : items){
    		Item item = (Item) obj;
    		
    		builder += item.toString() + "\n";
    	}
    	
    	builder += "\n\nTotal Price : " + format.format(getTotalPrice());
    	builder += "\nTotal Items : " + getTotalItems();	
    	
    	return builder;
    }
    
    
}