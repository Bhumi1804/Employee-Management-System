//
//package employee.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
//import java.sql.*;
//
//public class UpdateEmployee extends JFrame implements ActionListener{
//    
//    JTextField tfeducation, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
//    JLabel lblempId;
//    JButton add, back;
//    String empId;
//    
//    UpdateEmployee(String empId) {
//        this.empId = empId;
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel heading = new JLabel("Update Employee Detail");
//        heading.setBounds(320, 30, 500, 50);
//        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
//        add(heading);
//        
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50, 150, 150, 30);
//        labelname.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelname);
//        
//        JLabel lblname = new JLabel();
//        lblname.setBounds(200, 150, 150, 30);
//        add(lblname);
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
//        JLabel lbldob = new JLabel();
//        lbldob.setBounds(200, 200, 150, 30);
//        add(lbldob);
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
//        tfeducation = new JTextField();
//        tfeducation.setBounds(600, 300, 150, 30);
//        add(tfeducation);
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
//        JLabel lblaadhar = new JLabel();
//        lblaadhar.setBounds(600, 350, 150, 30);
//        add(lblaadhar);
//        
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelempId);
//        
//        lblempId = new JLabel();
//        lblempId.setBounds(200, 400, 150, 30);
//        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(lblempId);
//        
//        try {
//            Conn c = new Conn();
//            String query = "select * from employee where empId = '"+empId+"'";
//            ResultSet rs = c.s.executeQuery(query);
//            while(rs.next()) {
//                lblname.setText(rs.getString("name"));
//                tffname.setText(rs.getString("fname"));
//                lbldob.setText(rs.getString("dob"));
//                tfaddress.setText(rs.getString("address"));
//                tfsalary.setText(rs.getString("salary"));
//                tfphone.setText(rs.getString("phone"));
//                tfemail.setText(rs.getString("email"));
//                tfeducation.setText(rs.getString("education"));
//                lblaadhar.setText(rs.getString("aadhar"));
//                lblempId.setText(rs.getString("empId"));
//                tfdesignation.setText(rs.getString("designation"));
//                
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        add = new JButton("Update Details");
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
//            String fname = tffname.getText();
//            String salary = tfsalary.getText();
//            String address = tfaddress.getText();
//            String phone = tfphone.getText();
//            String email = tfemail.getText();
//            String education = tfeducation.getText();
//            String designation = tfdesignation.getText();
//            
//            try {
//                Conn conn = new Conn();
//                String query = "update employee set fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email =  '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"'";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
//        new UpdateEmployee("");
//    }
//}

//package employee.management.system;
//
//import java.awt.*;
//import java.util.*;
//import javax.swing.*;
//import java.awt.event.*;
//import java.sql.*;
//import java.text.SimpleDateFormat;
//import java.util.regex.Pattern;
//import com.toedter.calendar.JDateChooser;
//
//public class UpdateEmployee extends JFrame implements ActionListener {
//    
//    JTextField tfname, tfeducation, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
//    JLabel lblempId;
//    JButton add, back;
//    String empId;
//    
//    UpdateEmployee(String empId) {
//        this.empId = empId;
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel heading = new JLabel("Update Employee Detail");
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
//        JLabel lbldob = new JLabel();
//        lbldob.setBounds(200, 200, 150, 30);
//        add(lbldob);
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
//        tfeducation = new JTextField();
//        tfeducation.setBounds(600, 300, 150, 30);
//        add(tfeducation);
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
//        JLabel lblaadhar = new JLabel();
//        lblaadhar.setBounds(600, 350, 150, 30);
//        add(lblaadhar);
//        
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelempId);
//        
//        lblempId = new JLabel();
//        lblempId.setBounds(200, 400, 150, 30);
//        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(lblempId);
//        
//        try {
//            Conn c = new Conn();
//            String query = "select * from employee where empId = '"+empId+"'";
//            ResultSet rs = c.s.executeQuery(query);
//            while(rs.next()) {
//                tfname.setText(rs.getString("name"));
//                tffname.setText(rs.getString("fname"));
//                lbldob.setText(rs.getString("dob"));
//                tfaddress.setText(rs.getString("address"));
//                tfsalary.setText(rs.getString("salary"));
//                tfphone.setText(rs.getString("phone"));
//                tfemail.setText(rs.getString("email"));
//                tfeducation.setText(rs.getString("education"));
//                lblaadhar.setText(rs.getString("aadhar"));
//                lblempId.setText(rs.getString("empId"));
//                tfdesignation.setText(rs.getString("designation"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        add = new JButton("Update Details");
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
//            String salary = tfsalary.getText();
//            String address = tfaddress.getText();
//            String phone = tfphone.getText();
//            String email = tfemail.getText();
//            String education = tfeducation.getText();
//            String designation = tfdesignation.getText();
//            
//            
//            try {
//                Conn conn = new Conn();
//                String query = "update employee set name = '"+name+"', fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"'";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
//        new UpdateEmployee("");
//    }
//}

