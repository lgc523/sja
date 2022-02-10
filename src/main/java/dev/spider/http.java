package dev.spider;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class http {
    public static void main(String[] args) throws IOException {
        String uri = "";
        URL url = new URL(uri);
        URLConnection conn = url.openConnection();

        Map<String, List<String>> headerFields = conn.getHeaderFields();
        List<String> rets = headerFields.get("");

        System.out.println(Arrays.toString(rets.toArray()));
        System.out.println(headerFields);
    }
}
