/*
 * Author: Nicole Torres
 * Date: 02/ 04/ 19
 * HW 0
 * CS 3331
 */


package edu.utep.cs.cs3331.pricewatcher;
import java.util.*;


public class Item {

    private String itemName = "LED Monitor";
    private String URL = "http://www.bestbuy.com/site/samsun-ue90-series-28-led-4k-uhd-moniotr-black/5484022.p?skuId=5484022";
    private double maxPrice = 369.99;
    private double minPrice = 61.67;
    private double itemPrice = getRandomPrice();
    private double itemChange = change();
    private String itemDate = "08/25/2018";


    // constructors
    public void item(){}

//    public void Item(String itemName, String URL, double maxPrice, double minPrice, double itemPrice, double itemChange, String itemDate){
//        this.itemName = itemName;
//        this.URL = URL;
//        this.maxPrice = maxPrice;
//        this.minPrice = minPrice;
//        this.itemPrice = itemPrice;
//        this.itemChange = itemChange;
//        this.itemDate = itemDate;
//    }

    //getters and setters
    public String getItemName() {
        return itemName;
    }

    public String getURL() {
        return URL;
    }

    public double getMaxPrice(){
        return maxPrice;
    }


    public double getItemPrice() {
        return itemPrice;
    }

    public double getItemChange() {
        return itemChange;
    }

    public String getItemDate() {
        return itemDate;
    }

    public double getRandomPrice(){
        Random ran = new Random();
        return ran.doubles(minPrice, (maxPrice + 1)).findFirst().getAsDouble();
    }


    public double change(){
        double increase = maxPrice - itemPrice;
        double percentage = (increase / maxPrice) * 100;

        return percentage;

    }

}
