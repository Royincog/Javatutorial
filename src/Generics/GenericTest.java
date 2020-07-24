package Generics;

public class GenericTest {
    public static <T> boolean isfound(T[] arr, T obj) {
        boolean isfound = false;
        for (T t : arr) {
            if (t == obj) {
                isfound = true;
            } else if (t.toString().equals(obj)) {
                isfound = true;
            }
        }
        return isfound;
    }

    public static void main(String[] args) {
        String  hello = "Hello world";
       Character[] characterarray = hello.chars().mapToObj(c -> (char)c).toArray(Character[]::new); //cha[] to Character[]

        Character ch = 'H';
        System.out.println(isfound(characterarray,ch));
    }
}

