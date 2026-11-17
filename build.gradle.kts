import goddrinksjava.*

plugins {
    id("java")
    id("application")
}

group = "goddrinksjava"
version = "12.6.2016"

World {
    addThing("MavenCentral")
    startSimulation()
}

Thing {
    addAttribute(me.love.jaylib)
}

application {
    mainClass = "goddrinksjava.GodDrinksJava"
}

tasks.withType<JavaExec> {
    jvmArgs("--enable-native-access=ALL-UNNAMED")
}