object Test extends dotty.runtime.LegacyApp {

    private def f = new T { val state = State.A }

    private object State extends Enumeration {
        val A, B = Value
    }

    f
}

trait T {
}
