package form;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField Usertextf;
    private JPasswordField passtextf;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public login() {
        setResizable(false);
        setBackground(new Color(128, 128, 64));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 524, 419);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("User names");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setBounds(31, 121, 119, 48);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("User registration");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblNewLabel_2.setBounds(107, 27, 316, 32);
        contentPane.add(lblNewLabel_2);

        Usertextf = new JTextField();
        Usertextf.setBounds(328, 118, 172, 48);
        contentPane.add(Usertextf);
        Usertextf.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Pass word");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1.setToolTipText("pass word");
        lblNewLabel_1.setBounds(31, 222, 108, 32);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the HOMEPAGEOFHOUSEMAID window
                HOMEPAGEOFHOUSEMAID homepage = new HOMEPAGEOFHOUSEMAID();
                homepage.setVisible(true);
                // Close the current login window
                dispose();
            }
        });
        btnNewButton.setBackground(new Color(255, 128, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnNewButton.setBounds(82, 330, 119, 41);
        contentPane.add(btnNewButton);

        passtextf = new JPasswordField();
        passtextf.setBounds(333, 230, 167, 48);
        contentPane.add(passtextf);
    }
}
