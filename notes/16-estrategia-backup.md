# Estratégia de Backup e Recuperação de Dados

## 💡 Conceito
O **backup de dados** é a **cópia dos dados do sistema, configuração ou aplicativos** armazenada separadamente do original.  
Ele é essencial para proteger informações contra **desastres naturais, erros humanos, falhas de sistema ou eventos de segurança**, garantindo **continuidade dos negócios e conformidade regulatória**.

---

## 🛠️ Definindo a estratégia de backup
Uma boa estratégia envolve várias etapas:

### 1️⃣ Avaliação e Planejamento
- **Identificar dados críticos**: determine quais dados precisam ser protegidos.  
- **Definir RPO e RTO**:  
  - **RPO (Recovery Point Objective)**: margem máxima de dados que pode ser perdida entre ciclos de backup.  
  - **RTO (Recovery Time Objective)**: tempo máximo que o sistema pode ficar indisponível antes da recuperação completa.

### 2️⃣ Seleção de serviços AWS
- **Amazon S3**: armazenar backups de forma escalável e segura.  
- **AWS Backup**: gerenciar e automatizar backups dos serviços AWS.

### 3️⃣ Implementação da estratégia
- **Backups regulares**: automáticos diários para dados críticos; incrementais para otimizar espaço.  
- **Cópias em múltiplas regiões**: usar replicação entre regiões do S3.  
- **Automação e monitoramento**: AWS Lambda e CloudWatch para verificar integridade dos backups.  
- **RDS**: backups automatizados + snapshots manuais para restauração pontual.  
- **DynamoDB**: backups sob demanda e contínuos (PITR).

### 4️⃣ Recuperação e teste
- Documente planos detalhados para diferentes cenários de falha.  
- Realize **testes regulares de recuperação** para garantir restauração eficaz.  
- **Backup Drill**: simulação de desastres para validar a estratégia.

### 5️⃣ Segurança e conformidade
- **Criptografia**: TLS em trânsito e Server-Side Encryption ou RDS Encryption em repouso.  
- **Controle de acesso**: políticas do IAM para restringir acesso apenas a usuários autorizados.  
- **Registros e auditoria**: AWS CloudTrail para monitoramento e conformidade.

### 6️⃣ Custo e otimização
- **Gestão de custos**: AWS Cost Explorer para análise e otimização de gastos.  
- **Ciclo de vida dos dados**: mover dados entre diferentes classes de armazenamento para reduzir custos.