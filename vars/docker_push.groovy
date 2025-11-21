def call(String DockerHubUser , String ProjectName ,String ImageTag ){
withCredentials([usernamePassword(credentialsId: 'DockerHub',
usernameVariable: 'dockerHubUser',
passwordVariable: 'dockerHubPass' )]) {
sh 'docker login -u ${dockerHubUser} -p ${dockerHubPass}'
}
sh "docker push ${DockerHubUser}/${ProjectName}:${ImageTag}"
}
