package A;

public class Matrix3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     if(args.length!=4)
    	 System.out.print("enter");
     int a[][]=new int[2][2];
     int r[][]=new int[2][2];
     
     int i=0,j=0,x=0;
     for(i=0;i<2;i++)
     {
    	 for(j=0;j<2;j++)
    	 {
    		 a[i][j]=Integer.parseInt(args[x]);
    		 x++;
    	 }
    	 
     }
     for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				r[2-i-1][2-j-1]=a[i][j];
			}
		}
     for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
