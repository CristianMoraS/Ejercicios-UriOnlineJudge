/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;


import java.io.*;
/**
 *
 * @author Administrador
 */
public class URI1211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
      
        try {
            String input = br.readLine();
            int cases;
            int[][] numbers; 
            while(!input.equals("") && !input.equals("0")){
                cases = Integer.parseInt(input);
                
                input = br.readLine();
                numbers = new int [cases][input.length()];
                    
                for (int j = 0; j < input.length(); j++) {
                    numbers[0][j] = Integer.parseInt(input.substring(j, j + 1));
                }
                
                for (int i = 0;  i < cases; i++) {
                    input = br.readLine();
                    for (int j = 0; j < input.length(); j++) {
                        numbers[i][j] = Integer.parseInt(input.substring(j,j + 1));
                }
                }
                int counter = 0;
                for (int i = 1; i < cases; i++) {
                    for (int j = 0; j < input.length(); j++) {
                        if (numbers[i][j] == numbers[i - 1][j]) {
                            counter += 1;
                        }else{
                            break;
                        }
                    }
                }
                
                input = br.readLine();
            }   
        } catch (IOException ex) {
            
        }
    }
    public static void radix_Sort(int[][] numbers){
        
    }
    
}
