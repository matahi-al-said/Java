public class Endereco {

    String logradouro;
    short numero;
    String complemento;
    String cep;

    String retornarEndereco(){
        return logradouro + " " + numero + " " + complemento + " " + cep;

    }
}
