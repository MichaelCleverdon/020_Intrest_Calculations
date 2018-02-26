/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg020_interest_calculation;

import javax.swing.JOptionPane;

/**
 *
 * @author compsci
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(Interest());
        
        
        
        
        
    }

    private static double Interest() {
         double Principle;
        double Rate;
        double Period;
        double Time;
        
        Principle = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the loan amount?"));
        Rate = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your interest rate as a percent?"));
        Period = Double.parseDouble(JOptionPane.showInputDialog(null, "How often is the interest compounded? (Examples: 12 for monthly, 6 for bimonthly, etc..."));
        Time = Double.parseDouble(JOptionPane.showInputDialog(null, "How long is the loan for in years?"));
        Rate = Rate/100;
        System.out.println(Rate);
        
      
        double ROverN = (double)Rate/Period;
        double parenthesis = (double)(1+ROverN);
        double NTimesT = Period*Time;
        double parenPlusExp = Math.pow(parenthesis, NTimesT);
        double total = Principle*parenPlusExp;
        return total;
    }
    
}
