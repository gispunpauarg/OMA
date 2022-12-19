import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;

public class InterfaceHerramienta {

	private JFrame frmHerramienta;
	private JTextField textFieldNombreAPI;
	private JTextField textFieldVersion;
	private JTextField textFieldNumRecursos;
	private JTextField textFieldNumRecursosLectura;
	private JTextField textFieldNumRecursosPost;
	private JTextField textFieldNumRecursosDelete;
	private JTextField textFieldPesoRecursosLectura;
	private JTextField textFieldPesoRecursosPost;
	private JTextField textFieldPesoRecursosDelete;
	private JTextField textFieldLongRutaMaxima;
	private JTextField textFieldLongRutaPromedio;
	private JTextField textFieldNumParametros;
	private JTextField textFieldNumParametrosObligatorios;
	private JTextField textFieldNumParametrosOpcionales;
	private JTextField textFieldPromedioParametros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceHerramienta window = new InterfaceHerramienta();
					window.frmHerramienta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceHerramienta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHerramienta = new JFrame();
		frmHerramienta.setIconImage(Toolkit.getDefaultToolkit().getImage(InterfaceHerramienta.class.getResource("/Im\u00E1genes/\u00CDcono OpenAPI.png")));
		frmHerramienta.setTitle("OMA");
		frmHerramienta.setBounds(100, 100, 450, 475);
		frmHerramienta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textFieldNombreAPI = new JTextField();
		textFieldNombreAPI.setBounds(66, 28, 180, 20);
		textFieldNombreAPI.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 31, 46, 14);
		
		JFormattedTextField frmtdtxtfldArchivoDeEspecificacin = new JFormattedTextField();
		frmtdtxtfldArchivoDeEspecificacin.setBounds(0, 0, 434, 20);
		frmtdtxtfldArchivoDeEspecificacin.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldArchivoDeEspecificacin.setForeground(Color.WHITE);
		frmtdtxtfldArchivoDeEspecificacin.setText("Archivo de Especificaci\u00F3n OpenAPI");
		frmtdtxtfldArchivoDeEspecificacin.setEditable(false);
		frmtdtxtfldArchivoDeEspecificacin.setBackground(Color.DARK_GRAY);
		
		JButton btnAnalizar = new JButton("Analizar");
		btnAnalizar.setBounds(287, 27, 89, 23);
		btnAnalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JFormattedTextField frmtdtxtfldMtricasDeLa = new JFormattedTextField();
		frmtdtxtfldMtricasDeLa.setBounds(0, 59, 434, 20);
		frmtdtxtfldMtricasDeLa.setText("M\u00E9tricas de la API");
		frmtdtxtfldMtricasDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldMtricasDeLa.setForeground(Color.WHITE);
		frmtdtxtfldMtricasDeLa.setEditable(false);
		frmtdtxtfldMtricasDeLa.setBackground(Color.DARK_GRAY);
		
		JLabel lblNewLabel = new JLabel("Versi\u00F3n");
		lblNewLabel.setBounds(10, 90, 218, 14);
		
		JLabel lblNewLabel_2 = new JLabel("N\u00FAmero de Recursos");
		lblNewLabel_2.setBounds(10, 115, 218, 14);
		
		JLabel lblNewLabel_2_1 = new JLabel("N\u00FAmero de Recursos de Solo Lectura");
		lblNewLabel_2_1.setBounds(10, 140, 218, 14);
		
		JLabel lblNewLabel_2_2 = new JLabel("N\u00FAmero de Recursos POST");
		lblNewLabel_2_2.setBounds(10, 165, 218, 14);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("N\u00FAmero de Recursos DELETE");
		lblNewLabel_2_2_1.setBounds(10, 190, 218, 14);
		
		JLabel lblNewLabel_3 = new JLabel("Peso de Recursos de Solo Lectura");
		lblNewLabel_3.setBounds(10, 215, 218, 14);
		
		JLabel lblNewLabel_3_1 = new JLabel("Peso de Recursos POST");
		lblNewLabel_3_1.setBounds(10, 240, 218, 14);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Peso de Recursos DELETE");
		lblNewLabel_3_1_1.setBounds(10, 265, 218, 14);
		
		JLabel lblNewLabel_4 = new JLabel("Longitud de Ruta M\u00E1xima");
		lblNewLabel_4.setBounds(10, 290, 218, 14);
		
		JLabel lblNewLabel_4_1 = new JLabel("Longitud de Ruta Promedio");
		lblNewLabel_4_1.setBounds(10, 315, 218, 14);
		
		JLabel lblNewLabel_5 = new JLabel("N\u00FAmero de Par\u00E1metros");
		lblNewLabel_5.setBounds(10, 340, 218, 14);
		
		JLabel lblNewLabel_5_1 = new JLabel("N\u00FAmero de Par\u00E1metros Obligatorios");
		lblNewLabel_5_1.setBounds(10, 365, 218, 14);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("N\u00FAmero de Par\u00E1metros Opcionales");
		lblNewLabel_5_1_1.setBounds(10, 390, 218, 14);
		
		JLabel lblNewLabel_6 = new JLabel("Promedio de Par\u00E1metros");
		lblNewLabel_6.setBounds(10, 415, 218, 14);
		
		textFieldVersion = new JTextField();
		textFieldVersion.setBounds(238, 87, 186, 20);
		textFieldVersion.setEditable(false);
		textFieldVersion.setColumns(10);
		
		textFieldNumRecursos = new JTextField();
		textFieldNumRecursos.setBounds(238, 112, 186, 20);
		textFieldNumRecursos.setEditable(false);
		textFieldNumRecursos.setColumns(10);
		
		textFieldNumRecursosLectura = new JTextField();
		textFieldNumRecursosLectura.setBounds(238, 137, 186, 20);
		textFieldNumRecursosLectura.setEditable(false);
		textFieldNumRecursosLectura.setColumns(10);
		
		textFieldNumRecursosPost = new JTextField();
		textFieldNumRecursosPost.setBounds(238, 162, 186, 20);
		textFieldNumRecursosPost.setEditable(false);
		textFieldNumRecursosPost.setColumns(10);
		
		textFieldNumRecursosDelete = new JTextField();
		textFieldNumRecursosDelete.setBounds(238, 187, 186, 20);
		textFieldNumRecursosDelete.setEditable(false);
		textFieldNumRecursosDelete.setColumns(10);
		
		textFieldPesoRecursosLectura = new JTextField();
		textFieldPesoRecursosLectura.setBounds(238, 212, 186, 20);
		textFieldPesoRecursosLectura.setEditable(false);
		textFieldPesoRecursosLectura.setColumns(10);
		
		textFieldPesoRecursosPost = new JTextField();
		textFieldPesoRecursosPost.setBounds(238, 237, 186, 20);
		textFieldPesoRecursosPost.setEditable(false);
		textFieldPesoRecursosPost.setColumns(10);
		
		textFieldPesoRecursosDelete = new JTextField();
		textFieldPesoRecursosDelete.setBounds(238, 262, 186, 20);
		textFieldPesoRecursosDelete.setEditable(false);
		textFieldPesoRecursosDelete.setColumns(10);
		
		textFieldLongRutaMaxima = new JTextField();
		textFieldLongRutaMaxima.setBounds(238, 287, 186, 20);
		textFieldLongRutaMaxima.setEditable(false);
		textFieldLongRutaMaxima.setColumns(10);
		
		textFieldLongRutaPromedio = new JTextField();
		textFieldLongRutaPromedio.setBounds(238, 312, 186, 20);
		textFieldLongRutaPromedio.setEditable(false);
		textFieldLongRutaPromedio.setColumns(10);
		
		textFieldNumParametros = new JTextField();
		textFieldNumParametros.setBounds(238, 337, 186, 20);
		textFieldNumParametros.setEditable(false);
		textFieldNumParametros.setColumns(10);
		
		textFieldNumParametrosObligatorios = new JTextField();
		textFieldNumParametrosObligatorios.setBounds(238, 362, 186, 20);
		textFieldNumParametrosObligatorios.setEditable(false);
		textFieldNumParametrosObligatorios.setColumns(10);
		
		textFieldNumParametrosOpcionales = new JTextField();
		textFieldNumParametrosOpcionales.setBounds(238, 387, 186, 20);
		textFieldNumParametrosOpcionales.setEditable(false);
		textFieldNumParametrosOpcionales.setColumns(10);
		
		textFieldPromedioParametros = new JTextField();
		textFieldPromedioParametros.setBounds(238, 412, 186, 20);
		textFieldPromedioParametros.setEditable(false);
		textFieldPromedioParametros.setColumns(10);
		
		Escuchador escuchador = new Escuchador(textFieldNombreAPI, textFieldVersion,
		textFieldNumRecursos, textFieldNumRecursosLectura, textFieldNumRecursosPost, 
		textFieldNumRecursosDelete, textFieldPesoRecursosLectura, textFieldPesoRecursosPost,
		textFieldPesoRecursosDelete, textFieldLongRutaMaxima, textFieldLongRutaPromedio, 
		textFieldNumParametros,textFieldNumParametrosObligatorios, textFieldNumParametrosOpcionales,
		textFieldPromedioParametros);
		
		btnAnalizar.addActionListener(escuchador);
		
		frmHerramienta.getContentPane().setLayout(null);
		frmHerramienta.getContentPane().add(textFieldNombreAPI);
		frmHerramienta.getContentPane().add(lblNewLabel_1);
		frmHerramienta.getContentPane().add(frmtdtxtfldArchivoDeEspecificacin);
		frmHerramienta.getContentPane().add(btnAnalizar);
		frmHerramienta.getContentPane().add(frmtdtxtfldMtricasDeLa);
		frmHerramienta.getContentPane().add(lblNewLabel);
		frmHerramienta.getContentPane().add(lblNewLabel_2);
		frmHerramienta.getContentPane().add(lblNewLabel_2_1);
		frmHerramienta.getContentPane().add(lblNewLabel_2_2);
		frmHerramienta.getContentPane().add(lblNewLabel_2_2_1);
		frmHerramienta.getContentPane().add(lblNewLabel_3);
		frmHerramienta.getContentPane().add(lblNewLabel_3_1);
		frmHerramienta.getContentPane().add(lblNewLabel_3_1_1);
		frmHerramienta.getContentPane().add(lblNewLabel_4);
		frmHerramienta.getContentPane().add(lblNewLabel_4_1);
		frmHerramienta.getContentPane().add(lblNewLabel_5);
		frmHerramienta.getContentPane().add(lblNewLabel_5_1);
		frmHerramienta.getContentPane().add(lblNewLabel_5_1_1);
		frmHerramienta.getContentPane().add(lblNewLabel_6);
		frmHerramienta.getContentPane().add(textFieldVersion);
		frmHerramienta.getContentPane().add(textFieldNumRecursos);
		frmHerramienta.getContentPane().add(textFieldNumRecursosLectura);
		frmHerramienta.getContentPane().add(textFieldNumRecursosPost);
		frmHerramienta.getContentPane().add(textFieldNumRecursosDelete);
		frmHerramienta.getContentPane().add(textFieldPesoRecursosLectura);
		frmHerramienta.getContentPane().add(textFieldPesoRecursosPost);
		frmHerramienta.getContentPane().add(textFieldPesoRecursosDelete);
		frmHerramienta.getContentPane().add(textFieldLongRutaMaxima);
		frmHerramienta.getContentPane().add(textFieldLongRutaPromedio);
		frmHerramienta.getContentPane().add(textFieldNumParametros);
		frmHerramienta.getContentPane().add(textFieldNumParametrosObligatorios);
		frmHerramienta.getContentPane().add(textFieldNumParametrosOpcionales);
		frmHerramienta.getContentPane().add(textFieldPromedioParametros);
	}
}
