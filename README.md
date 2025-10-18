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

## 🎯 Objetivo

Este repositório reúne minhas anotações, práticas e reflexões durante os estudos sobre AWS no bootcamp Code Girls 2025 do Santander em parceria com a DIO. O objetivo é consolidar conhecimentos em infraestrutura em nuvem e serviços relacionados, servindo como material de apoio para revisões futuras e aplicações práticas.

## 🗂️ Estrutura do Repositório

- `desafio-instancias-EC2/`: desenho de arquitetura com S3/Lambda/EC2/EBS, com draw.io
- `desafio-step-functions/`: explorando workflows automatizados com AWS Step Functions
- `desafios-de-codigo/`: cálculos com liguagens de programação distintas
- `notes/`: anotações e resumos das aulas
- `website-formacao-aws/`: modelo de website pessoal
- `README.md`: documentação completa dos estudos

## 📖 Conteúdos Estudados

-⁠ ⁠História da AWS.
-⁠ ⁠Infraestrutura global, modelo de negócio e conceitos fundamentais.
-⁠ ⁠Boas práticas de otimização de custos na nuvem.
- IAM: usuários, grupos, políticas e controle de acesso  
- EC2: criação, configuração e segurança de instâncias  
- EBS: volumes, snapshots e recuperação  
- S3: armazenamento de objetos, políticas de acesso e classes de armazenamento  
- VPC, Subnets, Route Tables e Security Groups  
- Route 53 e CloudFront: DNS e entrega global de conteúdo  
- RDS e DynamoDB: bancos de dados relacional e NoSQL  
- Lambda, ECS, EKS, SNS, SQS  
- Step Functions: orquestração e automação de fluxos serverless

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

Este repositório vai continuar sendo atualizado conforme avanço no bootcamp, adicionando novos testes, prints e insights.  

✨ Desenvolvido por Ana Beatriz Custódio
Bootcamp Code Girls 2025 — Santander / DIO
