package Desafio.Dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(50);
    private Set<Dev> inscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public Set<Dev> getInscritos() {
        return inscritos;
    }
    public void setInscritos(Set<Dev> inscritos) {
        this.inscritos = inscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) o;
        if (nome == null) {
            if (bootcamp.nome != null)
                return false;
        } else if (!nome.equals(bootcamp.nome))
            return false;
        if (descricao == null) {
            if (bootcamp.descricao != null)
                return false;
        } else if (!descricao.equals(bootcamp.descricao))
            return false;
        if (dataInicial == null) {
            if (bootcamp.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(bootcamp.dataInicial))
            return false;
        if (dataFinal == null) {
            if (bootcamp.dataFinal != null)
                return false;
        } else if (!dataFinal.equals(bootcamp.dataFinal))
            return false;
        if (inscritos == null) {
            if (bootcamp.inscritos != null)
                return false;
        } else if (!inscritos.equals(bootcamp.inscritos))
            return false;
        if (conteudos == null) {
            if (bootcamp.conteudos != null)
                return false;
        } else if (!conteudos.equals(bootcamp.conteudos))
            return false;
        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((inscritos == null) ? 0 : inscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }
}