package arrays;

import java.util.Arrays;

public class OrdenarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome [] = new String [] {"B" , "Z","A","F","G"};
		
		Arrays.parallelSort(nome);
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}
		
	}

}
