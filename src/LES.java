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
    public void eliminar final() {
         if(inicio != null){
             if(inicio.getSgte() == null){
                inicio = null;
            }else{
              p = inicio; q = inicio;
              while(p.getSgte() != null ){
                 q=p; p=p.getSgte();
              }
              q.getSgte(null);
             }
          }
        }
    }
}
