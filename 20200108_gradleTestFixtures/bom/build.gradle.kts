plugins {
    `java-platform`
}

javaPlatform {

    allowDependencies()
}

dependencies {
    constraints {
       // api(platform("com.fasterxml.jackson:jackson-bom:2.9.8"))
//        api(
//                platform("org.jetbrains.kotlin:kotlin-bom:1.3.61")
//        )
        api("io.github.microutils:kotlin-logging:1.7.8")
    }
}
