package classes;

public class Maths {
	public int add(int x , int y ){
		return x+y;		
	}
	public int sub(int x , int y ){
		return x-y;		
	}
	public int div(int x , int y ){
		return x/y;		
	}
	public int mul(int x , int y ){
		return x*y;		
	}
	public boolean prime(int x){
		int c=0;
		for(int i=1;i<=x;i++){
			if(x%i==0){
				c++;
			}
		}
		if(c==2){
			return true;
		}
		return false;
	}
}
