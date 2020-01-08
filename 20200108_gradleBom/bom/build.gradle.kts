plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  constraints {
    api("io.github.microutils:kotlin-logging:1.7.8")
    api("ch.qos.logback:logback-classic:1.2.3")
  }

  api(
    platform("org.jetbrains.kotlin:kotlin-bom:${embeddedKotlinVersion}")
  )
}
