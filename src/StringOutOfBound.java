public class StringOutOfBound {
    public static void main(String args[]){
        String s="Topic is about Exception";
        String str="ExceptionHandling";


        System.out.println("The length of this string:"+s.length() + ',' +  str.length());
        for(int a=0;a<s.length();a++){
            System.out.println(s.charAt(a));
        }
        for(int b=0;b<str.length();b++){
            System.out.println(str.charAt(b));
        }

        System.out.println(s.charAt(35));
        System.out.println(str.charAt(20));
    }
}
