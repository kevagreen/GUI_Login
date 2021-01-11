import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI_Login implements ActionListener {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args) {
        //JFrame gives you a window/frame with with/height of 200
        frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //panel is layout on top of frame
        //good website with these specs https://beginnersbook.com/2015/07/java-swing-tutorial/
        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        userLabel = new JLabel("user");
        userLabel.setBounds(10, 20, 80, 25);
        //add user label to panel
        panel.add(userLabel);
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        //password label added to panel
        passwordLabel = new JLabel("password");
        passwordLabel.setBounds(10, 50, 80, 25);
        //add password label to panel
        panel.add(passwordLabel);
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI_Login());
        panel.add(button);
        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String user = userText.getText();
       String password = passwordText.getText();
        System.out.println(user +" " + password);
        if(user.equals("Apple") && password.equals("sadie123")){
            success.setText("Login Successful!");
        }else{
            success.setText("invalid password or userid");
        }
    }
}
