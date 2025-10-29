# Explorando Ferramentas da AWS para DevOps

## Dores e motivações para migração à Cloud

Empresas com infraestrutura local enfrentam desafios como custos altos, baixa escalabilidade e falta de flexibilidade.
Migrar para a nuvem permite reduzir custos e aumentar eficiência.

⸻

## Infraestrutura como Código (IaC)

É o processo de gerenciar infraestrutura aplicando as boas práticas do desenvolvimento de software DevOps.
Inspirada pelo conceito de CI/CD, IaC traz automação e controle de versão à infraestrutura.

## Principais Ferramentas:

🔹 Ansible
	•	O que é: Ferramenta de automação para gerenciar múltiplas máquinas via playbooks (YAML).
	•	Ideal para: Gerenciamento de configurações.
	•	Recurso extra: Ansible Galaxy – repositório de playbooks prontos.

🔹 Terraform
	•	O que é: Ferramenta para construir, modificar e versionar infraestruturas em múltiplas clouds.
	•	Por que usar: Excelente para provisionar recursos, além de ser portátil entre provedores.

🔹 AWS CloudFormation
    •	O que é: Serviço nativo da AWS para modelar e gerenciar recursos com YAML ou JSON.
	•	Vantagens:
	•	Evita erros humanos e automatiza o provisionamento
	•	Permite versionamento e reutilização de modelos
	•	Integra-se com praticamente todos os serviços AWS
	•	Cria ambientes rapidamente e com consistência

O CloudFormation é essencial para alcançar excelência operacional, com ganhos de agilidade, qualidade e reutilização.

---

## Em resumo:

O DevOps e as ferramentas de IaC (como Terraform, Ansible e CloudFormation) trabalham juntos para automatizar processos, reduzir erros e garantir entregas contínuas e seguras na AWS.
