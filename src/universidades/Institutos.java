package universidades;

import java.util.Date;

public class Institutos extends Universidades {
    
    private int cantidadDeMaestros;
    private Date fechaDeInicio;
    private String nombreDelInstituto;

    public Institutos(int cantidadDeMaestros, Date fechaDeInicio, String nombreDelInstituto, int salones, boolean tieneInstitutos, Date fechaDeEntrada, boolean esPrivada, int numeroDeEstudiantes) {
        super(salones, tieneInstitutos, fechaDeEntrada, esPrivada, numeroDeEstudiantes);
        this.cantidadDeMaestros = cantidadDeMaestros;
        this.fechaDeInicio = fechaDeInicio;
        this.nombreDelInstituto = nombreDelInstituto;
    }
    
    public void agregarMaestros(){
        this.cantidadDeMaestros+=1;
    }
    
    public void renombrarInstituto(String nuevoNombre){
        this.nombreDelInstituto= nuevoNombre;
    }
    
    public void setcantidadDeMaestros(int cantidadDeMaestros){
        this.cantidadDeMaestros = cantidadDeMaestros;
    }

    public int getCantidadDeMaestros() {
        return cantidadDeMaestros;
    }

    public Date getFechaDeEntrada() {
        return fechaDeInicio;
    }

    public void setFechaDeEntrada(Date fechaDeEntrada) {
        this.fechaDeInicio = fechaDeEntrada;
    }

    public String getNombreDelInstituto() {
        return nombreDelInstituto;
    }

    public void setNombreDelInstituto(String nombreDelInstituto) {
        this.nombreDelInstituto = nombreDelInstituto;
    }
}

