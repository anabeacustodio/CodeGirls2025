# AWS CloudFormation – Infraestrutura Automatizada

## ☁️ O que é o AWS CloudFormation

O **AWS CloudFormation** é um serviço que facilita a **modelagem, automação e configuração de recursos** na AWS.  
Por meio dele, podemos criar modelos (templates) que descrevem os recursos necessários — como **instâncias EC2, bancos de dados RDS, buckets S3, VPCs e Security Groups** — automatizando seu provisionamento e configuração.

Com o CloudFormation, eliminamos o trabalho manual de configurar cada recurso, permitindo **foco no desenvolvimento e na gestão de aplicações**.

---

## ⚙️ O que é uma infraestrutura automatizada

O AWS CloudFormation permite **automatizar a criação e configuração completa de uma infraestrutura na nuvem** por meio de templates escritos em **YAML ou JSON**.  
Esses templates definem todos os recursos necessários (EC2, RDS, Security Groups, etc.), eliminando a necessidade de configuração manual.

---

## ⚙️ Benefícios do CloudFormation

- **Automação:** Cria, configura e gerencia recursos de forma rápida, confiável e repetível.  
- **Consistência e Padronização:** Permite usar modelos padrão para replicar infraestruturas idênticas em diferentes ambientes.  
- **Economia de Custos:** Reduz custos de implantação ao reutilizar templates existentes.  
- **Segurança:** Garante que todos os recursos sejam configurados seguindo políticas e boas práticas de segurança.

---

## 🧾 Formatos de Template: JSON e YAML

O CloudFormation suporta **JSON** e **YAML** para a criação dos templates de infraestrutura.

### 🧩 JSON
Formato tradicional e originalmente suportado.  
A estrutura é baseada em **pares chave-valor**, sendo mais verbosa e técnica.

### 🪶 YAML
Formato preferido por muitos devido à **simplicidade e legibilidade**.  
Segue a mesma lógica do JSON, mas com uma sintaxe mais enxuta e organizada.

---

## 🧩 CloudFormation vs Terraform

| Ferramenta | Provedor | Linguagem | Características |
|-------------|-----------|------------|-----------------|
| **CloudFormation** | Exclusivo da AWS | YAML / JSON | Totalmente integrado ao ecossistema AWS |
| **Terraform** | Multi-cloud (AWS, Azure, GCP etc.) | HCL (HashiCorp Language) | Independente de provedor, mais flexível para ambientes híbridos |