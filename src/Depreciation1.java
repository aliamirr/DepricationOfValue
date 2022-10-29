// Java program to find Depreciation of the value.
// Inputs Initial Value, Rate and Time.

import java.util.Scanner;

public class Depreciation1
{
    // Function to return the depreciation of value
    static float Depreciation(float v,
                              float r, float t)
    {
        float D = (float)(v * Math.pow((1 - r / 100), t));

        return D;
    }

    // Driver code
    public static void main(String[] args)
    {
        float V1, R, T;
        System.out.println("Enter the value of Item: ");
        Scanner inp = new Scanner(System.in);
        V1 = inp.nextFloat();
        System.out.println("Enter the Rate: ");
        R = inp.nextFloat();
        System.out.println("Enter the Time Period: ");
        T = inp.nextFloat();

        System.out.print("The depreciation is: " + Depreciation(V1, R, T));
    }
}


