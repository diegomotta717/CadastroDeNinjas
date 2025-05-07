package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninjas")
public class NinjaController {
    @GetMapping ("/boasvindas")
    public String boasVindas () {
        return "Essa é minha primeira mensagem";
    }
        //adicionar ninja (create)

        @PostMapping("/criar")
                public String criarNinja(){
            return "Ninja criado";

        }



        //procurar ninja por id (read)

    @GetMapping("/listarid")
    public String mostrarNinjasPorId (){
            return "Ninja ID mostrado";
        }

        //deletar ninja (delete)

        @DeleteMapping("/deletar")
        public String deletarNinjaPorId(){
        return  "O Ninja pdeletado por id";}

        //alterar dados dos ninjas (update)
        @PutMapping("/alterar")
        public String alterarNinjaPorId(){
        return "Ninja alterado por id";}



        //mostrar todos os ninjas (read)
        @GetMapping ("/listar")
        public String mostrarTodosOsNinjas(){
            return "todos os ninjas mostrados";
        }



}





