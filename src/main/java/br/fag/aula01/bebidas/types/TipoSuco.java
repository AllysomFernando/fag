package br.fag.aula01.bebidas.types;

public enum TipoSuco {
        COCA_COLA(3.50f, "Coca Cola"),
        PESPI(2.40F, "Pepsi"),
        FANTA_LARANJA(3.50f, "Fanta Laranja"),
        GUARANA(2.50f, "Guarana");

        private final float valordoSuco;
        private final String nomedoSuco;
        TipoSuco(float valordoSuco, String nomedoSuco) {
            this.valordoSuco = valordoSuco;
            this.nomedoSuco = nomedoSuco;
        }

        public float getValordoSabor(){
            return valordoSuco;
        }
        public String getNomedoSuco(){
            return nomedoSuco;
        }
    }


