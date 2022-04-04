import java.util.*;
class M{
	int i,j,k,l,m,n;
	int x[][]=new int[50][50];
	int y[][]=new int[50][50];
	int z[][]=new int[50][50];
	Scanner s=new Scanner(System.in);
	void add() {
	System.out.println("Enter the limit of the first matrix:");
	k=s.nextInt();
	l=s.nextInt();
	System.out.println("Enter the limit of the second matrix:");
	m=s.nextInt();
	n=s.nextInt();
	if(k==m && l==n){
		System.out.println("Enter elements to the first array:");
		for(i=0;i<k;i++) {
			for(j=0;j<l;j++) {
				x[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter elements to the second array:");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				y[i][j]=s.nextInt();
			}
		}
	System.out.println("The first matrix is:");
	for(i=0;i<k;i++) {
		for(j=0;j<l;j++) {
			System.out.println(x[i][j]);
		}
		System.out.println();
	}
	System.out.println("The second matrix is:");
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			System.out.println(y[i][j]);
		}
		System.out.println();
	}
	System.out.println("The addition of two matrices is:");
	for(i=0;i<k;i++) {
		for(j=0;j<l;j++) {
			z[i][j]=x[i][j]+y[i][j];
		}
	}
	for(i=0;i<k;i++) {
		for(j=0;j<l;j++) {
			System.out.println(z[i][j]);
		}
		System.out.println();
	}
	}
	else {
		System.out.println("Addition cannot be performed");
	}
	}
}
class Matrix{
	public static void main(String args[]){
		M mat=new M();
		mat.add();
	}
}