package javaRepo.javaRepo;

public class RecursiveFibo {
	
	static int fibo(int b){
		if ( b <= 1 ){
			return b;
		}else{
			return fibo(b-1) + fibo(b-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++){
			System.out.println(i + " : " + fibo(i));
		}
	}

}
