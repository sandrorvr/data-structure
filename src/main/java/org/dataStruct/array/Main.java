package org.dataStruct.array;

public class Main {
    public static void main(String[] args) {
        Array numeros = new Array();
        int size = 3;
        for(int i = 0; i<size; i++) {
            numeros.append(((Integer) i).toString());
        }
        System.out.println(numeros);
        numeros.append("x",4);
        System.out.println(numeros);
        //String[] x = new String[3];
        //System.out.println(x.length);
    }
}