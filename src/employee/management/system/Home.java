//usual code
//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Home extends JFrame implements ActionListener{
//
//    JButton view, add, update, remove;
//    
//    Home() {
//        
//        setLayout(null);
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(0, 0, 1120, 630);
//        add(image);
//        
//        JLabel heading = new JLabel("Employee Management System");
//        heading.setBounds(620, 20, 400, 40);
//        heading.setFont(new Font("Raleway", Font.BOLD, 25));
//        image.add(heading);
//        
//        add = new JButton("Add Employee");
//        add.setBounds(650, 80, 150, 40);
//        add.addActionListener(this);
//        image.add(add);
//        
//        view = new JButton("View Employees");
//        view.setBounds(820, 80, 150, 40);
//        view.addActionListener(this);
//        image.add(view);
//        
//        update = new JButton("Update Employee");
//        update.setBounds(650, 140, 150, 40);
//        update.addActionListener(this);
//        image.add(update);
//        
//        remove = new JButton("Remove Employee");
//        remove.setBounds(820, 140, 150, 40);
//        remove.addActionListener(this);
//        image.add(remove);
//        
//        setSize(1120, 630);
//        setLocation(250, 100);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            setVisible(false);
//            new AddEmployee();
//        } else if (ae.getSource() == view) {
//            setVisible(false);
//            new ViewEmployee();
//        } else if (ae.getSource() == update) {
//            setVisible(false);
//            new ViewEmployee();
//        } else {
//            setVisible(false);
//            new RemoveEmployee();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Home();
//    }
//}





//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Home extends JFrame implements ActionListener {
//
//    JButton view, add, update, remove;
//
//    Home() {
//        setLayout(null);
//
//        // Get full screen dimensions
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int width = screenSize.width;
//        int height = screenSize.height;
//
//        // Set JFrame to full screen
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setUndecorated(true); // removes title bar
//
//        // Load and scale image to screen size
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(0, 0, width, height);
//        add(image);
//
//        JLabel heading = new JLabel("Employee Management System");
//        heading.setBounds(width - 500, 40, 400, 40);
//        heading.setFont(new Font("Raleway", Font.BOLD, 25));
//        heading.setForeground(Color.WHITE); // Optional: makes text readable if image is dark
//        image.add(heading);
//
//        add = new JButton("Add Employee");
//        add.setBounds(width - 500, 100, 150, 40);
//        add.addActionListener(this);
//        image.add(add);
//
//        view = new JButton("View Employees");
//        view.setBounds(width - 330, 100, 150, 40);
//        view.addActionListener(this);
//        image.add(view);
//
//        update = new JButton("Update Employee");
//        update.setBounds(width - 500, 160, 150, 40);
//        update.addActionListener(this);
//        image.add(update);
//
//        remove = new JButton("Remove Employee");
//        remove.setBounds(width - 330, 160, 150, 40);
//        remove.addActionListener(this);
//        image.add(remove);
//
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            setVisible(false);
//            new AddEmployee();
//        } else if (ae.getSource() == view) {
//            setVisible(false);
//            new ViewEmployee();
//        } else if (ae.getSource() == update) {
//            setVisible(false);
//            new ViewEmployee();
//        } else {
//            setVisible(false);
//            new RemoveEmployee();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Home();
//    }
//}

package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    JButton view, add, update, remove;

    Home() {
        // Get screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Set layout and make undecorated full screen
        setLayout(null);
        setUndecorated(true); // Optional: removes title bar

        // Load and scale background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, screenWidth, screenHeight);
        setContentPane(image);
        image.setLayout(null);

        // Heading
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620, 20, 400, 40);
       heading.setFont(new Font("Raleway", Font.BOLD, 25));
       heading.setForeground(Color.white);
        image.add(heading);

        // Buttons
        add = new JButton("Add Employee");
        add.setBounds((screenWidth / 2) - 160, 120, 180, 50);
        add.addActionListener(this);
        image.add(add);

        view = new JButton("View Employees");
        view.setBounds((screenWidth / 2) + 20, 120, 180, 50);
        view.addActionListener(this);
        image.add(view);

        update = new JButton("Update Employee");
        update.setBounds((screenWidth / 2) - 160, 190, 180, 50);
        update.addActionListener(this);
        image.add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds((screenWidth / 2) + 20, 190, 180, 50);
        remove.addActionListener(this);
        image.add(remove);

        // Final settings
        setSize(screenWidth, screenHeight);
        setLocation(0, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        if (ae.getSource() == add) {
            new AddEmployee();
        } else if (ae.getSource() == view || ae.getSource() == update) {
            new ViewEmployee(); // both view and update go to ViewEmployee
        } else {
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
