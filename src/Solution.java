



import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args)
    {
        // 2. Genera 10 nombres positius aleatoris i guarda'ls a un array. Després busca el màxim i el mínim dels valors continguts dins aquest Array.

        Scanner sc = new Scanner(System.in);

        int primerArray[] = new int[7];

        int i=0;
        while(i < primerArray.length)
        {
            primerArray[i] = sc.nextInt();
            i++;

        primerArray = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(i=0; i < primerArray.length; i++)
        {
            primerArray[i] =(int)(Math.random() * 1000);
            if(max < primerArray[i]) max = primerArray[i];
            if(min > primerArray[i]) min = primerArray[i];
        }
        System.out.println("Max:"+max+" Min:"+min);

    }
}
}
