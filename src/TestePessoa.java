/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mfpasold
 */
public class TestePessoa {
    
    public static void main(String[] args) {
        
        int num = 0;
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "João";
        pessoa.idade = 21;
        pessoa.altura = 1.73;
        pessoa.peso = 66;
        System.out.println(pessoa);
    }
}
