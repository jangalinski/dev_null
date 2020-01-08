plugins {
  kotlin("jvm")
  application
}

dependencies {
  implementation(
    platform(project(":bom"))
  )

  implementation(kotlin("stdlib-jdk8"))

  // versions from "bom" platform
  implementation("io.github.microutils:kotlin-logging")
  implementation("ch.qos.logback:logback-classic")
}

application {
  mainClassName = "com.github.jangalinski.devnull.GradleBomUsageApplicationKt"
}
