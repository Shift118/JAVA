import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener{
	
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[19];
	JButton addButton,subButton,mulButton,divButton,powButton,logButton,lenButton,rootButton,sinButton,cosButton,tanButton,ansButton;
	JButton piButton,eButton;
	JButton decButton, equButton , delButton , clrButton,negButton;
	JPanel panel;
	JTextArea text;
	
	Font myFont = new Font("Sans Comic", Font.BOLD,30);
	double num1 = 0, num2 =0, result = 0;
	int once = 0;
	char operator;
	
	Calculator(){
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(825,550);
		frame.setLayout(null);
		
		//TextField
		textfield = new JTextField();
		textfield.setBounds(50, 25, 725, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		
		//Buttons
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		powButton = new JButton("^");
		logButton = new JButton("log()");
		lenButton = new JButton("len()");
		rootButton = new JButton("root()");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Del");
		clrButton = new JButton("Clr");
		negButton = new JButton("(-)");
		sinButton = new JButton("sin");
		cosButton = new JButton("cos");
		tanButton = new JButton("tan");
		ansButton = new JButton("ans");
		piButton = new JButton("PI");
		eButton = new JButton("e");
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		functionButtons[9] = powButton;
		functionButtons[10] = logButton;
		functionButtons[11] = lenButton;
		functionButtons[12] = rootButton;
		functionButtons[13] = sinButton;
		functionButtons[14] = cosButton;
		functionButtons[15] = tanButton;
		functionButtons[16] = ansButton;
		functionButtons[17] = piButton;
		functionButtons[18] = eButton;
		
		for(int i = 0; i<19 ; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		for(int i = 0; i<10 ; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		piButton.setBounds(162, 430, 100, 50);
		eButton.setBounds(262, 430, 100, 50);
		negButton.setBounds(362,430,100,50);
		delButton.setBounds(462, 430, 100, 50);
		clrButton.setBounds(562, 430, 100, 50);
	
		//Panel
		panel = new JPanel();
		panel.setBounds(50, 100, 725, 300);
		panel.setLayout(new GridLayout(4,6,10,10));
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(powButton);
		panel.add(sinButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(logButton);
		panel.add(cosButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(lenButton);
		panel.add(tanButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		panel.add(rootButton);
		panel.add(ansButton);
		
		
		//text
		text = new JTextArea();
		Font textFont = new Font("Sans Comic", Font.BOLD,14);
		text.setFont(textFont);
		text.setVisible(true);
		text.setBounds(310, 75, 600, 20);
		text.setBackground(null);
		
		//Frame Customize 
		frame.add(textfield);
		frame.add(text);
		frame.add(delButton);
		frame.add(panel);
		frame.add(clrButton);
		frame.add(negButton);
		frame.add(piButton);
		frame.add(eButton);
		frame.setVisible(true);
	}
	 
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0 ; i < 10 ; i++) {
			if(e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		if (e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		if (e.getSource() == addButton) {
			if(once == 0) { num1 = Double.parseDouble(textfield.getText()); once++;}
			else num1 += Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}
		if (e.getSource() == subButton) {
			if(once == 0) { num1 = Double.parseDouble(textfield.getText()); once++;}
			else num1 -= Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		if (e.getSource() == mulButton) {
			if(once == 0) { num1 = Double.parseDouble(textfield.getText()); once++;}
			else num1 *= Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		if (e.getSource() == divButton) {
			if(once == 0) { num1 = Double.parseDouble(textfield.getText()); once++;}
			else num1 /= Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		if (e.getSource() == equButton) {
			num2 = Double.parseDouble(textfield.getText());
			text.setText("");
			switch(operator) {
			case '+':result = num1 + num2; break;
			case '-':result = num1 - num2; break;
			case '*':result = num1 * num2; break;
			case '/':result = num1 / num2; break;
			case 'L':result = Math.log(num1)/Math.log(num2); break;
			case '^':result = Math.pow(num1, num2); break;
			case 'r':result = Math.pow(num1, 1.0/num2); break;
			}
			textfield.setText(String.valueOf(result));
			once = 0;
		}
		if (e.getSource() == clrButton) {
			num1 = 0;
			num2 = 0;
			once = 0;
			operator = ' ';
			textfield.setText("");
		}
		if (e.getSource() == delButton) {
			String string =textfield.getText();
			textfield.setText("");
			text.setText("");
			for (int i = 0; i < string.length() -1 ; i++) {
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}
		if (e.getSource() == negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp *= -1;
			textfield.setText(String.valueOf(temp));
		}
		if (e.getSource() == powButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '^';
			textfield.setText("");
			text.setText("Enter Power Value");
		}
		if (e.getSource() == logButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = 'L';
			textfield.setText("");
			text.setText("Enter Log Base Value");
		}
		if (e.getSource() == lenButton) {
			num1 = Math.log(Double.parseDouble(textfield.getText()));
			textfield.setText(String.valueOf(num1));
		}
		if (e.getSource() == rootButton) {
			num1 = Double.parseDouble(textfield.getText());
			text.setText("Enter The Root Base");
			operator = 'r';
			textfield.setText("");
		}
		if (e.getSource() == sinButton) {
			num1 = Math.sin(Math.toRadians(Double.parseDouble(textfield.getText())));
			textfield.setText(String.valueOf(num1));
		}
		if (e.getSource() == cosButton) {
			num1 = Math.cos(Math.toRadians(Double.parseDouble(textfield.getText())));
			textfield.setText(String.valueOf(num1));
		}
		if (e.getSource() == tanButton) {
			num1 = Math.tan(Math.toRadians(Double.parseDouble(textfield.getText())));
			textfield.setText(String.valueOf(num1));
		}
		if (e.getSource() == ansButton) {
			textfield.setText(String.valueOf(result));
		}
		if (e.getSource() == piButton) {
			textfield.setText(String.valueOf(Math.PI));
		}
		if (e.getSource() == eButton) {
			textfield.setText(String.valueOf(Math.E));
		}	
	}
}