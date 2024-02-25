import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class SchoolApp implements ActionListener, UserArray {
    JFrame frame;
    JButton addButton, updateButton, removeButton, displayButton, exitButton, searchButton;
    JButton[] functionButtons = new JButton[6];
    JPanel panel;
    JTextArea text;
    Font myFont = new Font("Sans Comic", Font.BOLD, 15);

    public SchoolApp() {
        frame = new JFrame("School Management System");

        addButton = new JButton("Add User");
        updateButton = new JButton("Update User");
        removeButton = new JButton("Remove User");
        displayButton = new JButton("Display Users");
        exitButton = new JButton("Exit");
        searchButton = new JButton("Search User");

        functionButtons[0] = addButton;
        functionButtons[1] = updateButton;
        functionButtons[2] = removeButton;
        functionButtons[3] = displayButton;
        functionButtons[4] = exitButton;
        functionButtons[5] = searchButton;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(50, 125, 400, 100);
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        panel.add(addButton);
        panel.add(updateButton);
        panel.add(removeButton);
        panel.add(displayButton);
        panel.add(searchButton);
        panel.add(exitButton);

        text = new JTextArea(15, 40);
        text.setBounds(100, 100, 100, 100);
        text.setBackground(null);
        JScrollPane scrollPane = new JScrollPane(text);
        
        frame.add(panel);
        frame.add(scrollPane);
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = JOptionPane.showInputDialog("Enter name:");
            String address = JOptionPane.showInputDialog("Enter address:");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID:"));
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
            int phone = Integer.parseInt(JOptionPane.showInputDialog("Enter phone:"));

            int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for Student, 2 for Teacher:"));
            if (choice == 1) {
                double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter student grade:"));
                Add add = new Add(name, address, id, age, phone, grade);
            } else if (choice == 2) {
                double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter teacher salary:"));
                double score = Double.parseDouble(JOptionPane.showInputDialog("Enter teacher score:"));
                Add add = new Add(name, address, id, age, phone, salary, score);
            }
        } else if (e.getSource() == updateButton) {
            int userId = Integer.parseInt(JOptionPane.showInputDialog("Enter user ID to update:"));
            Student foundStudent = findStudentById(userId);
            Teacher foundTeacher = findTeacherById(userId);

            if (foundStudent != null) {
                String newName = JOptionPane.showInputDialog("Enter new name:");
                foundStudent.setName(newName);
                text.setText("Student updated: \n" + foundStudent.toString());
            } else if (foundTeacher != null) {
                String newName = JOptionPane.showInputDialog("Enter new name:");
                foundTeacher.setName(newName);
                text.setText("Teacher updated: \n" + foundTeacher.toString());
            } else {
                text.setText("User with ID " + userId + " not found.");
            }
        } else if (e.getSource() == removeButton) {
            int userId = Integer.parseInt(JOptionPane.showInputDialog("Enter user ID to remove:"));
            boolean removed = students.removeIf(student -> student.getId() == userId)
                            || teachers.removeIf(teacher -> teacher.getId() == userId);

            if (removed) {
                text.setText("User with ID " + userId + " removed.");
            } else {
                text.setText("User with ID " + userId + " not found.");
            }
        } else if (e.getSource() == displayButton) {
            JFrame usersFrame = new JFrame("All Users");
            JTextArea usersText = new JTextArea(15, 40);

            // Append students' information
            usersText.append("Students:\n");
            for (Student student : students) {
                usersText.append(student.toString());
                usersText.append("\n");
            }

            // Append teachers' information
            usersText.append("\nTeachers:\n");
            for (Teacher teacher : teachers) {
                usersText.append(teacher.toString());
                usersText.append("\n");
            }

            JScrollPane usersScrollPane = new JScrollPane(usersText);

            usersFrame.add(usersScrollPane);
            usersFrame.setSize(500, 400);
            usersFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close to only close the window
            usersFrame.setVisible(true);
        } else if (e.getSource() == searchButton) {
            int userId = Integer.parseInt(JOptionPane.showInputDialog("Enter user ID to search:"));

            Student foundStudent = findStudentById(userId);
            Teacher foundTeacher = findTeacherById(userId);

            if (foundStudent != null) {
                text.setText("Student found: \n" + foundStudent.toString());
            } else if (foundTeacher != null) {
                text.setText("Teacher found: \n" + foundTeacher.toString());
            } else {
                text.setText("User with ID " + userId + " not found.");
            }
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private Student findStudentById(int userId) {
        for (Student s : students) {
            if (s.getId() == userId) {
                return s;
            }
        }
        return null;
    }

    private Teacher findTeacherById(int userId) {
        for (Teacher t : teachers) {
            if (t.getId() == userId) {
                return t;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new SchoolApp();
    }
}
