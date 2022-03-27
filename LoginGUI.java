import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Alex Nanor
// source: https://www.youtube.com/watch?v=iE8tZ0hn2Ws: Alex Lee

public class LoginGUI implements ActionListener {

    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args){

//        Start with frame and panel

        /*
            Code to create 100 by 100 Window
         */
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            frame.add(panel);
            frame.setSize(100,100);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//            Panel Configuration

        //Username label and panel config.
        panel.setLayout(null); // i.e. rows and columns
        label = new JLabel("Username: "); // label object
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        //Text field for username
        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Password label
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,50,80, 25);
        panel.add(passwordLabel);

        //Password field to hide password
        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText); 

        //Login button with action listener
        button = new JButton("Login");
        button.addActionListener(new LoginGUI());
        button.setBounds(10,80,80,25);
        panel.add(button);

        // Success message and outline
        success = new JLabel("");
        success.setBounds(10,110,300, 25);
        panel.add(success);



        frame.setVisible(true);









    }
/* Get the text of the user and password. Listens for clicks and responds with
* events.  */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked: ");
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + "," + password);

        if(user.equals("Alex") && password.equals("CrunchyBeaver")){
            success.setText("Login Successful!");
        } else{
            success.setText("");
        }

    }
}
