plugins {
  kotlin("jvm")
  `java-test-fixtures`
}

dependencies {
  implementation(
    platform(project(":bom"))
  )

  implementation(kotlin("stdlib-jdk8"))

}
