plugins {
    `java-library`
    kotlin("jvm") version "1.9.20"
    `maven-publish`
}

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
