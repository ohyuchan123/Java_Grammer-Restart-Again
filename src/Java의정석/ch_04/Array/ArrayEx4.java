package Java의정석.ch_04.Array;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(abc);
        System.out.println(num);

        //arraycopy : 배열 복사

        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc,0,result,0,abc.length);
        System.arraycopy(num,0,result,0,num.length);
        System.out.println(result);

        System.arraycopy(abc,0,num,0,abc.length);
        System.out.println(num);

        System.arraycopy(num,0,num,6,3);
        System.out.println(num);
    }
}
