package code;

public class MaxiMini {
	public static void main(String[] args) {
		int array[] = {54,546,548,60};
		int max = array[0];
		int mini = array[0];
		for(int i=0;i<array.length;i++) {
			if ( array[i]>max) {
				max=array[i];
			}
			else if (array[i]<mini) {
				mini=array[i];
			}
		}
		
		System.out.print(max+" ");
		System.out.println(mini);
	}
	

}
