import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends javax.swing.JFrame {

    private static Socket socket_cliente;

    /**
     * Creates new form FClient
     */
    public Cliente() {
        initCliente();
    }

    private static void  initCliente(){
        try {
            socket_cliente = new Socket("127.0.0.1",8888);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public static void main(String args[]) {

        try {
            PrintStream saida = new PrintStream(socket_cliente.getOutputStream());
            saida.println("Entrada do cliente");
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}