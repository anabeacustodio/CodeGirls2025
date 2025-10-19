# AWS CloudFormation  

## 📘 Visão Geral  
O **AWS CloudFormation** automatiza a criação de recursos na AWS através de **templates** escritos em **JSON** ou **YAML**.  
Ele permite criar, modificar e excluir ambientes inteiros de forma padronizada e reproduzível.  

Cada **stack** representa um conjunto de recursos — como **EC2**, **RDS**, **S3**, entre outros.  
Pagamos apenas pelos recursos criados, não pelo uso do CloudFormation em si.  

## ⚙️ Componentes Principais  
- **Template**: arquivo JSON/YAML com a definição dos recursos.  
- **Stack**: conjunto de recursos criados a partir de um template.  
- **Policy**: define comportamento na exclusão ou retenção de dados.  

## 🧠 Conceitos-Chave
•	AWS::S3::Bucket → Cria buckets S3 para registros e backups.
•	DeletionPolicy: Retain → Mantém os dados mesmo após exclusão da stack.
•	LifecycleConfiguration → Define regras de ciclo de vida, como expiração de arquivos após 15 ou 30 dias.

## 💡 Benefícios
•	Facilita a automação e reprodutibilidade de ambientes.
•	Reduz erros humanos e acelera implantações.
•	Permite versionar e auditar infraestrutura como código (IaC).