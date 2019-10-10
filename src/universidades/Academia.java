package universidades;

public class Academia{
    
    private int cantidadDeMiembros;
    private String fechaDeFinalizacionDelCurso;
    private boolean tieneSucursales;

    public Academia(int cantidadDeMiembros, String fechaDeFinalizacionDelCurso, boolean tieneSucursales) {
        this.cantidadDeMiembros = cantidadDeMiembros;
        this.fechaDeFinalizacionDelCurso = fechaDeFinalizacionDelCurso;
        this.tieneSucursales = tieneSucursales;
    }
    
    public void ingresarALaAcademia(){
        cantidadDeMiembros+=1;
    }

    public void tieneOtrasSucursales(){
        this.tieneSucursales= true;
    }
    
    public int getCantidadDeMiembros() {
        return cantidadDeMiembros;
    }

    public void setCantidadDeMiembros(int cantidadDeMiembros) {
        this.cantidadDeMiembros = cantidadDeMiembros;
    }

    public String getFechaDeFinalizacionDelCurso() {
        return fechaDeFinalizacionDelCurso;
    }

    public void setFechaDeFinalizacionDelCurso(String fechaDeFinalizacionDelCurso) {
        this.fechaDeFinalizacionDelCurso = fechaDeFinalizacionDelCurso;
    }

    public boolean isTieneSucursales() {
        return tieneSucursales;
    }

    public void setTieneSucursales(boolean tieneSucursales) {
        this.tieneSucursales = tieneSucursales;
    }
    
    
}
