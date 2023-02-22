plugins {
    id("java")
}

group = "xyz.cm3k.ReleaseOnline"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    // Bukkit API
    implementation(files("lib/bukkit-1.0.1-R1.jar"))
}