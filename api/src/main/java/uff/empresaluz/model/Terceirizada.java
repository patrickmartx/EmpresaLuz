package uff.empresaluz.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@Table(name = "terceirizada")
@XmlRootElement
public class Terceirizada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    private String nome;

    private String cidade;

    private int numeroDeAtendimentosRealizados;

    @OneToMany(mappedBy = "terceirizada", cascade = CascadeType.ALL)
    private List<Equipe> equipes; // Relação com equipes


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumeroDeAtendimentosRealizados() {
        return numeroDeAtendimentosRealizados;
    }

    public void setNumeroDeAtendimentosRealizados(int numeroDeAtendimentosRealizados) {
        this.numeroDeAtendimentosRealizados = numeroDeAtendimentosRealizados;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }
}

