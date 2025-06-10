
//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.sql.*;
//import net.proteanit.sql.DbUtils;
//import java.awt.event.*;
//
//public class ViewEmployee extends JFrame implements ActionListener{
//
//    JTable table;
//    Choice cemployeeId;
//    JButton search, print, update, back;
//    
//    ViewEmployee() {
//        
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel searchlbl = new JLabel("Search by Employee Id");
//        searchlbl.setBounds(20, 20, 150, 20);
//        add(searchlbl);
//        
//        cemployeeId = new Choice();
//        cemployeeId.setBounds(180, 20, 150, 20);
//        add(cemployeeId);
//        
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from employee");
//            while(rs.next()) {
//                cemployeeId.add(rs.getString("empId"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        table = new JTable();
//        
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from employee");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        JScrollPane jsp = new JScrollPane(table);
//        jsp.setBounds(0, 100, 900, 600);
//        add(jsp);
//        
//        search = new JButton("Search");
//        search.setBounds(20, 70, 80, 20);
//        search.addActionListener(this);
//        add(search);
//        
//        print = new JButton("Print");
//        print.setBounds(120, 70, 80, 20);
//        print.addActionListener(this);
//        add(print);
//        
//        update = new JButton("Update");
//        update.setBounds(220, 70, 80, 20);
//        update.addActionListener(this);
//        add(update);
//        
//        back = new JButton("Back");
//        back.setBounds(320, 70, 80, 20);
//        back.addActionListener(this);
//        add(back);
//        
//        setSize(900, 700);
//        setLocation(300, 100);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == search) {
//            String query = "select * from employee where empId = '"+cemployeeId.getSelectedItem()+"'";
//            try {
//                Conn c = new Conn();
//                ResultSet rs = c.s.executeQuery(query);
//                table.setModel(DbUtils.resultSetToTableModel(rs));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == print) {
//            try {
//                table.print();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == update) {
//            setVisible(false);
//            new UpdateEmployee(cemployeeId.getSelectedItem());
//        } else {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new ViewEmployee();
//    }
//}

