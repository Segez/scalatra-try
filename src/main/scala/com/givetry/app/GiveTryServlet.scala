package com.givetry.app

import org.scalatra._

class GiveTryServlet extends GiveatryStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
