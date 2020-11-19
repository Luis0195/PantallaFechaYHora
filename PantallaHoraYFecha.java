public class PantallaHoraYFecha
{
 // Día del año
    private PantallaDosDigitos pantallaDays;
    // Mes del año
    private PantallaDosDigitos pantallaMonths;
    // Año
    private PantallaDosDigitos pantallaYears;
    // Pantalla horas
    private PantallaDosDigitos pantallaHoras;
    // Pantalla minutos
    private PantallaDosDigitos pantallaMinutos;
    
    public PantallaHoraYFecha() {
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
        pantallaDays = new PantallaDosDigitos (1, 31);
        pantallaMonths = new PantallaDosDigitos (1, 13);
        pantallaYears = new PantallaDosDigitos (1, 100);
    }
}
