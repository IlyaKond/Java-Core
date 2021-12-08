package Lesson2;

import java.rmi.activation.ActivationException;
import java.util.Arrays;
import java.util.Scanner;

public class SizeArrayException extends Exception {

    public static void main(String[] args) {
        printArray();
    }
public static void printArray() {
  while (true)
  {
      Scanner input=new Scanner(System.in);
    System.out.println("Введите размер массива 4*4:");
    int size1 = input.nextInt();
    int size2 = input.nextInt();
    int[][] array=new int[size1][size2];
        try {
            if(size1 != 4 || size2 != 4)
            {
      throw new MyArraySizeException("Можно ввести массив только 4*4");
        }
            System.out.println("Создан массив 4*4");
        }
        catch (MyArraySizeException e)
        {
            e.printStackTrace();
            System.out.println("Напечатали другой массив");
        }
        System.out.println("Введите числа массива");

          for (int i = 0; i < size1; i++)
          {
              for (int j = 0; j < size2; j++)
              {
                  array[i][j] = input.nextInt();

              }

          }
          System.out.println(Arrays.deepToString(array));


      }
  }


}






