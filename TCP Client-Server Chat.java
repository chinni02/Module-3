// Server
import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server started. Waiting for client...");
        
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        
        String inputLine;
        while (true) {
            // Read from client
            if (in.ready()) {
                inputLine = in.readLine();
                if (inputLine.equalsIgnoreCase("bye")) {
                    break;
                }
                System.out.println("Client: " + inputLine);
            }
            
            // Read from console and send to client
            if (consoleReader.ready()) {
                String consoleInput = consoleReader.readLine();
                out.println(consoleInput);
                if (consoleInput.equalsIgnoreCase("bye")) {
                    break;
                }
            }
        }
        
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}

// Client
import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        
        String inputLine;
        while (true) {
            // Read from console and send to server
            if (consoleReader.ready()) {
                String consoleInput = consoleReader.readLine();
                out.println(consoleInput);
                if (consoleInput.equalsIgnoreCase("bye")) {
                    break;
                }
            }
            
            // Read from server
            if (in.ready()) {
                inputLine = in.readLine();
                if (inputLine.equalsIgnoreCase("bye")) {
                    break;
                }
                System.out.println("Server: " + inputLine);
            }
        }
        
        in.close();
        out.close();
        socket.close();
    }
}