package ru.ssau.tk.narmores.tasksoop.exam;

import javax.swing.*;

public class ReverseText extends JFrame {
    public static void main(String[] args) {
        ReverseText window = new ReverseText();
        window.setVisible(true);
    }

    public ReverseText() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        JButton reverseButton = new JButton("Перевернуть");
        reverseButton.addActionListener(event -> textField.setText(new StringBuffer(textField.getText()).reverse().toString()));
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
        this.add(textField);
        this.add(reverseButton);
        int width = 500;
        int height = 65;
        this.setSize(width, height);
    }
}
