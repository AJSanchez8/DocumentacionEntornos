package tarea6;


import java.util.Scanner;


public class tarea6 {



    public static void main(String[] args) {


        SelectionSort selectionSort = new SelectionSort();
        int[] array1 = { 10, 1, 5, 40, 12, 34, 44, 12, 11, 9 };
        selectionSort.printArray(array1);
        selectionSort.sortArray(array1);
        selectionSort.printArray(array1);
        System.out.println();

        int[] array2 = { 3, 1, 23, 18, 41, 4, 44, 7, 16, 2 };
        int[] array3;
        selectionSort.printArray(array2);
        array3=selectionSort.sortArray2(array2);
        selectionSort.printArray(array3);
    }

    public static int ej1(int a, int b, int c){
        int x=5;
        if ((a>1) && (b>5) && (c<2))
            x=x+1;
        else
            x= x-1;
        return x;
    }

    public static int ej2(int a, int b, int c){
        int x=5;
        if ((a>1) || (b>5) || (c<2))
            x=x+1;
        else
            x= x-1;
        return x;
    }

    public static void ej3(int n){

        int i=1;
        while(i<=n){
            System.out.println(i+' ');
            i++;
        }
    }

    public static void ej4(int x){
        if(x<16){
            System.out.println("Eres demasiado pequeño para conducir y beber");
        }
        else if(x<21){
            System.out.println("Puedes conducir pero no beber");
        }
        else{
            System.out.println("Puedes conducir y beber");
        }

    }

    public static int ej5(int x, int y){

        while(x!=y){
            if (x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        return x;
    }

    public static int ej6(int num, int x, int y){

        if(x<y){

            if(x<=num && num<=y){
                return 1;
            }
            else
                return 0;
        }
        else
            return -1;

    }

    public static void ej7(int x, int y){
        Scanner sc=new Scanner(System.in);
        int num=-1;
        if(x<y){
            while(num!=0){
                System.out.println("Escribe un numero. 0 Para salir");
                num=sc.nextInt();
                if(x<=num && num<=y){
                    System.out.println("Numero dentro del rango");
                }
                else
                    System.out.println("Numero fuera de rango");
            }
        }
        else
            System.out.println("Rango invalido");

        System.out.println("Programa terminado");
        sc.close();
    }

    public static int ej8(int x, int y) {
        int contador = 0; //Iniciamos el contador en cero

        for(int i = 0; i <= y; i++)
        {
            if(i % x == 0) //Preguntamos si el residuo es 0 (es múltiplo de x)
            {
                contador++; //Si es múltiplo aumentamos el contador en 1
            }
            //Si no es múltiplo no hacemos nada
        }

        return contador;
    }
}