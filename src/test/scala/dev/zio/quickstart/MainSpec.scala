package dev.zio.quickstart

import zio.test._

object MainSpec extends ZIOSpecDefault {
  override def spec = suite("main") {
    test("it works") {
      assertTrue(1 == 1)
    }
  }

}
