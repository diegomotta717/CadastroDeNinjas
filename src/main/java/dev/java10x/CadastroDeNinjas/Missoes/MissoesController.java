package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/missoes")
    public String missoes (){
        return  "Bem vindo às Missoes";
    }

   //criar missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada";

    }



    //procurar missoes por id (read)
    @GetMapping("/todasmissoesid")
    public String mostrarMissaoPorId (){
        return "Missao ID mostrado";
    }

    //deletar missoes (delete)
    @DeleteMapping("/deletar")
    public String deletarMissaoPorId(){
        return  "Missao deletada por id";}

    //alterar dados das missoes (update)
    @PutMapping("/alterar")
    public String alterarMissaoPorId(){
        return "Missao alterado por id";}



    //mostrar todos as missoes (read)
    @GetMapping ("/todas")
    public String mostrarTodasAsMissoes(){
        return "todos as missoes mostradas";
    }


}
