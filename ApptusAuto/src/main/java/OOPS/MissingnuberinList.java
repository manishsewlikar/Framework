package OOPS;

// Java program to find missing Number
import java.util.*;
public class MissingnuberinList {
	static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }
	
	public static void main(String[] args)
	{
		int[] arr = { 2,3, 4, 5,};
		System.out.println(getMissingNo(arr, arr.length));
	}
}
