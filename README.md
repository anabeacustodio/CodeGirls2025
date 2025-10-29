<h1 align="center">CodeGirls2025: Formação AWS Cloud Foundations</h1>
<p align="center">
  <img src="https://convergenciadigital.com.br/wp-content/uploads/2023/05/cloud.jpg" alt="Capa do Projeto" width="600"/>
</p>

## 📚 Índice

- [Objetivo](#objetivo)
- [Estrutura do Repositório](#estrutura-do-repositório)
- [Conteúdos Estudados](#conteudos-estudados)
- [Desafio - Intâncias EC2](#desafio-intancias-ec2)
- [Desafio - AWS Step Functions](#desafio-aws-step-functions)
- [Desafio - Stack com AWS CloudFormation](#desafio-stack-cloudformation)
- [Desafio - Automatização com AWS CloudFormation](#desafio-automatizacao-cloudformation)
- [Desafio - Tarefas Automatizadas](#desafio-tarefas-automatizadas)

## 🎯 Objetivo

Este repositório reúne minhas anotações, práticas e reflexões durante os estudos sobre AWS no bootcamp Code Girls 2025 do Santander em parceria com a DIO. O objetivo é consolidar conhecimentos em infraestrutura em nuvem e serviços relacionados, servindo como material de apoio para revisões futuras e aplicações práticas.

## 🗂️ Estrutura do Repositório

- `desafio-automatizacao-cloudFormation/`: implementando uma infraestrutura automatizada com AWS CLoudFormation
- `desafio-instancias-EC2/`: desenho de arquitetura com S3/Lambda/EC2/EBS, com draw.io
- `desafio-stack-cloudFormation/`: implementando minha primeira Stack com AWS CloudFormation
- `desafio-step-functions/`: explorando workflows automatizados com AWS Step Functions
- `desafio-tarefas-automatizadas/`: 
- `desafios-de-codigo/`: recursos da AWS; serviços de armazenamento e CDN; cálculo salarial
- `notes/`: anotações e resumos das aulas
- `website-formacao-aws/`: modelo de website pessoal
- `LICENSE/`: MIT
- `README.md`: documentação completa dos estudos

## 📖 Conteúdos Estudados

- ⁠História da AWS.
- ⁠Infraestrutura global, modelo de negócio e conceitos fundamentais.
- ⁠Boas práticas de otimização de custos na nuvem.
- IAM: usuários, grupos, políticas e controle de acesso  
- EC2: criação, configuração e segurança de instâncias  
- EBS: volumes, snapshots e recuperação  
- S3: armazenamento de objetos, políticas de acesso e classes de armazenamento  
- VPC, Subnets, Route Tables e Security Groups  
- Route 53 e CloudFront: DNS e entrega global de conteúdo  
- RDS e DynamoDB: bancos de dados relacional e NoSQL  
- Lambda, ECS, EKS, SNS, SQS  
- Step Functions: orquestração e automação de fluxos serverless
- Gerenciamento e governança aws: CloudWatch, CloudTrail e CloudFormation
- AWS SDK, AWS CLI, AWS CodeDeploy
- Automação e DevOps: Terraform, Ansible, LocalStack, CI/CD

---

## 🚀 Desafio — Instâncias EC2

Pasta: `desafio-instancias-EC2`

Este desafio teve como objetivo **simular uma arquitetura na AWS** utilizando EC2 e demais componentes de rede.  
Foi desenvolvido um **diagrama no Draw.io** representando a estrutura de uma aplicação web hospedada na nuvem com instâncias EC2, balanceador de carga e segurança configurada com VPC, subnets e grupos de segurança.

**Objetivos:**
- Criar uma arquitetura escalável e segura  
- Entender o papel de cada serviço dentro da infraestrutura  
- Representar visualmente o fluxo de comunicação entre os componentes  

**Arquivos:**
- `desafioDiagrama.drawio.png`
- `desafio-arquitetura.md` explicativo dentro da pasta do desafio  

---

## ⚙️ Desafio — AWS Step Functions

Pasta: `desafio-step-functions`

Este desafio consistiu em **automatizar um processo financeiro** utilizando AWS Step Functions, Lambda e SNS.

**Cenário criado:**
O sistema importa diariamente um arquivo `.csv` com o retorno bancário de boletos.  
O Lambda processa os dados, identifica boletos pagos, novos e com erro de comunicação, e o Step Functions coordena o fluxo, enviando notificações via SNS.

**Objetivos:**
- Aplicar automação de processos com Step Functions
- Integrar Lambda para leitura e análise de dados
-	Usar SNS para notificações automatizadas
-	Documentar o fluxo técnico de forma clara e organizada

**Arquivos:**
- `resolucao.md` resolução do desafio proposto
- `step-functions.md` anotações sobre o conceito

--- 

## 🧩 Desafio: AWS CloudFormation

Pasta: `desafio-stack-cloudFormation`

O desafio teve como foco criar uma **Stack automatizada** para provisionar recursos na AWS a partir de templates.
Foi utilizado o formato YAML, por sua legibilidade e suporte a comentários, para definir recursos como buckets S3 com políticas de retenção, acesso privado e ciclo de vida automatizado.

**Objetivo:** 
Implementar a minha primeira Stack utilizando AWS CloudFormation.

**Arquivos:**
- `aws-cloudFormation.md` minhas anotações
- `resolucao.md` resolução do desafio proposto

---

## 🚀 Desafio – AWS CloudFormation: Infraestrutura Automatizada

Pasta: `desafio-automatizacao-cloudFormartion`

Neste desafio, foi implementada uma **infraestrutura automatizada com AWS CloudFormation**, utilizando o **sample template LAMP Stack**.  

**Objetivo:**
Compreender como o CloudFormation automatiza a criação e configuração de recursos AWS, permitindo aplicar o conceito de **Infraestrutura como Código (IaC)** com eficiência, segurança e padronização.

**Arquivos:**
- `aws-cloudFormation-automatizacao.md` minhas anotações
- `resolucao.md` resolução do desafio proposto

---

## 🌐 Desafio: Tarefas Automatizadas com Lambda Function e S3

Pasta: `desafio-tarefas-automatizadas`

Durante a prática, foi demonstrado como o AWS Lambda executa funções sem a necessidade de gerenciar servidores, respondendo automaticamente a eventos do Amazon S3, como o upload de arquivos, exclusão ou atualização.

**Objetivo:**
Este laboratório teve como objetivo consolidar os conhecimentos em tarefas automatizadas com AWS Lambda e S3, explorando como ambos os serviços podem trabalhar juntos para otimizar fluxos de trabalho e reduzir tarefas manuais.

**Cenário criado:**
•	Um bucket S3 armazena planilhas de controle de despesas.
•	Sempre que uma nova planilha é enviada ao bucket, uma função Lambda é acionada automaticamente.
•	Essa função faz a leitura do arquivo, valida os dados e gera um relatório de acompanhamento financeiro, que pode ser enviado por e-mail ou armazenado em outro bucket.

**Arquivos:**
- `lambda.e.s3.md` minhas anotações
- `resolucao.md` resolução do desafio proposto

---

Este repositório vai continuar sendo atualizado conforme avanço no bootcamp, adicionando novos testes, prints e insights.  

✨ Desenvolvido por Ana Beatriz Custódio
Bootcamp Code Girls 2025 — Santander / DIO