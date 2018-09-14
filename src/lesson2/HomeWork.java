package lesson2;

    public class HomeWork{
        public static void  main(String args[]){
            String hello  = "fafafa";

            System.out.println(hello);
            int length = hello.length();
            System.out.println(length);
            int start = 0;
            int end = length;

            char result = hello.charAt(2,4);
            System.out.println(result);
        }
    }