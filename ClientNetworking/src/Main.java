import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost",5000)){

            socket.setSoTimeout(5000);
            BufferedReader echoes = new BufferedReader( new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoStr;
            String response;

            do{
                System.out.println("String to be echoed: ");
                echoStr = scanner.nextLine();

                stringToEcho.println(echoStr);
                if(!echoStr.equals("exit")){
                    response = echoes.readLine();
                    System.out.println(response);
                }
            }while(!echoStr.equals("exit"));
        }
        catch (SocketTimeoutException se){
            se.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}