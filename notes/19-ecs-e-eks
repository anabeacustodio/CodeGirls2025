# Amazon ECS e EKS – Serviços de Contêineres Gerenciados

Trabalham com **microservices** em contêineres, permitindo escalabilidade, integração e segurança.

## Amazon ECS (Elastic Container Service)
Serviço de **orquestração de contêineres** para executar, interromper e gerenciar contêineres em clusters.

### Características:
- **Gerenciamento simplificado:** automatiza o gerenciamento de clusters de contêineres.  
- **Escalabilidade automática:** ajusta contêineres com base na demanda.  
- **Integração:** fácil integração com IAM, VPC, CloudWatch, entre outros.  
- **Segurança:** políticas de acesso aplicáveis a contêineres.

### Use Case:
- Cada microserviço (catálogo, carrinho, pagamentos) em **um contêiner Docker**.  
- Definir tarefas e serviços no ECS, configurando **políticas de escalabilidade automática**.  
- Monitoramento via **CloudWatch**.

### Elastic Container Registry (ECR)
Serviço de **registro de contêineres gerenciado** para armazenar e implantar imagens Docker.

---

## Amazon EKS (Elastic Kubernetes Service)
Serviço gerenciado para **executar Kubernetes na AWS** sem necessidade de gerenciar o cluster.

### Características:
- **Orquestração Kubernetes**: escalonamento automático de aplicativos conforme demanda.  
- **Segurança e confiabilidade:** cluster gerenciado pela AWS.  
- Indicado para organizações que já usam ou desejam usar **Kubernetes**.

### ECS vs EKS
| Característica | ECS | EKS |
|----------------|-----|-----|
| Orquestração | AWS Proprietária | Kubernetes |
| Complexidade | Baixa a média | Alta, corporativo |
| Infraestrutura | Fargate (serverless) | Cluster K8s gerenciado |
| Casos de uso | Começo com contêineres | Arquiteturas complexas baseadas em microservices |