package arrays;

public class MediaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero [] = new double [] {3,4,7,8};
		double soma = 0;
		
		double maior = numero[0];
		
		for (int i = 0; i < numero.length; i++) {

			if (numero[i] > maior)
				maior = numero [i];
			
			soma += numero[i];
			double media;
			media = (soma / numero.length);
			
			System.out.println(media);
			System.out.println("O maior número é: " + maior);	
		}
	}

}
