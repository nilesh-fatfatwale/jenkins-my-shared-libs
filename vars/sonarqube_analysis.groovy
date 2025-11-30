def call(String SonarQubeAPI, String Projectname, String ProjectKey){
  withSonarQubeEnv("${Sonar}"){
      sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -Dsonar.java.binaries=. -X"
  }
}
