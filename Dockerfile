# Usando a imagem base do OpenJDK
FROM openjdk:21-slim

# Definindo um volume temporário
VOLUME /tmp

# Copiando o JAR da aplicação para o contêiner
COPY target/*.jar app.jar

# Expondo a porta que a aplicação usará
EXPOSE 8080

# Definindo o comando de entrada para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]
