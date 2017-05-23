
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roger
 */
public class Testa_Ilhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ilhas ilhas = new Ilhas("D:\\Senac\\Workspace\\Algoritimo e Programacao III\\Trabalho01\\src\\exemplo_3.txt");

        //System.out.println(ilhas.getIlhas()); 
        //System.out.println(""); 
        //ilhas.printMatriz();
        //System.out.println(""); 
        //ilhas.printPositions();
        
        boolean t = true;
        String a = String.valueOf(t);
        
        
        ArrayList<Pessoa> lstPessoa = new ArrayList<Pessoa>();

        lstPessoa.add(new Pessoa("m"));
        lstPessoa.add(new Pessoa("f"));
        lstPessoa.add(new Pessoa("m"));
        lstPessoa.add(new Pessoa("f"));
        lstPessoa.add(new Pessoa("m"));
            
        Collections.sort(lstPessoa);
        
    }
    
    
    
}
