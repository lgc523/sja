package dev.spider.string;

public class CodePointLength {
    public static void main(String[] args) {
        String s = "\uD834\uDD1E";
        /**
         * {@link Character}
         */
        System.out.println(s.length());
        System.out.println(s.codePointCount(0, s.length()));
    }
}
