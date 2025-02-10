
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a origem: ");
        String pontoA = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Informe o destino: ");
        String pontoB = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Como será realizada a rota?");
        System.out.println("Carro | Pedestre | Bicicleta | Ônibus");
        String tipo = sc.nextLine();

        //Criar um novo GPS para incluir os dados coletados
        GPS gps = new GPS(pontoA, pontoB, tipo);

        //Criar a rota, que vai identificar o tipo, para informar ao RotaFactory
        ServicoDeGPS rota = RotaFactory.criarRota(gps.tipo);
        //O trajeto pega a informação de rota (do tipo) e informa o ponto A e o ponto B
        String trajeto =  rota.tracarRota(pontoA, pontoB); //TODO: ajustar o return para incluir as infos das variáveis
        System.out.println(trajeto);
    }
}
