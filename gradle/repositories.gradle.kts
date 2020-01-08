repositories {
    mavenLocal()

    jcenter()
    mavenCentral()

    gradlePluginPortal()
}

// for snapshot resolution
configurations.all {
    with(resolutionStrategy) {
        cacheChangingModulesFor(0, TimeUnit.SECONDS)
        cacheDynamicVersionsFor(0, TimeUnit.SECONDS)
    }
}
