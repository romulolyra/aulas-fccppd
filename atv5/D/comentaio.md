A estratégia utilizada foi primeiro pegar no cliente a entrada do usuário para receber a quantidade desejada e enviar via getOutputStream() para o servidor que vai receber via getInputStream() e  ‘parsear’ o binário Scanner para inteiro e gerar a lista a partir da entrada. 

Em seguida, o servidor vai gerar a lista e mandar os valores individualmente para o cliente via getOutputStream().
