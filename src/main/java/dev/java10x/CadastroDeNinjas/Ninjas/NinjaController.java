package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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

    @GetMapping("/todosid")
    public String mostrarNinjasPorId (){
            return "Ninja ID mostrado";
        }

        //deletar ninja (delete)

        @DeleteMapping("/deletarid")
        public String deletarNinjaPorId(){
        return  "O Ninja pdeletado por id";}

        //alterar dados dos ninjas (update)
        @PutMapping("/alterarid")
        public String alterarNinjaPorId(){
        return "Ninja alterado por id";}



        //mostrar todos os ninjas (read)
        @GetMapping ("/todos")
        public String mostrarTodosOsNinjas(){
            return "todos os ninjas mostrados";
        }



}





