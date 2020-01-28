package currency;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class Cconverter extends JFrame {
	double inr=71.31;
	double usd=1.00;
	double cyuan=6.94;
	double cad=1.32;
	double ind=13642.40;
	double jap=109.02;

	private JPanel contentPane;
	private JTextField inpbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cconverter frame = new Cconverter();
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
	public Cconverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1073, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setBounds(5, 5, 1060, 73);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		contentPane.add(lblNewLabel);
		
		JComboBox orgcunt = new JComboBox();
		orgcunt.setFont(new Font("Tahoma", Font.BOLD, 28));
		orgcunt.setModel(new DefaultComboBoxModel(new String[] {"select a country", "India", "Usa", "Canada", "China", "Indonesia", "Japan"}));
		orgcunt.setBounds(550, 145, 276, 47);
		contentPane.add(orgcunt);
		
		JLabel lblNewLabel_1 = new JLabel("Convert from");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(252, 145, 276, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblConvertInto = new JLabel("Convert into");
		lblConvertInto.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblConvertInto.setBounds(252, 236, 276, 47);
		contentPane.add(lblConvertInto);
		
		JComboBox rescunt = new JComboBox();
		rescunt.setModel(new DefaultComboBoxModel(new String[] {"select a country", "India", "Usa", "Canada", "China", "Indonesia", "Japan"}));
		rescunt.setFont(new Font("Tahoma", Font.BOLD, 28));
		rescunt.setBounds(550, 236, 276, 47);
		contentPane.add(rescunt);
		
		inpbox = new JTextField();
		inpbox.setBorder(new LineBorder(Color.BLACK, 4));
		inpbox.setFont(new Font("Tahoma", Font.BOLD, 40));
		inpbox.setBounds(550, 327, 276, 47);
		contentPane.add(inpbox);
		inpbox.setColumns(10);
		
		JLabel lblResbox = new JLabel("");
		lblResbox.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblResbox.setHorizontalAlignment(SwingConstants.CENTER);
		lblResbox.setForeground(Color.BLACK);
		lblResbox.setBackground(new Color(0, 0, 0));
		lblResbox.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblResbox.setBounds(264, 408, 562, 47);
		contentPane.add(lblResbox);
		
		
		JLabel lblEnterAmount = new JLabel("Enter amount");
		lblEnterAmount.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblEnterAmount.setBounds(252, 327, 276, 47);
		contentPane.add(lblEnterAmount);
		
		JButton conButt = new JButton("Convert");
		conButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double inp= Double.parseDouble(inpbox.getText());
				if(orgcunt.getSelectedItem().equals("Usa"))
				{
					if(rescunt.getSelectedItem().equals("Usa"))
					{
						String con = String.format("$ %.2f", inp);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("India"))
					{
						String con = String.format("INR %.2f", inp*inr);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Canada"))
					{
						String con = String.format("Can$ %.2f", inp*cad);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("China"))
					{
						String con = String.format("Chinese Yuan %.2f", inp*cyuan);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Indonesia"))
					{
						String con = String.format("Rp %.2f", inp*ind);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Japan"))
					{
						String con = String.format("JAP YEN %.2f", inp*jap);
						lblResbox.setText(con);
					}
				}
				if(orgcunt.getSelectedItem().equals("India"))
				{
					inp=inp/inr;
					if(rescunt.getSelectedItem().equals("Usa"))
					{
						String con = String.format("$ %.2f", inp);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("India"))
					{
						String con = String.format("INR %.2f", inp*inr);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Canada"))
					{
						String con = String.format("Can$ %.2f", inp*cad);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("China"))
					{
						String con = String.format("Chinese Yuan %.2f", inp*cyuan);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Indonesia"))
					{
						String con = String.format("Rp %.2f", inp*ind);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Japan"))
					{
						String con = String.format("JAP YEN %.2f", inp*jap);
						lblResbox.setText(con);
					}
				}
				if(orgcunt.getSelectedItem().equals("China"))
				{
					inp=inp/cyuan;
					if(rescunt.getSelectedItem().equals("Usa"))
					{
						String con = String.format("$ %.2f", inp);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("India"))
					{
						String con = String.format("INR %.2f", inp*inr);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Canada"))
					{
						String con = String.format("Can$ %.2f", inp*cad);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("China"))
					{
						String con = String.format("Chinese Yuan %.2f", inp*cyuan);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Indonesia"))
					{
						String con = String.format("Rp %.2f", inp*ind);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Japan"))
					{
						String con = String.format("JAP YEN %.2f", inp*jap);
						lblResbox.setText(con);
					}
				}
				if(orgcunt.getSelectedItem().equals("Canada"))
				{
					inp=inp/cad;
					if(rescunt.getSelectedItem().equals("Usa"))
					{
						String con = String.format("$ %.2f", inp);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("India"))
					{
						String con = String.format("INR %.2f", inp*inr);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Canada"))
					{
						String con = String.format("Can$ %.2f", inp*cad);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("China"))
					{
						String con = String.format("Chinese Yuan %.2f", inp*cyuan);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Indonesia"))
					{
						String con = String.format("Rp %.2f", inp*ind);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Japan"))
					{
						String con = String.format("JAP YEN %.2f", inp*jap);
						lblResbox.setText(con);
					}
				}
				if(orgcunt.getSelectedItem().equals("Japan"))
				{
					inp=inp/jap;
					if(rescunt.getSelectedItem().equals("Usa"))
					{
						String con = String.format("$ %.2f", inp);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("India"))
					{
						String con = String.format("INR %.2f", inp*inr);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Canada"))
					{
						String con = String.format("Can$ %.2f", inp*cad);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("China"))
					{
						String con = String.format("Chinese Yuan %.2f", inp*cyuan);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Indonesia"))
					{
						String con = String.format("Rp %.2f", inp*ind);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Japan"))
					{
						String con = String.format("JAP YEN %.2f", inp*jap);
						lblResbox.setText(con);
					}
				}
				if(orgcunt.getSelectedItem().equals("Indonesia"))
				{
					inp=inp/ind;
					if(rescunt.getSelectedItem().equals("Usa"))
					{
						String con = String.format("$ %.2f", inp);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("India"))
					{
						String con = String.format("INR %.2f", inp*inr);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Canada"))
					{
						String con = String.format("Can$ %.2f", inp*cad);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("China"))
					{
						String con = String.format("Chinese Yuan %.2f", inp*cyuan);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Indonesia"))
					{
						String con = String.format("Rp %.2f", inp*ind);
						lblResbox.setText(con);
					}
					if(rescunt.getSelectedItem().equals("Japan"))
					{
						String con = String.format("JAP YEN %.2f", inp*jap);
						lblResbox.setText(con);
					}
				}
			}
		});
		conButt.setFont(new Font("Tahoma", Font.BOLD, 28));
		conButt.setBounds(264, 501, 166, 82);
		contentPane.add(conButt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inpbox.setText(null);
				lblResbox.setText(null);
				orgcunt.setSelectedIndex(0);
				rescunt.setSelectedIndex(0);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnReset.setBounds(463, 501, 166, 82);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnExit.setBounds(660, 501, 166, 82);
		contentPane.add(btnExit);
	}
}
