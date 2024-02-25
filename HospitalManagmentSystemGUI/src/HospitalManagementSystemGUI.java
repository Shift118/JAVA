import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class Doctor extends User {
    private String specialization;

    public Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization;
    }
}

class Patient extends User {
    private String illness;

    public Patient(String name, int id, String illness) {
        super(name, id);
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return super.toString() + ", Illness: " + illness;
    }
}

public class HospitalManagementSystemGUI extends JFrame {
    private ArrayList<User> userList;

    public HospitalManagementSystemGUI() {
        userList = new ArrayList<>();

        setTitle("Hospital Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        JTextArea textArea = new JTextArea();
        JButton addButton = new JButton("Add User");
        JButton displayButton = new JButton("Display Users"); 
        JButton updateButton = new JButton("Update User");
        JButton deleteButton = new JButton("Delete User");
        JButton exitButton = new JButton("Exit");

        addButton.addActionListener(new AddButtonListener());
        displayButton.addActionListener(new DisplayButtonListener(textArea));
        updateButton.addActionListener(new UpdateButtonListener());
        deleteButton.addActionListener(new DeleteButtonListener());
        exitButton.addActionListener(new ExitButtonListener());

        panel.add(textArea);
        panel.add(addButton);
        panel.add(displayButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(exitButton);

        add(panel);
    }

    private class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String[] options = {"Doctor", "Patient"};
            int choice = JOptionPane.showOptionDialog(null, "Select user type:", "Add User",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == 0) { // Add Doctor
                addDoctor();
            } else if (choice == 1) { // Add Patient
                addPatient();
            }
        }

        private void addDoctor() {
            String name = JOptionPane.showInputDialog("Enter doctor name:");
            if (name != null && !name.isEmpty()) {
                try {
                    int doctorId = Integer.parseInt(JOptionPane.showInputDialog("Enter doctor ID:"));
                    String specialization = JOptionPane.showInputDialog("Enter doctor specialization:");
                    userList.add(new Doctor(name, doctorId, specialization));
                    JOptionPane.showMessageDialog(null, "Doctor added successfully!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid doctor ID. Please enter a number.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Doctor name cannot be empty.");
            }
        }

        private void addPatient() {
            String name = JOptionPane.showInputDialog("Enter patient name:");
            if (name != null && !name.isEmpty()) {
                try {
                    int patientId = Integer.parseInt(JOptionPane.showInputDialog("Enter patient ID:"));
                    String illness = JOptionPane.showInputDialog("Enter patient illness:");
                    userList.add(new Patient(name, patientId, illness));
                    JOptionPane.showMessageDialog(null, "Patient added successfully!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid patient ID. Please enter a number.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Patient name cannot be empty.");
            }
        }
    }

    private class DisplayButtonListener implements ActionListener {
        private JTextArea textArea;

        public DisplayButtonListener(JTextArea textArea) {
            this.textArea = textArea;
        }

        public void actionPerformed(ActionEvent e) {
            if (userList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No users to display.");
            } else {
                textArea.setText("");
                for (User user : userList) {
                    textArea.append(user.toString() + "\n");
                }
            }
        }
    }

    private class UpdateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (userList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No users to update.");
            } else {
                String userIdString = JOptionPane.showInputDialog("Enter user ID to update:");
                if (userIdString != null && !userIdString.isEmpty()) {
                    try {
                        int userId = Integer.parseInt(userIdString);
                        updateUser(userId);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid user ID. Please enter a number.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User ID cannot be empty.");
                }
            }
        }

        private void updateUser(int userId) {
            User foundUser = findUserById(userId);
            if (foundUser != null) {
                if (foundUser instanceof Doctor) {
                    Doctor doctor = (Doctor) foundUser;
                    String newSpecialization = JOptionPane.showInputDialog("Enter new specialization for the doctor:");
                    doctor.setSpecialization(newSpecialization);
                    JOptionPane.showMessageDialog(null, "Doctor data updated successfully!");
                } else if (foundUser instanceof Patient) {
                    Patient patient = (Patient) foundUser;
                    String newIllness = JOptionPane.showInputDialog("Enter new illness for the patient:");
                    patient.setIllness(newIllness);
                    JOptionPane.showMessageDialog(null, "Patient data updated successfully!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "User with ID " + userId + " not found.");
            }
        }
    }

    private class DeleteButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (userList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No users to delete.");
            } else {
                String userIdString = JOptionPane.showInputDialog("Enter user ID to delete:");
                if (userIdString != null && !userIdString.isEmpty()) {
                    try {
                        int userId = Integer.parseInt(userIdString);
                        deleteUser(userId);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid user ID. Please enter a number.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User ID cannot be empty.");
                }
            }
        }

        private void deleteUser(int userId) {
            User foundUser = findUserById(userId);
            if (foundUser != null) {
                userList.remove(foundUser);
                JOptionPane.showMessageDialog(null, "User with ID " + userId + " deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "User with ID " + userId + " not found.");
            }
        }
    }

    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private User findUserById(int userId) {
        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HospitalManagementSystemGUI gui = new HospitalManagementSystemGUI();
            gui.setVisible(true);
        });
    }
}
