//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

       // c1.tampada = true; //chamada atributo
        //c1.status(); // referencia metodo

        c1.rabiscar();

        Caneta c2 = new Caneta();
        c1.modelo = "Hostnet";
        c1.cor = "Preta";
        c2.destampar();
        c2.rabiscar();








    }
}