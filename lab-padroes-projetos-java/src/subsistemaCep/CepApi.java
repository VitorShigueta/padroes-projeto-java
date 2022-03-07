package subsistemaCep;


public class CepApi {
    private static CepApi cepApi = new CepApi();

    private CepApi(){super();}

    public static CepApi getInstance(){
        return cepApi;
    }

    public String recuperarCidade(String cep){
        return "Cianorte";
    }

    public String recuperarEstado(String cep){
        return "Paraná";
    }

}
