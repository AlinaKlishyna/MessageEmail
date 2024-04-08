package com.gmail.alinakotova102.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainForm extends JFrame{
    private JPanel panelMain;
    private JButton select;
    private JLabel info;

    public MainForm(){
        //display title form
        super("Invio di messagi dei nuovi clienti");

        //display components
        setContentPane(panelMain);

        //when you press the button..
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //select file
                JFileChooser openFile = new JFileChooser();
                //display window dialog
                int file = openFile.showDialog(null, "Open file");
                //if file selected.. then
                if (file == JFileChooser.APPROVE_OPTION){
                    //get selected file
                    File fileEmails = openFile.getSelectedFile();
                }
            }
        });
    }
}