package com.yyf.form;

import com.yyf.module.BarTableModel;
import com.yyf.module.ProgressRenderer;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by andy on 2015/8/10 0010.
 */
public class MainForm {
    private JPanel mainPanel;
    private JScrollPane centerPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JTextField fileField;
    private JButton fileBtn;
    private JProgressBar allpgBar;
    private JButton startBtn;
    private JTable fileTable;


    public MainForm() {
        fileBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                /*JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jFileChooser.showOpenDialog(null);
                File file = jFileChooser.getSelectedFile();
                System.out.println(file.getPath());
                fileField.setText(file.getPath());*/
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
