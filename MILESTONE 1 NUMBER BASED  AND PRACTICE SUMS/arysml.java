package B;

public class arysml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[5];
        int i=0,r=0;
        int t=3241,k=0;
        while(t!=0)
        {
        	r=t%10;
        	a[i]=r;
        	i++;
        	t=t/10;
        }
        for(k=0;k<i;k++)
        	System.out.print(a[k]+" ");
	}

}
