package jp.ac.uryukyu.ie.e195719;

public class Main {
    public static void main(String[] args){
        try{
        String str = null;
        System.out.println(str.length());
        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

