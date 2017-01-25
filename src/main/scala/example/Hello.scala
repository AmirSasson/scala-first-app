package example

object Hello extends Greeting with App {
  println(greeting)
  print("yo first app")
}

trait Greeting {
  lazy val greeting: String = "hello"
}
