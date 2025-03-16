import java.awt.*;
import java.awt.event.*;
public class awtexample extends Frame implements ActionListener{
    private Label label;
    private Button button;
    public awtexample(){
        label = new Label("Click the button.");
        label.setBounds(50,50,300,30);
        button = new Button("click me");
        button.setBounds(100,100,80,30);
        button.addActionListener(this);
        add(label);
        add(button);
        setSize(400,200);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        label.setText("Button Clicked!");

    }
    public static void main(String[] args){
        new awtexample();
    }
}