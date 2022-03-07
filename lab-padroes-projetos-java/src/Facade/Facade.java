package Facade;

import subsistema.CrmService;
import subsistemaCep.CepApi;

import java.awt.image.AbstractMultiResolutionImage;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);


        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
