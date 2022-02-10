package dev.spider;

public class Obj {
    private String name = "spider";
    private String time = "2022";

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public static void main(String[] args) {
        Obj obj = new Obj();
        System.out.println(obj.getName());
    }
}
