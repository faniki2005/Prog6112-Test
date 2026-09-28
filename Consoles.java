/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public abstract class Consoles {
    
    protected String consoleType;
    protected String store;
    protected int totalSales;

    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }
    public String getConsoleType() {
     return consoleType;
    }
    public String getStore() {
        return store;
    }
    public int getTotalSales() {
        return totalSales;
    }

    public abstract void printReport();
}

