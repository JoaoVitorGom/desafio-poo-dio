package desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;    
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + getData() + "]";
    }
    @Override
    public double calcularXP() {
        return XP_PADRAO +20d;
    }
    


}