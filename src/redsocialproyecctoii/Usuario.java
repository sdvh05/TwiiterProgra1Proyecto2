package redsocialproyecctoii;
import java.time.LocalDate;


   
public class Usuario {
    private String nombre;
    private String user;
    private String pass;
    private String genero;
    private int edad;
    private String fecha;
    private boolean estado;
    
     public Tweets[] tweets;
     public int numTweetsU;
    
     
    private String[] followers;
    private int numFollowers;
    private String[] following;
    private int numFollowing;
    
    
    
    
    public Usuario(){
        
    }
    
    public Usuario(String nombre, String usuario, String contra,String genero,int edad){
        this.nombre=nombre;
        this.user=usuario;
        this.pass=contra;
        this.genero=genero;
        this.edad=edad;
        LocalDate fechaActual = LocalDate.now();
        this.fecha=fechaActual.toString();
        this.estado=true;
        
        
         this.tweets = new Tweets[50]; 
         this.numTweetsU = 0;
         
        this.followers = new String[20]; 
        this.numFollowers = 0; 
        this.following = new String[20]; 
        this.numFollowing = 0; 
    }
    

        public boolean agregarTweet(Tweets tweet) {
        if (numTweetsU < tweets.length) {
            tweets[numTweetsU] = tweet; 
            this.numTweetsU++;
            return true;
        }
        return false; 
        }

         public Tweets[] getTweets() {
           return tweets; 
         }   
        
    
  public String getNombre(){
        return nombre;
    }
  
    public String getUser(){
        return user;
    }
    public String getPass() {
        return pass;
    }
    public String getFecha(){
        return fecha;
    }
    public String getGen(){
        return genero;
    }
    public int getAge(){
        return edad;
    }
    
    public int getNumTweetsU(){
        return numTweetsU;
    }
    
    
    public void setUser(String user){
        this.user=user;   
    }
    
    public void setPass(String pass){
        this.pass=pass;   
    }
  
    public void setNombre(String nombre){
        this.nombre=nombre;   
    }
    public void setEdad(int edad){
         this.edad=edad;
    }
    
    public String[] getfollowers(){
       return this.followers;
   } 

     public String[] getfollowing(){
       return this.following;
   } 

     
     
 public void AgregarFollower(String nombre){
     this.followers[numFollowers]=nombre;
     numFollowers++;
 }
 
 public void UpdateFollowing(String user, int pos){
     this.following[pos]=user;
 }
 
  public void AgregarFollowing(String nombre){
     this.following[numFollowing]=nombre;
     numFollowing++;
 }
  
  public void UpdateFollowers(String user, int pos){
      this.followers[pos]=user;
  }

  public void RestarFollower(String nombre){
       int posicion = -1; 
    for (int i = 0; i < numFollowers; i++) {
   
    
        if (followers[i].equals(nombre)) {
            posicion = i;
            break;
        }
    }
    if (posicion != -1) {
        

        for (int j = posicion; j < numFollowers - 1; j++) {
            this.followers[j] = this.followers[j + 1];
        }
        this.followers[numFollowers - 1] = null;

        numFollowers--;
        
    } 
  }
  
  
  
  public void RestarFollowing(String nombre){
       int posicion = -1; 
    for (int i = 0; i < numFollowing; i++) {
   
    
        if (following[i].equals(nombre)) {
            posicion = i;
            break;
        }
    }
    if (posicion != -1) {
        

        for (int j = posicion; j < numFollowing - 1; j++) {
            this.following[j] = this.following[j + 1];
        }
        this.following[numFollowing - 1] = null;

        numFollowing--;
        
    } 

  }
  
  
    public int getNumFollowers() {
        return numFollowers; 
    }

    public int getNumFollowing() {
        return numFollowing; 
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void ActivarCuenta(){
        this.estado=true; //True=Activa
    }
    
     public void DesactivarCuenta(){
        this.estado=false; //False=Desactiva
    }

}