import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Class to create calculator
class Calculator {
    JFrame frame;
    JTextField display;
    JButton[] buttons;
    JButton delete, clear, equal;
    String expression;
    String[] operands;
    int currentOper;
    char operator;
    boolean containsOperator;

    // Constructor
    Calculator()
    {
        UIManager.put("Button.font", new Font("Arial", Font.PLAIN, 15));
        UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 15));
        // creating window
        frame = new JFrame();
        frame.setSize(240, 290);
        frame.setTitle("Calculator");
        frame.setResizable(false);

        // creating display box
        display = new JTextField();
        display.setEnabled(false);
        display.setDisabledTextColor(Color.BLACK);
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        // creating buttons
        buttons = new JButton[]{
                new JButton("0"),
                new JButton("1"),
                new JButton("2"),
                new JButton("3"),
                new JButton("4"),
                new JButton("5"),
                new JButton("6"),
                new JButton("7"),
                new JButton("8"),
                new JButton("9"),
                new JButton("."),
                new JButton("+"),
                new JButton("-"),
                new JButton("/"),
                new JButton("X"),
        };
        equal = new JButton("=");
        delete = new JButton("DEL");
        clear = new JButton("AC");

        // initialising other variables
        operands = new String[]{"", ""};
        currentOper = 0;
        operator = ' ';
        expression = "";
        containsOperator = false;
    }

    void setUp()
    {
        JPanel main = new JPanel();

        // creating layout
        GridLayout layout = new GridLayout();
        layout.setRows(6);
        layout.setColumns(1);
        main.setLayout(layout);

        // creating sub panels
        JPanel sub1 = new JPanel();
        JPanel sub2 = new JPanel();
        JPanel sub3 = new JPanel();
        JPanel sub4 = new JPanel();
        JPanel sub5 = new JPanel();

        // creating layout for sub panels with 2 columns
        GridLayout subLayout2 = new GridLayout();
        subLayout2.setRows(1);
        subLayout2.setColumns(2);
        sub1.setLayout(subLayout2);

        // creating layout for sub panels with 4 columns
        GridLayout subLayout4 = new GridLayout();
        subLayout4.setRows(1);
        subLayout4.setColumns(4);
        sub2.setLayout(subLayout4);
        sub3.setLayout(subLayout4);
        sub4.setLayout(subLayout4);
        sub5.setLayout(subLayout4);

        // adding components to sub panels
        sub1.add(delete);
        sub1.add(clear);

        sub2.add(buttons[7]);
        sub2.add(buttons[8]);
        sub2.add(buttons[9]);
        sub2.add(buttons[13]);

        sub3.add(buttons[4]);
        sub3.add(buttons[5]);
        sub3.add(buttons[6]);
        sub3.add(buttons[14]);

        sub4.add(buttons[1]);
        sub4.add(buttons[2]);
        sub4.add(buttons[3]);
        sub4.add(buttons[12]);

        sub5.add(buttons[10]);
        sub5.add(buttons[0]);
        sub5.add(equal);
        sub5.add(buttons[11]);
        
        // adding components to main panel
        main.add(display);
        main.add(sub1);
        main.add(sub2);
        main.add(sub3);
        main.add(sub4);
        main.add(sub5);

        frame.add(main);

        // setting what happens when window closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // displaying window
        frame.setVisible(true);
    }

    // method to set up button action listeners
    void setUpButtonListeners()
    {
        // action listener for all buttons inside array
        ActionListener arrayButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                for(int i = 0; i < buttons.length; i++)
                {
                    if(source == buttons[i]) {
                        String input = buttons[i].getText();
                        // checking if number is to be made negative
                        if(i == 12 && !operands[currentOper].contains("-") && operands[currentOper].length() == 0) {
                            operands[currentOper] += input;
                        }
                        // checking if operator was entered
                        else if(i >= 11 && !containsOperator && operands[0].length() != 0) {
                            operator = input.charAt(0);
                            containsOperator = true;
                            currentOper++;
                        }
                        // checking if number was entered
                        else if(i <= 9){
                            operands[currentOper] += input;
                        }
                        // checking if decimal point was entered
                        else if(i == 10 && !operands[currentOper].contains(".")) {
                            operands[currentOper] += input;
                        }

                    }

                }
                // setting text of display
                display.setText(operands[0] + operator + operands[1]);
            }
        };

        // action listener for all other buttons
        ActionListener otherButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if(source.equals(delete)) {
                    if(operands[1].length() != 0) {
                        // removing last digit from operand
                        operands[1] = operands[1].substring(0, operands[1].length()-1);
                    } else if(operator != ' ') {
                        // removing last operator
                        operator = ' ';
                        containsOperator = false;
                        currentOper = 0;
                    } else if(operands[0].length() != 0) {
                        // removing last digit from operand
                        operands[0] = operands[0].substring(0, operands[0].length() - 1);
                    }
                    // setting text of display
                    display.setText(operands[0] + operator + operands[1]);
                } else if(source.equals(clear)) {
                    // clearing operands and operator
                    containsOperator = false;
                    operator = ' ';
                    operands[0] = "";
                    operands[1] = "";

                    // setting text of display
                    display.setText(operands[0] + operator + operands[1]);
                } else if(source.equals(equal)) {
                    evaluate();
                }
            }
        };

        for(int i = 0; i<buttons.length; i++)
            buttons[i].addActionListener(arrayButtonListener);
        delete.addActionListener(otherButtonListener);
        clear.addActionListener(otherButtonListener);
        equal.addActionListener(otherButtonListener);
    }

    void evaluate()
    {
        try {
            double num1 = Double.parseDouble(operands[0]);
            double num2 = Double.parseDouble(operands[1]);
            switch (operator) {
                case '+':
                    operands[0] = Double.toString(num1 + num2);
                    break;
                case '-':
                    operands[0] = Double.toString(num1 - num2);
                    break;
                case '/':
                    operands[0] = Double.toString(num1 / num2);
                    break;
                case 'X':
                    operands[0] = Double.toString(num1 * num2);
                    break;
            }
            operands[1] = "";
            operator = ' ';
            containsOperator = false;
            currentOper = 0;
            display.setText(operands[0]);
        } catch(Exception e) {
            operands[0] = "";
            operands[1] = "";
            operator = ' ';
            display.setText("ERROR");
            containsOperator = false;
            currentOper = 0;
        }
    }
}
