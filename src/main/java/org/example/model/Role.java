package org.example.model;

public class Role {
    public final static String username = "user";
    public final static String password = "123";

    /*private Role (){
        throw new AssertionError();
    }*/
    public  void test (){
        System.out.println("Role test");
    }
    public static class Sub{
        public static String subName="sda";
    }
}
