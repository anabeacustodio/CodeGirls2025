# AWS CloudWatch  

## 📘 Visão Geral  
O **AWS CloudWatch** é responsável por monitorar os recursos da conta na AWS em tempo real.  
Ele coleta e acompanha **métricas** (eventos e variáveis) que ajudam a medir o desempenho de serviços e aplicações.  

Ao acessar o painel do CloudWatch, são exibidas automaticamente métricas de cada produto da AWS em uso.  
Também é possível criar **dashboards personalizados** para visualizar métricas específicas e acompanhar recursos sob demanda.  

## ⚙️ Funcionalidades  
- Coleta e monitora métricas de recursos AWS.  
- Criação de **dashboards** personalizados.  
- Configuração de **alarmes** que enviam notificações ou ajustam recursos automaticamente.  
- Integração com **AWS Lambda**, **EC2**, **S3** e outros serviços.  

## 🧩 Casos de Uso  
**1. Monitoramento de instâncias EC2**  
Permite observar uso de CPU, disco e rede.  
Exemplo: aumentar automaticamente a quantidade de instâncias quando a carga for alta.  

**2. Registro de alterações em EC2 com Lambda**  
Usando **CloudWatch Events**, é possível registrar e reagir a alterações no estado de uma instância EC2.  

**3. Auditoria de operações em buckets S3**  
Com **CloudWatch Events** e **CloudTrail**, é possível registrar operações de API em nível de objeto.  

## 🧠 Conceitos-Chave  
- **Métrica**: variável monitorada (CPU, memória, disco, etc.)  
- **Alarme**: regra que reage a métricas e executa ações.  
- **Dashboard**: painel visual com métricas personalizadas.  
- **Evento**: ação ou alteração detectada em um serviço.  

## 💡 Benefício  
Proporciona **visibilidade operacional completa**, ajudando a manter a performance e a integridade das aplicações.  