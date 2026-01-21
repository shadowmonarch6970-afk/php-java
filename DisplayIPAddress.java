import java.net.InetAddress;
import java.net.UnknownHostException;

public class DisplayIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address of the system: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to get IP address");
            e.printStackTrace();
        }
    }
}
