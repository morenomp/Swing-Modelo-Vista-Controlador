package Model;


public class Klingon extends Ser{

//-------------------------------------
//Variable de instancia (v.i)
//-------------------------------------

    private int force; //escala de fuerza que va de 50 a 350
    private static int civilizationLevel = 3; //el nivel de civilización de cada especie
                                            //(será única para cada una de ellas)
                                            //le pondremos "static", para que TODOS 
                                            //tengan estos atributos
    
//-------------------------------------
//Sobrecarga de constructores:
//-------------------------------------
    
    public Klingon(int force, String name) {
        super(name);
        this.force = force;
    }
    
//-------------------------------------
//Variable de clase (v.c)
//-------------------------------------
    
//GETTER:
    public int getForce() {
        return force;
    }
    public static int getCivilizationLevel() {
        return civilizationLevel;
    }
    
//SETTER:
    public void setForce(int force) {
        this.force = force;
    }
    
//-------------------------------------
//OVERRIDE
//-------------------------------------
    
    /**
     * Devuelve datos sobrescribiendo el metodo del padre
     * 
     * @return 
     */
    
    @Override
    public String toString() {
        //con super.toSrting() llamamos al padre (Ser)
        return "Raza: Klingon\n" + super.toString() + 
                           "\nFuerza: " + force;
    }
}
