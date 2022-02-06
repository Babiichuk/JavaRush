package ua.javarush.additional;

import java.util.Scanner;

public class Spiral{ public static void main(String[] args) {

    int value,row=0,col=0;
    boolean okorno=false;

    Scanner input = new Scanner(System.in);
    Pand pd = new Pand();

    //Enter the number of lines, you can exit; verify whether it meets
    do {

        System.out.println("Please enter the number of rows of the spiral matrix:");
        value=input.nextInt();
        okorno=pd.hs((int)value);
        if (okorno) {
            row=value;
            System.out.println("The number of lines is valid.");
        }else
            System.out.println("The number of lines does not match, please re-enter.");
    }while (!okorno);


    //Enter the number of columns, you can exit; verify whether it meets
    do {
        System.out.println("Please enter the number of columns of the spiral matrix:");
        value=input.nextInt();
        okorno=pd.hs((int)value);
        if (okorno) {
            col=value;
            System.out.println("The number of columns is valid.");
        }else
            System.out.println("The number of columns does not match, please re-enter.");
    }while (!okorno);

    input.close();
    System.out.println("This is a spiral matrix with the number of rows "+row+" and the number of columns "+col+"");
    int juzhen[][]=new int[row][col];

    int intA=1,intB;
    if (col%2!=0)
        intB=(col+1)/2;
    else
        intB=col/2;

    for(int i=0;i<intB;i++)
    {
        //Left to right loop
        for(int j=i;j<col-i-1;j++){
            juzhen[i][j]=intA;
            intA++;
        }


        //Top to bottom loop
        for(int k=i;k<row-i-1;k++){
            juzhen[k][col-i-1]=intA;
            intA++;
        }

        //Right to left loop
        for(int L=col-i-1;L>=i;L--){
            juzhen[row-i-1][L]=intA;
            intA++;
        }

        //Bottom-up loop
        for(int m=row-i-2;m>i;m--){
            if (juzhen[m][i]==0)
                juzhen[m][i]=intA;
            else
                break;
            intA++;
        }
    }

    //The output array, because the single digit occupies less, it is prone to misalignment, so add spaces
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++){
            if (juzhen[i][j]<=9)
                System.out.print(" "+juzhen[i][j]+" ");
            else
                System.out.print(juzhen[i][j]+" ");
        }
        System.out.println();
    }
}
}

class Pand {
    public boolean hs(int value){
        if (value>=0) return value >= 2;
        else return false;
    }
}