//search by all fields
//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.sql.*;
//import net.proteanit.sql.DbUtils;
//import java.awt.event.*;
//
//public class ViewEmployee extends JFrame implements ActionListener {
//
//    JTable table;
//    JComboBox<String> cbSearchField;
//    JTextField tfSearchValue;
//    JButton search, print, update, back;
//
//    ViewEmployee() {
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//
//        JLabel lblSearchBy = new JLabel("Search By");
//        lblSearchBy.setBounds(20, 20, 100, 20);
//        add(lblSearchBy);
//
//        cbSearchField = new JComboBox<>(new String[]{"empId", "name", "designation", "phone", "email","education","fname","salary"});
//        cbSearchField.setBounds(100, 20, 150, 20);
//        add(cbSearchField);
//
//        tfSearchValue = new JTextField();
//        tfSearchValue.setBounds(270, 20, 150, 20);
//        add(tfSearchValue);
//
//        search = new JButton("Search");
//        search.setBounds(440, 20, 100, 20);
//        search.addActionListener(this);
//        add(search);
//
//        table = new JTable();
//        loadAllData(); // initially load all employees
//
//        JScrollPane jsp = new JScrollPane(table);
//        jsp.setBounds(0, 100, 900, 600);
//        add(jsp);
//
//        print = new JButton("Print");
//        print.setBounds(20, 70, 80, 20);
//        print.addActionListener(this);
//        add(print);
//
//        update = new JButton("Update");
//        update.setBounds(120, 70, 80, 20);
//        update.addActionListener(this);
//        add(update);
//
//        back = new JButton("Back");
//        back.setBounds(220, 70, 80, 20);
//        back.addActionListener(this);
//        add(back);
//
//        setSize(900, 700);
//        setLocation(300, 100);
//        setVisible(true);
//    }
//
//    private void loadAllData() {
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("SELECT * FROM employee");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == search) {
//            String field = cbSearchField.getSelectedItem().toString();
//            String value = tfSearchValue.getText().trim();
//
//            if (value.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Enter search value");
//                return;
//            }
//
//            String query = "SELECT * FROM employee WHERE " + field + " LIKE '%" + value + "%'";
//            try {
//                Conn c = new Conn();
//                ResultSet rs = c.s.executeQuery(query);
//                table.setModel(DbUtils.resultSetToTableModel(rs));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == print) {
//            try {
//                table.print();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == update) {
//            int row = table.getSelectedRow();
//            if (row == -1) {
//                JOptionPane.showMessageDialog(null, "Please select an employee to update");
//                return;
//            }
//            String empId = table.getValueAt(row, 0).toString();
//            setVisible(false);
//            new UpdateEmployee(empId);
//        } else if (ae.getSource() == back) {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new ViewEmployee();
//    }
//}

//we only have to search
//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.sql.*;
//import net.proteanit.sql.DbUtils;
//import java.awt.event.*;
//
//public class ViewEmployee extends JFrame implements ActionListener {
//
//    JTable table;
//    JTextField tfemployeeId;
//    JButton search, print, update, back;
//
//    ViewEmployee() {
//
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//
//        JLabel searchlbl = new JLabel("Search by Employee Id");
//        searchlbl.setBounds(20, 20, 150, 20);
//        add(searchlbl);
//
//        tfemployeeId = new JTextField();
//        tfemployeeId.setBounds(180, 20, 150, 20);
//        add(tfemployeeId);
//
//        table = new JTable();
//
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from employee");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        JScrollPane jsp = new JScrollPane(table);
//        jsp.setBounds(0, 100, 900, 600);
//        add(jsp);
//
//        search = new JButton("Search");
//        search.setBounds(20, 70, 80, 20);
//        search.addActionListener(this);
//        add(search);
//
//        print = new JButton("Print");
//        print.setBounds(120, 70, 80, 20);
//        print.addActionListener(this);
//        add(print);
//
//        update = new JButton("Update");
//        update.setBounds(220, 70, 80, 20);
//        update.addActionListener(this);
//        add(update);
//
//        back = new JButton("Back");
//        back.setBounds(320, 70, 80, 20);
//        back.addActionListener(this);
//        add(back);
//
//        setSize(900, 700);
//        setLocation(300, 100);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == search) {
//            String empId = tfemployeeId.getText();
//            String query = "select * from employee where empId = '" + empId + "'";
//            try {
//                Conn c = new Conn();
//                ResultSet rs = c.s.executeQuery(query);
//                table.setModel(DbUtils.resultSetToTableModel(rs));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == print) {
//            try {
//                table.print();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == update) {
//            setVisible(false);
//            new UpdateEmployee(tfemployeeId.getText());
//        } else {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new ViewEmployee();
//    }
//}

//package employee.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.sql.*;
//import net.proteanit.sql.DbUtils;
//import java.awt.event.*;
//import java.util.Vector;
//
//public class ViewEmployee extends JFrame implements ActionListener {
//
//    JTable table;
//    JComboBox<String> comboEmpId;
//    JButton search, print, update, back;
//    Vector<String> empIdList;
//
//    ViewEmployee() {
//
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//
//        JLabel searchlbl = new JLabel("Search by Employee Id");
//        searchlbl.setBounds(20, 20, 150, 20);
//        add(searchlbl);
//
//        empIdList = new Vector<>();
//
//        comboEmpId = new JComboBox<>(empIdList);
//        comboEmpId.setEditable(true);
//        comboEmpId.setBounds(180, 20, 150, 20);
//        add(comboEmpId);
//
//        // Load employee IDs from DB
//        loadEmployeeIds();
//
//        // Add filtering as user types
//        JTextField editor = (JTextField) comboEmpId.getEditor().getEditorComponent();
//        editor.addKeyListener(new KeyAdapter() {
//            public void keyReleased(KeyEvent e) {
//                String input = editor.getText();
//                filterEmployeeIds(input);
//            }
//        });
//
//        table = new JTable();
//        loadAllEmployees();
//
//        JScrollPane jsp = new JScrollPane(table);
//        jsp.setBounds(0, 100, 900, 600);
//        add(jsp);
//
//        search = new JButton("Search");
//        search.setBounds(20, 70, 80, 20);
//        search.addActionListener(this);
//        add(search);
//
//        print = new JButton("Print");
//        print.setBounds(120, 70, 80, 20);
//        print.addActionListener(this);
//        add(print);
//
//        update = new JButton("Update");
//        update.setBounds(220, 70, 80, 20);
//        update.addActionListener(this);
//        add(update);
//
//        back = new JButton("Back");
//        back.setBounds(320, 70, 80, 20);
//        back.addActionListener(this);
//        add(back);
//
//        setSize(900, 700);
//        setLocation(300, 100);
//        setVisible(true);
//    }
//
//    private void loadEmployeeIds() {
//        empIdList.clear();
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select empId from employee");
//            while (rs.next()) {
//                empIdList.add(rs.getString("empId"));
//            }
//            updateComboBox(empIdList);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void updateComboBox(Vector<String> list) {
//        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(list);
//        comboEmpId.setModel(model);
//        comboEmpId.setSelectedItem(""); // reset to empty
//    }
//
//    private void filterEmployeeIds(String input) {
//        Vector<String> filtered = new Vector<>();
//        for (String id : empIdList) {
//            if (id.toLowerCase().contains(input.toLowerCase())) {
//                filtered.add(id);
//            }
//        }
//        updateComboBox(filtered);
//        comboEmpId.setSelectedItem(input); // retain typed text
//        comboEmpId.showPopup(); // show dropdown
//    }
//
//    private void loadAllEmployees() {
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from employee");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        String selectedEmpId = (String) comboEmpId.getSelectedItem();
//
//        if (ae.getSource() == search) {
//            if (selectedEmpId == null || selectedEmpId.trim().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Please enter or select an Employee ID.");
//                return;
//            }
//
//            String query = "select * from employee where empId = '" + selectedEmpId + "'";
//            try {
//                Conn c = new Conn();
//                ResultSet rs = c.s.executeQuery(query);
//                table.setModel(DbUtils.resultSetToTableModel(rs));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        } else if (ae.getSource() == print) {
//            try {
//                table.print();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        } else if (ae.getSource() == update) {
//            if (selectedEmpId == null || selectedEmpId.trim().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Please select an Employee ID to update.");
//                return;
//            }
//            setVisible(false);
//            new UpdateEmployee(selectedEmpId);
//
//        } else if (ae.getSource() == back) {
//            setVisible(false);
//            new Home();
//        }
//    }
//
//    public static void main(String[] args) {
//        new ViewEmployee();
//    }
//}

package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.util.Vector;

public class ViewEmployee extends JFrame implements ActionListener {

    JTable table;
    JComboBox<String> comboEmpId;
    JButton search, print, update, back;
    Vector<String> empIdList;

    ViewEmployee() {

        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximized window
        setTitle("View Employee");

        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        // Top Panel for controls
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.WHITE);
        topPanel.setLayout(null);
        topPanel.setPreferredSize(new Dimension(1200, 100));

        JLabel searchlbl = new JLabel("Search by Employee Id");
        searchlbl.setBounds(20, 30, 150, 20);
        topPanel.add(searchlbl);

        empIdList = new Vector<>();
        comboEmpId = new JComboBox<>(empIdList);
        comboEmpId.setEditable(true);
        comboEmpId.setBounds(180, 30, 150, 20);
        topPanel.add(comboEmpId);

        // Load employee IDs from DB
        loadEmployeeIds();

        // Add filtering as user types
        JTextField editor = (JTextField) comboEmpId.getEditor().getEditorComponent();
        editor.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String input = editor.getText();
                filterEmployeeIds(input);
            }
        });

        search = new JButton("Search");
        search.setBounds(350, 30, 100, 25);
        search.addActionListener(this);
        topPanel.add(search);

        print = new JButton("Print");
        print.setBounds(460, 30, 100, 25);
        print.addActionListener(this);
        topPanel.add(print);

        update = new JButton("Update");
        update.setBounds(570, 30, 100, 25);
        update.addActionListener(this);
        topPanel.add(update);

        back = new JButton("Back");
        back.setBounds(680, 30, 100, 25);
        back.addActionListener(this);
        topPanel.add(back);

        add(topPanel, BorderLayout.NORTH);

        // Table Panel
        table = new JTable();
        loadAllEmployees();

        JScrollPane jsp = new JScrollPane(table);
        add(jsp, BorderLayout.CENTER);

        setVisible(true);
    }

    private void loadEmployeeIds() {
        empIdList.clear();
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select empId from employee");
            while (rs.next()) {
                empIdList.add(rs.getString("empId"));
            }
            updateComboBox(empIdList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateComboBox(Vector<String> list) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(list);
        comboEmpId.setModel(model);
        comboEmpId.setSelectedItem(""); // reset to empty
    }

    private void filterEmployeeIds(String input) {
        Vector<String> filtered = new Vector<>();
        for (String id : empIdList) {
            if (id.toLowerCase().contains(input.toLowerCase())) {
                filtered.add(id);
            }
        }
        updateComboBox(filtered);
        comboEmpId.setSelectedItem(input); // retain typed text
        comboEmpId.showPopup(); // show dropdown
    }

    private void loadAllEmployees() {
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String selectedEmpId = (String) comboEmpId.getSelectedItem();

        if (ae.getSource() == search) {
            if (selectedEmpId == null || selectedEmpId.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter or select an Employee ID.");
                return;
            }

            String query = "select * from employee where empId = '" + selectedEmpId + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == update) {
            if (selectedEmpId == null || selectedEmpId.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select an Employee ID to update.");
                return;
            }
            setVisible(false);
            new UpdateEmployee(selectedEmpId);

        } else if (ae.getSource() == back) {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }
}