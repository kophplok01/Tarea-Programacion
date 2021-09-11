import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Graf3 extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graf3 frame = new Graf3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Graf3() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			}
		});
		btnNewButton_1.setBounds(25, 174, 89, 23);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(215, 174, 89, 23);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setBounds(25, 30, 74, 14);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 27, 89, 20);
		textField_1.setColumns(10);
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(25, 112, 74, 14);
		textField = new JTextField();
		textField.setBounds(133, 103, 89, 23);
		textField.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField_1);
		contentPane.add(lblNewLabel);
		contentPane.add(textField);
	}
}

