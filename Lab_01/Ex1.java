package Lab_01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] arr = {1, 2};
        float[] newArray = multi(1, 2 ,3);
        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
        float[] arrTwo = multi(10, 5, 2);
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.println(arrTwo[i]);
        }

        float[] arrThree = devide(20, 40, 10);
        for (int i = 0; i < arrThree.length; i++) {
            System.out.println(arrThree[i]);
        }
    }


    public static float[] multi(float[]v, float s){
        v[0] *= s;
        v[1] *= s;
        return v;
    }

    public static float[] multi (float x, float y, float s){
        float[] v = {x, y};
        multi(v, s);
        return v;
    }

    public static float[] devide(float x, float y, float s){
        float[] v = {x, y};
        s = 1 / s;
        multi(v, s);
        return  v;
    }

}



