package Services;
import Services.VendingMachine;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Domen.Product;

public class VendingMachineGUI extends JFrame {
   
    private static final long serialVersionUID = 1L;
    public VendingMachineGUI() {
        Container menu = getContentPane(); // клиентская область окна
        menu.setLayout(new BorderLayout()); // выбираем компоновщик
        // добавляем какие-нибудь дочерние элементы
        //MyComponent child = new MyComponent();
        JPanel buyProduct= new JPanel();    
        menu.add(buyProduct);
        
        setTitle("Main menu"); // заголовок окна
        
        setPreferredSize(new Dimension(640, 480)); // желательные размеры окна
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// завершить приложение при закрытии окна
        pack(); // устанавливаем желательные размеры
        setVisible(true); // отображаем окно
        JButton changeProduct=new JButton("Веберите продукт");//создаем кнопки
        JButton cash=new JButton("Внесите деньги");
        JButton takeChange=new JButton("Получите сдачу");
        buyProduct.add(changeProduct);
        buyProduct.add(cash);
        buyProduct.add(takeChange);


    }
}
