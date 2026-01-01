def call(String imageName, String imageTag, String context = '.', String dockerfile = 'Dockerfile') {
    sh """
        docker build \
        --no-cache \
        -f ${dockerfile} \
        -t ${imageName}:${imageTag} \
        ${context}
    """
}
