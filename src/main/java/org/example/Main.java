package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ამოცანა 1
        int[] array={1,3,8,9};
        int lutsi = 0;
        for (int i = 0; i < array.length ; i++) {

            if(array[i]%2==0)
            {
                lutsi++;
            }
        }

        if (lutsi == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("ამ მასივში არის " + lutsi + " ლუწი რიცხვი");
        }

        //ამოცანა 2
        String text = "me miyvars avtomatizacia";
        int nabiji = 2;

        while (nabiji < text.length()) {
            char simbolo = text.charAt(nabiji);
            System.out.println(simbolo);

            if (simbolo == 'z') {
                break;
            }
            nabiji += 3;
        }

        //ამოცანა 3
        Length amocana=new Length();
        amocana.setAge();

        //ამოცანა 4
        checkNumber(0);

        //ამოცანა 5
        hasTeen(1,2,8);

    }

    static void checkNumber(int ricxvi) {
        if (ricxvi > 0) {
            System.out.println("დადებითი");
        } else if (ricxvi < 0) {
            System.out.println("უარყოფითი");
        } else if(ricxvi==0) {
            System.out.println("ნოლი");
        }
    }

    static void hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (num2 >= 13 && num2 <= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (num3 >= 13 && num3 <= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}