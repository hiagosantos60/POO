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
## Qual a diferença entre Merge e Rebase? 
