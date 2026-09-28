/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public abstract class Consoles {
    // Variables to store the console details
    protected String consoleType;
    protected String store;
    protected int totalSales;

    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }
    // Getter for the console type
    public String getConsoleType() {
     return consoleType;
    }
    // Getter for the store name
    public String getStore() {
        return store;
    }
    // Getter for the total sales
    public int getTotalSales() {
        return totalSales;
    }

    public abstract void printReport();
}

