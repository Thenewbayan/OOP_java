package View;


import javax.swing.*;

import Domen.ComplexNumber;
import Service.Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame implements ActionListener {

    private JTextField firstRealField;
    private JTextField firstImagField;
    private JTextField secondRealField;
    private JTextField secondImagField;
    private JButton addButton;
    private JButton substrButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton clearButton; // добавляем кнопку очистить
    private JTextField resultArea;

    public MainView() {
        setTitle("Complex Number Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberLabel.setBounds(20, 20, 100, 20);
        add(firstNumberLabel);

        firstRealField = new JTextField();
        firstRealField.setBounds(20, 50, 50, 20);
        add(firstRealField);

        JLabel plusLabel = new JLabel("+");
        plusLabel.setBounds(80, 50, 10, 20);
        add(plusLabel);

        firstImagField = new JTextField();
        firstImagField.setBounds(100, 50, 50, 20);
        add(firstImagField);

        JLabel iLabel1 = new JLabel("i");
        iLabel1.setBounds(160, 50, 10, 20);
        add(iLabel1);

        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberLabel.setBounds(20, 90, 100, 20);
        add(secondNumberLabel);

        secondRealField = new JTextField();
        secondRealField.setBounds(20, 120, 50, 20);
        add(secondRealField);

        JLabel plusLabel2 = new JLabel("+");
        plusLabel2.setBounds(80, 120, 10, 20);
        add(plusLabel2);

        secondImagField = new JTextField();
        secondImagField.setBounds(100, 120, 50, 20);
        add(secondImagField);

        JLabel iLabel2 = new JLabel("i");
        iLabel2.setBounds(160, 120, 10, 20);
        add(iLabel2);

        addButton = new JButton("+");
        addButton.setBounds(20, 160, 50, 20);
        addButton.addActionListener(this);
        add(addButton);

        substrButton = new JButton("-");
        substrButton.setBounds(80, 160, 50, 20);
        substrButton.addActionListener(this);
        add(substrButton);

        multiplyButton = new JButton("*");
        multiplyButton.setBounds(140, 160, 50, 20);
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.setBounds(200, 160, 50, 20);
        divideButton.addActionListener(this);
        add(divideButton);

        clearButton = new JButton("Clear"); // создаем кнопку очистить
        clearButton.setBounds(260, 160, 80, 20); // задаем ее размеры и расположение
        clearButton.addActionListener(this); // добавляем слушателя
        add(clearButton); // добавляем на форму

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 200, 50, 20);
        add(resultLabel);

        resultArea = new JTextField();
        resultArea.setBounds(80, 200, 200, 20);
        resultArea.setEditable(false);
        add(resultArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexNumber first = new ComplexNumber(Double.parseDouble(firstRealField.getText()), Double.parseDouble(firstImagField.getText()));
        ComplexNumber second = new ComplexNumber(Double.parseDouble(secondRealField.getText()), Double.parseDouble(secondImagField.getText()));
        Calculator calculator = new Calculator(first, second);

        if (e.getSource() == addButton) {
            resultArea.setText(calculator.add().toString());
        } else if (e.getSource() == multiplyButton) {
            resultArea.setText(calculator.multiply().toString());
        } else if (e.getSource() == divideButton) {
            resultArea.setText(calculator.divide().toString());
        } else if (e.getSource() == substrButton) {
            resultArea.setText(calculator.substraction().toString());


} else if (e.getSource() == clearButton) { // если нажата кнопка очистить
            firstRealField.setText(""); // очищаем все поля
            firstImagField.setText("");
            secondRealField.setText("");
            secondImagField.setText("");
            resultArea.setText("");
        }
    }

    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.setVisible(true);
    }
}