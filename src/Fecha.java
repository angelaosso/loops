public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int darDia(){
        return this.dia;
    }

    public int darMes(){
        return this.mes;
    }

    public int darAnio(){
        return this.anio;
    }

}
