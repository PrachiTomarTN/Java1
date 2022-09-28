public class Question4 {

    public void sumofrows(int [][] Array1){

        int sum,rows,cols,Rsum=0;
        rows=Array1.length;
        cols=Array1[0].length;
        for(int i=0;i<rows;i++)
        {
            sum=0;
            for(int j=0;j<cols;j++)
            {
                sum=sum+Array1[i][j];

            }
            System.out.println("Row"+(i+1)+"Sum="+sum);
            Rsum=Rsum+sum;
        }
        System.out.println("Sum of all rows elements:"+Rsum);
    }
      public void sumofcols(int [][] Array1)
      {
          int sum,rows,cols,Csum=0;
          rows=Array1.length;
          cols=Array1[0].length;
          for(int j=0;j<cols;j++)
          {
              sum=0;
              for(int i=0;i<rows;i++)
              {
                  sum=sum+Array1[i][j];
              }
              System.out.println("column"+(j+1)+"sum="+sum);
              Csum=Csum+sum;
          }
          System.out.println("Sum of all Columns elements:"+Csum);
      }
}
