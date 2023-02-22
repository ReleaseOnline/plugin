plugins {
    id("java")
}

group = "xyz.cm3k.ReleaseOnline"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    // Bukkit API - After compiling there was 2 files this one, and one just named "bukkit-1.0.1-R1.jar", this one seems to work fine though.
    implementation(files("lib/bukkit-1.0.1-R1.jar"))
}