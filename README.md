plugins {
    id 'org.jetbrains.kotlin.jvm' version '1.9.20'
    id 'maven-publish'
}

repositories {
    mavenCentral()
}

publishing {
    publications {
        maven(MavenPublication) {
            from components.java
        }
    }
}
