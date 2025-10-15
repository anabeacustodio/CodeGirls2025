# DESAFIO DE ARQUITETURA - draw.io
Criar o desenho de nossa arquitetura com S3/Lambda/EC2/EBS

---

Esse tipo de arquitetura é um exemplo de integração de serviços AWS para fluxos de dados, onde cada componente tem uma função clara:
	•	S3 = armazenar
	•	Lambda = processar
	•	EC2 + EBS = rodar aplicação e manter persistência

## Explicação do Diagrama

### Fluxo da Arquitetura
	1.	Usuário
O ponto de entrada. Pode ser um cliente da aplicação (via web, mobile ou API) que envia arquivos, imagens, relatórios, etc.

	2.	Amazon S3 (Simple Storage Service)
Armazena os objetos enviados.
	•	Escalável e durável (99,999999999%).
	•	Pode acionar eventos (ex.: quando um novo arquivo é criado).

	3.	AWS Lambda
Função serverless executada sob demanda.
	•	É disparada automaticamente quando ocorre um evento no S3.
	•	Faz o processamento inicial (ex.: validar, converter formato, gerar metadados).
	•	Evita a necessidade de manter servidores ativos 24/7.

    4.	Amazon EC2 (Elastic Compute Cloud)
Uma instância de servidor virtual onde roda a aplicação principal ou banco de dados.
	•	Recebe os dados processados pela Lambda.
	•	Pode executar tarefas mais pesadas, que exigem maior controle sobre o sistema operacional e recursos.

	5.	Amazon EBS (Elastic Block Store)
Volume de armazenamento em bloco anexado à instância EC2.
	•	Guarda dados persistentes da aplicação.
	•	Diferente do S3, que é “object storage”, o EBS funciona como um HD/SSD do servidor.

	6.	VPC (Virtual Private Cloud) - Nuvem
A camada de rede que isola e protege a instância EC2 e o EBS, controlando tráfego e segurança

---

### Onde essa arquitetura pode ser aplicada

Esse padrão é bastante usado em cenários como:
	•	Processamento de arquivos
Usuários sobem documentos ou imagens → Lambda trata os arquivos (compressão, validação, transformação) → dados ficam armazenados ou tratados no EC2.
	•	ETL simplificado (Extract, Transform, Load)
Upload de relatórios em CSV no S3 → Lambda transforma em JSON/Parquet → salva em EC2 com EBS para análise posterior.
	•	Aplicações web escaláveis
Parte estática (imagens, vídeos, backups) vai para o S3 → processamento serverless com Lambda → backend rodando no EC2.
    •	Machine Learning/Data Science pipelines
Dados brutos no S3 → Lambda aciona modelos de pré-processamento → EC2 com GPU + EBS roda o treinamento do modelo.

---

### Vantagens do desenho
	•	Automação → Lambda dispara sem precisar de intervenção.
	•	Escalabilidade → S3 e Lambda crescem de forma elástica.
	•	Flexibilidade → EC2 dá controle total, enquanto Lambda cuida das partes event-driven.
	•	Custo otimizado → Lambda só cobra pelo uso; S3 é barato para armazenamento; EBS mantém persistência no EC2.