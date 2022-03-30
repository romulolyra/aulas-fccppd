import java.net.*;
import java.io.*;
import java.util.Scanner;


public class Client {
 
    public static void main(String[] args) {
 
        String hostname = "192.168.0.1";
        int port = 8888;

        try (Socket socket = new Socket(hostname, port)) {

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true); 
            
            Scanner ler = new Scanner(System.in);
 
            int quantidade = ler.nextInt(); 

            writer.println(quantidade);
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}