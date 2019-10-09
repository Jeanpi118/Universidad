package universidades;

import java.util.Date;

public class Universidades {
    
    private int salones;
    private boolean tieneInstitutos;
    private Date fechaDeEntrada;
    private boolean esPrivada;
    private int numeroDeEstudiantes;

    public Universidades(int salones, boolean tieneInstitutos, Date fechaDeEntrada, boolean esPrivada, int numeroDeEstudiantes) {
        this.salones = salones;
        this.tieneInstitutos = tieneInstitutos;
        this.fechaDeEntrada = fechaDeEntrada;
        this.esPrivada = esPrivada;
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }
    
    public void universidadPrivada(){
        esPrivada= true;
    }
    
    public void cantidadDeEstudiantes(){
        salones+= 45;
    }
    
    public void institutos(){
        tieneInstitutos= true; 
    }
    
    public void aprobaronParcial(int promedioDeNotas,int numeroDeEstudiantesQuePasaron, int numeroDeEstudiantesQueNoPasaron){
        if (promedioDeNotas<3){
            System.out.println("El promedio de los estudiantes es bajo");
        }
        else {
            if (promedioDeNotas<0){
                System.out.println("Promedio invalido");
            }else{
                this.numeroDeEstudiantes=numeroDeEstudiantesQueNoPasaron;
            }
        }
    }
}

