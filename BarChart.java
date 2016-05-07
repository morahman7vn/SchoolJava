/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchart;

import javax.swing.JOptionPane;

/**
*Bar Chart:
*
*Write a program that asks the user to enter today's sales for five stores.
* The program should display a bar chart comparing each stores sales.
* Create each bar in the bar chart by displaying a row of asterisks. Each asterisk should represent $100 of sales.
* Do not accept any number less than $100.00. Here is an example of the program's output:
 * @author Mo Rahman 04/01/2016 22:37 - Finished 05/06/2016 20:50
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        final int SalesMen = 5;
        
        int[] sales = new int[SalesMen];
        
        String [] salesChart = new String [SalesMen];
        
        salesChart[0] = ("BARCHART: "); salesChart[1] = ("BARCHART: ");salesChart[2] = ("BARCHART: ");
        salesChart[3] = ("BARCHART: "); salesChart[4] = ("BARCHART: ");
		
	JOptionPane.showMessageDialog(null,"This program will store and display sales by "+SalesMen+" salesmen."
                + "\n And represent them in Asterisks per $100.");
		
	sales[0] = Integer.parseInt( JOptionPane.showInputDialog ("First salesmen's yield?"));
		while (sales[0] < 100)
			sales[0] =  Integer.parseInt( JOptionPane.showInputDialog ("Sorry, only values above 100 are accepted"));
	
	sales[1] =   Integer.parseInt( JOptionPane.showInputDialog ("Second salesmen's yield?"));
		while (sales[1] < 100)
				sales[1] =  Integer.parseInt( JOptionPane.showInputDialog ("Sorry, only values above 100 are accepted"));
		
	sales[2] =  Integer.parseInt (JOptionPane.showInputDialog ("Third salesmen's yield?"));
		while (sales[2] < 100)
                    sales[2] =  Integer.parseInt( JOptionPane.showInputDialog ("Sorry, only values above 100 are accepted"));
	
	sales[3] =  Integer.parseInt (JOptionPane.showInputDialog ("Fourth salesmen's yield?"));
		while (sales[3] < 100)
			sales[3] =  Integer.parseInt( JOptionPane.showInputDialog ("Sorry, only values above 100 are accepted"));
		
	sales[4] =  Integer.parseInt (JOptionPane.showInputDialog ("Fifth salesmen's yield?"));
		while (sales[4] < 100)
			sales[4] =  Integer.parseInt( JOptionPane.showInputDialog ("Sorry, only values above 100 are accepted"));
                
        for (int salesCount = 0; salesCount < sales[0]; salesCount += 100)
            {
                salesChart[0] += ("*");
            }
        
        for (int salesCount = 0; salesCount < sales[1]; salesCount += 100)
            {
                salesChart[1] += ("*");
            }
        
        for (int salesCount = 0; salesCount < sales[2]; salesCount += 100)
            {
                salesChart[2] += ("*");
            }
        for (int salesCount = 0; salesCount < sales[3]; salesCount += 100)
            {
                salesChart[3] += ("*");
            }
        for (int salesCount = 0; salesCount < sales[4]; salesCount += 100)
            {
                salesChart[4] += ("*");
            }
        
        JOptionPane.showMessageDialog(null,"Salesmen 1: "+sales[0]+"\nSalesman 2: "+sales[1]+"\nSalesmen 3: "+sales[2]+"\n"
                                         + "Salesmen 4: "+sales[3]+"\nSalesmen 5: "+sales[4] + "\n"
                                         + "\n SALES BARCHART \n"
                                         + "SALESMEN 1 " + salesChart[0] + "\n"
                                         + "SALESMEN 2 " + salesChart[1] + "\n"
                                         + "SALESMEN 3 " + salesChart[2] + "\n"
                                         + "SALESMEN 4 " + salesChart[3] + "\n"
                                         + "SALESMEN 5 " + salesChart[4] + "\n");

    }
    
}
