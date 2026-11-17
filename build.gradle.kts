import goddrinksjava.*

plugins {
    id("java")
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