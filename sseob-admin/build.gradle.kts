plugins {
  id("java")
  id("java-library")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
//  implementation(project(":sseob-domain")) // admin module 만 sseob-domain 모듈 참조하여 사용 가능.
  api(project(":sseob-domain")) // admin module 을 참조하는 모든 모듈 또한 sseob-domain 모듈 참조하여 사용 가능.
  testImplementation(platform("org.junit:junit-bom:5.9.1"))
  testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
  useJUnitPlatform()
}