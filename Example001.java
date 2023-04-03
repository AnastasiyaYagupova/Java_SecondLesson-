/*
 * 1 Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

Пример. (n = 6, c1='a', c2='b') -> "ababab"
(n = 8, c1='x', c2='y') -> "xyxyxyxy"

static String buildString(int n, char c1, char c2) {
    return null;
}
 */
import java.util.Arrays;
public class Example001{

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildString(8, "a", "b")));
    }

    static String[] buildString(int n, String c1, String c2) {
        String array[] = new String[n];
        for( int i = 0; i < n; i++){
            if(i % 2 == 0){
                array[i] = c1;
            }else{
                array[i] = c2;
            }
        }
        return array;
    }
}