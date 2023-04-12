package br.fag.aula01.pizza.types;

public enum SaborDoce {
        CHOCOLATE_COM_MORANGO  (5.50f, "Chocolate Com Morango"),
        BANANA_COM_CANELA (3.50f, "Banana Com Canela"),

        ROMEU_E_JULIETA (4.50f, "Romeu e Julieta"),

        BRIGADEIRO (7.50f, "Brigadeiro"),

        NUTELA_COM_MORANGO(6.50f, "Nutela Com Morango"),

        SENSACAO(7.50f, "Sensação"),

        COCO_COM_LEITE(3.50f, "Coco Com Leite"),

        PRESTIGIO (6.60f, "Prestigio"),

        DOCE_DE_LEITE (8.30f,"Doce de Leite"),

        MACA_COM_CANELA (4.50f, "Maça Com Canela");


        private final float valordoSabor;
        private final String nomedaPizza;
        SaborDoce(float valordoSabor, String nomeDaPizza) {
            this.valordoSabor = valordoSabor;
            this.nomedaPizza = nomeDaPizza;
        }

        public float getValordoSabor(){
            return valordoSabor;
        }
        public String getNomedaPizza(){
            return nomedaPizza;
        }
    }



