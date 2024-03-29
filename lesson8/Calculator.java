package lesson8;


import javax.swing.*;
import java.awt.*;

public class Calculator {

    private static final int WINDOW_WIDTH = 410;
    private static final int WINDOW_HEIGHT = 600;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 70;
    private static final int MARGIN_X = 20;
    private static final int MARGIN_Y = 60;

    private JFrame window;
    private JTextField inText;
    private JButton btnC, btnDiv, btn7, btn8, btn9,
            btnMul, btn4, btn5, btn6, btnSub, btn1, btn2, btn3, btnAdd,
            btn0, btnEqual, btnRoot;
    private char opt = ' ';
    private boolean go = true;
    private boolean addWrite = true;
    private double val = 0;




    private Calculator() {
        window = new JFrame("Калькулятор");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLocationRelativeTo(null);


        Font btnFont = new Font("Arial", Font.PLAIN, 28);
        Font smallTxtBtnFont = new Font("Arial", Font.PLAIN, 24);



        int[] x = {MARGIN_X, MARGIN_X + 90, 200, 290, 380};
        int[] y = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 180, MARGIN_Y + 260, MARGIN_Y + 340, MARGIN_Y + 420};

        inText = new JTextField("0");
        inText.setBounds(x[0], y[0], 350, 70);
        inText.setEditable(false);
        inText.setBackground(Color.WHITE);
        inText.setFont(new Font("Arial", Font.PLAIN, 33));
        window.add(inText);

        btnC = new JButton("C");
        btnC.setBounds(x[0], y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnC.setFont(btnFont);
        btnC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnC.addActionListener(event -> {
            repaintFont();
            inText.setText("0");
            opt = ' ';
            val = 0;
        });
        window.add(btnC);

        btnRoot = new JButton("√");
        btnRoot.setBounds(x[2], y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnRoot.setFont(btnFont);
        btnRoot.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRoot.addActionListener(event -> {
            val = Math.sqrt(Double.parseDouble(inText.getText()));
            inText.setText(String.valueOf(val));
            opt = '√';
            addWrite = false;
        });
        btnRoot.setVisible(true);
        window.add(btnRoot);


        btnDiv = new JButton("/");
        btnDiv.setBounds(x[1], y[1], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnDiv.setFont(btnFont);
        btnDiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDiv.addActionListener(event -> {
            repaintFont();
            val = calc(val, inText.getText(), opt);
            inText.setText(String.valueOf((int) val));
            opt = '/';
            go = false;
            addWrite = false;
        });
        window.add(btnDiv);



        btn7 = new JButton("7");
        btn7.setBounds(x[0], y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn7.setFont(btnFont);
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.addActionListener(event -> {
            repaintFont();
            inText.setText("7");
            addWrite = true;
            go = true;
        });
        window.add(btn7);

        btn8 = new JButton("8");
        btn8.setBounds(x[1], y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn8.setFont(btnFont);
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.addActionListener(event -> {
            repaintFont();
            inText.setText("8");
            addWrite = true;
            go = true;
        });
        window.add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(x[2], y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn9.setFont(btnFont);
        btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn9.addActionListener(event -> {
            repaintFont();
            inText.setText("9");
            addWrite = true;
            go = true;
        });
        window.add(btn9);

        btnMul = new JButton("*");
        btnMul.setBounds(x[3], y[2], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnMul.setFont(btnFont);
        btnMul.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMul.addActionListener(event -> {
            repaintFont();
            val = calc(val, inText.getText(), opt);
            inText.setText(String.valueOf((int) val));
            opt = '*';
            go = false;
            addWrite = false;
        });
        window.add(btnMul);

        btn4 = new JButton("4");
        btn4.setBounds(x[0], y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn4.setFont(btnFont);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.addActionListener(event -> {
            repaintFont();
            inText.setText("4");
            addWrite = true;
            go = true;
        });
        window.add(btn4);

        btn5 = new JButton("5");
        btn5.setBounds(x[1], y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn5.setFont(btnFont);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.addActionListener(event -> {
            repaintFont();
            inText.setText("5");
            addWrite = true;
            go = true;
        });
        window.add(btn5);

        btn6 = new JButton("6");
        btn6.setBounds(x[2], y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn6.setFont(btnFont);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn6.addActionListener(event -> {
            repaintFont();
            inText.setText("6");
            addWrite = true;
            go = true;
        });
        window.add(btn6);

        btnSub = new JButton("-");
        btnSub.setBounds(x[3], y[3], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnSub.setFont(btnFont);
        btnSub.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSub.addActionListener(event -> {
            repaintFont();
            val = calc(val, inText.getText(), opt);
            inText.setText(String.valueOf((int) val));
            opt = '-';
            go = false;
            addWrite = false;
        });
        window.add(btnSub);

        btn1 = new JButton("1");
        btn1.setBounds(x[0], y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn1.setFont(btnFont);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.addActionListener(event -> {
            repaintFont();
            inText.setText("1");
            addWrite = true;
            go = true;
        });
        window.add(btn1);

        btn2 = new JButton("2");
        btn2.setBounds(x[1], y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn2.setFont(btnFont);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.addActionListener(event -> {
            repaintFont();
            inText.setText("2");
            addWrite = true;
            go = true;
        });
        window.add(btn2);

        btn3 = new JButton("3");
        btn3.setBounds(x[2], y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn3.setFont(btnFont);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.addActionListener(event -> {
            repaintFont();
            inText.setText("3");
            addWrite = true;
            go = true;
        });
        window.add(btn3);

        btnAdd = new JButton("+");
        btnAdd.setBounds(x[3], y[4], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnAdd.setFont(btnFont);
        btnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAdd.addActionListener(event -> {
            repaintFont();
            val = calc(val, inText.getText(), opt);
            inText.setText(String.valueOf((int) val));
            opt = '+';
            go = false;
            addWrite = false;
        });
        window.add(btnAdd);


        btn0 = new JButton("0");
        btn0.setBounds(x[1], y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn0.setFont(btnFont);
        btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn0.addActionListener(event -> {
            repaintFont();
            inText.setText("0");
            addWrite = true;
            go = true;
        });
        window.add(btn0);

        btnEqual = new JButton("=");
        btnEqual.setBounds(x[2], y[5], 2 * BUTTON_WIDTH + 10, BUTTON_HEIGHT);
        btnEqual.setFont(btnFont);
        btnEqual.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnEqual.addActionListener(event -> {
            val = calc(val, inText.getText(), opt);
            inText.setText(String.valueOf((int) val));
            opt = '=';
            addWrite = false;
        });
        window.add(btnEqual);

        window.setLayout(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    private double calc(double x, String input, char opt) {
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        double y = Double.parseDouble(input);
        if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        }
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        return y;
    }

    private void repaintFont() {
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

