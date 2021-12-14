package agendarcita;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

public class FXMLCitasController implements Initializable {
    @FXML
	private Label citaFecha;
    @FXML
	private DatePicker calendarioCita; 
    
    @FXML
	private Button btnAgregar;
    @FXML
	private Button btnSalir;
    
    
    
    @FXML
	public void agendar(){
		LocalDate fechaHoy = calendarioCita.getValue();
                String myFormattedDate = fechaHoy.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
                citaFecha.setText(myFormattedDate);
                
                JOptionPane.showMessageDialog(null,"Fecha agregada con exito");
	}
        
        
     @FXML
	public void salir(){
            
        int confirmaSalida=JOptionPane.showConfirmDialog(null,"¿Quieres salir?","Mensaje importante",JOptionPane.YES_NO_OPTION);
        if (confirmaSalida==0) {
            System.exit(0);//cierra ventana     
            }
        
	}
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }     
}
