
plugins {
    application // <1>
}

repositories {
    mavenCentral() // <2>
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1") // <3>

    implementation("com.google.guava:guava:30.1.1-jre") // <4>
    //implementation("org.apache.kudu:kudu-client:1.15.0.7.2.12.2-5")
    implementation("org.apache.kudu:kudu-client:1.15.0")
}

application {
    mainClass.set("demo.App") // <5>
}

tasks.named<Test>("test") {
    useJUnitPlatform() // <6>
}

