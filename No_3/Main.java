package No_3;

import javax.swing.JFrame;

public class Main {
    
    public static void main(String args[]) {
        CurrencyConverter gui = new CurrencyConverter();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 150);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        gui.setTitle("Currency Converter");
    }
}
