import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
	id("org.springframework.boot") version "2.7.2"
	id("io.spring.dependency-management") version "1.0.12.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

group = "pl.marcinrosol"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	// https://mvnrepository.com/artifact/org.liquibase/liquibase-core
	implementation("org.liquibase:liquibase-core:4.15.0")
	implementation("org.jdbi:jdbi3-core:3.32.0")
	implementation("org.jdbi:jdbi3-postgres:3.32.0")
	implementation("org.jdbi:jdbi3-sqlobject:3.32.0")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.3")
	implementation("org.postgresql:postgresql:42.4.2")
	implementation("commons-codec:commons-codec:1.15")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
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
