package dev.spider;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        System.out.println(s);
    }
}
