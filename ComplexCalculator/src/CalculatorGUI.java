// Класс для пользовательского интерфейса калькулятора комплексных чисел

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField firstRealPartField;
    private JTextField firstImaginaryPartField;
    private JTextField secondRealPartField;
    private JTextField secondImaginaryPartField;
    private JButton addButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JTextArea resultArea;

    public CalculatorGUI() {
        super("Complex Number Calculator");

        // Настройка компонентов пользовательского интерфейса
        JPanel inputPanel = new JPanel(new GridLayout(5, 8));
        inputPanel.add(new JLabel("First number:"));
        inputPanel.add(new JLabel("Real part"));
        inputPanel.add(new JLabel("Imaginary part"));
        inputPanel.add(new JLabel(""));
        inputPanel.add(new JLabel("Number 1:"));
        firstRealPartField = new JTextField(5);
        inputPanel.add(firstRealPartField);
        firstImaginaryPartField = new JTextField(5);
        inputPanel.add(firstImaginaryPartField);
        inputPanel.add(new JLabel("Number 2:"));
        secondRealPartField = new JTextField(5);
        inputPanel.add(secondRealPartField);
        secondImaginaryPartField = new JTextField(5);
        inputPanel.add(secondImaginaryPartField);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        addButton = new JButton("Add");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);
        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.add(new JLabel("Result:"), BorderLayout.NORTH);
        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        resultPanel.add(scrollPane, BorderLayout.CENTER);

        // Добавление компонентов на форму
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);

        // Настройка окна
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Получение значений из полей ввода
        double firstRealPart = Double.parseDouble(firstRealPartField.getText());
        double firstImaginaryPart = Double.parseDouble(firstImaginaryPartField.getText());
        double secondRealPart = Double.parseDouble(secondRealPartField.getText());
        double secondImaginaryPart = Double.parseDouble(secondImaginaryPartField.getText());

        // Создание объектов комплексных чисел и калькулятора
        ComplexNumber firstNumber = new ComplexNumber(firstRealPart, firstImaginaryPart);
        ComplexNumber secondNumber = new ComplexNumber(secondRealPart, secondImaginaryPart);
        Calculator calculator = new Calculator(firstNumber, secondNumber);

        // Выполнение операции и вывод результата
        if (e.getSource() == addButton) {
            ComplexNumber result = calculator.add();
            resultArea.setText(result.toString());
        } else if (e.getSource() == multiplyButton) {
            ComplexNumber result = calculator.multiply();
            resultArea.setText(result.toString());
        } else if (e.getSource() == divideButton) {
            ComplexNumber result = calculator.divide();
            resultArea.setText(result.toString());
        }
    }
}
