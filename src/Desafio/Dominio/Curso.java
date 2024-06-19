package Desafio.Dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "Curso Título= " + getTitulo()
                + ", Descrição= " + getDescricao()
                + ", Carga horária= " + cargaHoraria;
    }
}