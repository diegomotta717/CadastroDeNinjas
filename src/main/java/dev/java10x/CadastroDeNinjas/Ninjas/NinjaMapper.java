package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map (NinjaDTO ninjaDTO){

        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setJUTSU(ninjaDTO.getJUTSU());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setRANK(ninjaDTO.getRANK());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());
        ninjaModel.setImg(ninjaDTO.getImg());


        return ninjaModel;

    }

    public NinjaDTO map (NinjaModel ninjaModel){

        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setJUTSU(ninjaModel.getJUTSU());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setRANK(ninjaModel.getRANK());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());
        ninjaDTO.setImg(ninjaModel.getImg());


        return ninjaDTO;



    }



}
