public class App{
    public static void main(String args[]){
        Placa p1 = new Placa("Brasil","ABC1R23");
        Placa p2 = new Placa("Brasil","CBA1R23");
        Veiculo v = new Veiculo(p1);
        Veiculo v2 = new Veiculo(p2);

        v.abastece(65);
        v.dirige(250);
        v2.abastece(125);
        v2.dirige(15);
        System.out.println("Dados do veiculo:");
        System.out.println(v);
        System.out.println("----------------");
        }
}