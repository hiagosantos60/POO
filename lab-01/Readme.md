# Sistema de controle de versão 

## Configuração inicial para uso do Git 
### Configuração inicial do git local

Para ter controle do histórico e da versão em que o software se encontra é necessário configurar a sua identificação para registro na história de commits do git.

- Configuração inicial de nome de usuário
``` bash 
git config −−global user.name "Seu Nome Completo"
```

- Configuração inicial de email 
``` bash 
git config −−global user.email "seu−email@example.com"
```

- Adicionar um comando chamado tree para o log de commits
``` bash 
git config −−global alias.tree "log −−oneline −−graph −−decorate −−all"
```

### Criando Personal Access Token (PAT) no GitHub
O GitHub não aceita autenticações com o método de senha simples, portanto, você precisa de um token de acesso gerado no próprio GitHub para acesso aos seus diretórios. `Importante notar que se caso o token for repassado para outras pessoas e estiver acessível por algum arquivo, o usuário terá total acesso sobre todos os seus diretórios e poderá fazer alterações.`

#### Passo a passo para criação de PAT no GitHub
>Após a criação do token o GitHub irá mostrar o token apenas uma vez, não sendo possível visualizá-lo em outro momento. Mas, você pode regenerar o token seguindo o mesmo caminho indicado abaixo

- Acesse sua conta no GitHub
- Clique na sua foto e selecione a opção de configuração (Settings)
- Na aba lateral esquerda, vá até a opção Configurações do desenvolvedor (Developer Settings)
- Selecione a opção: Personal Access Tokes > Tokens (classic)
- Logo acima terá a opção de gerar um novo token (Generate New Token) 
- Se caso já existir um token e apenas quer acessá-lo, você deve selecionar o token e solicitar a regeneração do token

### Salvar em cache as credenciais do PAT 

## Qual a diferença entre Merge e Rebase? 

