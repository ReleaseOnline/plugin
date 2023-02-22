plugins {
    id("java")
}

group = "xyz.cm3k"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("lib/1.0.1-R1.jar"))
}