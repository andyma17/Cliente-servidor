
public class DatosColaborador {

    String nombrec, pApellidoc, sApellidoc, nombUsuarioc, contraseñac, estadoc; //La c al final es para diferencair que es de colaborador

    public DatosColaborador() {
        this.nombrec = "";
        this.pApellidoc = "";
        this.sApellidoc = "";
        this.nombUsuarioc = "";
        this.contraseñac = "";

    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getpApellidoc() {
        return pApellidoc;
    }

    public void setpApellidoc(String pApellidoc) {
        this.pApellidoc = pApellidoc;
    }

    public String getsApellidoc() {
        return sApellidoc;
    }

    public void setsApellidoc(String sApellidoc) {
        this.sApellidoc = sApellidoc;
    }

    public String getNombUsuarioc() {
        return nombUsuarioc;
    }

    public void setNombUsuarioc(String nombUsuarioc) {
        this.nombUsuarioc = nombUsuarioc;
    }

    public String getContraseñac() {
        return contraseñac;
    }

    public void setContraseñac(String contraseñac) {
        this.contraseñac = contraseñac;
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }

}
