import java.awt.*;
import java.awt.event.*;

public class CalculatorExample extends Frame implements ActionListener {
    private TextField display;
    private Button[] buttons;

    public CalculatorExample() {
        // Create a text field for display
        display = new TextField();
        display.setEditable(false);
        
        // Create buttons for the calculator
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };
        
        buttons = new Button[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].addActionListener(this);
        }

        // Set layout for the frame
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);

        // Create a panel with GridLayout for buttons
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5)); // 4 rows, 4 columns
        for (Button button : buttons) {
            buttonPanel.add(button);
        }
        
        add(buttonPanel, BorderLayout.CENTER);

        // Set frame properties
        setSize(300, 400);
        setTitle("Calculator");
        setVisible(true);

        // Add window listener to close the application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("C")) {
            display.setText("");
        } else if (command.equals("=")) {
            // Simple evaluation logic (not robust)
            try {
                display.setText(String.valueOf(eval(display.getText())));
            } catch (Exception ex) {
                display.setText("Error");
            }
        } else {
            display.setText(display.getText() + command);
        }
    }

    // Simple evaluation method (for demonstration purposes)
    private double eval(String expression) {
        // This is a very basic evaluation logic for demonstration purposes.
        // In a real application, you would want to use a proper expression parser.
        String[] tokens = expression.split(" ");
        double result = 0;
        if (tokens.length == 3) {
            double num1 = Double.parseDouble(tokens[0]);
            double num2 = Double.parseDouble(tokens[2]);
            switch (tokens[1]) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new CalculatorExample();
    }
}