// fun ist kurz für function, kann aber dennoch Spaß machen.
fun main() {

    // Variablen werden mit var deklariert. Konstanten deklariert man allerdings mit val.
    var input: String

    // Das Semikolon ist hier übrigens überall überflüssig ...
    while(true) {
        // ... außer man notiert mehrere Befehle in einer Zeile
        print("Eingabe: "); input = readln()

        // Auch Kontrollstrukturen können verkürzt notiert werden.
        if(input == "bye") break else println(input)
    }

}