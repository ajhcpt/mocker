package com.testlabs.mocker.server

import scala.io.StdIn

object Main extends App {
  val stubServer = new StubServer()
  stubServer.run()
  println(stubServer.getPort)
  println("Press any key to stop server....")
  StdIn.readChar()
}
