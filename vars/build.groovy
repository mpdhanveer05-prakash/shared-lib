def call(String ProjectName, String ImageTag, String dockerHubUser){
  sh "docker run -t ${dockerHubUser}/${ProjectName}:${ProjectName} ."
}
