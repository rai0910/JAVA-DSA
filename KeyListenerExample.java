import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    private TextField textField;
    private Label label;

    public KeyListenerExample() {
        // Create components
        textField = new TextField(20);
        label = new Label("Press any key in the text field.");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(textField);
        add(label);

        // Add key listener to the text field
        textField.addKeyListener(this);

        // Set frame properties
        setSize(300, 200);
        setTitle("KeyListener Example");
        setVisible(true);

        // Add window listener to close the application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Implement KeyListener methods
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyCode());
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}