
package Modelo;

public class Empleado {
    private String nom_empleado;
    private int rol_id;
    private int num_empleado;
    private int tipo_id;

    public Empleado() {
    }

    public Empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public Empleado(String nom_empleado, int rol_id, int num_empleado, int tipo_id) {
        this.nom_empleado = nom_empleado;
        this.rol_id = rol_id;
        this.num_empleado = num_empleado;
        this.tipo_id = tipo_id;
    }
    
    public String getNom_empleado() {
        return nom_empleado;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public int getRol_id() {
        return rol_id;
    }

    public int getTipo_id() {
        return tipo_id;
    }

    public void setNom_empleado(String nom_empleado) {
        this.nom_empleado = nom_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public void setTipo_id(int tipo_id) {
        this.tipo_id = tipo_id;
    }
}
    