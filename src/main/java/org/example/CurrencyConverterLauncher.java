package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterLauncher {
    CurrencyConverterLauncher(){
        //creates a frame for GUI
        JFrame frame = new JFrame();

        JLabel rupeeLabel = new JLabel("Rupee");
        rupeeLabel.setBounds(50,100,60,30);
        frame.add(rupeeLabel);

        JTextField rupeeInputBox = new JTextField("0");
        rupeeInputBox.setBounds(105,100,60,30);
        frame.add(rupeeInputBox);

        JLabel dollarLabel = new JLabel("Dollar");
        dollarLabel.setBounds(175,100,60,30);
        frame.add(dollarLabel);

        JTextField dollarInputBox = new JTextField("0");
        dollarInputBox.setBounds(235,100,60,30);
        frame.add(dollarInputBox);

        JButton rupeeToDollarButton = new JButton("ToDollar");
        rupeeToDollarButton.setBounds(60,160,90,30);
        frame.add(rupeeToDollarButton);

        JButton dollarToRupeeButton = new JButton("ToINR");
        dollarToRupeeButton.setBounds(200,160,90,30);
        frame.add(dollarToRupeeButton);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(130,200,90,30);
        frame.add(closeButton);

        rupeeToDollarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = new Double(rupeeInputBox.getText());
                double dollarAmount = d/65.25;
                dollarInputBox.setText(String.format("%.2f",dollarAmount));
            }
        });

        dollarToRupeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = new Double(dollarInputBox.getText());
                double inrAmount = d*65.25;
                rupeeInputBox.setText(String.format("%.2f",inrAmount));
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setSize(1080,720);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
