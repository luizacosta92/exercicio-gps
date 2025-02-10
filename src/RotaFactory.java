public class RotaFactory {
    public static ServicoDeGPS criarRota(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "carro" -> new RotaCarro();
            case "pedestre" -> new RotaPedestre();
            case "bicicleta" -> new RotaBicicleta();
            case "ônibus" -> new RotaOnibus();
            default -> throw new IllegalArgumentException("Tipo de rota inválido.");
        };
    }
}