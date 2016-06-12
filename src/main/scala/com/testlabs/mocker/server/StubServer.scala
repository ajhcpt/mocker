package com.testlabs.mocker.server

import org.glassfish.grizzly.http.server.HttpServer
import org.apache.mina.util.AvailablePortFinder
import org.glassfish.grizzly.PortRange

class StubServer {
  val httpServer = HttpServer.createSimpleServer(
    null,
    new PortRange(AvailablePortFinder.MIN_PORT_NUMBER, AvailablePortFinder.MAX_PORT_NUMBER)
  )

  def run(): Unit = {
    httpServer.getServerConfiguration.addHttpHandler(new MyHttpHandler, "/")
    httpServer.start()
  }

  def stop(): Unit = httpServer.shutdownNow()

  def getPort: Int = httpServer.getListeners.iterator().next().getPort
}
