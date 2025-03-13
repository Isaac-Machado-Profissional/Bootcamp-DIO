plugins {
    id("java")
    checkstyle //plugin verificação de código, documentação de checkstyles
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"
val mapstructVersion = "1.5.5.Final"
val lombokVersion = "1.18.30"
val lombokMapstructBinding = "0.2.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.mapstruct:mapstruct:$mapstructVersion")
    implementation("org.projectlombok:lombok-mapstruct-binding:$lombokMapstructBinding")
    compileOnly("org.projectlombok:lombok:$lombokVersion")


    // Precisamos declarar as implementacoes como annotation, no maven eram plugins, no gradle eles vem padrao

    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:$lombokMapstructBinding")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")


}

// Configuração seguinte do checkstyle

tasks.withType<Checkstyle>().configureEach {
    reports {
        xml.required = true
        html.required = true
    }
}

tasks.checkstyleMain {
    source = fileTree("src/main/java") // Pedir pra ele verificar pra gente
}
