plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  constraints {
    api("io.github.microutils:kotlin-logging:1.7.8")
  }
  api(
    platform("org.jetbrains.kotlin:kotlin-bom:${embeddedKotlinVersion}")
  )
}
