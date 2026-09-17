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

public class Nodo {
    private int dato;
    private Nodo sgte;

    public Nodo(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
}

public class LES {
    private Nodo inicio, nuevo, p, q;

    public void insertarxInicio (int dato){
        nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
        }else{
            nuevo.setSgte(inicio);
            inicio = nuevo;
        }
    }
    public void eliminaxInicio(){
        if (inicio != null){
            inicio = inicio.getSgte();
        }
    }
    public String muestraLE() {
        String cadena = "";
        if (inicio != null){
            p = inicio;
            while (p!= null){
                cadena += p.getDato() + " - ";
                p = p.getSgte();
            }
        }
        return cadena;
    }
}
