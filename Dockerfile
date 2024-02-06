FROM openjdk:17
LABEL authors="Saleem"
EXPOSE 8080
ADD target/springboot-images-new.jar springboot-images-new.jar
ENTRYPOINT ["java","-jar", "/springboot-images-new.jar"]