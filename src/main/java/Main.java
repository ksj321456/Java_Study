import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char c = st.nextToken().charAt(0);

        if (c >= '0' && c <= '9') {
            System.out.println(c - '0');
        }
        else if (c >= 'A' && c <= 'F') {
            System.out.println(c - 'A' + 10);
        }
    }
}