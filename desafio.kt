// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }
}

fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val conteudoEducacional1 = ConteudoEducacional("Funções em Kotlin", 80)
    val conteudoEducacional2 = ConteudoEducacional("Orientação a Objetos com Kotlin", 100)
    val conteudoEducacional3 = ConteudoEducacional("Lingagem de programação Kotlin")
    val conteudoEducacional4 = ConteudoEducacional("Tratamento de exceções em Kotlin", 40)

    val formacao = Formacao(
        "Desenvolvimento de sistemas com Kotlin",
        Nivel.INTERMEDIARIO,
        listOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3, conteudoEducacional4)
    )

    formacao.matricular(usuario1, usuario2)

    print(formacao)
}
