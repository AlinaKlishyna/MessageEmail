package com.gmail.alinakotova102;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{
    private JPanel panelMain;
    private JButton select;
    private JLabel info;

    public MainForm(){
        //display title form
        super("Invio di messagi dei nuovi clienti");

        //display components
        setContentPane(panelMain);
    }
}