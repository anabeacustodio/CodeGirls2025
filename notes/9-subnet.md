# SubNet (Sub-rede)

## 💡 Conceito
A **SubNet** é uma **gama de endereços IP dentro de uma VPC** — ou seja, uma **sub-rede lógica** criada dentro de uma rede virtual da AWS.  
É possível **criar recursos da AWS**, como **instâncias EC2**, em **sub-redes específicas**, garantindo organização e controle sobre a comunicação de rede.

Cada **sub-rede deve residir inteiramente dentro de uma única Zona de Disponibilidade (AZ)**, o que ajuda a distribuir aplicações de forma resiliente e tolerante a falhas.

---

## 🧩 Função dentro da VPC
As subnets segmentam a rede em partes menores, o que permite:
- Separar **recursos públicos e privados** (por exemplo: servidores web em sub-redes públicas e bancos de dados em sub-redes privadas).  
- Definir **regras de roteamento** diferentes para cada parte da infraestrutura.  

---

## 🔐 Segurança nas Subnets
É **dentro das subnets** que são configurados os **Security Groups (SG)**, responsáveis por controlar o tráfego de rede.  
Eles determinam:
- **Inbound rules:** quais **protocolos e IPs podem acessar** os recursos.  
- **Outbound rules:** para **quais IPs e protocolos os recursos podem se conectar**.  

Essas regras garantem o **controle e a segurança** da comunicação entre os serviços hospedados na VPC.