class Altprime
{
	public static void main(String args[]){
		int flag=0;
		int flaga=0;
		for(int i=2;i<=100;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=1;
				}
			}
		if(flag==0&&flaga==0){
			System.out.println(i);
			flaga=1;
		}
		else if(flag==0&&flaga==1){
			flaga=0;
		}
		flag=0;
		}
	}
}