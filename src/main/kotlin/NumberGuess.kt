package numberguess

import js.dom.html.window
import corejs.Core
import echo.Echo

public class NumberGuess : Echo.Application {

}

fun init() {
    Core.Web.init();
    val numberGuess = NumberGuess()
    val targetDiv = window.document.getElementById("rootArea")
    if (targetDiv != null) {
        val client = Echo.FreeClient(numberGuess, targetDiv)
        client.init()
    }
}
