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

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping ("/boasvindas")
    public String boasVindas () {
        return "Essa é minha primeira mensagem";
    }

    //adicionar ninja (create)
        @PostMapping("/criar")
                public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
            return ninjaService.criarNinja(ninja);

        }



        //procurar ninja por id (read)

    @GetMapping("/listar/{id}")
    public NinjaDTO mostrarNinjasPorId (@PathVariable Long id){
            return ninjaService.listarNinjasPorId(id);
        }

        //deletar ninja (delete)
        @DeleteMapping("/deletar/{id}")
        public void deletarNinjaPorId(@PathVariable Long id){
         ninjaService.deletarNinjaPorId(id);
    }

        //alterar dados dos ninjas (update)
        @PutMapping("/alterar/{id}")
        public NinjaDTO alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);}



        //mostrar todos os ninjas (read)
        @GetMapping ("/listar")
        public List<NinjaDTO> listarNinjas(){
            return ninjaService.listarNinjas();
        }



}





