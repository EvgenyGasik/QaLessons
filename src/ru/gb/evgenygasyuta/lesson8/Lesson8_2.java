package ru.gb.evgenygasyuta.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Lesson8_2 extends JFrame {
    public Lesson8_2(){
        setBounds(300,300,300,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("PASWDGEN");
        setResizable(false);


        JButton button = new JButton("Gen Passwd");
        JTextField text = new JTextField();

        text.setEnabled(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                String[] popPass = {"hello", "fine", "ook"};
                String str = " ";

                str += popPass[random.nextInt(4)];

                str += random.nextInt(90) + 10;

                text.setText(str);



            }
        });



        add(button, BorderLayout.NORTH);
        add(text, BorderLayout.CENTER);

        setVisible(true);






    }
    public static void main(String[] args) {
        new Lesson8_2();

    }
}