//package employee.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
//import java.sql.*;
//
//
//import java.util.*;
//        
////import com.toedter.calendar.JDateChooser;
////import java.util.Date;
//public class UpdateEmployee extends JFrame implements ActionListener {
//    
//    JTextField tfname, tfdob, tffname, tfaddress, tfphone, tfemail, tfsalary, tfdesignation;
//     JComboBox cbeducation;
//    JLabel lblempId, lblaadhar;
//    JButton add, back;
//    String empId;
//    
//    UpdateEmployee(String empId) {
//        this.empId = empId;
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel heading = new JLabel("Update Employee Detail");
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
//        tfdob = new JTextField();
//        tfdob.setBounds(200, 200, 150, 30);
//        add(tfdob);
////dcdob = new JDateChooser();
////        dcdob.setBounds(200, 200, 150, 30);
////        add(dcdob);
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
////        tfeducation = new JTextField();
////        tfeducation.setBounds(600, 300, 150, 30);
////        add(tfeducation);
//String courses[] = { "Select", "BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC",
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
//        lblaadhar = new JLabel();
//        lblaadhar.setBounds(600, 350, 150, 30);
//        add(lblaadhar);
//        
//        JLabel labelempId = new JLabel("Employee id");
//        labelempId.setBounds(50, 400, 150, 30);
//        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelempId);
//        
//        lblempId = new JLabel();
//        lblempId.setBounds(200, 400, 150, 30);
//        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
//        add(lblempId);
//        
//        try {
//            Conn c = new Conn();
//            String query = "select * from employee where empId = '"+empId+"'";
//            ResultSet rs = c.s.executeQuery(query);
//            while(rs.next()) {
//                tfname.setText(rs.getString("name"));
//                tffname.setText(rs.getString("fname"));
//                tfdob.setText(rs.getString("dob"));
//                tfaddress.setText(rs.getString("address"));
//                tfsalary.setText(rs.getString("salary"));
//                tfphone.setText(rs.getString("phone"));
//                tfemail.setText(rs.getString("email"));
////                tfeducation.setText(rs.getString("education"));
//cbeducation.setSelectedItem(rs.getString("education"));
//
//                lblaadhar.setText(rs.getString("aadhar"));
//                lblempId.setText(rs.getString("empId"));
//                tfdesignation.setText(rs.getString("designation"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        add = new JButton("Update Details");
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
//            String dob = tfdob.getText();
////String dobStr = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText().trim();
//
//            String salaryStr = tfsalary.getText().trim();
//            String address = tfaddress.getText();
//            String phone = tfphone.getText();
//            String email = tfemail.getText();
////            String education = tfeducation.getText();
//String education = (String) cbeducation.getSelectedItem();
//            String designation = tfdesignation.getText();
//            
//            
//            if (name.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Name cannot be empty");
//            return; // stop further execution
//        }
//        
//        // Check if name contains digits
//        if (name.matches(".*\\d.*")) {
//            JOptionPane.showMessageDialog(null, "Name cannot contain numbers");
//            return;
//        }
//        if (fname.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Father's Name cannot be empty");
//            return; // stop further execution
//        }
//        
//        
//        // Check if name contains digits
//        if (fname.matches(".*\\d.*")) {
//            JOptionPane.showMessageDialog(null, "Father's Name cannot contain numbers");
//            return;
//        }
//        
//        if (address.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Address cannot be empty");
//            return; // stop further execution
//        }
//        
//        // Check if name contains digits
//        if (address.matches(".*\\d.*")) {
//            JOptionPane.showMessageDialog(null, "Address cannot contain numbers");
//            return;
//        }
//        if (education.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Education cannot be empty");
//            return; // stop further execution
//        }
//        if ("Select".equals(education)) {
//    JOptionPane.showMessageDialog(null, "Please select a valid education option");
//    return;
//}
//        // Check if name contains digits
//        if (education.matches(".*\\d.*")) {
//            JOptionPane.showMessageDialog(null, "Education cannot contain numbers");
//            return;
//        }
//        if (designation.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Designation cannot be empty");
//            return; // stop further execution
//        }
//        
//        // Check if name contains digits
//        if (designation.matches(".*\\d.*")) {
//            JOptionPane.showMessageDialog(null, "Designation cannot contain numbers");
//            return;
//        }
//         if (salaryStr.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Salary cannot be empty");
//            return;
//        }
//        double salary = 0;
//        try {
//            salary = Double.parseDouble(salaryStr);
//            if (salary <= 0) {
//                JOptionPane.showMessageDialog(null, "Salary cannot be negative");
//                return;
//            }
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Salary must be a valid number");
//            return;
//        }
//        if (phone.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Designation cannot be empty");
//            return; // stop further execution
//        }
//        if (!phone.matches("\\d{10}")) {
//        JOptionPane.showMessageDialog(null, "Phone number must be exactly 10 digits");
//        return;
//    }
//        if (email.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Designation cannot be empty");
//            return; // stop further execution
//        }
//        
//        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
//        JOptionPane.showMessageDialog(null, "Invalid email format");
//        return;
//    }
//        
//       if (dob.isEmpty()) {
//    JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty");
//    return;
//}
//
//        
//       
//         
//        
//            try {
//                Conn conn = new Conn();
//                String query = "update employee set name = '"+name+"', fname = '"+fname+"', dob = '"+dob+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"'";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
//        new UpdateEmployee("");
//    }
//}

