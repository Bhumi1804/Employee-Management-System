
//package employee.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
//import java.util.*;
//import java.awt.event.*;
//
//public class AddEmployee extends JFrame implements ActionListener{
//    
//    Random ran = new Random();
//    int number = ran.nextInt(999999);
//    
//    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
//    JDateChooser dcdob;
//    JComboBox cbeducation;
//    JLabel lblempId;
//    JButton add, back;
//    
//    AddEmployee() {
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel heading = new JLabel("Add Employee Detail");
//        heading.setBounds(320, 30, 500, 50);
//        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
//        add(heading);
//        
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50, 150, 150, 30);
//        labelname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelname);
//        
//        tfname = new JTextField();
//        tfname.setBounds(200, 150, 150, 30);
//        add(tfname);
//        
//        JLabel labelfname = new JLabel("Father's Name");
//        labelfname.setBounds(400, 150, 150, 30);
//        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelfname);
//        
//        tffname = new JTextField();
//        tffname.setBounds(600, 150, 150, 30);
//        add(tffname);
//        
//        JLabel labeldob = new JLabel("Date of Birth");
//        labeldob.setBounds(50, 200, 150, 30);
//        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldob);
//        
//        dcdob = new JDateChooser();
//        dcdob.setBounds(200, 200, 150, 30);
//        add(dcdob);
//        
//        JLabel labelsalary = new JLabel("Salary");
//        labelsalary.setBounds(400, 200, 150, 30);
//        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelsalary);
//        
//        tfsalary = new JTextField();
//        tfsalary.setBounds(600, 200, 150, 30);
//        add(tfsalary);
//        
//        JLabel labeladdress = new JLabel("Address");
//        labeladdress.setBounds(50, 250, 150, 30);
//        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeladdress);
//        
//        tfaddress = new JTextField();
//        tfaddress.setBounds(200, 250, 150, 30);
//        add(tfaddress);
//        
//        JLabel labelphone = new JLabel("Phone");
//        labelphone.setBounds(400, 250, 150, 30);
//        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelphone);
//        
//        tfphone = new JTextField();
//        tfphone.setBounds(600, 250, 150, 30);
//        add(tfphone);
//        
//        JLabel labelemail = new JLabel("Email");
//        labelemail.setBounds(50, 300, 150, 30);
//        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelemail);
//        
//        tfemail = new JTextField();
//        tfemail.setBounds(200, 300, 150, 30);
//        add(tfemail);
//        
//        JLabel labeleducation = new JLabel("Higest Education");
//        labeleducation.setBounds(400, 300, 150, 30);
//        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeleducation);
//        
//        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD","Select"};
//        cbeducation = new JComboBox(courses);
//        cbeducation.setBackground(Color.WHITE);
//        cbeducation.setBounds(600, 300, 150, 30);
//        add(cbeducation);
//        
//        JLabel labeldesignation = new JLabel("Designation");
//        labeldesignation.setBounds(50, 350, 150, 30);
//        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldesignation);
//        
//        tfdesignation = new JTextField();
//        tfdesignation.setBounds(200, 350, 150, 30);
//        add(tfdesignation);
//        
//        JLabel labelaadhar = new JLabel("Aadhar Number");
//        labelaadhar.setBounds(400, 350, 150, 30);
//        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelaadhar);
//        
//        tfaadhar = new JTextField();
//        tfaadhar.setBounds(600, 350, 150, 30);
//        add(tfaadhar);
//        
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelempId);
//        
//        lblempId = new JLabel("" + number);
//        lblempId.setBounds(200, 400, 150, 30);
//        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(lblempId);
//        
//        add = new JButton("Add Details");
//        add.setBounds(250, 550, 150, 40);
//        add.addActionListener(this);
//        add.setBackground(Color.BLACK);
//        add.setForeground(Color.WHITE);
//        add(add);
//        
//        back = new JButton("Back");
//        back.setBounds(450, 550, 150, 40);
//        back.addActionListener(this);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        add(back);
//        
//        setSize(900, 700);
//        setLocation(300, 50);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            String name = tfname.getText();
//            String fname = tffname.getText();
//            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
//            String salary = tfsalary.getText();
//            String address = tfaddress.getText();
//            String phone = tfphone.getText();
//            String email = tfemail.getText();
//            String education = (String) cbeducation.getSelectedItem();
//            String designation = tfdesignation.getText();
//            String aadhar = tfaadhar.getText();
//            String empId = lblempId.getText();
//            
//            try {
//                Conn conn = new Conn();
//                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Details added successfully");
//                setVisible(false);
//                new Home();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new AddEmployee();
//    }
//}

