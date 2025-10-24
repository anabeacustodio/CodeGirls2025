# ☁️ Automação e DevOps na AWS

## ⚙️ Como automatizar tarefas

A automação na AWS ajuda a simplificar e acelerar tarefas dentro da nuvem, reduzindo o trabalho manual e o risco de erros humanos.
Ela permite criar processos inteligentes e repetíveis, desde o provisionamento da infraestrutura até a implantação e o monitoramento de aplicações.

## 🧩 Ferramentas para automação na AWS
	•	AWS CloudFormation: automação da criação e gerenciamento de infraestrutura como código (IaC) usando templates em JSON ou YAML.
    •	AWS Lambda: execução de código sem necessidade de servidores, ideal para responder a eventos automaticamente.
	•	AWS CodePipeline: automação do ciclo de vida de desenvolvimento, como integração contínua (CI) e entrega contínua (CD).
	•	AWS Systems Manager: automação de tarefas operacionais como execução de comandos, manutenção de patches e gerenciamento de instâncias.
	•	AWS Step Functions: criação de fluxos de trabalho automatizados para orquestrar diferentes serviços da AWS.

⸻

## 🧠 Formas de automação
	•	Infraestrutura como Código (IaC):
    Usar ferramentas como CloudFormation ou Terraform para criar e gerenciar recursos de forma consistente e versionada.
	•	Scripts e linha de comando:
	•	Com o AWS CLI, é possível escrever scripts para automatizar tarefas como iniciar instâncias ou criar buckets S3.
	•	Com os SDKs, podemos usar linguagens como Python (Boto3), JavaScript ou Java para interagir com a AWS e criar automações personalizadas.

⸻

## 🌟 Benefícios da automação
	•	Redução de erros: tarefas repetitivas são executadas de forma consistente.
	•	Eficiência: economiza tempo e simplifica operações manuais.
    •	Escalabilidade: permite automatizar desde pequenas tarefas até fluxos complexos e ambientes inteiros.

⸻

## 🛠️ Outras formas de automação
	•	Automatizando com Ansible: configuração e gerenciamento automatizado de servidores.
	•	Automatizando com Terraform: criação e versionamento de infraestrutura em múltiplas clouds.
	•	Usando PowerShell: scripts para codificação e concatenação de arquivos, além de automação em ambientes híbridos.
   
⸻

## ⚡️ Executando tarefas com Lambda Function e S3

### 🗂️ Amazon S3

O Amazon S3 (Simple Storage Service) é o serviço de armazenamento em nuvem da AWS. Ele permite armazenar e acessar dados de forma segura e escalável, ideal para backup, hospedagem de arquivos e integração com outros serviços.

Principais vantagens:
	•	Durabilidade: dados replicados em múltiplas zonas de disponibilidade.
	•	Disponibilidade: acesso contínuo e confiável.
	•	Escalabilidade: ajuste automático da capacidade de armazenamento.
	•	Segurança: criptografia, controle de acesso e auditoria com CloudTrail.

### 🧮 AWS Lambda

O AWS Lambda é um serviço de computação serverless, que executa código em resposta a eventos, sem precisar gerenciar servidores.
Basta fazer o upload do código que o Lambda executa automaticamente e escala conforme a demanda.

Principais vantagens:
	•	Execução sob demanda: o código roda apenas quando necessário.
	•	Escalabilidade automática: adapta-se ao número de eventos.
	•	Custo eficiente: paga apenas pelo tempo de execução.
	•	Integração com outros serviços AWS: conecta-se com S3, DynamoDB, API Gateway, entre outros.

⸻

## 🔁 Integração Lambda + S3 (Exemplo prático)
    1.	O usuário faz upload de um arquivo (CSV ou JSON) em um bucket S3.
	2.	O evento no S3 dispara uma função Lambda escrita em Python.
	3.	A função Lambda processa o conteúdo do arquivo e grava os dados em uma tabela do DynamoDB.
	4.	Outra função Lambda consulta o DynamoDB e expõe os dados por meio de uma API Gateway.

💡 Esse fluxo mostra o poder da automação serverless, integrando serviços sem precisar de servidores dedicados.

⸻

## 🧰 AWS Local com LocalStack

O LocalStack é um projeto open-source criado pela Atlantis Software em 2016 (e tornado público em 2017).
Ele permite simular localmente os serviços da AWS, facilitando o desenvolvimento e os testes sem custos e sem precisar acessar a nuvem real.

Principais vantagens:
	•	Simulação de ambientes AWS localmente.
	•	Redução de custos com testes e desenvolvimento.
	•	Ideal para testes automatizados e pipelines CI/CD.

Serviços suportados (entre outros):
Lambda, API Gateway, S3, DynamoDB, SNS, SQS, CloudFormation.

### 🔗 Para criar nosso ambiente local:
-> acesse: https://docs.localstack.cloud/overview