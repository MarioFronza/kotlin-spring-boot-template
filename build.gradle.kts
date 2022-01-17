import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.org.template.Dependencies

plugins {
    id("org.springframework.boot") version "2.5.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("io.gitlab.arturbosch.detekt").version("1.18.1")
    kotlin("jvm") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"
    kotlin("plugin.jpa") version "1.5.21"
}

group = "com.github"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

detekt {
    autoCorrect = true
}

dependencies {
    implementation(Dependencies.springBootDataJpa)
    implementation(Dependencies.springBootSecurity)
    implementation(Dependencies.springBootWeb)
    implementation(Dependencies.jackson)
    implementation(Dependencies.kotlinReflect)
    implementation(Dependencies.kotlinJdk8)
    implementation(Dependencies.jjwt)
    implementation(Dependencies.postgresql)

    testImplementation(Dependencies.springBootTest)
    testImplementation(Dependencies.springSecurityTest)

    detektPlugins(Dependencies.detekt)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
