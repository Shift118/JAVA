import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter implements ActionListener {

    private JFrame frame;
    private JTextField txtInput;
    private JRadioButton rbCelsius, rbKelvin;
    private ButtonGroup conversionGroup;
    private JButton btnShowResult;
    private JLabel lblResult;

    public TemperatureConverter() {
        frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new GridLayout(4, 2));

        txtInput = new JTextField();
        rbCelsius = new JRadioButton("to Celsius", true);
        rbKelvin = new JRadioButton("to Kelvin");
        conversionGroup = new ButtonGroup();
        conversionGroup.add(rbCelsius);
        conversionGroup.add(rbKelvin);
        btnShowResult = new JButton("Show Result");
        
        lblResult = new JLabel("Enter Fahrenheit and choose conversion option");
        Font myFont = new Font("Sans Comic",Font.BOLD,12);
        lblResult.setFont(myFont);
        
        btnShowResult.addActionListener(this);

        frame.add(new JLabel("Fahrenheit:"));
        frame.add(txtInput);
        frame.add(rbCelsius);
        frame.add(rbKelvin);
        frame.add(new JLabel());
        frame.add(btnShowResult);
        frame.add(lblResult);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnShowResult) {
                double fahrenheit = Double.parseDouble(txtInput.getText());
                double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
                double result = rbCelsius.isSelected() ? celsius : celsius + 273.15;

                String resultMessage = rbCelsius.isSelected() ?
                        String.format("%.2f Fahrenheit is %.2f Celsius", fahrenheit, result) :
                        String.format("%.2f Fahrenheit is %.2f Kelvin", fahrenheit, result);
                
                lblResult.setText(resultMessage);
        }
    }
}
