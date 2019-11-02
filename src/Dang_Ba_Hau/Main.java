package Dang_Ba_Hau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter a size");
            size = input.nextInt();
            if(size>10){
                System.out.println("Size should not exceed 20");
            }

        }
        while(size>20);
        array = new int[size];
        int i =0;
        while(i<array.length){
            System.out.println("enter element "+(i+1) + " :");
            int number = input.nextInt();
            array[i] = number;
            i++;
        }
        System.out.println("Property list:");
        for(int j = 0 ; j <array.length ; j++){
            System.out.printf(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int h = 0; h < array.length; h++) {
            if (array[h] > max) {
                max = array[h];
                index = h;
            }
        }
        System.out.println("the langest property value in the list is "+array[index]);
    }
}
