import spray.json._
import fommil.sjs._

package domain {
  case class Foo(bar: JsValue)
}

package protocol {
  object JsonProtocol extends DefaultJsonProtocol with FamilyFormats
}

package test {
  object SiblingPackagesTest {
    import domain._
    import protocol.JsonProtocol._
    val foo: Foo = ???
    foo.toJson
  }
}

