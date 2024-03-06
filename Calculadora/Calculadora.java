package CalcPropina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Calculadora {

	private JFrame frmCalculadoraDePropinas;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox<String> comboBox;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadoraDePropinas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Calculadora() {
		initialize();
	}

	private void initialize() {
		frmCalculadoraDePropinas = new JFrame();
		frmCalculadoraDePropinas.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Laura\\Downloads\\restaurante (2).png"));
		frmCalculadoraDePropinas.setTitle("Calculadora de Propinas");
		frmCalculadoraDePropinas.getContentPane().setForeground(new Color(238, 130, 238));
		frmCalculadoraDePropinas.getContentPane().setBackground(new Color(240, 255, 240));
		frmCalculadoraDePropinas.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Importe de la cuenta:");
		lblNewLabel.setFont(new Font("Dubai", Font.PLAIN, 22));
		lblNewLabel.setBounds(24, 43, 201, 43);
		frmCalculadoraDePropinas.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("% de propina:");
		lblNewLabel_1.setFont(new Font("Dubai", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(64, 119, 128, 54);
		frmCalculadoraDePropinas.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Dubai", Font.PLAIN, 22));
		textField.setBounds(224, 40, 174, 49);
		frmCalculadoraDePropinas.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(255, 0, 0));
		comboBox.setFont(new Font("Dubai", Font.PLAIN, 22));
		comboBox.setBounds(202, 121, 196, 50);
		frmCalculadoraDePropinas.getContentPane().add(comboBox);
		
		String[] percentages = {"10%", "20%","25%", "30%", "50%"};
		comboBox.setModel(new DefaultComboBoxModel<>(percentages));
		
		comboBox.addActionListener(new ActionListener() {;
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnNewButton = new JButton("Calcular Propina");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Dubai", Font.PLAIN, 22));
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.setBounds(20, 292, 257, 43);
		frmCalculadoraDePropinas.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Monto de la propina:");
		lblNewLabel_2.setFont(new Font("Dubai", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(24, 188, 201, 64);
		frmCalculadoraDePropinas.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total a pagar");
		lblNewLabel_3.setFont(new Font("Dubai", Font.BOLD, 22));
		lblNewLabel_3.setBounds(129, 362, 139, 28);
		frmCalculadoraDePropinas.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setForeground(new Color(0, 0, 255));
		textField_1.setFont(new Font("Dubai", Font.PLAIN, 22));
		textField_1.setBounds(224, 196, 174, 48);
		frmCalculadoraDePropinas.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setForeground(new Color(60, 179, 113));
		textField_2.setFont(new Font("Dubai", Font.BOLD, 24));
		textField_2.setBounds(75, 395, 232, 54);
		frmCalculadoraDePropinas.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Reiniciar");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Dubai", Font.PLAIN, 15));
		btnNewButton_1.setBounds(13, 469, 94, 28);
		frmCalculadoraDePropinas.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Laura\\Downloads\\menu (1).png"));
		lblNewLabel_4.setBounds(324, 350, 100, 146);
		frmCalculadoraDePropinas.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Laura\\Downloads\\hamburguesa (1).png"));
		lblNewLabel_5.setBounds(287, 21, 139, 152);
		frmCalculadoraDePropinas.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Laura\\Downloads\\propina (1).png"));
		lblNewLabel_6.setBounds(10, 110, 71, 63);
		frmCalculadoraDePropinas.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Laura\\Downloads\\tenedor-y-cuchillo (1).png"));
		lblNewLabel_7.setBounds(344, 256, 77, 109);
		frmCalculadoraDePropinas.getContentPane().add(lblNewLabel_7);
		frmCalculadoraDePropinas.setBounds(100, 100, 450, 544);
		frmCalculadoraDePropinas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				try {
					double billAmount = Double.parseDouble(textField.getText());
					double tipPercentage = Double.parseDouble(((String) comboBox.getSelectedItem()).replace("%", "")) / 100.0;
					
					double tipAmount = billAmount * tipPercentage;
					double totalAmount = billAmount + tipAmount;
					
					DecimalFormat df = new DecimalFormat("#.00");
					
					textField_1.setText(String.format("%.2f", tipAmount));
					textField_2.setText(String.format("%.2f", totalAmount));
					
					
				}catch (NumberFormatException ex) {
					textField_1.setText("");
					textField_2.setText("");
				}
			}

		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				comboBox.setSelectedIndex(0);
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		
		frmCalculadoraDePropinas.setBounds(100, 100, 450, 544);
		frmCalculadoraDePropinas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