//package employee.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
//import java.util.*;
//import java.awt.event.*;
//
//public class AddEmployee extends JFrame implements ActionListener{
//    
//    Random ran = new Random();
//    int number = ran.nextInt(999999);
//    
//    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
//    JDateChooser dcdob;
//    JComboBox cbeducation;
//    JLabel lblempId;
//    JButton add, back;
//    
//    AddEmployee() {
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel heading = new JLabel("Add Employee Detail");
//        heading.setBounds(320, 30, 500, 50);
//        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
//        add(heading);
//        
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50, 150, 150, 30);
//        labelname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelname);
//        
//        tfname = new JTextField();
//        tfname.setBounds(200, 150, 150, 30);
//        add(tfname);
//        
//        JLabel labelfname = new JLabel("Father's Name");
//        labelfname.setBounds(400, 150, 150, 30);
//        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelfname);
//        
//        tffname = new JTextField();
//        tffname.setBounds(600, 150, 150, 30);
//        add(tffname);
//        
//        JLabel labeldob = new JLabel("Date of Birth");
//        labeldob.setBounds(50, 200, 150, 30);
//        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldob);
//        
//        dcdob = new JDateChooser();
//        dcdob.setBounds(200, 200, 150, 30);
//        add(dcdob);
//        
//        JLabel labelsalary = new JLabel("Salary");
//        labelsalary.setBounds(400, 200, 150, 30);
//        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelsalary);
//        
//        tfsalary = new JTextField();
//        tfsalary.setBounds(600, 200, 150, 30);
//        add(tfsalary);
//        
//        JLabel labeladdress = new JLabel("Address");
//        labeladdress.setBounds(50, 250, 150, 30);
//        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeladdress);
//        
//        tfaddress = new JTextField();
//        tfaddress.setBounds(200, 250, 150, 30);
//        add(tfaddress);
//        
//        JLabel labelphone = new JLabel("Phone");
//        labelphone.setBounds(400, 250, 150, 30);
//        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelphone);
//        
//        tfphone = new JTextField();
//        tfphone.setBounds(600, 250, 150, 30);
//        add(tfphone);
//        
//        JLabel labelemail = new JLabel("Email");
//        labelemail.setBounds(50, 300, 150, 30);
//        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelemail);
//        
//        tfemail = new JTextField();
//        tfemail.setBounds(200, 300, 150, 30);
//        add(tfemail);
//        
//        JLabel labeleducation = new JLabel("Higest Education");
//        labeleducation.setBounds(400, 300, 150, 30);
//        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeleducation);
//        
//        String courses[] = {"Select","BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
//        cbeducation = new JComboBox(courses);
//        cbeducation.setBackground(Color.WHITE);
//        cbeducation.setBounds(600, 300, 150, 30);
//        add(cbeducation);
//        
//        JLabel labeldesignation = new JLabel("Designation");
//        labeldesignation.setBounds(50, 350, 150, 30);
//        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldesignation);
//        
//        tfdesignation = new JTextField();
//        tfdesignation.setBounds(200, 350, 150, 30);
//        add(tfdesignation);
//        
//        JLabel labelaadhar = new JLabel("Aadhar Number");
//        labelaadhar.setBounds(400, 350, 150, 30);
//        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelaadhar);
//        
//        tfaadhar = new JTextField();
//        tfaadhar.setBounds(600, 350, 150, 30);
//        add(tfaadhar);
//        
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelempId);
//        
//        lblempId = new JLabel("" + number);
//        lblempId.setBounds(200, 400, 150, 30);
//        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(lblempId);
//        
//        add = new JButton("Add Details");
//        add.setBounds(250, 550, 150, 40);
//        add.addActionListener(this);
//        add.setBackground(Color.BLACK);
//        add.setForeground(Color.WHITE);
//        add(add);
//        
//        back = new JButton("Back");
//        back.setBounds(450, 550, 150, 40);
//        back.addActionListener(this);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        add(back);
//        
//        setSize(900, 700);
//        setLocation(300, 50);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            String name = tfname.getText();
//            String fname = tffname.getText();
//            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
//            String salary = tfsalary.getText();
//            String address = tfaddress.getText();
//            String phone = tfphone.getText();
//            String email = tfemail.getText();
//            String education = (String) cbeducation.getSelectedItem();
//            String designation = tfdesignation.getText();
//            String aadhar = tfaadhar.getText();
//            String empId = lblempId.getText();
//            
//            if(name.isEmpty()||fname.isEmpty()||dob.isEmpty()||salary.isEmpty()||address.isEmpty()||phone.isEmpty()||email.isEmpty()||education.isEmpty()||designation.isEmpty()||aadhar.isEmpty())
//            {
//                JOptionPane.showMessageDialog(null, "Please fill all the details");
//                return;
//            }
//            if("Select".equals(education))
//                    {
//                        JOptionPane.showMessageDialog(null, "Please select valid education option");
//                return;
//                    }
//                
//            
//            try {
//                Conn conn = new Conn();
//                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Details added successfully");
//                setVisible(false);
//                new Home();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new AddEmployee();
//    }
//}

