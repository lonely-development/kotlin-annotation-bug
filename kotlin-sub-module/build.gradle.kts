plugins {
     kotlin("jvm") version "1.6.10"
     application
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation(project(":java-sub-module"))
}

application {
    mainClass.set("MainKt")
}