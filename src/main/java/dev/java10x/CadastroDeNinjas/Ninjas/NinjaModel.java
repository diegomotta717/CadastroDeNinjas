package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Entity transforma uma classe comum em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "missoes")




public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;
    private String RANK;
    private String JUTSU;
    private String img;


    //@ManyToOne - um ninja tem uma única missao
    @ManyToOne
    @JoinColumn(name="missoes_id") // chave estrangeira / foreigh key
    private MissoesModel missoes;





}
