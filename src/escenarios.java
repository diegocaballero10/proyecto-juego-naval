public class escenarios {

    public int [][]alto_ancho;
    private float probabilidadItem;
    private int maxTurnosFallido;
    private int contarTurnoExitoso;
    private int contarTurnoFallido;
    private int puntaje;

    public escenarios(int[][] alto_ancho, float probabilidadItem, int maxTurnosFallido, int contarTurnoExitoso, int contarTurnoFallido, int puntaje) {
        this.alto_ancho = alto_ancho;
        this.probabilidadItem = probabilidadItem;
        this.maxTurnosFallido = maxTurnosFallido;
        this.contarTurnoExitoso = contarTurnoExitoso;
        this.contarTurnoFallido = contarTurnoFallido;
        this.puntaje = puntaje;
    }

    public int[][] getAlto_ancho() {
        return alto_ancho;
    }

    public void setAlto_ancho(int[][] alto_ancho) {
        this.alto_ancho = alto_ancho;
    }

    public void setAgregarBarco(int[][] agregarBarco) {
    }

    public float getProbabilidadItem() {
        return probabilidadItem;
    }

    public void setProbabilidadItem(float probabilidadItem) {
        this.probabilidadItem = probabilidadItem;
    }

    public int getMaxTurnosFallido() {
        return maxTurnosFallido;
    }

    public void setMaxTurnosFallido(int maxTurnosFallido) {
        this.maxTurnosFallido = maxTurnosFallido;
    }

    public int getContarTurnoExitoso() {
        return contarTurnoExitoso;
    }

    public void setContarTurnoExitoso(int contarTurnoExitoso) {
        this.contarTurnoExitoso = contarTurnoExitoso;
    }

    public int getContarTurnoFallido() {
        return contarTurnoFallido;
    }

    public void setContarTurnoFallido(int contarTurnoFallido) {
        this.contarTurnoFallido = contarTurnoFallido;
    }

    public int getPuntaje() {
        return puntaje;
    }

}
