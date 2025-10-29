# CI/CD na AWS

CI/CD significa Continuous Integration (Integração Contínua) e Continuous Deployment (Implantação Contínua).

## Etapas típicas de um Pipeline CI/CD:
	1.	Commit do código → CodeCommit (GitHub)
	2.	Build e Testes → CodeBuild
	3.	Implantação → CodeDeploy (EC2 simulado ou Docker)
	4.	Monitoramento → CloudWatch

Benefícios: rapidez, consistência e menos erros manuais.

## Exemplo de cenário

Uma equipe de desenvolvimento precisa automatizar o deploy de uma aplicação Python Flask na AWS, garantindo controle de versão, build, testes, deploy automatizado e monitoramento.
Usam CodeCommit, CodeBuild, CodeDeploy e CloudWatch dentro do LocalStack para simular o ambiente AWS.