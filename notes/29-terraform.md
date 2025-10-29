# Criação de Recursos com Terraform

## O que é?

O Terraform é uma ferramenta de Infraestrutura como Código (IaC) desenvolvida pela HashiCorp, que permite definir, provisionar e gerenciar infraestrutura em múltiplos provedores de nuvem — como a AWS — de forma declarativa.

## O que podemos fazer?
	•	Criar recursos: VPCs, instâncias EC2, buckets S3, funções Lambda, bancos de dados, etc.
	•	Automatizar a infraestrutura: Executar mudanças em grande escala com scripts reutilizáveis.
	•	Gerenciar dependências: Configurar relações entre recursos (ex.: um bucket S3 depende de uma IAM Role).
    •	Controlar versões: Aplicar, atualizar ou reverter mudanças com segurança.

## Recursos com Terraform

Imagine criar e atualizar recursos através de comandos, sem precisar acessar o painel da AWS.
Com o Terraform, é possível atualizar todos os recursos da nuvem, como EC2, bancos de dados e storages, ajustando capacidade e tamanho com facilidade.

Em resumo, o Terraform facilita a gestão automatizada, replicável e versionável da infraestrutura na AWS.

## Estrutura do Terraform

Um projeto básico contém:
	•	main.tf: arquivo principal que define os recursos;
	•	variables.tf: variáveis reutilizáveis do projeto;
	•	outputs.tf: informações de saída após o deploy;
	•	terraform.tfstate: arquivo que registra o estado da infraestrutura.

## Comandos principais:
terraform init   # inicializa o ambiente
terraform plan   # mostra o que será criado
terraform apply  # aplica as mudanças
terraform destroy # remove os recursos