import java.util.Scanner;
 
public class Two2dArray {
 
    public static void main(String[] args) {
         
        Two2dArray bs = new Two2dArray();
 
        bs.student();
    }
 
    private void student() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of sem" );
        int noofsem = sc.nextInt();
        int[][] record = new int[noofsem][0];
        int noofsub = 0;
         
        for(int i = 0;i< noofsem;i++)
        {
            System.out.println(" Enter number of subject for "+ (i+1) + " sem" );
            noofsub = sc.nextInt();
            record[i] = new int[noofsub];
            for(int j = 0;j<noofsub;j++)
            {
                System.out.println(" Enter " + (j +1) + "  subject in " + (i +1) +" sem");
                record[i][j] = sc.nextInt();
            }
             
        }
         
        for(int k = 0;k<record.length;k++)
             
        {
            for(int l = 0;l<record[k].length;l++)
            {
                //System.out.println("Matrix ( " + k +" ,"+ l + " )  " + record[k][l] );
                System.out.print(record[k][l] + " " );
            }
            System.out.println(" ");
        }
         
    }