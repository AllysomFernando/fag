package br.fag.aula01.bebidas.types;

public enum TipoAgua {
        SEM_GAS(1.10f, "Água sem Gás"),
        COM_GAS(1.40F, "Água com Gás");

        private final float valordaAgua;
        private final String nomedaAgua;
        TipoAgua(float valordaAgua, String nomedaAgua) {
            this.valordaAgua = valordaAgua;
            this.nomedaAgua = nomedaAgua;
        }

        public float getValordaAgua(){
            return valordaAgua;
        }
        public String nomedaAgua(){
            return nomedaAgua;
        }
    }

