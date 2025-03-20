package Model;


//esto se llaman EXCEPCIONES PROPIAS

public class PlanetaException extends Exception{
    
//--------------
//CONSTRUCTOR
//--------------
    
    //Para crear su constructor debemos marcar el segundo apartado
    
    public PlanetaException(String message) {
        super(message);
    }    
}
