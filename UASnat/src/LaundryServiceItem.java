/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author - LENOVO -
 */
public class LaundryServiceItem {
    private String laundryName;
    private double price;
    private String laundryType;

    public LaundryServiceItem(String laundryName, double price, String laundryType) {
        this.laundryName = laundryName;
        this.price = price;
        this.laundryType = laundryType;
    }

    public String getLaundryName() {
        return laundryName;
    }

    public double getPrice() {
        return price;
    }

    public String getLaundryType() {
        return laundryType;
    }

    @Override
    public String toString() {
        return laundryName + " - Rp" + price + " (" + laundryType + ")";
    }
}
