import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

List<Veiculos> veículos = new ArrayList<>();

void main() {
    String menu = """
            ===== Cadastro de Veículos ====
            Selecione algumas das opçoes abaixo:
            1 - Cadastrar Veículo
            2 - Listar Veículo
            3 - Consultar Veículo 
            0 - Sair do Cadastro 
            """;
        
        int opcao; 
        do {
            IO.println(menu);
            opcao = input.readInt("Digite uma opçao: ");
            switch (opcao) {
                case 1 -> {
                    CadastrarVeiculo();
                }
                case 2 -> {
                    ListarVeiculos();
                
                }
                case 3 -> {
                    ConsultarVeiculos();
                }
                case 0 ->{
                    IO.println(" Até a próxima :)");
                }
            
                default ->{
                    IO.println(" Opçao Inválida !");
                }
                    
                    
                
        }

    
    } while (opcao != 0 );
}   

void CadastrarVeiculo(){
    String marca = IO.readln("Digite a marca do seu veículo: ");
    String modelo = IO.readln("Diga o modelo do seu veículo: ");
    int ano = input.readInt("Digite aqui o ano do seu carro: ");

     int anoAtual = LocalDate.now().getYear();
    while( ano < 1900 || ano > anoAtual + 1){
        IO.println("Ano invalido! tente outro ano entre 1900 e" + (anoAtual+1));
        ano = input.readInt("Digite o ano:");
    }  

    String placa = IO.readln("Precisamos tambem da placa do seu carro:");

    for (Veiculos veiculos : veículos ){
        if (veiculos.getPlaca().equalsIgnoreCase(placa)){
            IO.println("Erro essa placa ja esta registrada");
            return;
        }
    }

    Veiculos novoVeiculo = new Veiculos(marca, modelo, ano, placa);
    veículos.add(novoVeiculo);
    IO.println("Seu veiculo foi cadastrado com exito!");

    


}

void ListarVeiculos(){
    if (veículos.isEmpty()){
        IO.println("Nenhum veiculo esta cadastrado");
        return;
    }
    IO.println("==== Veiculos Cadastrados ====");

    for(Veiculos veiculos: veículos){
        IO.println("Marca:"  + veiculos.getMarca());
        IO.println("Modelo:"  + veiculos.getModelo());
        IO.println("Ano:"  + veiculos.getAno());
        IO.println("Placa:"  + veiculos.getPlaca());
    }
    
}

void ConsultarVeiculos(){
    String placaBusca = IO.readln("Digite a placa do seu Veiculo: ");
    for (Veiculos veiculos : veículos){
        if (veiculos.getPlaca(). equalsIgnoreCase(placaBusca)){
            IO.println("== Veiculo Encontrado ==");
            IO.println("Marca:" + veiculos.getMarca());
            IO.println("Modelo:" + veiculos.getModelo());
            IO.println("Ano:" + veiculos.getAno());
            IO.println("Placa:" + veiculos.getPlaca());
            return;
        }
        
    }
    
    IO.println("Veiculo nao encontrado, tente novamente!");
    
    
}