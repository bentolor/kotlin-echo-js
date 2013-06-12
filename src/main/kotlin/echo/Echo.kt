package echo

import js.native
import js.noImpl
import js.dom.core.Element

public native object Echo {

    public open native class Client {

        public native var designMode: Boolean = js.noImpl

    }

    public native class FreeClient(app: Application, domElement: Element): Client() {
        /**
         * Initializes the FreeClient.
         * This method must be invoked before the client is initially used.
         */
        fun init() = js.noImpl
    }

    public native trait Application {
        /**
         * Performs application initialization operations.  This method should be provided by an application implementation
         * if required.  The superclass' <code>init()</code> method should always be invoked out of convention.
         * The <code>client</code> property will be available.
         */
        fun init() = js.noImpl

        /**
         * Performs application disposal/resource cleanup operations. This method should be provided by an application
         * implementation if required. The superclass' <code>dispose()</code> method should always be invoked out of convention.
         * The <code>client</code> property will be available.
         */
        fun dispose() = js.noImpl

        /**
         * Returns the active state of the application.
         *
         * @return the active state of the application, a value of
         *         true indicating the application is ready for user
         *         input, a value of false indicating otherwise
         * @type Boolean
         */
        fun isActive() = js.noImpl

    }

}