FROM #{eclipse-temurin_17_alpine}#
LABEL version="#{Build.BuildNumber}#"  description=""
EXPOSE 8080
COPY CursoReactive.jar app.jar
COPY --chown=#{eclipse-temurin_17_alpine-user}#:#{eclipse-temurin_17_alpine-user}# io/opentelemetry/javaagent/opentelemetry-javaagent/1.26.0/opentelemetry-javaagent-1.26.0.jar opentelemetry-javaagent-1.26.0.jar
ENV JAVA_OPTS="-javaagent:./opentelemetry-javaagent-1.26.0.jar -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom"
USER #{eclipse-temurin_17_alpine-user}#
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar app.jar"]