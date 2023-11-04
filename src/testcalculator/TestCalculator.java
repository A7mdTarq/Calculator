package testcalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TestCalculator implements ActionListener {
    
    double num1 = 0, num2 = 0, result = 0;
    int calculation;
    String str;
    

    JFrame frame = new JFrame("Calculator");
    JLabel lable = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("X\u00B2");
    JButton buttonReciprocal = new JButton("1 / X");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonMod = new JButton("%");
    JButton buttonPow = new JButton("pow");
    
    
    
    TestCalculator(){
        prepareGui();
        addComponents();
        addActionEvevt();
    }
    
    public void prepareGui(){
        frame.setSize(610,1020);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void addComponents(){
        lable.setBounds(500, 0, 100, 100);
        lable.setForeground(Color.white);
        frame.add(lable);
        
        textField.setBounds(20,80,540,80);
        textField.setFont(new Font ("Arial",Font.BOLD,40));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        
        onRadioButton.setBounds(20, 190, 120, 80);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font ("Arial",Font.BOLD,28));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);
        
        offRadioButton.setBounds(20, 240, 120, 80);
        offRadioButton.setSelected(true);
        offRadioButton.setFont(new Font ("Arial",Font.BOLD,28));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        
        buttonSeven.setBounds(20, 460, 120, 80);
        buttonSeven.setFont(new Font ("Arial",Font.BOLD,40));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);
        
        buttonEight.setBounds(160, 460, 120, 80);
        buttonEight.setFont(new Font ("Arial",Font.BOLD,40));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);
        
        buttonNine.setBounds(300, 460, 120, 80);
        buttonNine.setFont(new Font ("Arial",Font.BOLD,40));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);
        
        buttonFour.setBounds(20, 580, 120, 80);
        buttonFour.setFont(new Font ("Arial",Font.BOLD,40));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);
        
        buttonFive.setBounds(160, 580, 120, 80);
        buttonFive.setFont(new Font ("Arial",Font.BOLD,40));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);
        
        buttonSix.setBounds(300, 580, 120, 80);
        buttonSix.setFont(new Font ("Arial",Font.BOLD,40));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);
        
        buttonOne.setBounds(20, 700, 120, 80);
        buttonOne.setFont(new Font ("Arial",Font.BOLD,40));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);
        
        buttonTwo.setBounds(160, 700, 120, 80);
        buttonTwo.setFont(new Font ("Arial",Font.BOLD,40));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);
        
        buttonThree.setBounds(300, 700, 120, 80);
        buttonThree.setFont(new Font ("Arial",Font.BOLD,40));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);
        
        buttonDot.setBounds(160, 820, 120, 80);
        buttonDot.setFont(new Font ("Arial",Font.BOLD,40));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);
        
        buttonZero.setBounds(20, 820, 120, 80);
        buttonZero.setFont(new Font ("Arial",Font.BOLD,40));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);
        
        buttonEqual.setBounds(300, 820, 120, 80);
        buttonEqual.setFont(new Font ("Arial",Font.BOLD,40));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);
        
        buttonDiv.setBounds(440, 220, 120, 80);
        buttonDiv.setFont(new Font ("Arial",Font.BOLD,40));
        buttonDiv.setBackground(new Color(239,188,2));
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);
        
        buttonSqrt.setBounds(20, 340, 120, 80);
        buttonSqrt.setFont(new Font ("Arial",Font.BOLD,36));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);
        
        buttonMul.setBounds(440, 460, 120, 80);
        buttonMul.setFont(new Font ("Arial",Font.BOLD,40));
        buttonMul.setBackground(new Color(239,188,2));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);
        
        buttonMinus.setBounds(440, 340, 120, 80);
        buttonMinus.setFont(new Font ("Arial",Font.BOLD,40));
        buttonMinus.setBackground(new Color(239,188,2));
        buttonMinus.setFocusable(false);
        frame.add(buttonMinus);

        buttonPlus.setBounds(440, 580, 120, 80);
        buttonPlus.setFont(new Font ("Arial",Font.BOLD,40));
        buttonPlus.setBackground(new Color(239,188,2));
        buttonPlus.setFocusable(false);
        frame.add(buttonPlus);
        
        buttonSquare.setBounds(160, 340, 120, 80);
        buttonSquare.setFont(new Font ("Arial",Font.BOLD,40));
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);
        
        buttonReciprocal.setBounds(300, 340, 120, 80);
        buttonReciprocal.setFont(new Font ("Arial",Font.BOLD,30));
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);
        
        buttonDelete.setBounds(300, 220, 120, 80);
        buttonDelete.setFont(new Font ("Arial",Font.BOLD,24));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);
        
        buttonClear.setBounds(160, 220, 120, 80);
        buttonClear.setFont(new Font ("Arial",Font.BOLD,24));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);
        
        buttonMod.setBounds(440, 700, 120, 80);
        buttonMod.setFont(new Font ("Arial",Font.BOLD,35));
        buttonMod.setBackground(new Color(239,188,2));
        buttonMod.setFocusable(false);
        frame.add(buttonMod);
        
        buttonPow.setBounds(440, 820, 120, 80);
        buttonPow.setFont(new Font ("Arial",Font.BOLD,30));
        buttonPow.setBackground(new Color(239,188,2));
        buttonPow.setFocusable(false);
        frame.add(buttonPow);
        
        
        
        
        
    
    }
    
    public void addActionEvevt(){
    
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonPow.addActionListener(this);
        buttonMod.addActionListener(this);
        
        
        
        
    }
    
   
    public static void main(String[] args) {
       
        TestCalculator c1 = new TestCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object source = ae.getSource();
        
        if(source == onRadioButton){
            enable();
        }else if(source == offRadioButton){
            disable();
        }else if(source == buttonClear){
            lable.setText("");
            textField.setText("");
        }else if(source == buttonDelete){
            
            int length = textField.getText().length();
            int number = length -1;
            
            if(length > 0){    
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());        
            }
            if(textField.getText().endsWith(""));
            lable.setText("");
        }else if (source == buttonZero){
            if(textField.getText().equals("0")){
                return;
            }else{
                textField.setText(textField.getText() + "0");
            }
        }else if(source == buttonOne){
            textField.setText(textField.getText() + "1");
        }else if(source == buttonTwo){
            textField.setText(textField.getText() + "2");
        }else if(source == buttonThree){
            textField.setText(textField.getText() + "3");
        }else if(source == buttonFour){
            textField.setText(textField.getText() + "4");
        }else if(source == buttonFive){
            textField.setText(textField.getText() + "5");
        }else if(source == buttonSix){
            textField.setText(textField.getText() + "6");
        }else if(source == buttonSeven){
            textField.setText(textField.getText() + "7");
        }else if(source == buttonEight){
            textField.setText(textField.getText() + "8");
        }else if(source == buttonNine){
            textField.setText(textField.getText() + "9");
        }else if(source == buttonDot){
            if(textField.getText().contains(".")){
                return;
            }else{
                textField.setText(textField.getText() + ".");
            }  
        }else if(source == buttonPlus){
            str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            lable.setText(str + "+");
        }else if(source == buttonMinus){
            str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            lable.setText(str + "-");
        }else if(source == buttonMul){
            str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            lable.setText(str + "x");
        }else if(source == buttonDiv){
            str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            lable.setText(str + "/");
        }else if(source == buttonSquare){
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
                
            }else{
                textField.setText(string);
            }
        }else if(source == buttonSqrt){
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        }else if(source == buttonReciprocal){
            num1 = Double.parseDouble(textField.getText());
            double reciprocal = 1 / num1;
            String string = Double.toString(reciprocal);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
                
            }else{
                textField.setText(string);
            }
        }else if(source == buttonPow){
            str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 5;
            textField.setText("");
            lable.setText(str + "^");
        }else if(source == buttonMod){
            str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 6;
            textField.setText("");
            lable.setText(str + "%");
        }else if (source == buttonEqual){
            num2 = Double.parseDouble(textField.getText());
            switch(calculation){
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                case 5:
                    result = Math.pow(num1, num2);
                    break;
                case 6:
                    result = num1 % num2;
                    break;
                default:
                    return;
            }
            if(Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0", ""));
            }else{
                textField.setText(Double.toString(result));
            }
            lable.setText("");
            num1 = result;
        }
        
    }
    
    public void enable(){
    
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        lable.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonMod.setEnabled(true);
        buttonPow.setEnabled(true);
        
    }
    
    public void disable(){
        
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        lable.setEnabled(false);
        lable.setText("");
        textField.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);        
        buttonMod.setEnabled(false);
        buttonPow.setEnabled(false);
    
    }
    
}
