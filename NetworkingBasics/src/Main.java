import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));

                PrintWriter op = new PrintWriter(socket.getOutputStream(), true);
                String ehcoStr = bufferedReader.readLine();
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ehcoStr.equals("exit")) {
                    break;
                }
                op.println("Echo from server " + ehcoStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}