package hw5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class chatgpt3 {
	

	    public static void main(String[] args) {
	        // 簡單的 Socket 連接
	        try {
	            // 建立一個 Socket 連接到指定的主機和埠號
	            String host = "www.example.com";
	            int port = 80;
	            java.net.Socket socket = new java.net.Socket(host, port);

	            System.out.println("Connected to " + host + " on port " + port);

	            // 在此可以使用 socket 進行讀寫操作

	            // 關閉連接
	            socket.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // HTTP GET 請求
	        try {
	            // 建立一個 URL 對象
	            URL url = new URL("https://www.example.com");

	            // 打開一個 HttpURLConnection
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // 設置請求方法為 GET
	            connection.setRequestMethod("GET");

	            // 讀取伺服器回應
	            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            String line;
	            StringBuilder response = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                response.append(line);
	            }

	            // 關閉連接
	            connection.disconnect();

	            // 輸出伺服器回應
	            System.out.println("HTTP Response:\n" + response.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
}
