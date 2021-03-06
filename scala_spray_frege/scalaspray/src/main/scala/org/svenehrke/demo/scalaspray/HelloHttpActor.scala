package org.svenehrke.demo.scalaspray

import akka.actor.Actor
import spray.routing._
import spray.http._
import MediaTypes._

import fj.Unit
import org.svenehrke.fregedemos.FregeFunctions

import fj.Unit.unit


trait HelloHttpService extends HttpService {

  val s: String = FregeFunctions.java2Frege(5)

  val helloRoute =
    // http://localhost:8080/sayhelloto?name=sven
    path("sayhelloto") {
      get {
        parameters('name) { (name) =>
          respondWithMediaType(`text/html`) {
            // XML is marshalled to 'text/xml' by default, so we simply override here
            complete(s"""
              <html>
                <body>
                  <h1>Hello $name from <i>spray-routing $s</i>
                    on
                    <i>spray-can</i>
                    !</h1>
                </body>
              </html>
            """)
          }
        }
      }
  }
}

class HelloHttpActor extends Actor with HelloHttpService {
  def actorRefFactory = context
  def receive = runRoute(helloRoute)
}
