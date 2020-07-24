public class Varargstest {
    public static void helloNames(String... names){ //varargs used for a variable list of arguments passed in method
        for (String name : names) {
            System.out.println("Hello " + name);
        }
    }
    public static void main(String... args){  //varargs ..
        helloNames("hulla","hulla","hulla");
    }
}