//package employee.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
//import java.util.*;
//import java.awt.event.*;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//
//public class AddEmployee extends JFrame implements ActionListener{
//    
//    Random ran = new Random();
//    int number = ran.nextInt(999999);
//    
//    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
//    JDateChooser dcdob;
//    JComboBox cbeducation;
//    JLabel lblempId;
//    JButton add, back;
//    
//    AddEmployee() {
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel heading = new JLabel("Add Employee Detail");
//        heading.setBounds(320, 30, 500, 50);
//        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
//        add(heading);
//        
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50, 150, 150, 30);
//        labelname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelname);
//        
//        tfname = new JTextField();
//        tfname.setBounds(200, 150, 150, 30);
//        add(tfname);
//        
//        JLabel labelfname = new JLabel("Father's Name");
//        labelfname.setBounds(400, 150, 150, 30);
//        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelfname);
//        
//        tffname = new JTextField();
//        tffname.setBounds(600, 150, 150, 30);
//        add(tffname);
//        
//        JLabel labeldob = new JLabel("Date of Birth");
//        labeldob.setBounds(50, 200, 150, 30);
//        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldob);
//        
//        dcdob = new JDateChooser();
//        dcdob.setBounds(200, 200, 150, 30);
//        add(dcdob);
//        
//        JLabel labelsalary = new JLabel("Salary");
//        labelsalary.setBounds(400, 200, 150, 30);
//        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelsalary);
//        
//        tfsalary = new JTextField();
//        tfsalary.setBounds(600, 200, 150, 30);
//        add(tfsalary);
//        
//        JLabel labeladdress = new JLabel("Address");
//        labeladdress.setBounds(50, 250, 150, 30);
//        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeladdress);
//        
//        tfaddress = new JTextField();
//        tfaddress.setBounds(200, 250, 150, 30);
//        add(tfaddress);
//        
//        JLabel labelphone = new JLabel("Phone");
//        labelphone.setBounds(400, 250, 150, 30);
//        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelphone);
//        
//        tfphone = new JTextField();
//        tfphone.setBounds(600, 250, 150, 30);
//        add(tfphone);
//        
//        JLabel labelemail = new JLabel("Email");
//        labelemail.setBounds(50, 300, 150, 30);
//        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelemail);
//        
//        tfemail = new JTextField();
//        tfemail.setBounds(200, 300, 150, 30);
//        add(tfemail);
//        
//        JLabel labeleducation = new JLabel("Higest Education");
//        labeleducation.setBounds(400, 300, 150, 30);
//        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeleducation);
//        
//        String courses[] = {"Select","BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
//        cbeducation = new JComboBox(courses);
//        cbeducation.setBackground(Color.WHITE);
//        cbeducation.setBounds(600, 300, 150, 30);
//        add(cbeducation);
//        
//        JLabel labeldesignation = new JLabel("Designation");
//        labeldesignation.setBounds(50, 350, 150, 30);
//        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldesignation);
//        
//        tfdesignation = new JTextField();
//        tfdesignation.setBounds(200, 350, 150, 30);
//        add(tfdesignation);
//        
//        JLabel labelaadhar = new JLabel("Aadhar Number");
//        labelaadhar.setBounds(400, 350, 150, 30);
//        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelaadhar);
//        
//        tfaadhar = new JTextField();
//        tfaadhar.setBounds(600, 350, 150, 30);
//        add(tfaadhar);
//        
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelempId);
//        
//        lblempId = new JLabel("" + number);
//        lblempId.setBounds(200, 400, 150, 30);
//        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(lblempId);
//        
//        add = new JButton("Add Details");
//        add.setBounds(250, 550, 150, 40);
//        add.addActionListener(this);
//        add.setBackground(Color.BLACK);
//        add.setForeground(Color.WHITE);
//        add(add);
//        
//        back = new JButton("Back");
//        back.setBounds(450, 550, 150, 40);
//        back.addActionListener(this);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        add(back);
//        
//        setSize(900, 700);
//        setLocation(300, 50);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            String name = tfname.getText();
//            String fname = tffname.getText();
//            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
//            String salary = tfsalary.getText();
//            String address = tfaddress.getText();
//            String phone = tfphone.getText();
//            String email = tfemail.getText();
//            String education = (String) cbeducation.getSelectedItem();
//            String designation = tfdesignation.getText();
//            String aadhar = tfaadhar.getText();
//            String empId = lblempId.getText();
//            
//            
//            if(name.isEmpty()||fname.isEmpty()||dob.isEmpty()||salary.isEmpty()||address.isEmpty()||phone.isEmpty()||email.isEmpty()||education.isEmpty()||designation.isEmpty()||aadhar.isEmpty())
//            {
//                JOptionPane.showMessageDialog(null, "Please fill all the details");
//                return;
//            }
//            if("Select".equals(education))
//                    {
//                        JOptionPane.showMessageDialog(null, "Please select valid education option");
//                return;
//                    }
//                
//            
//            try {
//                Conn conn = new Conn();
//                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Details added successfully");
//                setVisible(false);
//                new Home();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new AddEmployee();
//    }
//}

