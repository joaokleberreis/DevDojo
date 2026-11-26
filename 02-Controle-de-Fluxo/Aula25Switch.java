public class Aula25Switch {
    public static void main(String[] args) {
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Dia não mapeado");
        }

        String tipo = "PREMIUM";
        switch (tipo) {
            case "BASICO":
                System.out.println("Plano básico");
                break;
            case "PREMIUM":
                System.out.println("Plano premium");
                break;
            default:
                System.out.println("Plano desconhecido");
        }
    }
}
