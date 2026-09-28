/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        // Single-dimensional arrays
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };
        
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };
        
        // Two-dimensional array for sales   
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        // Print header for the sales report
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s %-10s %-10s %-10s%n", "", consoles[0], consoles[1], consoles[2]);
        
        // Print table data using single and 2D arrays
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-10d %-10d %-10d%n", 
                cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");
        
        // Fixed: Use square brackets for array creation
        int[] totalSalesPerCity = new int[cities.length];
        int maxSales = -1;
        int topCityIndex = 0;
        
        // Fixed: Double slashes for comment syntax
        // Calculate totals and determine the city with the most sales
        for (int i = 0; i < cities.length; i++) {
            int currentCityTotal = 0;
            for (int j = 0; j < consoles.length; j++) {
                currentCityTotal += sales[i][j];
            }
            totalSalesPerCity[i] = currentCityTotal;

            // Track highest sales
            if (currentCityTotal > maxSales) {
                maxSales = currentCityTotal;
                topCityIndex = i;
            } // Fixed: Closed if-statement brace
          
            System.out.printf("%-18s %-10d%n", cities[i], totalSalesPerCity[i]);
        } // Fixed: Closed main calculation for-loop brace

        System.out.println("--------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[topCityIndex]);
        System.out.println("--------------------------------------------------");
    }
}