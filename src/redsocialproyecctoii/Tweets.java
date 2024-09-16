package redsocialproyecctoii;

import java.time.LocalDate;

public class Tweets {
    private String usuario;
    private String texto;
    private String fecha;
    
 public Tweets(){

    }
    
    public Tweets(String usuario, String text){
        this.usuario=usuario;
        this.texto=text;
        LocalDate fechaActual = LocalDate.now();
        this.fecha=fechaActual.toString();
    }
    
    public String getTweetInfo(){
        return "@"+this.usuario+" Escribio: "+"\n"+this.texto+"\n"+this.fecha;
    }
            
            
    public String getUsuario(){
        return usuario;
    }
    
    public String getText(){
        return texto;
    }   
    
    public String getFecha(){
        return fecha;
    }
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    
    public String[] getHashtags() {
    
    String[] palabras = this.texto.split(" ");
    
    
    int contadorHashtags = 0;
    for (String palabra : palabras) {
        if (palabra.startsWith("#") && palabra.length() > 1) {
            contadorHashtags++;
        }
    }
   
    String[] hashtags = new String[contadorHashtags];
    int index = 0;
    
    for (String palabra : palabras) {
        if (palabra.startsWith("#") && palabra.length() > 1) {
            hashtags[index] = palabra;
            index++;
        }
    }
    
    return hashtags;
}
    
}
