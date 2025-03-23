public class Condicional {

    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if(anoDeLancamento >= 2022){
            System.out.println();
            System.out.println("Lançamento mais visitados pelos clientes!");
        }else {
            System.out.println("Filmes retrôs que são mais procurados pelos clientes!");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }

    }
}