//package employee.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
//import java.util.*;
//import java.awt.event.*;
//import java.text.SimpleDateFormat;
//import java.util.regex.Pattern;
//
//public class AddEmployee extends JFrame implements ActionListener {
//
//    Random ran = new Random();
//    int number = ran.nextInt(999999);
//
//    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
//    JDateChooser dcdob;
//    JComboBox cbeducation;
//    JLabel lblempId;
//    JButton add, back;
//
//    AddEmployee() {
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//
//        JLabel heading = new JLabel("Add Employee Detail");
//        heading.setBounds(320, 30, 500, 50);
//        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
//        add(heading);
//
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50, 150, 150, 30);
//        labelname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelname);
//
//        tfname = new JTextField();
//        tfname.setBounds(200, 150, 150, 30);
//        add(tfname);
//
//        JLabel labelfname = new JLabel("Father's Name");
//        labelfname.setBounds(400, 150, 150, 30);
//        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelfname);
//
//        tffname = new JTextField();
//        tffname.setBounds(600, 150, 150, 30);
//        add(tffname);
//
//        JLabel labeldob = new JLabel("Date of Birth");
//        labeldob.setBounds(50, 200, 150, 30);
//        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldob);
//
//        dcdob = new JDateChooser();
//        dcdob.setBounds(200, 200, 150, 30);
//        add(dcdob);
//
//        JLabel labelsalary = new JLabel("Salary");
//        labelsalary.setBounds(400, 200, 150, 30);
//        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelsalary);
//
//        tfsalary = new JTextField();
//        tfsalary.setBounds(600, 200, 150, 30);
//        add(tfsalary);
//
//        JLabel labeladdress = new JLabel("Address");
//        labeladdress.setBounds(50, 250, 150, 30);
//        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeladdress);
//
//        tfaddress = new JTextField();
//        tfaddress.setBounds(200, 250, 150, 30);
//        add(tfaddress);
//
//        JLabel labelphone = new JLabel("Phone");
//        labelphone.setBounds(400, 250, 150, 30);
//        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelphone);
//
//        tfphone = new JTextField();
//        tfphone.setBounds(600, 250, 150, 30);
//        add(tfphone);
//
//        JLabel labelemail = new JLabel("Email");
//        labelemail.setBounds(50, 300, 150, 30);
//        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelemail);
//
//        tfemail = new JTextField();
//        tfemail.setBounds(200, 300, 150, 30);
//        add(tfemail);
//
//        JLabel labeleducation = new JLabel("Higest Education");
//        labeleducation.setBounds(400, 300, 150, 30);
//        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeleducation);
//
//        String courses[] = { "Select", "BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC",
//                "PHD" };
//        cbeducation = new JComboBox(courses);
//        cbeducation.setBackground(Color.WHITE);
//        cbeducation.setBounds(600, 300, 150, 30);
//        add(cbeducation);
//
//        JLabel labeldesignation = new JLabel("Designation");
//        labeldesignation.setBounds(50, 350, 150, 30);
//        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldesignation);
//
//        tfdesignation = new JTextField();
//        tfdesignation.setBounds(200, 350, 150, 30);
//        add(tfdesignation);
//
//        JLabel labelaadhar = new JLabel("Aadhar Number");
//        labelaadhar.setBounds(400, 350, 150, 30);
//        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelaadhar);
//
//        tfaadhar = new JTextField();
//        tfaadhar.setBounds(600, 350, 150, 30);
//        add(tfaadhar);
//
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelempId);
//
//        this.lblempId = new JLabel("" + number);
//        this.lblempId.setBounds(200, 400, 150, 30);
//        this.lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(this.lblempId);
//
//        add = new JButton("Add Details");
//        add.setBounds(250, 550, 150, 40);
//        add.addActionListener(this);
//        add.setBackground(Color.BLACK);
//        add.setForeground(Color.WHITE);
//        add(add);
//
//        back = new JButton("Back");
//        back.setBounds(450, 550, 150, 40);
//        back.addActionListener(this);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        add(back);
//
//        setSize(900, 700);
//        setLocation(300, 50);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            String name = tfname.getText().trim();
//            String fname = tffname.getText().trim();
//            String dobStr = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText().trim();
//            String salaryStr = tfsalary.getText().trim();
//            String address = tfaddress.getText().trim();
//            String phone = tfphone.getText().trim();
//            String email = tfemail.getText().trim();
//            String education = (String) cbeducation.getSelectedItem();
//            String designation = tfdesignation.getText().trim();
//            String aadhar = tfaadhar.getText().trim();
//            String empId = lblempId.getText();
//
//            // Empty field checks
//            if (name.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Name cannot be empty");
//                return;
//            }
//            if (fname.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Father's Name cannot be empty");
//                return;
//            }
//            if (dobStr.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty");
//                return;
//            }
//            if (salaryStr.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Salary cannot be empty");
//                return;
//            }
//            if (address.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Address cannot be empty");
//                return;
//            }
//            if (phone.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Phone number cannot be empty");
//                return;
//            }
//            if (email.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Email cannot be empty");
//                return;
//            }
//            if ("Select".equals(education)) {
//                JOptionPane.showMessageDialog(null, "Please select a valid education option");
//                return;
//            }
//            if (designation.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Designation cannot be empty");
//                return;
//            }
//            if (aadhar.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Aadhar number cannot be empty");
//                return;
//            }
//
//            // Name & Father's Name validation (letters and spaces only)
//            if (!name.matches("[a-zA-Z\\s]+")) {
//                JOptionPane.showMessageDialog(null, "Name must contain only letters and spaces");
//                return;
//            }
//            if (!fname.matches("[a-zA-Z\\s]+")) {
//                JOptionPane.showMessageDialog(null, "Father's Name must contain only letters and spaces");
//                return;
//            }
//
//            // Validate DOB is a valid past date
//            
//
//            // Validate salary is a positive number
//            double salary = 0;
//            try {
//                salary = Double.parseDouble(salaryStr);
//                if (salary <= 0) {
//                    JOptionPane.showMessageDialog(null, "Salary must be a positive number");
//                    return;
//                }
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Salary must be a number");
//                return;
//            }
//
//            // Validate phone is exactly 10 digits
//            if (!phone.matches("\\d{10}")) {
//                JOptionPane.showMessageDialog(null, "Phone number must be exactly 10 digits");
//                return;
//            }
//            Date dob = dcdob.getDate();
//if (dob == null) {
//    JOptionPane.showMessageDialog(null, "Please select a valid Date of Birth");
//    return;
//}
//
//Date today = new Date();
//if (dob.after(today)) {
//    JOptionPane.showMessageDialog(null, "Date of Birth must be in the past");
//    return;
//}
//
//            // Validate email format with regex
//            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
//                                "[a-zA-Z0-9_+&*-]+)*@" +
//                                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//                                "A-Z]{2,7}$";
//            Pattern pat = Pattern.compile(emailRegex);
//            if (!pat.matcher(email).matches()) {
//                JOptionPane.showMessageDialog(null, "Invalid email format");
//                return;
//            }
//
//            // Designation validation (letters and spaces only)
//            if (!designation.matches("[a-zA-Z\\s]+")) {
//                JOptionPane.showMessageDialog(null, "Designation must contain only letters and spaces");
//                return;
//            }
//
//            // Aadhar validation (exactly 12 digits)
//            if (!aadhar.matches("\\d{12}")) {
//                JOptionPane.showMessageDialog(null, "Aadhar number must be exactly 12 digits");
//                return;
//            }
//
//            // If all validations pass, insert into DB
//            try {
//                Conn conn = new Conn();
//                String query = "insert into employee values('" + name + "', '" + fname + "', '" + dobStr + "', '" + salary
//                        + "', '" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation
//                        + "', '" + aadhar + "', '" + empId + "')";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Details added successfully");
//                setVisible(false);
//                new Home();
//            } catch (Exception e) {
//                e.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Error while adding details");
//            }
//
//        } else if (ae.getSource() == back) {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new AddEmployee();
//    }
//}
//

