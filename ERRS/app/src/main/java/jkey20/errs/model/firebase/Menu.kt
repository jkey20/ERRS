package jkey20.errs.model.firebase

data class Menu(
    val name : String = "",
    val price : Int  = 0,
    val pay : String = "",
    val option : List<String> = listOf()
)
