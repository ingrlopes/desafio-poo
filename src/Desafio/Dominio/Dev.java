package Desafio.Dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> inscritos = new LinkedHashSet<>();
    private Set<Conteudo> concluidos = new LinkedHashSet<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getInscritos() {
        return inscritos;
    }

    public void setInscritos(Set<Conteudo> inscritos) {
        this.inscritos = inscritos;
    }

    public Set<Conteudo> getConcluidos() {
        return concluidos;
    }

    public void setConcluidos(Set<Conteudo> concluidos) {
        this.concluidos = concluidos;
    }
    

    public void inscrever(Bootcamp bootcamp) {
        this.inscritos.addAll(bootcamp.getConteudos());
        bootcamp.getInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.inscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.concluidos.add(conteudo.get());
            this.inscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public double totalXp() {
        return this.concluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dev dev = (Dev) o;
        if (nome == null) {
            if (dev.nome != null)
                return false;
        } else if (!nome.equals(dev.nome))
            return false;
        if (inscritos == null) {
            if (dev.inscritos != null)
                return false;
        } else if (!inscritos.equals(dev.inscritos))
            return false;
        if (concluidos == null) {
            if (dev.concluidos != null)
                return false;
        } else if (!concluidos.equals(dev.concluidos))
            return false;
        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((inscritos == null) ? 0 : inscritos.hashCode());
        result = prime * result + ((concluidos == null) ? 0 : concluidos.hashCode());
        return result;
    }
}