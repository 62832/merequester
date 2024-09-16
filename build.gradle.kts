plugins {
    id("net.neoforged.moddev") version "2.0.30-beta"
    id("com.almostreliable.almostgradle") version "1.1.1"
}

almostgradle.setup {
    withSourcesJar = false
}

neoForge {
    runs {
        configureEach {
            systemProperties = mapOf(
                "guideDev.ae2guide.sources" to file("guidebook").absolutePath,
                "guideDev.ae2guide.sourcesNamespace" to almostgradle.modId
            )
        }

        create("guide") {
            client()
            systemProperty("guideDev.ae2guide.startupPage", "${almostgradle.modId}:${almostgradle.modId}.md")
        }
    }
}

repositories {
    maven("https://modmaven.dev")
    mavenLocal()
}

dependencies {
    implementation("appeng:appliedenergistics2:${almostgradle.getProperty("aeVersion")}")
}

tasks.withType<Jar> {
    from("guidebook") {
        into("assets/${almostgradle.modId}/ae2guide")
    }
}
