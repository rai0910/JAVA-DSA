import java.awt.*;
import java.awt.event.*;

public class AWTEventExample extends Frame implements ActionListener {
    private Label label;
    private Button button;

    public AWTEventExample() {
        // Create a label
        label = new Label("Click the button to see a message.");
        label.setBounds(50, 50, 300, 30);

        // Create a button
        button = new Button("Click Me");
        button.setBounds(100, 100, 80, 30);

        // Add action listener to the button
        button.addActionListener(this);

        // Add components to the frame
        add(label);
        add(button);

        // Set frame properties
        setSize(400, 200);
        setLayout(null);
        setVisible(true);

        // Add window listener to close the application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Implement the actionPerformed method
    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked!");
    }

    public static void main(String[] args) {
        new AWTEventExample();
    }
}