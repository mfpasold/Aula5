
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mfpasold
 */
public class Pessoa {
    
    private String nome;
    private Integer idade;
    private Double altura;
    private Integer peso;

    public Pessoa() {
    }
    
    public Pessoa(String nome, Integer idade, Double altura, Integer peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public Integer getIdade() {
        return idade;
    }
    
    public void setIdade (Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }   

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (!Objects.equals(this.altura, other.altura)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        return true;
    }
    
    
}
