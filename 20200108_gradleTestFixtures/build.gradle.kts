plugins {
    base
    idea

    kotlin("jvm") version embeddedKotlinVersion apply false
}

allprojects {
  group = "com.github.jangalinski.devnull"

  apply {
    from("${rootProject.rootDir}/gradle/repositories.gradle.kts")
  }
}


dependencies {
    subprojects.forEach {
        archives(it)
    }
}
