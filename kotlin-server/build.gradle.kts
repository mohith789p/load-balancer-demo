plugins { 
    kotlin("jvm") version "1.9.23"
    application 
    id("com.github.johnrengelman.shadow") version "8.1.1"
}
repositories { mavenCentral() }
dependencies {
    implementation("io.ktor:ktor-server-netty-jvm:2.3.10")
    implementation("ch.qos.logback:logback-classic:1.5.3")
}
application { mainClass.set("com.example.ApplicationKt") }