//package employee.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
//import java.util.*;
//import java.awt.event.*;
//import java.text.SimpleDateFormat;
//import java.util.regex.Pattern;
//
//public class AddEmployee extends JFrame implements ActionListener {
//
//    Random ran = new Random();
//    int number = ran.nextInt(999999);
//
//    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
//    JDateChooser dcdob;
//    JComboBox cbeducation;
//    JLabel lblempId;
//    JButton add, back;
//
//    AddEmployee() {
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//
//        JLabel heading = new JLabel("Add Employee Detail");
//        heading.setBounds(320, 30, 500, 50);
//        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
//        add(heading);
//
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50, 150, 150, 30);
//        labelname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelname);
//
//        tfname = new JTextField();
//        tfname.setBounds(200, 150, 150, 30);
//        add(tfname);
//
//        JLabel labelfname = new JLabel("Father's Name");
//        labelfname.setBounds(400, 150, 150, 30);
//        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelfname);
//
//        tffname = new JTextField();
//        tffname.setBounds(600, 150, 150, 30);
//        add(tffname);
//
//        JLabel labeldob = new JLabel("Date of Birth");
//        labeldob.setBounds(50, 200, 150, 30);
//        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldob);
//
//        dcdob = new JDateChooser();
//        dcdob.setBounds(200, 200, 150, 30);
//        add(dcdob);
//
//        JLabel labelsalary = new JLabel("Salary");
//        labelsalary.setBounds(400, 200, 150, 30);
//        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelsalary);
//
//        tfsalary = new JTextField();
//        tfsalary.setBounds(600, 200, 150, 30);
//        add(tfsalary);
//
//        JLabel labeladdress = new JLabel("Address");
//        labeladdress.setBounds(50, 250, 150, 30);
//        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeladdress);
//
//        tfaddress = new JTextField();
//        tfaddress.setBounds(200, 250, 150, 30);
//        add(tfaddress);
//
//        JLabel labelphone = new JLabel("Phone");
//        labelphone.setBounds(400, 250, 150, 30);
//        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelphone);
//
//        tfphone = new JTextField();
//        tfphone.setBounds(600, 250, 150, 30);
//        add(tfphone);
//
//        JLabel labelemail = new JLabel("Email");
//        labelemail.setBounds(50, 300, 150, 30);
//        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelemail);
//
//        tfemail = new JTextField();
//        tfemail.setBounds(200, 300, 150, 30);
//        add(tfemail);
//
//        JLabel labeleducation = new JLabel("Higest Education");
//        labeleducation.setBounds(400, 300, 150, 30);
//        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeleducation);
//
//        String courses[] = { "Select", "BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC",
//                "PHD" };
//        cbeducation = new JComboBox(courses);
//        cbeducation.setBackground(Color.WHITE);
//        cbeducation.setBounds(600, 300, 150, 30);
//        add(cbeducation);
//
//        JLabel labeldesignation = new JLabel("Designation");
//        labeldesignation.setBounds(50, 350, 150, 30);
//        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labeldesignation);
//
//        tfdesignation = new JTextField();
//        tfdesignation.setBounds(200, 350, 150, 30);
//        add(tfdesignation);
//
//        JLabel labelaadhar = new JLabel("Aadhar Number");
//        labelaadhar.setBounds(400, 350, 150, 30);
//        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelaadhar);
//
//        tfaadhar = new JTextField();
//        tfaadhar.setBounds(600, 350, 150, 30);
//        add(tfaadhar);
//
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelempId);
//
//        this.lblempId = new JLabel("" + number);
//        this.lblempId.setBounds(200, 400, 150, 30);
//        this.lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(this.lblempId);
//
//        add = new JButton("Add Details");
//        add.setBounds(250, 550, 150, 40);
//        add.addActionListener(this);
//        add.setBackground(Color.BLACK);
//        add.setForeground(Color.WHITE);
//        add(add);
//
//        back = new JButton("Back");
//        back.setBounds(450, 550, 150, 40);
//        back.addActionListener(this);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        add(back);
//
//        setSize(900, 700);
//        setLocation(300, 50);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            String name = tfname.getText().trim();
//            String fname = tffname.getText().trim();
//            String dobStr = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText().trim();
//            String salaryStr = tfsalary.getText().trim();
//            String address = tfaddress.getText().trim();
//            String phone = tfphone.getText().trim();
//            String email = tfemail.getText().trim();
//            String education = (String) cbeducation.getSelectedItem();
//            String designation = tfdesignation.getText().trim();
//            String aadhar = tfaadhar.getText().trim();
//            String empId = lblempId.getText();
//
//            // Empty field checks
//            if (name.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Name cannot be empty");
//                return;
//            }
//            if (fname.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Father's Name cannot be empty");
//                return;
//            }
//            if (dobStr.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty");
//                return;
//            }
//            if (salaryStr.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Salary cannot be empty");
//                return;
//            }
//            if (address.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Address cannot be empty");
//                return;
//            }
//            if (phone.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Phone number cannot be empty");
//                return;
//            }
//            if (email.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Email cannot be empty");
//                return;
//            }
//            if ("Select".equals(education)) {
//                JOptionPane.showMessageDialog(null, "Please select a valid education option");
//                return;
//            }
//            if (designation.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Designation cannot be empty");
//                return;
//            }
//            if (aadhar.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Aadhar number cannot be empty");
//                return;
//            }
//
//            // Name & Father's Name validation (letters and spaces only)
//            if (!name.matches("[a-zA-Z\\s]+")) {
//                JOptionPane.showMessageDialog(null, "Name must contain only letters and spaces");
//                return;
//            }
//            if (!fname.matches("[a-zA-Z\\s]+")) {
//                JOptionPane.showMessageDialog(null, "Father's Name must contain only letters and spaces");
//                return;
//            }
//
//            // Validate DOB is a valid past date
//            Date dob = dcdob.getDate();
//            if (dob == null) {
//                JOptionPane.showMessageDialog(null, "Please select a valid Date of Birth");
//                return;
//            }
//            Date today = new Date();
//            if (dob.after(today)) {
//                JOptionPane.showMessageDialog(null, "Date of Birth must be in the past");
//                return;
//            }
//
//            // Validate salary is a positive number
//            double salary = 0;
//            try {
//                salary = Double.parseDouble(salaryStr);
//                if (salary <= 0) {
//                    JOptionPane.showMessageDialog(null, "Salary must be a positive number");
//                    return;
//                }
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Salary must be a number");
//                return;
//            }
//
//            // Validate phone is exactly 10 digits
//            if (!phone.matches("\\d{10}")) {
//                JOptionPane.showMessageDialog(null, "Phone number must be exactly 10 digits");
//                return;
//            }
//
//            // Validate email format with regex
//            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
//                    "[a-zA-Z0-9_+&*-]+)*@" +
//                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//                    "A-Z]{2,7}$";
//            Pattern pat = Pattern.compile(emailRegex);
//            if (!pat.matcher(email).matches()) {
//                JOptionPane.showMessageDialog(null, "Invalid email format");
//                return;
//            }
//
//            // Designation validation (letters and spaces only)
//            if (!designation.matches("[a-zA-Z\\s]+")) {
//                JOptionPane.showMessageDialog(null, "Designation must contain only letters and spaces");
//                return;
//            }
//
//            // Aadhar validation (exactly 12 digits)
//            if (!aadhar.matches("\\d{12}")) {
//                JOptionPane.showMessageDialog(null, "Aadhar number must be exactly 12 digits");
//                return;
//            }
//
//            // Now check if Aadhar number already exists in DB
//            try {
//                Conn conn = new Conn();
//
//                // Check if Aadhar exists
//                String checkQuery = "SELECT * FROM employee WHERE aadhar = '" + aadhar + "'";
//                java.sql.ResultSet rs = conn.s.executeQuery(checkQuery);
//                if (rs.next()) {
//                    JOptionPane.showMessageDialog(null,
//                            "Aadhar number already exists! Please enter a unique Aadhar number.");
//                    return; // Stop insertion
//                }
//
//                // Insert employee record
//                String query = "INSERT INTO employee VALUES('" + name + "', '" + fname + "', '" + dobStr + "', '" + salary
//                        + "', '" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation
//                        + "', '" + aadhar + "', '" + empId + "')";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Details added successfully");
//                setVisible(false);
//                new Home();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Error while adding details");
//            }
//
//        } else if (ae.getSource() == back) {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new AddEmployee();
//    }
//}

