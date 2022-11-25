package Swing;

import LIambda.Person;
 import com.sun.java_cup.internal.runtime.Scanner;
import interfaces.marker.Dog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.text.Format;
import java.util.EventListener;
import java.util.Locale;
import java.util.jar.JarFile;

public class RadioButton_CheckBox {

    public static void main(String[] args) {
        JFrame frame=new JFrame("FRAME");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(new Dimension(600,400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        Font font=new Font("Italian",Font.BOLD,40);

        JRadioButton jRadioButton=new JRadioButton("jradiobutton");
        jRadioButton.setFont(font);
        //jRadioButton.setSize(90,90);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 10, 150, 75);
        slider.setFont(font);


        JCheckBox jCheckBox=new JCheckBox("jcheckBox");
        jCheckBox.setFont(font);

        JButton button=new JButton("button");
        button.setFont(font);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean insider=jRadioButton.isSelected();
                System.out.println("insider "+insider);
            }
        });

        frame.add(jRadioButton, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                        new Insets(5,5,5,5),0,0));

        frame.add(jCheckBox,new GridBagConstraints(1,0,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(5,5,5,5),0,0));

        frame.add(button, new GridBagConstraints(0,1,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(5,5,5,5),0,0));

        frame.add(slider, new GridBagConstraints(1,1,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(5,5,5,5),0,0));

        //frame.pack();
        frame.setVisible(true);

        System.out.println("4/2=" + 4/2 == "4/2=2");

    }
}