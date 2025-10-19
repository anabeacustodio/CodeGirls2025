# Serviços de Mensagens e Notificações

## Amazon SNS (Simple Notification Service)
Serviço de **mensagens assíncronas** para notificações entre aplicativos distribuídos e microserviços.

- **Envio:** push para dispositivos móveis, SMS, e-mail ou integração com SQS/Lambda.  
- **Componentes:** **Tópicos** e **Assinaturas** (Subscribers).  
- **Tipos de tópicos:**  
  - **FIFO:** ordenação de mensagens (300 publicações/seg).  
  - **Standard:** alta flexibilidade, mensagens podem ser entregues mais de uma vez.

---

## Amazon SQS (Simple Queue Service)
Serviço de **fila de mensagens**, usado para **desacoplar componentes de um aplicativo**.

- Suporte a **filas Standard e FIFO**.  
- Mensagens ficam invisíveis para outros consumidores por um tempo limite após recebidas.  
- **Suaviza picos de tráfego** e garante processamento consistente.

### SNS x SQS
- **SNS:** ideal para alertas instantâneos a usuários (broadcast).  
- **SQS:** ideal para comunicação organizada entre sistemas ou componentes.