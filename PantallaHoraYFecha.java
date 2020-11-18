public class PantallaHoraYFecha
{
 // Día del año
    private int day;
    // Mes del año
    private int month;
    // Año
    private int year;
    // Pantalla horas
    private PantallaDosDigitos pantallaHoras;
    // Pantalla minutos
    private PantallaDosDigitos pantallaMinutos;
    
    public PantallaHoraYFecha() {
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
        day = 1;
        month = 1;
        year = 1;
    }
}
