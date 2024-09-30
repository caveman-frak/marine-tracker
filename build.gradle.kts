plugins {
    id("marine.application-conventions")
}

dependencies {
}

testing {
    suites {
        val integrationTest by getting(JvmTestSuite::class) {
            dependencies {
            }
        }
    }
}

application {
    mainClass.set("uk.co.bluegecko.marine.tracker.TrackerApplication")
}