//
//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//
//public class Login extends JFrame implements ActionListener{
//    
//    JTextField tfusername, tfpassword;
//    
//    Login() {
//        
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel lblusername = new JLabel("Username");
//        lblusername.setBounds(40, 20, 100, 30);
//        add(lblusername);
//        
//        tfusername = new JTextField();
//        tfusername.setBounds(150, 20, 150, 30);
//        add(tfusername);
//        
//        JLabel lblpassword = new JLabel("Password");
//        lblpassword.setBounds(40, 70, 100, 30);
//        add(lblpassword);
//        
//        tfpassword = new JTextField();
//        tfpassword.setBounds(150, 70, 150, 30);
//        add(tfpassword);
//        
//        JButton login = new JButton("LOGIN");
//        login.setBounds(150, 140, 150, 30);
//        login.setBackground(Color.BLACK);
//        login.setForeground(Color.WHITE);
//        login.addActionListener(this);
//        add(login);
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(350, 0, 200, 200);
//        add(image);
//        
//        setSize(600, 300);
//        setLocation(450, 200);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        try {
//            String username = tfusername.getText();
//            String password = tfpassword.getText();
//            
//            Conn c = new Conn();
//            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
//            
//            ResultSet rs = c.s.executeQuery(query);
//            if (rs.next()) {
//                setVisible(false);
//                new Home();
//            } else {
//                JOptionPane.showMessageDialog(null, "Invalid username or password");
//                setVisible(false);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    
//    public static void main(String[] args) {
//        new Login();
//    }
//}
//

package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JPasswordField tfusername;
    JPasswordField tfpassword;
    JButton eyeUsernameButton, eyePasswordButton;
    boolean isUsernameVisible = false;
    boolean isPasswordVisible = false;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);

        tfusername = new JPasswordField();
        tfusername.setBounds(150, 20, 150, 30);
        tfusername.setEchoChar('●');
        add(tfusername);

        // Username Eye Button
        eyeUsernameButton = new JButton("👁");
        eyeUsernameButton.setBounds(310, 20, 50, 30);
        eyeUsernameButton.setFocusable(false);
        eyeUsernameButton.addActionListener(e -> {
            if (isUsernameVisible) {
                tfusername.setEchoChar('●');
                eyeUsernameButton.setText("👁");
            } else {
                tfusername.setEchoChar((char) 0);
                eyeUsernameButton.setText("👁‍🗨");
            }
            isUsernameVisible = !isUsernameVisible;
        });
        add(eyeUsernameButton);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 30);
        tfpassword.setEchoChar('●');
        add(tfpassword);

        // Password Eye Button
        eyePasswordButton = new JButton("👁");
        eyePasswordButton.setBounds(310, 70, 50, 30);
        eyePasswordButton.setFocusable(false);
        eyePasswordButton.addActionListener(e -> {
            if (isPasswordVisible) {
                tfpassword.setEchoChar('●');
                eyePasswordButton.setText("👁");
            } else {
                tfpassword.setEchoChar((char) 0);
                eyePasswordButton.setText("👁‍🗨");
            }
            isPasswordVisible = !isPasswordVisible;
        });
        add(eyePasswordButton);

        JButton login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String username = new String(tfusername.getPassword());
            String password = new String(tfpassword.getPassword());

            Conn c = new Conn();
            String query = "select * from login where username = '" + username + "' and password = '" + password + "'";

            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Home();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
