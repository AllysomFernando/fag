package br.fag.aula01.pizza;

public enum SaborSalgada {
        PEPERONI  (1.50f, "Peperoni"),
        CALABRESA (3.50f, "Calabresa"),

        MARGERITA (2.50f, "Margerita"),

        QUATRO_QUEIJO (1.50f, "Quatro Queijo"),

        GORGONZOLA (2.50f, "Gorgonzola"),

        FRANGO_COM_CATUPIRY(4.50f, "Frango Cm Catupiry"),

        PORTUGUESA(2.50f, "Portuguesa"),

        QUATRO_ESTACOES (1.30f, "Quatro Estações"),

        RUCULA_COM_TOMATE_SECO (1.30f,"Rucula com Tomate Seco"),

        LOMBO_COM_ABACAXI (3.40f, "Lombo Com Abacaxi"),

        BACON_COM_MILHO (2.50f, "Bacon com Milho");




    /*Sabores de Pizzas Salgadas:


Chocolate com Morango (chocolate, morangos fatiados)
Banana com Canela (banana em rodelas, canela)
Romeu e Julieta (goiabada, queijo mussarela)
Brigadeiro (brigadeiro, chocolate granulado)
Nutella com Morango (Nutella, morangos fatiados)
Coco com Leite Condensado (coco ralado, leite condensado)
Prestígio (chocolate, coco ralado)
Sensação (chocolate, morangos fatiados, raspas de chocolate)
Doce de Leite com Amendoim (doce de leite, amendoim triturado)
Maçã com Canela (maçã fatiada, canela)*/



        private final float valordoSabor;
        private final String nomedaPizza;
        SaborSalgada(float valordoSabor, String nomeDaPizza) {
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


