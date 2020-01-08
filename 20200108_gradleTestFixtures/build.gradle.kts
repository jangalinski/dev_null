plugins {
    base
    idea

    kotlin("jvm") version "1.3.61" apply false
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}
