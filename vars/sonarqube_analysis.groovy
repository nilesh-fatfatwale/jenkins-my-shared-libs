def call(String SonarQubeAPI, String Projectname, String ProjectKey){
withSonarQubeEnv(SonarQubeAPI) {
  sh """
      ${env.SONAR_HOME}/bin/sonar-scanner \
        -Dsonar.projectName=${projectName} \
        -Dsonar.projectKey=${projectKey} \
        -Dsonar.java.binaries=. -X
    """
  }
}
