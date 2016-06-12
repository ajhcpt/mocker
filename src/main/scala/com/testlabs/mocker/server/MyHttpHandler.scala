package com.testlabs.mocker.server

import org.glassfish.grizzly.http.server.{HttpHandler, Request, Response}

class MyHttpHandler extends HttpHandler {
  override def service(request: Request, response: Response): Unit = {
    val myResponse = "hello world"
    response.setContentType("text/plain")
    response.setContentLength(myResponse.length)
    response.getWriter.write(myResponse)
  }
}
