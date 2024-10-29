# Usa uma imagem base do OpenJDK
FROM openjdk:23-slim

# Define o diretório temporário
VOLUME /tmp

# Copia o jar do target para dentro da imagem
COPY target/*.jar app.jar

# Define o comando de entrada
ENTRYPOINT ["java", "-jar", "/app.jar"]
