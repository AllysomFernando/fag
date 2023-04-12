package br.fag.aula01.bebidas.types;

public enum TipoSuco {
        DEL_VALE_LARANJA(1.50f, "Del Vale Laranja"),
        KAPPO(2.40F, "Kappo"),
        DEL_VALE_UVA(2.50f, "Del Vale Uva");

        private final float valordoSuco;
        private final String nomedoSuco;
        TipoSuco(float valordoSuco, String nomedoSuco) {
            this.valordoSuco = valordoSuco;
            this.nomedoSuco = nomedoSuco;
        }

        public float getValordoSuco(){
            return valordoSuco;
        }
        public String getNomedoSuco(){
            return nomedoSuco;
        }
    }


