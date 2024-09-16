/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocialproyecctoii;


/**
 *
 * @author Hp
 */
public class Master {
    public Usuario UsuarioActual;
    public Usuario UsuarioBusqueda;
    
    public Usuario[] users;
    public Tweets[] tweets;
    
    public int NumUsers=0;
    public int NumTweets=0;
    
    public Master(){
        this.users=new Usuario[50];
        this.tweets=new Tweets[20];   
    }
    
    
    public boolean Login(String user, String pass){
        for (int i = 0; i < NumUsers; i++) {
            if(user.equals(users[i].getUser()) && pass.equals(users[i].getPass())){
              this.UsuarioActual=users[i];
              this.UsuarioActual.ActivarCuenta();
              return true;  
            }
        } return false;
    }
    
    public boolean CrearCuenta(String nombre, String usuario, String contra,String genero,int edad){
        for (int i = 0; i < NumUsers; i++) {
            if(users[i].getUser().equals(usuario)){
                return false;
            }  
        }
        Usuario newusers=new Usuario(nombre, usuario, contra, genero, edad);
        this.UsuarioActual= newusers;
        users[NumUsers]= newusers;
        NumUsers++;
        return true;     
    }  
    
  public void Logout(){
      this.UsuarioActual=null;
  }  
    
    public String getUsuarioActual(){
        return this.UsuarioActual.getUser();
    }
    
public void AgregarTweetsArreglo(Tweets newtweet){
    tweets[NumTweets]=newtweet;
    UsuarioActual.tweets[UsuarioActual.numTweetsU]=newtweet;
    
    NumTweets++; 
    UsuarioActual.numTweetsU++;
}
    
    public void agregarFollower() {
       this.UsuarioBusqueda.AgregarFollower(this.UsuarioActual.getUser());
       this.UsuarioActual.AgregarFollowing(this.UsuarioBusqueda.getUser());
    }
    
    public void DejardeSeguir(){
        this.UsuarioBusqueda.RestarFollower(this.UsuarioActual.getUser());
        this.UsuarioActual.RestarFollowing(this.UsuarioBusqueda.getUser());
    }
    
    
   
    //search user (recorrer arreglo agarras user ( .contains(valor del texto) )
//    public String searchUser(String usuario){
//        StringBuilder result = new StringBuilder();
//        
//        for (int i = 0; i < NumUsers; i++) {
//            if (users[i].contains(usuario)) {
//                result.append(users[i]).append("\n");
//            }
//        }return result.toString();
//    }
    
    
    
     //get tweet (recorrer arreglo de tweet generales, verificar que lo sigo, y agregar al feed, sino saltar)
//    public Tweets getTweet(){
//        Tweets feed = new Tweets(); 
//    
//    for (int i = 0; i < NumTweets; i++) {
//        for (int j = 0; j < followedTweets.length; j++) {  //juntar todos los twwets de los q me siguen, pero no se donde
//            if (tweets[i].equals(followedTweets[j])) {  
//                feed.agregarTweet(tweets[i]); 
//            }
//        }
//    }
//    
//    return feed;
//    }
    
    
    //make tweet (140 char) obj tipo tweet agregar tweet general y tweet usuario
//    public makeTweer(){
//        
//    }
}
    