//package employee.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
//import java.util.*;
//import java.awt.event.*;
//import java.text.SimpleDateFormat;
//import java.util.regex.Pattern;
//
//public class AddEmployee extends JFrame implements ActionListener {
//
//    Random ran = new Random();
//    int number = ran.nextInt(999999);
//
//    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
//    JDateChooser dcdob;
//    JComboBox cbeducation;
//    JLabel lblempId;
//    JButton add, back;
//
//    AddEmployee() {
//        // Full screen and undecorated
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setUndecorated(true);
//
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(new BorderLayout());
//
//        // Wrapper to center the form
//        JPanel wrapper = new JPanel(new GridBagLayout());
//        wrapper.setBackground(Color.WHITE);
//
//        // Actual form panel
//        JPanel formPanel = new JPanel();
//        formPanel.setLayout(null);
//        formPanel.setPreferredSize(new Dimension(900, 700));
//        formPanel.setBackground(Color.WHITE);
//        wrapper.add(formPanel);
//        add(wrapper, BorderLayout.CENTER);
//
//        JLabel heading = new JLabel("Add Employee Detail");
//        heading.setBounds(320, 30, 500, 50);
//        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
//        formPanel.add(heading);
//
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50, 150, 150, 30);
//        labelname.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labelname);
//
//        tfname = new JTextField();
//        tfname.setBounds(200, 150, 150, 30);
//        formPanel.add(tfname);
//
//        JLabel labelfname = new JLabel("Father's Name");
//        labelfname.setBounds(400, 150, 150, 30);
//        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labelfname);
//
//        tffname = new JTextField();
//        tffname.setBounds(600, 150, 150, 30);
//        formPanel.add(tffname);
//
//        JLabel labeldob = new JLabel("Date of Birth");
//        labeldob.setBounds(50, 200, 150, 30);
//        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labeldob);
//
//        dcdob = new JDateChooser();
//        dcdob.setBounds(200, 200, 150, 30);
//        formPanel.add(dcdob);
//
//        JLabel labelsalary = new JLabel("Salary");
//        labelsalary.setBounds(400, 200, 150, 30);
//        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labelsalary);
//
//        tfsalary = new JTextField();
//        tfsalary.setBounds(600, 200, 150, 30);
//        formPanel.add(tfsalary);
//
//        JLabel labeladdress = new JLabel("Address");
//        labeladdress.setBounds(50, 250, 150, 30);
//        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labeladdress);
//
//        tfaddress = new JTextField();
//        tfaddress.setBounds(200, 250, 150, 30);
//        formPanel.add(tfaddress);
//
//        JLabel labelphone = new JLabel("Phone");
//        labelphone.setBounds(400, 250, 150, 30);
//        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labelphone);
//
//        tfphone = new JTextField();
//        tfphone.setBounds(600, 250, 150, 30);
//        formPanel.add(tfphone);
//
//        JLabel labelemail = new JLabel("Email");
//        labelemail.setBounds(50, 300, 150, 30);
//        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labelemail);
//
//        tfemail = new JTextField();
//        tfemail.setBounds(200, 300, 150, 30);
//        formPanel.add(tfemail);
//
//        JLabel labeleducation = new JLabel("Higest Education");
//        labeleducation.setBounds(400, 300, 150, 30);
//        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labeleducation);
//
//        String courses[] = { "Select", "BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD" };
//        cbeducation = new JComboBox(courses);
//        cbeducation.setBackground(Color.WHITE);
//        cbeducation.setBounds(600, 300, 150, 30);
//        formPanel.add(cbeducation);
//
//        JLabel labeldesignation = new JLabel("Designation");
//        labeldesignation.setBounds(50, 350, 150, 30);
//        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labeldesignation);
//
//        tfdesignation = new JTextField();
//        tfdesignation.setBounds(200, 350, 150, 30);
//        formPanel.add(tfdesignation);
//
//        JLabel labelaadhar = new JLabel("Aadhar Number");
//        labelaadhar.setBounds(400, 350, 150, 30);
//        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labelaadhar);
//
//        tfaadhar = new JTextField();
//        tfaadhar.setBounds(600, 350, 150, 30);
//        formPanel.add(tfaadhar);
//
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(labelempId);
//
//        this.lblempId = new JLabel("" + number);
//        this.lblempId.setBounds(200, 400, 150, 30);
//        this.lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        formPanel.add(this.lblempId);
//
//        add = new JButton("Add Details");
//        add.setBounds(250, 550, 150, 40);
//        add.addActionListener(this);
//        add.setBackground(Color.BLACK);
//        add.setForeground(Color.WHITE);
//        formPanel.add(add);
//
//        back = new JButton("Back");
//        back.setBounds(450, 550, 150, 40);
//        back.addActionListener(this);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        formPanel.add(back);
//
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            String name = tfname.getText().trim();
//            String fname = tffname.getText().trim();
//            String dobStr = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText().trim();
//            String salaryStr = tfsalary.getText().trim();
//            String address = tfaddress.getText().trim();
//            String phone = tfphone.getText().trim();
//            String email = tfemail.getText().trim();
//            String education = (String) cbeducation.getSelectedItem();
//            String designation = tfdesignation.getText().trim();
//            String aadhar = tfaadhar.getText().trim();
//            String empId = lblempId.getText();
//
//            if (name.isEmpty() || fname.isEmpty() || dobStr.isEmpty() || salaryStr.isEmpty() || address.isEmpty()
//                    || phone.isEmpty() || email.isEmpty() || "Select".equals(education) || designation.isEmpty()
//                    || aadhar.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "All fields must be filled correctly.");
//                return;
//            }
//
//            if (!name.matches("[a-zA-Z\\s]+") || !fname.matches("[a-zA-Z\\s]+")) {
//                JOptionPane.showMessageDialog(null, "Names must contain only letters and spaces.");
//                return;
//            }
//
//            Date dob = dcdob.getDate();
//            if (dob == null || dob.after(new Date())) {
//                JOptionPane.showMessageDialog(null, "Enter a valid Date of Birth.");
//                return;
//            }
//
//            double salary = 0;
//            try {
//                salary = Double.parseDouble(salaryStr);
//                if (salary <= 0) throw new Exception();
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Enter a valid positive salary.");
//                return;
//            }
//
//            if (!phone.matches("\\d{10}")) {
//                JOptionPane.showMessageDialog(null, "Phone number must be 10 digits.");
//                return;
//            }
//
//            if (!Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\." +
//                    "[a-zA-Z0-9_+&*-]+)*@" +
//                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//                    "A-Z]{2,7}$").matcher(email).matches()) {
//                JOptionPane.showMessageDialog(null, "Invalid email format.");
//                return;
//            }
//
//            if (!designation.matches("[a-zA-Z\\s]+")) {
//                JOptionPane.showMessageDialog(null, "Designation must contain only letters and spaces.");
//                return;
//            }
//
//            if (!aadhar.matches("\\d{12}")) {
//                JOptionPane.showMessageDialog(null, "Aadhar must be exactly 12 digits.");
//                return;
//            }
//
//            try {
//                Conn conn = new Conn();
//                java.sql.ResultSet rs = conn.s.executeQuery("SELECT * FROM employee WHERE aadhar = '" + aadhar + "'");
//                if (rs.next()) {
//                    JOptionPane.showMessageDialog(null, "Aadhar already exists.");
//                    return;
//                }
//
//                String query = "INSERT INTO employee VALUES('" + name + "', '" + fname + "', '" + dobStr + "', '" +
//                        salary + "', '" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" +
//                        designation + "', '" + aadhar + "', '" + empId + "')";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Employee Added Successfully");
//                setVisible(false);
//                new Home();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Error while adding employee");
//            }
//
//        } else if (ae.getSource() == back) {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new AddEmployee();
//    }
//}

