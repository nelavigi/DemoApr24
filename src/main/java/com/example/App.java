package com.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //array of 10 random numbers
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
        }
        //print out the array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //convert array to stream
        IntStream stream = Arrays.stream(arr);
        //get the average and print it out
        OptionalDouble avg = stream.average();
        System.out.println(avg.getAsDouble());
        
    }
}
