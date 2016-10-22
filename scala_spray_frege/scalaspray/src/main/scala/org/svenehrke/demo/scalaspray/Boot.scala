package org.svenehrke.demo.scalaspray

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import spray.can.Http
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.duration._

object Boot extends App {

  implicit val system = ActorSystem("hello-actorsystem")

  val helloHttpActor = system.actorOf(Props[HelloHttpActor], "hello-actor")
  implicit val timeout = Timeout(5.seconds)
  IO(Http) ? Http.Bind(helloHttpActor, interface = "localhost", port = 8080)

}
