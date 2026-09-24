public class LES {
    private Nodo inicio,nuevo,p,q; 
    
    public void insertarxInicio(int dato){
        nuevo = new Nodo(dato);
        if(inicio == null)
            inicio = nuevo;
        else{
            nuevo.setSgte(inicio);
            inicio = nuevo;
        }
    }
    public void eliminaxInicio(){
        if(inicio != null){
            inicio = inicio.getSgte();
        }
    }
    public String muestraLE(){
        String cadena="";
        if(inicio != null){
            p = inicio;
            while (p!=null) {
                cadena += p.getDato()+" - ";
                p = p.getSgte();
            }
            //cadena += p.getDato()+" - ";
        }
        return cadena;
    }

    public void insertarxFinal(int dato) {
        nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            p = inicio;
            while (p.getSgte() != null) {
                p = p.getSgte();
            }
            p.setSgte(nuevo);

        }
    }
        public void eliminaxFinal(){
            if(inicio!= null) {
                if (inicio.getSgte() == null) {
                    inicio = null;
                }
            }else{
                    p=inicio; q=inicio;
                    while(p.getSgte() != null){
                        q = p;
                        p = p.getSgte();
                    }
                    q.setSgte(null);
                }
        }

        public void insertaDespues(int dato, int posicion){
            nuevo = new Nodo(dato);
            if(inicio == null) {
                inicio = nuevo;
            } else{
                p = inicio;
                while(p != null && p.getDato() != posicion) {
                    p = p.getSgte();
                    if (p.getDato() == posicion) {
                        nuevo.setSgte(p.getSgte());
                        p.setSgte(nuevo);
                    }
                }
            }
        }
        public void insertaAntes(int dato, int posicion){
            nuevo = new Nodo(dato);
            if(inicio == null) {
                inicio = nuevo;
            }else{
                p = inicio; q = inicio;
                while(p != null && p.getDato() != posicion){
                    q= p;   p = p.getSgte();
                }
                if(p.getDato() == posicion){
                    nuevo.setSgte(p);  q.setSgte(nuevo);
                }
            }
        }

        public void  eliminaEntre(int posicion) {
            if (inicio != null) {
                if (inicio.getSgte() == null)
                    inicio = null;
                else {
                    p = inicio;
                    q = inicio;
                    while (p.getSgte() != null && p.getDato() != posicion) {
                        q = p;
                        p = p.getSgte();
                    }
                    if (p.getDato() == posicion) {
                        if (p == inicio)
                            inicio = inicio.getSgte();
                        else
                            q.setSgte(p.getSgte());
                    }
                }
            }
        }

    }
