import java.awt.event.*;
import javax.swing.*;

public class Escuchador implements ActionListener {
	
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
	
	public Escuchador(JTextField textFieldNombreAPI, JTextField textFieldVersion,
	JTextField textFieldNumRecursos, JTextField textFieldNumRecursosLectura,
	JTextField textFieldNumRecursosPost, JTextField textFieldNumRecursosDelete,
	JTextField textFieldPesoRecursosLectura, JTextField textFieldPesoRecursosPost,
	JTextField textFieldPesoRecursosDelete, JTextField textFieldLongRutaMaxima,
	JTextField textFieldLongRutaPromedio, JTextField textFieldNumParametros,
	JTextField textFieldNumParametrosObligatorios, JTextField textFieldNumParametrosOpcionales,
	JTextField textFieldPromedioParametros) {
		this.textFieldNombreAPI = textFieldNombreAPI;
		this.textFieldVersion = textFieldVersion;
		this.textFieldNumRecursos = textFieldNumRecursos;
		this.textFieldNumRecursosLectura = textFieldNumRecursosLectura;
		this.textFieldNumRecursosPost = textFieldNumRecursosPost;
		this.textFieldNumRecursosDelete = textFieldNumRecursosDelete;
		this.textFieldPesoRecursosLectura = textFieldPesoRecursosLectura;
		this.textFieldPesoRecursosPost = textFieldPesoRecursosPost;
		this.textFieldPesoRecursosDelete = textFieldPesoRecursosDelete;
		this.textFieldLongRutaMaxima = textFieldLongRutaMaxima;
		this.textFieldLongRutaPromedio = textFieldLongRutaPromedio;
		this.textFieldNumParametros = textFieldNumParametros;
		this.textFieldNumParametrosObligatorios = textFieldNumParametrosObligatorios;
		this.textFieldNumParametrosOpcionales = textFieldNumParametrosOpcionales;
		this.textFieldPromedioParametros = textFieldPromedioParametros;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton boton=(JButton) e.getSource();
		String opcion=boton.getText();
		if(opcion.equals("Analizar")) {
			API api = new API(this.textFieldNombreAPI.getText());
			this.textFieldVersion.setText((String) api.getVersion().getValor() + "");
			this.textFieldNumRecursos.setText(api.getNumRecursos().getValor() + "");
			this.textFieldNumRecursosLectura.setText(api.getNumRecursosLectura().getValor() + "");
			this.textFieldNumRecursosPost.setText(api.getNumRecursosPost().getValor() + "");
			this.textFieldNumRecursosDelete.setText(api.getNumRecursosDelete().getValor() + "");
			this.textFieldPesoRecursosLectura.setText(api.getPesoRecursosLectura().getValor() + "");
			this.textFieldPesoRecursosPost.setText(api.getPesoRecursosPost().getValor() + "");
			this.textFieldPesoRecursosDelete.setText(api.getPesoRecursosDelete().getValor() + "");
			this.textFieldLongRutaMaxima.setText(api.getLongRutaMaxima().getValor() + "");
			this.textFieldLongRutaPromedio.setText(api.getLongRutaPromedio().getValor() + "");
			this.textFieldNumParametros.setText(api.getNumParametros().getValor() + "");
			this.textFieldNumParametrosObligatorios.setText(api.getNumParametrosObligatorios().getValor() +"");
			this.textFieldNumParametrosOpcionales.setText(api.getNumParametrosOpcionales().getValor() + "");
			this.textFieldPromedioParametros.setText(api.getPromedioParametros().getValor() + "");
		}
	}
}
