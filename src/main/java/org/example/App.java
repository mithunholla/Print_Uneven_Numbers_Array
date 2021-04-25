package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {

        int [] numbers = {20,15,18,13,27,38,45,63,77,103};

        for (int i =0 ;  i< numbers.length ; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }


        }
        }

    }

