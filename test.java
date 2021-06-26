import java.util.Scanner;
 
class MatrixMultiplication
{
  public static void main(String args[])
  {
    int mt1, mt2, ma1, ma2, sum = 0, i1, i2, i3;
 
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Jumlah Baris dan Kolom untuk Matriks pertama !");
    mt1 = input.nextInt();
    mt2 = input.nextInt();
 
    int first[][] = new int[mt1][mt2];
 
    System.out.println("Masukkan nilai dari Matriks pertama !");
 
    for (i1 = 0; i1 < mt1; i1++)
      for (i2 = 0; i2 < mt2; i2++)
        first[i1][i2] = input.nextInt();
 
    System.out.println("Masukkan Jumlah Baris dan Kolom untuk Matriks Kedua !");
    ma1 = input.nextInt();
    ma2 = input.nextInt();
 
    if (mt2 != ma1)
      System.out.println("Matriks tidak bisa dioperasikan");
    else
    {
      int second[][] = new int[ma1][ma2];
      int multiply[][] = new int[mt1][ma2];
 
      System.out.println("Masukkan nilai dari Matriks Kedua !");
 
      for (i1 = 0; i1 < ma1; i1++)
        for (i2 = 0; i2 < ma2; i2++)
          second[i1][i2] = input.nextInt();
 
      for (i1 = 0; i1 < mt1; i1++) {
        for (i2 = 0; i2 < ma2; i2++) {
          for (i3 = 0; i3 < ma1; i3++)
            sum = sum + first[i1][i3]*second[i3][i2];
 
          multiply[i1][i2] = sum;
          sum = 0;
        }
      }
 
      System.out.println("Hasil dan total Perhitungan dari operasi Matriks:");
 
      for (i1 = 0; i1 < mt1; i1++) {
        for (i2 = 0; i2 < ma2; i2++)
          System.out.print(multiply[i1][i2]+"\t");
 
        System.out.print("\n");
      }
    }
  }
}
