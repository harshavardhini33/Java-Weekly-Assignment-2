import java.util.Scanner;
public class TheMatrix {
    public static void main(String [] args){
        int r1,r2,c1,c2;
        int [][]Arr1;
        int [][]Arr2;
        Matrix m=new Matrix();
        System.out.println("Enter no of rows for matrix 1: ");
        r1=m.rows();
        System.out.println("Enter no of columns for matrix 1: ");
        c1=m.columns();
        System.out.println("Enter no of rows for matrix 2: ");
        r2=m.rows();
        System.out.println("Enter no of columns for matrix 2: ");
        c2=m.columns();
        Arr1=m.setmatix(r1,c1);
        Arr2=m.setmatix(r2,c2);
        System.out.println("Sum of two matrics: ");
        m.add(Arr1,Arr2,r1,c1,r2,c2);
        System.out.println("Product of two matrics: ");
        m.product(Arr1,Arr2,r1,c1,r2,c2);
    }
}
class Matrix {
    public int rows(){
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }
    public int columns(){
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }
    public int[][] setmatix(int r1, int c1){
        int [][]Arr1= new int[50][50];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<r1;i++) {
            for (int j = 0; j < c1; j++) {
                Arr1[i][j] = sc.nextInt();
            }
        }
        return Arr1;
    }
    public void add(int [][] Arr1,int [][] Arr2,int r1,int c1,int r2,int c2){
        int [][]sum=new int[50][50];
        if((r1==r2)&&(c1==c2)){
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++){
                    sum[i][j]=Arr1[i][j]+Arr2[i][j];
                }
            }
        }
        else{
            System.out.println("Cannot able to add the matrices!!");
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public void product(int [][] Arr1,int [][] Arr2,int r1,int c1,int r2,int c2){
        int [][] Ans=new int[50][50];
        if((r1==r2)&&(c1==c2)){
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++){
                    for(int k=0;k<r1;k++){
                        Ans[i][j]=Ans[i][j]+(Arr1[i][k]*Arr2[k][j]);
                    }
                }
            }
        }
        else{
            System.out.println("Cannot able to add the matrices!!");
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(Ans[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}