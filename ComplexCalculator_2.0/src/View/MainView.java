package View;

import javax.swing.*;

import Domen.ComplexNumber;
import Service.Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame implements ActionListener {

    private JTextField firstRealField, firstImagField, secondRealField, secondImagField, resultArea;
    private JButton addButton, substrButton, multiplyButton, divideButton, clearButton;

    public MainView() {
        setTitle("Complex Number Calculator");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем панель для компонентов
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        // Добавляем поля для ввода первого комплексного числа
        JLabel firstNumberLabel = new JLabel("Первое число:");
        panel.add(firstNumberLabel);

        firstRealField = new JTextField();
        panel.add(firstRealField);

        JLabel plusLabel = new JLabel("+");
        panel.add(plusLabel);

        firstImagField = new JTextField();
        panel.add(firstImagField);

        JLabel iLabel1 = new JLabel("i");
        panel.add(iLabel1);

        // Добавляем поля для ввода второго комплексного числа
        JLabel secondNumberLabel = new JLabel("Второе число:");
        panel.add(secondNumberLabel);

        secondRealField = new JTextField();
        panel.add(secondRealField);

        JLabel plusLabel2 = new JLabel("+");
        panel.add(plusLabel2);

        secondImagField = new JTextField();
        panel.add(secondImagField);

        JLabel iLabel2 = new JLabel("i");
        panel.add(iLabel2);

        // Добавляем кнопки для операций
        addButton = new JButton("+");
        addButton.addActionListener(this);
        panel.add(addButton);

        substrButton = new JButton("-");
        substrButton.addActionListener(this);
        panel.add(substrButton);

        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        panel.add(divideButton);

        // Добавляем поле для вывода результата
        JLabel resultLabel = new JLabel("Результат:");
        panel.add(resultLabel);

        resultArea = new JTextField();
        resultArea.setEditable(false);
        panel.add(resultArea);

        // Добавляем кнопку для очистки полей
        clearButton = new JButton("Очистить");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        // Добавляем панель на форму
        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Проверяем введенные значения на корректность
        try {
            double firstReal = Double.parseDouble(firstRealField.getText());
            double firstImag = Double.parseDouble(firstImagField.getText());
            double secondReal = Double.parseDouble(secondRealField.getText());
            double secondImag = Double.parseDouble(secondImagField.getText());

            // Создаем объект калькулятора и передаем ему введенные числа
            ComplexNumber first = new ComplexNumber(firstReal, firstImag);
            ComplexNumber second = new ComplexNumber(secondReal, secondImag);
            Calculator calculator = new Calculator(first, second);

            // Выполняем операцию в зависимости от нажатой кнопки
            if (e.getSource() == addButton) {
                resultArea.setText(calculator.add().toString());
            } else if (e.getSource() == substrButton) {
                resultArea.setText(calculator.substraction().toString());
            } else if (e.getSource() == multiplyButton) {
                resultArea.setText(calculator.multiply().toString());
            } else if (e.getSource() == divideButton) {
                resultArea.setText(calculator.divide().toString());
            } else if (e.getSource() == clearButton) { // если нажата кнопка очистить
                firstRealField.setText(""); // очищаем все поля
		firstImagField.setText("");
                secondRealField.setText("");
                secondImagField.setText("");
                resultArea.setText("");
            }
        } catch (NumberFormatException ex) {
            resultArea.setText("Ошибка ввода чисел");
        }
    }

    public static void main(String[] args) {
        new MainView();
    }
}