/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrifuga;

/**
 *
 * @author JHG-7
 */
public class Datos {
    private String nombre;
    private int edad;
    private String sexo;
    
    public Datos(){
        this.nombre = "Vacio";
        this.edad = 0;
        this.sexo = "Vacio";
    }
    
    public void Agregar(String _nombre, int _edad, String _sexo){
        this.nombre = _nombre;
        this.edad = _edad;
        this.sexo = _sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        String resp;   
        if(this.nombre != "Vacio"){
            resp = "Nombre: "+this.nombre+", Edad: "+this.edad+", Genero: "+this.sexo;
        }else{
            resp = "Vacio";            
        }
        return  resp; //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
    
    
    
    
    
}
