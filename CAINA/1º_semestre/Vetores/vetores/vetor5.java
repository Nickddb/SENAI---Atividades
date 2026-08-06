//Faça um programa que leia um valor N. Este N será o tamanho 
// de um vetor X[N]. A seguir, leia cada um dos valores de X, 
// encontre o menor elemento deste vetor e a sua posição dentro do 
// vetor, mostrando esta informação.


package vetores;
import java.util.Scanner;

public class vetor5{
    public static void main(String[] args) throws Exception{
    Scanner in = new Scanner(System.in);

    System.out.println("Delimite o tamanho do vetor: ");
    int tamanho = in.nextInt();

    int [] array = new int [tamanho];

    for(int i= 0; i<tamanho; i++){
            array[i] = in.nextInt();
        }

    int menor = array[0];
    int posicao = 0;

    for(int i= 0; i<tamanho; i++){
        System.out.println(array[i] + "/n");
        if(menor > array[i]){
            posicao = i;
            menor = array[i];
        }
        }
    System.out.println("Posição: " + posicao);
    System.out.println("Menor: " + menor);
    }
}
