package utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    
    public static boolean isNumeric(String Numero){
        
        try {
            Integer.parseInt(Numero);
            return true;
            
        } catch (Exception e) {           
            return false;
        }
    }
    
    //Convertendo data em string para clientes.
    public static Date StringToDate (String Data){
        SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy/MM/dd");
        Date x = null;
        
        try {
            x = formatoTexto.parse(Data);
        } catch (ParseException ex) {
            
        }
        return x;
    }
    
    
      //Convertendo data em string
    public static Date StringToDateBD (String Data){
        SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date x = null;
        
        try {
            x = formatoTexto.parse(Data);
        } catch (ParseException ex) {
            
        }
        return x;
    }
    
    //convertendo a data para ficar no padrao 
    //chamar na classe cliente
    public static String formatDate (Date Data){
        SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy/MM/dd");
        
        return formatoTexto.format(Data);
    }
}


