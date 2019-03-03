package assignments;

public class ninthQues {

	public static void main(String[] args) {
		int[] str={10,30,50,24,46,25,79};
		int max=str[0];
		for(int i=1;i<str.length;i++){
			if(str[i]<max){
				max=str[i];
				
			}
		}
		System.out.println(max);
	}

}
