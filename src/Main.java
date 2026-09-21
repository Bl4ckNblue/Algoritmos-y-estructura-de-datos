public class Main {
    public static void main(String[] args) {
        LES lista1 = new LES();
        lista1.insertarxInicio(5);System.out.println(lista1.muestraLE());
        lista1.insertarxInicio(10);System.out.println(lista1.muestraLE());
        lista1.insertarxInicio(56);System.out.println(lista1.muestraLE());
        lista1.insertarxInicio(106);System.out.println(lista1.muestraLE());
        lista1.eliminaxInicio();System.out.println(lista1.muestraLE());
    }
}


