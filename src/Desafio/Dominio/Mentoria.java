package Desafio.Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "Mentoria Título= " + getTitulo()
                + ", Descrição= " + getDescricao()
                + ", Data= " + data;
    }
}