package No_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame {
    private JTextField inputField;
    private JComboBox<String> currencyBox;
    private JButton convertButton;
    private JLabel resultLabel;

    public CurrencyConverter() {
        setLayout(new FlowLayout());

        inputField = new JTextField(10);
        add(inputField);

        String[] currencies = {"Dollar to Rupiah", "Rupiah to Dollar"};
        currencyBox = new JComboBox<>(currencies);
        add(currencyBox);

        convertButton = new JButton("Convert");
        add(convertButton);

        resultLabel = new JLabel("");
        add(resultLabel);

        event e = new event();
        convertButton.addActionListener(e);
    }

    void setLocationRelativeTo(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double value = Double.parseDouble(inputField.getText());
            String currency = currencyBox.getSelectedItem().toString();

            // Assuming 1 Dollar = 14000 Rupiah
            if (currency.equals("Dollar to Rupiah")) {
                value *= 14000;
            } else {
                value /= 14000;
            }

            resultLabel.setText(Double.toString(value));
        }
    }

}