package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class AddEmployee extends JFrame implements ActionListener {

    Random ran = new Random();
    int number = ran.nextInt(999999);

    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;

    AddEmployee() {
        // Full screen with title bar buttons (min, max, close)
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Enables close button

        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        // Wrapper to center the form
        JPanel wrapper = new JPanel(new GridBagLayout());
        wrapper.setBackground(Color.WHITE);

        // Actual form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setPreferredSize(new Dimension(900, 700));
        formPanel.setBackground(Color.WHITE);
        wrapper.add(formPanel);
        add(wrapper, BorderLayout.CENTER);

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        formPanel.add(heading);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labelname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        formPanel.add(tfname);

        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        formPanel.add(tffname);

        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labeldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        formPanel.add(dcdob);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labelsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        formPanel.add(tfsalary);

        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        formPanel.add(tfaddress);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        formPanel.add(tfphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        formPanel.add(tfemail);

        JLabel labeleducation = new JLabel("Highest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labeleducation);

        String courses[] = { "Select", "BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD" };
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        formPanel.add(cbeducation);

        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labeldesignation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        formPanel.add(tfdesignation);

        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labelaadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        formPanel.add(tfaadhar);

        JLabel labelempId = new JLabel("Employee ID");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(labelempId);

        this.lblempId = new JLabel("" + number);
        this.lblempId.setBounds(200, 400, 150, 30);
        this.lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        formPanel.add(this.lblempId);

        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        formPanel.add(add);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        formPanel.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText().trim();
            String fname = tffname.getText().trim();
            String dobStr = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText().trim();
            String salaryStr = tfsalary.getText().trim();
            String address = tfaddress.getText().trim();
            String phone = tfphone.getText().trim();
            String email = tfemail.getText().trim();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText().trim();
            String aadhar = tfaadhar.getText().trim();
            String empId = lblempId.getText();

            if (name.isEmpty() || fname.isEmpty() || dobStr.isEmpty() || salaryStr.isEmpty() || address.isEmpty()
                    || phone.isEmpty() || email.isEmpty() || "Select".equals(education) || designation.isEmpty()
                    || aadhar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields must be filled correctly.");
                return;
            }

            if (!name.matches("[a-zA-Z\\s]+") || !fname.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(null, "Names must contain only letters and spaces.");
                return;
            }

            Date dob = dcdob.getDate();
            if (dob == null || dob.after(new Date())) {
                JOptionPane.showMessageDialog(null, "Enter a valid Date of Birth.");
                return;
            }

            double salary = 0;
            try {
                salary = Double.parseDouble(salaryStr);
                if (salary <= 0) throw new Exception();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Enter a valid positive salary.");
                return;
            }

            if (!phone.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(null, "Phone number must be 10 digits.");
                return;
            }

            if (!Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\." +
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$").matcher(email).matches()) {
                JOptionPane.showMessageDialog(null, "Invalid email format.");
                return;
            }

            if (!designation.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(null, "Designation must contain only letters and spaces.");
                return;
            }

            if (!aadhar.matches("\\d{12}")) {
                JOptionPane.showMessageDialog(null, "Aadhar must be exactly 12 digits.");
                return;
            }

            try {
                Conn conn = new Conn();
                java.sql.ResultSet rs = conn.s.executeQuery("SELECT * FROM employee WHERE aadhar = '" + aadhar + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Aadhar already exists.");
                    return;
                }

                String query = "INSERT INTO employee VALUES('" + name + "', '" + fname + "', '" + dobStr + "', '" +
                        salary + "', '" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" +
                        designation + "', '" + aadhar + "', '" + empId + "')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Added Successfully");
                setVisible(false);
                new Home();

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error while adding employee");
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}


