public class barcos {

    private int longitud;
    private int cordenadas_centroide;
    private int bandera;
    private int contador_partes;
    private string tipoBarco;
    private int cantiMaxBarcos;


    public barcos(int longitud, int cordenadas_centroide, int bandera, int contador_partes, string tipoBarco, int cantiMaxBarcos) {
        this.longitud = longitud;
        this.cordenadas_centroide = cordenadas_centroide;
        this.bandera = bandera;
        this.contador_partes = contador_partes;
        this.tipoBarco = tipoBarco;
        this.cantiMaxBarcos = cantiMaxBarcos;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getCordenadas_centroide() {
        return cordenadas_centroide;
    }

    public void setCordenadas_centroide(int cordenadas_centroide) {
        this.cordenadas_centroide = cordenadas_centroide;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public int getContador_partes() {
        return contador_partes;
    }

    public void setContador_partes(int contador_partes) {
        this.contador_partes = contador_partes;
    }

    public string getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(string tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public int getCantiMaxBarcos() {
        return cantiMaxBarcos;
    }

    public void setCantiMaxBarcos(int cantiMaxBarcos) {
        this.cantiMaxBarcos = cantiMaxBarcos;
    }

}
