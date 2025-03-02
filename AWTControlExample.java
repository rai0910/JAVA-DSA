import java.awt.*;
import java.awt.event.*;

public class AWTControlExample extends Frame implements ActionListener {
    private Label nameLabel;
    private TextField nameField;
    private Checkbox newsletterCheckbox;
    private Button submitButton;
    private Label messageLabel;

    public AWTControlExample() {
        // Create components
        nameLabel = new Label("Enter your name:");
        nameField = new TextField(20);
        newsletterCheckbox = new Checkbox("Subscribe to newsletter");
        submitButton = new Button("Submit");
        messageLabel = new Label("");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(newsletterCheckbox);
        add(submitButton);
        add(messageLabel);

        // Add action listener to the button
        submitButton.addActionListener(this);

        // Set frame properties
        setSize(300, 200);
        setTitle("AWT Control Example");
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
        String name = nameField.getText();
        boolean isSubscribed = newsletterCheckbox.getState();
        String message = "Hello, " + name + "! ";

        if (isSubscribed) {
            message += "Thank you for subscribing to the newsletter.";
        } else {
            message += "You have opted out of the newsletter.";
        }

        messageLabel.setText(message);
    }

    public static void main(String[] args) {
        new AWTControlExample();
    }
}