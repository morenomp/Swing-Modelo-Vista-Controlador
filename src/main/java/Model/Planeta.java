package Model;

import java.util.Objects;
import Model.*;
import java.util.HashSet;

//aunque no haga falta lo pondremos para tener en cuenta 
//que Planeta es hijo de Object
public class Planeta extends Object{
    
//-------------------------------------
//Variable de instancia (v.i)
//-------------------------------------
    
    protected String name; //será lo que lo haga único
    
    protected String galaxy; //la galaxia a la que pertenece
    protected int populationMax; //máximo de población por planeta
    protected HashSet<Ser> population;//HashSet para tener los habitantes de los planetas
    protected String clime; //el tipo de clima que puede ser frío, cálido o templado
    protected boolean flora; //SI dispone de flora roja o no
    protected boolean aquatic; //SI tiene seres acuáticos o no
    
//-------------------------------------
//Constructor:
//-------------------------------------

    public Planeta(String name, String galaxy, int populationMax, String clime, boolean flora, boolean aquatic) {
        this.name = name;
        this.galaxy = galaxy;
        this.populationMax = populationMax;
        this.population = new HashSet<>();
        this.clime = clime;
        this.flora = flora;
        this.aquatic = aquatic;
    }

//-------------------------------------
//Constructor 2:
//-------------------------------------
    public Planeta(String name) {
        this.name = name;
    }
    
//-------------------------------------
//Variable de clase (v.c)
//-------------------------------------
    
//GETTER:
    public String getName() {
        return name;
    }

    public String getGalaxy() {
        return galaxy;
    }
    
    public int getPopulationMax() {
        return populationMax;
    }
    
    public HashSet<Ser> getPopulation() {
        return population;
    }

    public String getClime() {
        return clime;
    }

    public boolean isFlora() {
        return flora;
    }

    public boolean isAquatic() {
        return aquatic;
    }

//SETTER:
    //haremos que se pueda modificar todo, excepto
    //"name" que es único para cada planeta

    public void setGalaxy(String galaxy) {
        this.galaxy = galaxy;
    }

    public void setPopulationMax(int populationMax) {
        this.populationMax = populationMax;
    }

    public void setPopulation(HashSet<Ser> population) {
        this.population = population;
    }

    public void setClime(String clime) {
        this.clime = clime;
    }

    public void setFlora(boolean flora) {
        this.flora = flora;
    }

    public void setAquatic(boolean aquatic) {
        this.aquatic = aquatic;
    }
    
//-------------------------------------
//OVERRIDE
//-------------------------------------

    /**
     * Devuelve datos sobrescribiendo el padre (Object)
     * 
     * Quitaremos el array de la población, ya que más adelnate nos "estorbará"
     * 
     * @return 
     */
    
    @Override
    public String toString() {
        return "Planeta: " + name + 
               "\nGalaxia: " + galaxy + 
               "\nPoblacion Maxima: " + populationMax + 
               "\nClima: " + clime + 
               "\nDispone de Flora Roja: " + flora + 
               "\nTiene seres acuaticos: " + aquatic;
    }

//-------------------------------------
//HASHCODE
//------------------------------------- 
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

//-------------------------------------
//EQUALS
//-------------------------------------
//Lo usaremos para acortar y comparar los planetas
    
    /**
     * Compara Planeta con otro objeto para determinar si son iguales
     * @param obj obj será el objeto que comparará
     * @return 
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Planeta other = (Planeta) obj;
        return Objects.equals(this.name, other.name);
    }
}
