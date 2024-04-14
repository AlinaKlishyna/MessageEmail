package com.gmail.alinakotova102.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

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
            public void actionPerformed (ActionEvent e) {
                //select file
                JFileChooser openFile = new JFileChooser();
                //display window dialog
                int file = openFile.showDialog(null, "Open");
                //if file selected.. then
                if (file == JFileChooser.APPROVE_OPTION){
                    //get selected file
                    File fileEmails = openFile.getSelectedFile();

                    //Read file
                    FileReader reader = null;
                    try {
                        reader = new FileReader(fileEmails);
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
    }
}