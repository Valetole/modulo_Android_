package cl.valentina.miapp.modelAjenoAlproyectoPracticas

class QuoteProvider {
    companion object {

        fun random():QuoteModel{
            val position =(0..6).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
                QuoteModel(
                        quote = "Nunca vuelvas a decir lo que piensas a alguien que no sea de la Familia",
                        author = "El padrino"
                ),
                QuoteModel(
                        quote = "Hakuna Matata",
                        author = "Rey León"
                ),
                QuoteModel(
                        quote = "Le haré una oferta que no podrá rechazar",
                        author = "El padrino"
                ),
                QuoteModel(
                        quote = "El conocimiento es poder",
                        author = "Francis Bacon"
                ),
                QuoteModel(
                        quote = "La peor lucha es la que no se hace",
                        author = "Karl Mark"
                ),
                QuoteModel(
                        quote = "Hace falta una vida para aprender a vivir",
                        author = "Séneca"
                ),
                QuoteModel(
                        quote = "Quienes creen que el dinero lo hace todo terminan haciendo todo por dinero",
                        author = "Voltaire"
                )
        )
    }
}