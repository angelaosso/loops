public class Empleado {
    private String nombre;
    private String apellido;
    private int sexo;
    private int salario;
    private Fecha fechaNacimiento;
    private Fecha fechaingreso;


    public Empleado(String nombre, String apellido, int sexo, int salario, Fecha fechaNacimiento, Fecha fechaingreso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaingreso = fechaingreso;
    }

    public void cambiarSalario(int nuevoSalario){
        this.salario = nuevoSalario;
    }

    public int darSalario(){
        return this.salario;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento.darDia() + "/" + fechaNacimiento.darMes() + "/" + fechaNacimiento.darAnio();
    }
}
