package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class gaui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textcodigo;
	private JTextField textcategoria;
	private JTextField textapellidos;
	private JTextField texttelefono;
	private JTextField textdni;
	private JTextField textdescripcion;
	private JTextField textprecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gaui frame = new gaui();
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
	public gaui() {
		setTitle("Mantenimiento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//paneles
		JPanel panelvendedores = new JPanel();
		panelvendedores.setBounds(60, 44, 525, 84);
		contentPane.add(panelvendedores);
		panelvendedores.setLayout(null);
		
		//panel vendedores
				JLabel lblcodigo = new JLabel("codigo:");
				lblcodigo.setBounds(11, 8, 74, 14);
				panelvendedores.add(lblcodigo);
				
				JLabel lblcategoria = new JLabel("categoria");
				lblcategoria.setBounds(165, 8, 86, 14);
				panelvendedores.add(lblcategoria);
				
				textcategoria = new JTextField();
				textcategoria.setBounds(221, 5, 86, 20);
				panelvendedores.add(textcategoria);
				textcategoria.setColumns(10);
				
				JLabel lblnombre = new JLabel("nombre:");
				lblnombre.setBounds(322, 8, 68, 14);
				panelvendedores.add(lblnombre);
				
				textcodigo = new JTextField();
				textcodigo.setBounds(70, 5, 86, 20);
				panelvendedores.add(textcodigo);
				textcodigo.setColumns(10); 
				
				textnombre = new JTextField();
				textnombre.setBounds(397, 5, 86, 20);
				panelvendedores.add(textnombre);
				textnombre.setColumns(10);
				
				JLabel lblapellidos = new JLabel("apellidos:");
				lblapellidos.setBounds(322, 33, 75, 14);
				panelvendedores.add(lblapellidos);
				
				textapellidos = new JTextField();
				textapellidos.setBounds(397, 30, 86, 20);
				panelvendedores.add(textapellidos);
				textapellidos.setColumns(10);
				
				JLabel lbltelefono = new JLabel("telefono:");
				lbltelefono.setBounds(11, 33, 74, 14);
				panelvendedores.add(lbltelefono);
				
				texttelefono = new JTextField();
				texttelefono.setBounds(70, 30, 86, 20);
				panelvendedores.add(texttelefono);
				texttelefono.setColumns(10);
				
				JLabel lbldni = new JLabel("dni:");
				lbldni.setBounds(165, 33, 38, 14);
				panelvendedores.add(lbldni);
				
				textdni = new JTextField();
				textdni.setBounds(221, 30, 86, 20);
				panelvendedores.add(textdni);
				textdni.setColumns(10);
				
				JLabel lblNewLabel = new JLabel("Descripcion");
				lblNewLabel.setBounds(322, 58, 94, 14);
				panelvendedores.add(lblNewLabel);
				
				textdescripcion = new JTextField();
				textdescripcion.setEnabled(false);
				textdescripcion.setBounds(221, 55, 86, 20);
				panelvendedores.add(textdescripcion);
				textdescripcion.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("precio");
				lblNewLabel_1.setBounds(165, 58, 86, 14);
				panelvendedores.add(lblNewLabel_1);
				
				textprecio = new JTextField();
				textprecio.setEnabled(false);
				textprecio.setBounds(397, 55, 86, 20);
				panelvendedores.add(textprecio);
				textprecio.setColumns(10);
	
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vendedores", "Clientes", "Productos"}));
		comboBox.setBounds(10, 11, 155, 22);
		comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selesion = comboBox.getSelectedIndex();
                switch (selesion) {
                case 0: {
                	textcodigo.setEnabled(true);
                	textcategoria.setEnabled(true);
                	textnombre.setEnabled(true);
                	textapellidos.setEnabled(true);
                	texttelefono.setEnabled(true);
                	textdni.setEnabled(true);
                	textdescripcion.setEnabled(false);
                	textprecio.setEnabled(false);
                    break;
                }
                case 1: {
                	textcodigo.setEnabled(true);
                	textcategoria.setEnabled(false);
                	textnombre.setEnabled(true);
                	textapellidos.setEnabled(true);
                	texttelefono.setEnabled(true);
                	textdni.setEnabled(true);
                	textdescripcion.setEnabled(false);
                	textprecio.setEnabled(false);
                    break;
                }
                default: {
                	textcodigo.setEnabled(true);
                	textcategoria.setEnabled(false);
                	textnombre.setEnabled(false);
                	textapellidos.setEnabled(false);
                	texttelefono.setEnabled(false);
                	textdni.setEnabled(false);
                	textdescripcion.setEnabled(true);
                	textprecio.setEnabled(true);
                    break;
                }
            }
            }
        });
		contentPane.add(comboBox);
		
		
		JButton btnNewButton = new JButton("Ingreso");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(175, 11, 81, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(260, 11, 87, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Consulta");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(351, 11, 95, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(448, 11, 87, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Listar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(545, 11, 81, 23);
		contentPane.add(btnNewButton_4);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 135, 616, 260);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	}
}