package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener {

    JTextField tfname, tfdob, tffname, tfaddress, tfphone, tfemail, tfsalary, tfdesignation;
    JComboBox<String> cbeducation;
    JLabel lblempId, lblaadhar;
    JButton add, back;
    String empId;

    UpdateEmployee(String empId) {
        this.empId = empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(620, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);

        tfdob = new JTextField();
        tfdob.setBounds(200, 200, 150, 30);
        add(tfdob);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);

        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);

        String courses[] = { "Select", "BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD" };
        cbeducation = new JComboBox<>(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);

        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);

        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);

        lblaadhar = new JLabel();
        lblaadhar.setBounds(600, 350, 150, 30);
        add(lblaadhar);

        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);

        lblempId = new JLabel();
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);

        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+empId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                tfname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                tfdob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                cbeducation.setSelectedItem(rs.getString("education"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempId.setText(rs.getString("empId"));
                tfdesignation.setText(rs.getString("designation"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        add = new JButton("Update Details");
        add.setBounds(450, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);

        back = new JButton("Back");
        back.setBounds(650, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);

        // Optional: remove title bar
        // setUndecorated(true);

        // Full screen mode
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = tfdob.getText();
            String salaryStr = tfsalary.getText().trim();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();

            if (name.isEmpty() || name.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Invalid Name");
                return;
            }
            if (fname.isEmpty() || fname.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Invalid Father's Name");
                return;
            }
            if (address.isEmpty() || address.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Invalid Address");
                return;
            }
            if (education.equals("Select") || education.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Invalid Education");
                return;
            }
            if (designation.isEmpty() || designation.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(null, "Invalid Designation");
                return;
            }
            if (salaryStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Salary cannot be empty");
                return;
            }
            double salary = 0;
            try {
                salary = Double.parseDouble(salaryStr);
                if (salary <= 0) {
                    JOptionPane.showMessageDialog(null, "Salary cannot be negative");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Salary");
                return;
            }
            if (!phone.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(null, "Phone must be 10 digits");
                return;
            }
            if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                JOptionPane.showMessageDialog(null, "Invalid Email");
                return;
            }
            if (dob.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty");
                return;
            }

            try {
                Conn conn = new Conn();
                String query = "update employee set name = '"+name+"', fname = '"+fname+"', dob = '"+dob+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}


