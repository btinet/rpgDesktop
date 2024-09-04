package engine

class TerminalEngine(name: String) {

    private val myVar = name.uppercase()

    fun getMyVar(): String
    {
        return this.myVar
    }

}