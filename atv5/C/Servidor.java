import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    private static Socket socketServer;

    public static void main(String args[]){
        try {
            socketServer = new Socket("127.0.0.1",8888);

            ServerSocket server = new ServerSocket(8888);
            System.out.println("Servidor iniciado na porta 8888");

            Socket cliente = server.accept();
            System.out.println("Cliente conectado do IP "+cliente.getInetAddress().
                    getHostAddress());
            Scanner entrada = new Scanner(cliente.getInputStream());
            int numero = entrada.nextInt();

            randomList(numero);



            entrada.close();
            server.close();

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static int[] randomList(int length) {
        Random r = new Random();
        int[] newList = new int[length];
        for (int i = 0; i < length; i++) {
          newList[i] = r.nextInt();

          try {
            PrintStream saida = new PrintStream(socketServer.getOutputStream());
            saida.println( newList[i]);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       return newList;
    }
    

}