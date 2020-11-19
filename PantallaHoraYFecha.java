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
    
    /**
     * Devuelve la hora y la fecha
     */
    public String getFechaYHora() {
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla() + " " + pantallaDays.getTextoDeLaPantalla() + "-" + pantallaMonths.getTextoDeLaPantalla() + "-" + pantallaYears.getTextoDeLaPantalla();
    }
    
    /**
     * Avanza de uno en uno los minutos
     */
    public void avanzarMinuto() {
        pantallaMinutos.incrementaValorAlmacenado();
        if (pantallaMinutos.getValorAlmacenado() == 0) {
            pantallaHoras.incrementaValorAlmacenado();
            if (pantallaHoras.getValorAlmacenado() == 0) {
                pantallaDays.incrementaValorAlmacenado();
                if (pantallaDays.getValorAlmacenado() == 1) {
                    pantallaMonths.incrementaValorAlmacenado();
                    if (pantallaMonths.getValorAlmacenado() == 1) {
                        pantallaYears.incrementaValorAlmacenado();
                        
                    }
                }
            }
        }
    }
    
    /**
     * Fija los valores de las horas los minutos y la fecha
     */
    public void fijarFechaYHora(int horas, int minutos, int days, int months, int years) {
        pantallaHoras.setValorAlmacenado(horas);
        pantallaMinutos.setValorAlmacenado(minutos);
        pantallaDays.setValorAlmacenado(days);
        pantallaMonths.setValorAlmacenado(months);
        pantallaYears.setValorAlmacenado(years);
    }
}
