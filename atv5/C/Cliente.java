import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends javax.swing.JFrame {

    private static Socket socket_cliente;

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
  
    public static void main(String args[]) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros desejados: ");
        int num = scan.nextInt();
        scan.close();

        
        try {
            PrintStream saida = new PrintStream(socket_cliente.getOutputStream());
            saida.println(num);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }


        Scanner numerosAleatorios = new Scanner(socket_cliente.getInputStream());
        while(numerosAleatorios.hasNextInt()){

            int numero = numerosAleatorios.nextInt();
            System.out.print("Numero gerado no servidor = "+numero);

        }
    }


}