# AWS CloudTrail  

## 📘 Visão Geral  
O **AWS CloudTrail** é um serviço voltado para **auditoria, governança e conformidade**.  
Ele registra todas as ações realizadas por usuários, funções ou serviços dentro da conta AWS.  

Esses registros são chamados de **eventos**, e incluem ações executadas via:
- Console AWS  
- AWS CLI (Command Line Interface)  
- APIs  

## ⚙️ Funcionalidades  
- Registro detalhado de **quem** acessou **qual** recurso, **quando** e **o que** foi alterado.  
- Integração com o **CloudWatch Events** para acionar alertas com base em eventos.  
- Criação de **trilhas (Trails)** para monitorar regiões e serviços específicos.  

## 🧩 Casos de Uso  
**1. Auditoria de segurança**  
Rastreia logins, alterações em políticas IAM e criação/exclusão de recursos.  

**2. Integração com CloudWatch**  
Envia eventos para o CloudWatch e permite a automação de respostas via Lambda.  

**3. Conformidade e Governança**  
Garante transparência em ambientes corporativos e facilita auditorias.  

## 🧠 Conceitos-Chave  
- **Evento**: ação registrada (ex.: criação de uma instância EC2).  
- **Trilha (Trail)**: configuração que define o que será monitorado.  
- **Bucket S3 de destino**: local onde os logs são armazenados.  

## 💡 Diferença entre CloudTrail e CloudWatch  
| Serviço | Função Principal |
|----------|------------------|
| **CloudWatch** | Gera análises, métricas e dashboards visuais. |
| **CloudTrail** | Faz auditoria e registra o histórico de ações. |
