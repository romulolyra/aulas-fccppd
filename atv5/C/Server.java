import java.io.*;
import java.net.*;
import java.util.Random;

public class Server {
 
    public static void main(String[] args) {
 
        int port = 8888;
 
        try (ServerSocket serverSocket = new ServerSocket(port)) {
 
            System.out.println("Server is listening on port " + port);
 
            while (true) {
                Socket socket = serverSocket.accept();
 
                System.out.println("New client connected");
 
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);


                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
     
                int quantidade = reader.read();

                writer.println(quantidade);
                
                int[] list = randomList(quantidade);

                System.out.println(list);
            }
         }catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static int[] randomList(int length) {
        Random r = new Random();
        int[] newList = new int[length];
        for (int i = 0; i < length; i++) {
          newList[i] = r.nextInt();
       }
       return newList;
    }
}