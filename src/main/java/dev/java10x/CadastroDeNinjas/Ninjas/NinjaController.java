package dev.java10x.CadastroDeNinjas.Ninjas;
import io.swagger.v3.oas.annotations.OpenAPI31;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping ("/boasvindas")
    public String boasVindas () {
        return "Essa é minha primeira mensagem";
    }

    //adicionar ninja (create)
        @PostMapping("/criar")
                public ResponseEntity <String>  criarNinja(@RequestBody NinjaDTO ninja){
                NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + novoNinja.getNome() + " (ID): " + novoNinja.getId());


        }



        //procurar ninja por id (read)

    @GetMapping("/listar/{id}")
    public ResponseEntity <?> mostrarNinjasPorId (@PathVariable Long id) {

        NinjaDTO ninjaPorId = ninjaService.listarNinjasPorId(id);
        if (ninjaPorId != null) {
            return ResponseEntity.ok(ninjaPorId);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com esse ID não existe nos nossos registros");
        }
    }

        //deletar ninja (delete)
        @DeleteMapping("/deletar/{id}")
        public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id){
         if(ninjaService.listarNinjasPorId(id) != null){
             String ninjaDeletado=ninjaService.listarNinjasPorId(id).getNome();
             ninjaService.deletarNinjaPorId(id);
             return ResponseEntity.ok("Ninja deletado com sucesso: " + id + " " + ninjaDeletado);

         }
         else {
             return ResponseEntity.status(HttpStatus.NOT_FOUND)
                     .body("O ninja com o id " + id + " não foi encontrado!");
         }

    }

        //alterar dados dos ninjas (update)
        @PutMapping("/alterar/{id}")
        public ResponseEntity<?> alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){

            NinjaDTO ninja = ninjaService.atualizarNinja(id, ninjaAtualizado);

            if (ninja != null){

                return ResponseEntity.status(HttpStatus.CREATED)

                        .body(ninja);

            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body ("O ninja com o id " + id + " não foi encontrado!");
            }



        }







        //mostrar todos os ninjas (read)
        @GetMapping ("/listar")
        public ResponseEntity< List<NinjaDTO>> listarNinjas(){
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas) ;
        }



}





