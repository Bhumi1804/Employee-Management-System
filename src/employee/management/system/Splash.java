
//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Splash extends JFrame implements ActionListener {
//    
//    Splash() {
//        
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
//        heading.setBounds(80, 30, 1200, 60);
//        heading.setFont(new Font("serif", Font.PLAIN, 60));
//        heading.setForeground(Color.RED);
//        add(heading);
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(50, 100, 1050, 500);
//        add(image);
//        
//        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
//        clickhere.setBounds(400, 400, 300, 70);
//        clickhere.setBackground(Color.BLACK);
//        clickhere.setForeground(Color.WHITE);
//        clickhere.addActionListener(this);
//        image.add(clickhere);
//        
//        setSize(1170, 650);
//        setLocation(200, 50);
//        setVisible(true);
//        
//        while(true) {
//            heading.setVisible(false);
//            try {
//                Thread.sleep(500);
//            } catch (Exception e){
//                
//            }
//            
//            heading.setVisible(true);
//            try {
//                Thread.sleep(500);
//            } catch (Exception e){
//                
//            }
//        }
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        setVisible(false);
//        new Login();
//    }
//    
//    public static void main(String args[]) {
//        new Splash();
//    }
//}

//old
//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Splash extends JFrame implements ActionListener {
//
//    Splash() {
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//
//        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
//        heading.setBounds(350, 30, 1000, 60);
//        heading.setFont(new Font("serif", Font.PLAIN, 50));
//        heading.setForeground(Color.RED);
//        add(heading);
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH); // Full HD scaling
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(0, 100, 1920, 900); // adjust as per image height
//        add(image);
//
//        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
//        clickhere.setBounds(800, 600, 300, 70); // center it better
//        clickhere.setBackground(Color.BLACK);
//        clickhere.setForeground(Color.WHITE);
//        clickhere.addActionListener(this);
//        image.add(clickhere);
//
//        // Allow title bar (minimize/maximize/close)
//        setUndecorated(false);
//        // Maximize window to full screen
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//
//        // Blinking heading effect in a new thread to avoid blocking UI
//        new Thread(() -> {
//            while (true) {
//                heading.setVisible(false);
//                try {
//                    Thread.sleep(500);
//                } catch (Exception e) {}
//                heading.setVisible(true);
//                try {
//                    Thread.sleep(500);
//                } catch (Exception e) {}
//            }
//        }).start();
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        setVisible(false);
//        new Login();
//    }
//
//    public static void main(String args[]) {
//        new Splash();
//    }
//}

package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    Splash() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(350, 30, 1000, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 50));
        heading.setForeground(Color.RED);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH); // Full HD scaling
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 100, 1920, 900); // adjust as per image height
        add(image);

//        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
//        clickhere.setBounds(800, 600, 300, 70); // center it better
//        clickhere.setBackground(Color.BLACK);
//        clickhere.setForeground(Color.WHITE);
//        clickhere.addActionListener(this);
//        image.add(clickhere);
JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
int buttonWidth = 300;
int x = (screenWidth - buttonWidth) / 2;
int y = 600; // adjust this to move up/down
clickhere.setBounds(x, y, buttonWidth, 70);
clickhere.setBackground(Color.BLACK);
clickhere.setForeground(Color.WHITE);
clickhere.addActionListener(this);
image.add(clickhere);


        // Allow title bar (minimize/maximize/close)
        setUndecorated(false);
        // Maximize window to full screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Blinking heading effect in a new thread to avoid blocking UI
        new Thread(() -> {
            while (true) {
                heading.setVisible(false);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
                heading.setVisible(true);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
            }
        }).start();
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String args[]) {
        new Splash();
    }
}





