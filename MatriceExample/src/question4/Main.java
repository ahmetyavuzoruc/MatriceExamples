package question4;

import java.util.Random;

public class Main {

	void printRepeating(int arr[], int size)  
    { 
		
		
			
        int i, j; 
        System.out.println("Tekrarlayan sayılar :"); 
        for (i = 0; i < size; i++)  
        { 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
    }

	public static void main(String[] args) {
		
		Main repeat = new Main();
		
		int[] dizi = new int[10];
		for(int i=0; i<10; i++) {
			Random rastgele = new Random();
			int sayi = rastgele.nextInt(100)+1;
			dizi[i] = sayi;
			
			System.out.print(dizi[i]+ " ");
			
		}
		System.out.println("               ");
		System.out.println("----------------");
		
		int dizi_size = dizi.length;
		repeat.printRepeating(dizi, dizi_size);
	}

}
