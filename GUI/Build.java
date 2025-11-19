import java.awt.*;
import java.awt.event.*;

public class Build extends Frame{
    private TextField textField;
    private Button b1,b2;
    
    public Build(){
        setTitle("Counter");
        setSize(400,400);
        // closing operation
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setLayout(null);
        // Setup TextFields nd buttons
        textField = new TextField(20);
        textField.setText("0");
        b1 = new Button("count");
        b2 = new Button("reset");

        textField.setBounds(80,100,200,30);
        b1.setBounds(100,150,80,30);
        b2.setBounds(200,150,80,30);

        add(textField);
        add(b1);
        add(b2);

        // Add action listeners
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String text = textField.getText();
                int count = 0;
                try {
                    count = Integer.parseInt(text);
                    count++;
                    textField.setText(Integer.toString(count));
                } catch (NumberFormatException ex) {
                    count = 0; 
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textField.setText("0");
            }
        });

    }
    public static void main(String[] args) {
        Build frame = new Build();
        frame.setVisible(true);
    }
}
