# 🧠 Automatização de Tarefas com AWS Lambda e S3

## ⚙️ Conceitos Estudados

AWS Lambda:
	•	Serviço de computação serverless que executa código em resposta a eventos.
	•	Permite rodar funções sem gerenciar servidores, pagando apenas pelo tempo de execução.
	•	Pode ser ativado por diversos gatilhos (S3, API Gateway, CloudWatch, entre outros).

Amazon S3 (Simple Storage Service):
	•	Serviço de armazenamento de objetos altamente escalável e seguro.
	•	Usado para armazenar arquivos, logs, backups e dados processados por outras aplicações.
	•	Pode acionar funções Lambda automaticamente quando arquivos são criados, alterados ou removidos.

## 🔄 Integração Lambda + S3
	•	Evento de gatilho: Quando um novo arquivo é enviado (upload) para um bucket do S3, esse evento aciona a função Lambda automaticamente.
	•	Execução automática: A função pode, por exemplo, converter, renomear ou mover o arquivo, registrar logs ou enviar notificações.
	•	Vantagem: Nenhum servidor precisa ser mantido — toda a execução é sob demanda, com alta escalabilidade e baixo custo.


##💡 Insights e Aprendizados
	•	Compreendi a importância da automação serverless para reduzir custos e aumentar a eficiência operacional.
    •	Aprendi que o uso combinado de Lambda e S3 é ideal para processar dados em tempo real, gerar logs, monitorar uploads e executar pipelines automatizados.
	•	Vi na prática como o IAM (controle de permissões) é essencial para permitir que a função Lambda acesse o bucket S3 com segurança.