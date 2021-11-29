package ahorcademia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ogat1
 */
public class master_preg_resp {

public static void main(String[] args) {
    
   }
    
static List lista_preguntas() {
    
    List myArrayPreguntas = new ArrayList(); 
           myArrayPreguntas.add("¿DÓNDE LLEVA LA TILDE UNA PALABRA ESDRÚJULA?"); 
           myArrayPreguntas.add("ESCOJA EL RESULTADO DE 3+2");
           myArrayPreguntas.add("¿CUÁNTAS SÍLABAS TIENE LA PALABRA ABECEDARIO?");
           myArrayPreguntas.add("ESCOJA EL RESULTADO RESULTADO DE 3x2");
           myArrayPreguntas.add("¿QUÉ NO PUEDE FALTAR EN UNA ORACIÓN PARA QUE SEA COMPLETA?");
           myArrayPreguntas.add("ESCOJA EL RESULTADO DE 14-8");
           
     return myArrayPreguntas;     
     
 }


static String pregunta_texto( List myArrayPreguntas , int index )
{
    return (String) myArrayPreguntas.get(index);
}


static int index_pregunta( List myArrayPreguntas )
{
     int index = (int)(Math.random() * myArrayPreguntas.size());  
    return index;
}

static List random_respuestas(int pregunta) {
    
    List myArrayrepuestas = new ArrayList();
    
    if (pregunta==0)
    {
           myArrayrepuestas.add("EN LA PENULTIMA SILABA."); 
           myArrayrepuestas.add("EN LA ÚLTIMA SÍLABA");
           myArrayrepuestas.add("EN LA ANTEPENÚLTIMA SÍLABA");//correcta
           myArrayrepuestas.add("EN LA PRIMERA SÍLABA");
    }
    
        if (pregunta==1)
    {
           myArrayrepuestas.add("5"); //correcta
           myArrayrepuestas.add("0");
           myArrayrepuestas.add("52");
           myArrayrepuestas.add("4");
    }
        
            if (pregunta==2)
    {
        
           myArrayrepuestas.add("TIENE DOS SILABAS"); 
           myArrayrepuestas.add("TIENE UNA SILABA");
           myArrayrepuestas.add("TIENE SEIS SILABAS");//correcta
           myArrayrepuestas.add("TIENE CINCO SILABAS");
         
    }
            
          if (pregunta==3)
              
    {
        
           myArrayrepuestas.add("7"); 
           myArrayrepuestas.add("10");
           myArrayrepuestas.add("22");
           myArrayrepuestas.add("6");//correcta
    }
          
          if (pregunta==4)
    {
           myArrayrepuestas.add("LAS SILABAS"); 
           myArrayrepuestas.add("EL VERBO");//correcta
           myArrayrepuestas.add("LAS PALABRAS");
           myArrayrepuestas.add("EL PREDICADO");
    }
    
          
              if (pregunta==5)
    {
           myArrayrepuestas.add("2"); 
           myArrayrepuestas.add("5");
           myArrayrepuestas.add("6");//correcta
           myArrayrepuestas.add("3");
        
     
        
    }      
    
     
     return myArrayrepuestas;     
     
     			
 }


}
