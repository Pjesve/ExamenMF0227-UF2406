package funciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
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
	public VentanaCalculaMedia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][grow][][grow][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		contentPane.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 0 7 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UF2404:");
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "flowy,cell 2 1 2 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("UF2405:");
		contentPane.add(lblNewLabel_3, "flowx,cell 4 1,alignx trailing,growy");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 4 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UF2406:");
		contentPane.add(lblNewLabel_4, "cell 5 1,alignx trailing");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 6 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		contentPane.add(lblNewLabel_2, "cell 0 2");
		
		JButton btnNewButton = new JButton("Calcular Nota");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, "cell 4 4,alignx center");
		
		JLabel lblNewLabel_5 = new JLabel("Nota Media:");
		contentPane.add(lblNewLabel_5, "cell 0 5");
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		contentPane.add(lblNewLabel_7, "cell 3 5");
		
		JLabel lblNewLabel_6 = new JLabel("Resultado:");
		contentPane.add(lblNewLabel_6, "cell 0 7");
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		contentPane.add(lblNewLabel_8, "cell 3 7");
		
		protected void calcularNota() {
			
			String nombre = txtNombre.getText();
			double UF2404 = Double.parseDouble(txt2404.getText());
			double UF2405 = Double.parseDouble(txt2405.getText());
			double UF2406 = Double.parseDouble(txt2406.getText());
			
			double media = (nota2404+nota2405+nota2406)/3.0;
	}

}
