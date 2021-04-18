/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

/**
 *
 * @author indah
 */
public class Sequentialsearch {

    public static void main(String[] args) {
    int[] exampleVariableOne = {8, 3, 7, 1, 4, 0, 6, 9, 2};
    int target = 2;
    sequentialSearch(exampleVariableOne, target);
    }

    private static void sequentialSearch(int[] parameterOne, int parameterTwo) {
      int index = -1;
      for (int i = 0; i < parameterOne.length; i++)  {
          if (parameterOne[i] == parameterTwo)  {
              index = i;
              break;
          }
      }
      if (index == -1) {
          System.out.println("Target yang dituju tidak tersedia");
      } else {
          System.out.println("Target interger yang dituju ada pada index " + index + " dari array");
      }
    }
    
}
