package com.careerit.day7;
import java.util.Scanner;

public class TwoDArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter row length: ");
        int n = in.nextInt();
        System.out.println("enter column length: ");
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        //Displaying the array elements
        for (int[] temp : arr) {
            for (int ele : temp) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        //Biggest of the array
        int Max=BiggestOfTwoDArray(arr,n,m);
        System.out.println("The biggest number in the given array is: "+Max);
        //Sum of array elements
        int sum=SumOfArrayElements(arr,n,m);
        System.out.println("Sum of given array elements:"+sum);
        //Diagonal sum
        int dsum=Diagonalsum(arr,n,m);
        System.out.println("Sum of diagnoal elements for the given array: "+dsum);
        //Row sum
        for(int i=0;i<n;i++)
        {
            int rsum=RowSum(arr,n,m,i);
            System.out.println(i+" th row sum "+rsum);
        }
        //column sum
        for(int j=0;j<m;j++)
        {
            int cSum=columnSum(arr,n,m,j);
            System.out.println(j+" column sum "+cSum);
        }
        //Row sum as array
        int rowsum[]=new int[n];
        rowsum=rowsumarray(arr,n,m);
        for(int i=0;i<n;i++)
        {
            System.out.println(i+" th row sum is " +rowsum[i]);
        }
        //column sum as array
        int colsum[]=new int[m];
        colsum=colSumofarray(arr,n,m);
        for(int j=0;j<m;j++)
        {
            System.out.println(j+" column is "+colsum[j]);
        }
        //transpose of the given matrix
        int transpose[][]=new int[m][n];
        transpose=transpose(arr,n,m);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int BiggestOfTwoDArray(int arr[][],int n,int m)
    {
        int Max=arr[0][0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]>Max)
                {
                    Max=arr[i][j];
                }
            }
        }
        return Max;
    }
    public static int SumOfArrayElements(int arr[][],int n,int m)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum=sum+arr[i][j];
            }
        }
        return sum;
    }
    public static int Diagonalsum(int arr[][],int n,int m)
    {
        int dsum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                    dsum = dsum + arr[i][j];
            }
        }
       return dsum;
    }
    public static int RowSum(int arr[][],int n,int m,int i)
    {
        int row_sum=0;
        int j;
        for(int k=0;k<n;k++)
        {
            for(j=0;j<m;j++)
            {
                if(k==i)
                {
                    row_sum += arr[k][j];
                }
            }
        }
        return row_sum;
    }
    public static int columnSum(int arr[][],int n,int m,int j)
    {
        int colsum=0;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<m;k++)
            {
                if(k==j)
                {
                    colsum=colsum+arr[i][j];
                }
            }
        }
        return colsum;
    }
    public static int[] rowsumarray(int arr[][],int n,int m)
    {
        int a[]=new int[n];
        int j;
        for(int k=0;k<n;k++)
        {
            for(j=0;j<m;j++)
            {
                a[k]=a[k]+arr[k][j];
            }
        }
        return a;
    }
    public static int[] colSumofarray(int arr[][],int n,int m)
    {
        int colsum[]=new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                colsum[j]=colsum[j]+arr[i][j];
            }
        }
        return colsum;
    }
    public static int[][] transpose(int arr[][],int n,int m)
    {
        int trans[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                trans[i][j]=arr[j][i];
            }
        }
        return trans;
    }
}
