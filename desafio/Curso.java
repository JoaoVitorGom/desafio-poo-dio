package  desafio;

import java.util.HashSet;
import java.util.Set;

public class Curso extends Conteudo{


    private int cargaHoraria;
     private Set<Integer> notas;

    public Curso() {
        this.notas = new HashSet<>();
    }

    public void adicionarValor(int valor) {
        notas.add(valor);
    }

    public Set<Integer> getConjunto() {
        return notas;
    }

    public double avaliarDesempenho(){
        int soma = notas.stream().mapToInt(Integer::intValue).sum();
        double media=(double)soma/notas.size();
        return media;
    }
    


    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + getCargaHoraria() + "]";
    }

    
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;

    }



    

}