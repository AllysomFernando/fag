package br.fag.aula01.bebidas.types;

public enum TipoRefri {
    COCA_COLA(3.50f, "Coca Cola"),
    PESPI(2.40F, "Pepsi"),
    FANTA_LARANJA(3.50f, "Fanta Laranja"),
    GUARANA(2.50f, "Guarana");

    private final float valordoRefri;
    private final String nomedoRefri;
    TipoRefri(float valordoRefri, String nomedoRefri) {
        this.valordoRefri = valordoRefri;
        this.nomedoRefri = nomedoRefri;
    }

    public float getValordoRefri(){
        return valordoRefri;
    }
    public String getNomedoRefri(){
        return nomedoRefri;
    }


}
