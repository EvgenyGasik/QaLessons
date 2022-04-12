package ru.gb.evgenygasyuta.lesson8;

import javax.swing.*;
import javax.swing.tree.VariableHeightLayoutCache;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson8 extends JFrame {
    int count = 0;
    public Lesson8(){
        setBounds(300,300,400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Counter");
        setResizable(false);


        JLabel counter = new JLabel("0");
        JButton leftButton = new JButton("-");
        JButton rightButton = new JButton("+");

        Font font = new Font("Dialog",Font.BOLD,32);
        counter.setHorizontalAlignment(SwingConstants.CENTER);


        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count --;
                counter.setText(String.valueOf(count));
            }
        });
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count ++;
                counter.setText(String.valueOf(count));
            }
        });

        add(leftButton, BorderLayout.EAST);
        add(rightButton, BorderLayout.WEST);
        add(counter, BorderLayout.CENTER);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Lesson8();
    }

}
