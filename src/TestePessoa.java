
import javax.swing.JDialog;
import javax.swing.JOptionPane;

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
        
        pessoa.setNome("João");
        pessoa.setIdade(21);
        pessoa.setAltura(1.73);
        pessoa.setPeso(66);
        //System.out.println(pessoa.toString());
        JOptionPane.showMessageDialog(null, pessoa.toString());
    }
}
