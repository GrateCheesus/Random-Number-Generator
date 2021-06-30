import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;
public class Main {
    public static void main(String[] args){
        System.out.println(GetMessage());

        ResourceConfig rc = new ResourceConfig()
                .packages("Controller");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println(PrintSuccess());

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        server.stop(0);
    }public static String GetMessage() {
        return "Starting Server";
    }
    public static String PrintSuccess() {
        return "Server Started";
    }
}
