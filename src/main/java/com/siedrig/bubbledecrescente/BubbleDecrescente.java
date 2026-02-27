/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.siedrig.bubbledecrescente;

/**
 *
 * @author romeu
 */
public class BubbleDecrescente {

    public static void main(String[] args) {
       new BubbleDecrescente();
    }
    
    public BubbleDecrescente() {
    int numeros [] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
    
    bubbleSort_v05(numeros);
    visualizar(numeros);
}
    
    public void troca(int vetor[], int posa, int posb) {
        int temp = vetor[posa];
        vetor[posa] = vetor[posb];
        vetor[posb] = temp;        
    }
    
    public  boolean  bubbleSort_v05 (int vetor []) {
        if (vetor == null) return false; 
        boolean trocou;    int i = 0; 
        do {
            trocou = false;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
              if (vetor[j] < vetor[j+1]) {
                    troca(vetor, j, j+1);
                    trocou = true;
               }
            }
            i++;
        } while (trocou);
        return true;
    } 
    
    public void visualizar(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
}
