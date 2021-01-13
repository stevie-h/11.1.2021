// https://github.com/qa191120/11.01.20201/blob/main/hw.txt

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner prn = new Scanner(System.in);
        Random r = new Random();
        
        //ex3
        int min3 = 0;
        int max3 = 99;
        createRandom(r, min3, max3);

        //ex4
        double[] arr4 = {0.5, 0.7, 5, -2, 12.5};
        double min4 = -4;
        double max4 = 0.5;
        printInRange(arr4, min4, max4);

    }

    public static void printInRange(double[] arr, double min, double max)
    {
        int count = 0;
        System.out.println("The numbers in range are: ");
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= min && arr[i] <= max)
            {
                System.out.print(arr[i] + "  ");
                count++;
            }
        }
        System.out.println();
        double[] arr_range = new double[count];
        count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= min && arr[i] <= max)
            {
                arr_range[count] = arr[i];
                count++;
            }
        }
        System.out.print("The array containing only the numbers in range: ");
        for (int i = 0; i < arr_range.length; i++)
        {
            System.out.print(arr_range[i] + "  ");
        }
        System.out.println();
    }

    private static void createRandom(Random r, int min, int max)
    {
        int random_num3 = r.nextInt(max - min);
        System.out.println(String.format("The random number between %d and %d is: %d", min, max, random_num3));
    }


}
