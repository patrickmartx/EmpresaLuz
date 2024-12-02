package uff.empresaluz.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@Table(name = "equipe")
@XmlRootElement
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @ManyToOne
    @JoinColumn(name = "terceirizada_id")
    private Terceirizada terceirizada; // Terceirizada responsável

    private int quantidadeFuncionarios;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    private List<OrdemServico> ordensDeServicoAtendidas; // OSs atendidas


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Terceirizada getTerceirizada() {
        return terceirizada;
    }

    public void setTerceirizada(Terceirizada terceirizada) {
        this.terceirizada = terceirizada;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public List<OrdemServico> getOrdensDeServicoAtendidas() {
        return ordensDeServicoAtendidas;
    }

    public void setOrdensDeServicoAtendidas(List<OrdemServico> ordensDeServicoAtendidas) {
        this.ordensDeServicoAtendidas = ordensDeServicoAtendidas;
    }
}


