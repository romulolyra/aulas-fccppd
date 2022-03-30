import java.net.*;
import java.io.*;
 

public class Client {
 
    public static void main(String[] args) {
 
        String hostname = "177.98.139.45";
        int port = 8888;
 
        try (Socket socket = new Socket(hostname, port)) {
 
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 
            String mensagem = reader.readLine();
 
            System.out.println(mensagem);
 
 
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}