package org.example.swingPractice;

import javax.swing.*;

public class SwingPractice {
    SwingPractice(){
        //creates a window frame
        JFrame frame = new JFrame();

        //creates a button with the name as text passed as parameter
        JButton buttonOk= new JButton("Ok");
        //set bounds of the button
        buttonOk.setBounds(100,100,100,50);
        //add the above created button the window frame
        frame.add(buttonOk);

        JButton buttonSubmit= new JButton("Submit");
        buttonSubmit.setBounds(200,100,100,50);
        frame.add(buttonSubmit);

        JButton buttonCancel= new JButton("Cancel");
        buttonCancel.setBounds(100,200,200,50);
        frame.add(buttonCancel);

        frame.setSize(1080,720);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
