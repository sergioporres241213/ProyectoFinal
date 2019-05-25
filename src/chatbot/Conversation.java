package chatbot;

public class Conversation {
  
    NaryTree tree;
    
    //interacciones con el usuario
    public Conversation(){
        
        Node raiz;
        Node op1, op2, op3, op4, op5, op6, exit;
        tree = new NaryTree();
        
               raiz = tree.root = new Node("Hola! ¿Cómo Puedo Ayudarte? <br>"
                + "Contamos con las Siguientes Opciones para tu tarjeta de credito: "
                + "<br> 1. Bloqueo de Tarjeta "
                + "<br> 2. Saldo Disponible "
                + "<br> 3. Fecha de Corte"
                + "<br> 4. Fecha de Pago"
                + "<br> 5. Información de Tarjeta");
        raiz.palabra_clave[0] = "hola";
        raiz.palabra_clave[1] = "";
        raiz.palabra_clave[2] = "";
        
        op1 = raiz.operacion1 = new Node("bloquear tarjeta");
        op1.palabra_clave[0] = "bloquear";
        op1.palabra_clave[1] = "";
        op1.palabra_clave[2] = "tarjeta";
        op1.operacion1 = new Node("Con gusto te puedo ayudar a bloquear tu tarjeta de credito <br> ¿Me puedes indicar tu número de DPI?");
        op1.salida = new Node("Lo siento no me aparece ninguna tarjeta de crédito asociada con ese DPI <br>por favor visita alguna de nuestras agencias y un asesor te estará apoyando con tu solicitud.");
        
        op2 = raiz.operacion2 = new Node("saldo disponible tarjeta");
        op2.palabra_clave[0] = "saldo";
        op2.palabra_clave[1] = "";
        op2.palabra_clave[2] = "tarjeta";
        op2.operacion1 = new Node("Con gusto te puedo brindar el saldo disponible de tu tarjeta de credito <br> ¿Me puedes indicar tu número de DPI?");
        op2.salida = new Node("Lo siento no me aparece ninguna tarjeta de crédito asociada con ese DPI <br> por favor visita alguna de nuestras agencias y un asesor te estará apoyando con tu solicitud.");
        
        op3 = raiz.operacion3 = new Node("fecha de corte tarjeta");
        op3.palabra_clave[0] = "fecha";
        op3.palabra_clave[1] = "corte";
        op3.palabra_clave[2] = "";
        op3.operacion1 = new Node("Con gusto te puedo brindar la fecha de corte de tu tarjeta de credito <br> ¿Me puedes indicar tu número de DPI?");
        op3.salida = new Node("Lo siento no me aparece ninguna tarjeta de crédito asociada con ese DPI <br> por favor visita alguna de nuestras agencias y un asesor te estará apoyando con tu solicitud.");
        
        op4 = raiz.operacion4 = new Node("fecha de pago tarjeta");
        op4.palabra_clave[0] = "fecha";
        op4.palabra_clave[1] = "pago";
        op4.palabra_clave[2] = "";
        op4.operacion1 = new Node("Con gusto te puedo brindar la fecha de pago de tu tarjeta de credito <br> ¿Me puedes indicar tu número de DPI?");
        op4.salida = new Node("Lo siento no me aparece ninguna tarjeta de crédito asociada con ese DPI <br> por favor visita alguna de nuestras agencias y un asesor te estará apoyando con tu solicitud.");
        
        op5 = raiz.operacion5 = new Node("informacion de tarjeta");
        op5.palabra_clave[0] = "informacion";
        op5.palabra_clave[1] = "";
        op5.palabra_clave[2] = "tarjeta";
        op5.operacion1 = new Node("Con gusto te puedo brindar información acerca de tu tarjeta de credito <br> ¿Me puedes indicar tu DPI?");
        op5.salida = new Node("Lo siento no me aparece ninguna tarjeta de crédito asociada con ese DPI <br> por favor visita alguna de nuestras agencias y un asesor te estará apoyando con tu solicitud.");
        
        op6 = raiz.operacion6 = new Node("salida personalizada");
        op6.palabra_clave[0] = "tarjeta";
        op6.palabra_clave[1] = "";
        op6.palabra_clave[2] = "";
        op6.salida = new Node("Por motivos de seguridad, esa opción no se puede llevar a cabo por este medio. <br> Intenta visitar tu banco mas cercano para poder obtener ayuda sobre tu tarjeta de credito");
        
        exit = raiz.salida = new Node("Lo siento, no puedo ayudarte con tu solicitud. <br> Por este medio unicamente podemos ayudarte con tu tarjeta de credito");
        
    }
    
    public NaryTree getMyTree(){
        return tree;
    }
    
}
