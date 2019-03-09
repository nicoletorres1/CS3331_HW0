/*
 * Author: Nicole Torres
 * Date: 02/ 04/ 19
 * HW 0
 * CS 3331
 */

package edu.utep.cs.cs3331.pricewatcher;
import java.awt.*;
import java.net.URI;
import java.util.*;


public class ConsoleUi {
	private Item item;
	Scanner scan = new Scanner(System.in);


	public ConsoleUi(Item item) {
		this.item = item;
	}

	public void showWelcome() {
		// TODO Auto-generated method stub
		System.out.println("\nWelcome to Price Watcher!");
	}

	public void showItem() {
		// TODO Auto-generated method stub
		System.out.println("Here are the item details: \n ");
		System.out.print("item name: " + item.getItemName() + "\nItem URL: " + item.getURL());
		showPrice();
		showChange();
		System.out.println("Added: " + item.getItemDate() + "Max Price: $" + item.getMaxPrice());
	}

	public int promptUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 (to check price), 2 (to view page), or -1 to quit?" );
		int request = scan.nextInt();
		return request;
	}

	public void showPrice() {
		System.out.printf("\nItem Price: %.2f", item.getItemPrice());

	}

	public void showChange(){
		System.out.printf("\nItem Change: %.2f", item.getItemChange());
		System.out.println("%");
	}

	public void showURL(){
		System.out.println("Webpage displaying in your web browser.");
		try{
			Desktop d = Desktop.getDesktop();
			d.browse(new URI(item.getURL()));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void showThanks(){
		System.out.println("Thanks for using Price Watcher!");
	}

	public void showNotOption(){
		System.out.println("This is not an option");
	}

	public void newLine(){
		System.out.println();
	}

}
