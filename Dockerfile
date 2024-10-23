# Usando a imagem base do OpenJDK
FROM openjdk:23-slim

# Definindo o diretório de trabalho
WORKDIR /app

# Copiando o JAR da aplicação para o contêiner
COPY target/*.jar app.jar

# Expondo a porta que a aplicação usará
EXPOSE 8080

# Definindo o comando de entrada para iniciar a aplicação
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar" ]