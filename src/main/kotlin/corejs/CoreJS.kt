package corejs

import js.native
import js.noImpl

public native object Core {

    public native val Web: CoreWeb = js.noImpl

    public native trait CoreWeb {
        fun init() : Unit
    }

}