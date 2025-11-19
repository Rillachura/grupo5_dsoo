import modelo.Modelo;
import vista.MainGUI;

public class MainApp {
    public static void main(String[] args) {
        // Crear el modelo con datos de ejemplo
        Modelo modelo = new Modelo();

        // Abrir el menú principal
        MainGUI gui = new MainGUI(modelo);
        gui.setVisible(true);
    }
    
}