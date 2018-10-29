package com.Daniyah;

public class JackOLantern extends Runner{
    public static String[][] faceFeatures;

    JackOLantern(java.lang.String[][]faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public static void edit(java.lang.String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
    }


    public java.lang.String toString()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(str + '\n');
        }
    }

    public static void fill(java.lang.String str)
    {
        for(int i=0;i<faceFeatures.length;i++)
        {
            str = faceFeatures[i][i];
        }
    }
}
