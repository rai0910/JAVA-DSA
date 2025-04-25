import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener {
    private Button button;
    private Label label;

    public MouseListenerExample() {
        // Create components
        button = new Button("Hover or Click Me");
        label = new Label("Mouse Events will be displayed here.");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(button);
        add(label);

        // Add mouse listener to the button
        button.addMouseListener(this);

        // Set frame properties
        setSize(300, 200);
        setTitle("MouseListener Example");
        setVisible(true);

        // Add window listener to close the application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Implement MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the button.");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the button.");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed.");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released.");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}