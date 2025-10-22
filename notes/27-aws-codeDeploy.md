# AWS CodeDeploy – Implantação Automatizada de Aplicações

O **AWS CodeDeploy** é um serviço que automatiza o processo de **implantação de aplicações** em servidores locais ou instâncias AWS (como EC2).  
Ele atua como um “robô de deploy”, garantindo que novas versões sejam aplicadas com segurança e sem downtime.

---

### ⚙️ Como funciona
1. O CodeDeploy **obtém o código do aplicativo**.  
2. **Distribui automaticamente** entre os servidores ou instâncias EC2.  
3. **Gerencia a atualização**, garantindo que o serviço continue disponível.  

---

### 💡 Benefícios
1. **Automatização:** reduz erros humanos e implanta várias instâncias simultaneamente.  
2. **Eficiência:** acelera lançamentos e atualizações.  
3. **Alta disponibilidade:** suporta balanceamento e rollback automático.  
4. **Integração:** funciona com EC2, Lambda, ECS, S3 e GitHub.

---

### 🧩 Exemplo de uso
Imagine um site hospedado em múltiplas instâncias EC2.  
Com o CodeDeploy:
- você sobe o novo código no S3 ou GitHub,  
- o CodeDeploy distribui e atualiza automaticamente todas as instâncias,  
- e o site é atualizado sem interrupções para o usuário final.