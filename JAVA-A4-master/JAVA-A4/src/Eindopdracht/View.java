package Eindopdracht;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View {

    Controller controller;
    JTextField result;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void show() {
        JFrame frame = new JFrame("Rekenmachine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel calculatorPanel = new JPanel();
        calculatorPanel.setLayout(new FlowLayout());

        JTextField input1 = new JTextField(10);
        input1.setHorizontalAlignment(JTextField.RIGHT);
        calculatorPanel.add(input1);

        JComboBox<String> operand = new JComboBox<String>(
                new String[] { "+", "-", "*", "/" });
        calculatorPanel.add(operand);

        JTextField input2 = new JTextField(10);
        input2.setHorizontalAlignment(JTextField.RIGHT);
        calculatorPanel.add(input2);

        JLabel label = new JLabel(" = ");
        calculatorPanel.add(label);

        result = new JTextField(10);
        result.setBorder(BorderFactory.createLineBorder(
                Color.BLACK));
        result.setEditable(false);
        result.setHorizontalAlignment(JTextField.RIGHT);
        calculatorPanel.add(result);

        panel.add(calculatorPanel,
                BorderLayout.BEFORE_FIRST_LINE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton calcbutton = new JButton("Bereken");
        calcbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n1 = input1.getText();
                String op = operand.getItemAt(
                        operand.getSelectedIndex());
                String n2 = input2.getText();
                controller.handleUserInput(n1, op, n2);
            }
        });
        buttonPanel.add(calcbutton);

        panel.add(buttonPanel, BorderLayout.AFTER_LAST_LINE);

        frame.add(panel);
        frame.getRootPane().setDefaultButton(calcbutton);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public void setResult(String res) {
        this.result.setText(res);
    }

}
