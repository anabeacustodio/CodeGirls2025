# Security Group (Grupo de Segurança)

## 💡 Conceito
O **Security Group (SG)** é um **recurso de segurança da VPC** que atua como um **firewall virtual**, controlando o **tráfego de entrada (inbound)** e **saída (outbound)** das instâncias e recursos da AWS.

É através deste serviço que se **habilitam as permissões de acesso** às instâncias — definindo **quais portas, protocolos e origens** podem se comunicar com elas.

---

## ⚙️ Exemplos de uso
- **Permitir acesso via SSH (porta 22)** para conexões remotas em instâncias Linux.  
- **Permitir acesso via RDP (porta 3389)** para conexões remotas em instâncias Windows.  
- **Habilitar regras específicas** para permitir acesso **de determinados IPs** ou **para determinadas portas**.

---

## 🔒 Funcionamento
- As **regras de inbound** controlam **quem pode acessar** a instância.  
- As **regras de outbound** controlam **para onde a instância pode se conectar**.  
- Cada instância pode ter **um ou mais Security Groups**, e um mesmo SG pode ser **associado a várias instâncias**.  

---

## 🧭 Dica de estudo
Lembre-se:  
- **Security Groups são stateful**, ou seja, o tráfego de resposta é automaticamente permitido.  
- Diferencie-os das **Network ACLs**, que são stateless e atuam no nível da subnet.