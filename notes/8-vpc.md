# Amazon VPC (Virtual Private Cloud)

## 💡 Conceito
A **Amazon VPC** é uma solução que permite utilizar recursos da AWS em uma **rede lógica isolada**.  
Essa rede é semelhante a uma rede tradicional de datacenter, mas com a **flexibilidade e escalabilidade** oferecidas pela infraestrutura da AWS.

A Amazon VPC possibilita:
- A **criação de sub-redes** em diferentes zonas de disponibilidade dentro de uma região.  
- O uso de um **Internet Gateway** para facilitar a comunicação entre a VPC e a internet.

---

## 🌐 Serviços públicos e privados
- **Serviço público:** qualquer serviço **não implantado em uma VPC**, como mostrado em diagramas onde os serviços ficam na área pontilhada.  
- **Serviço privado:** requer **configuração de VPC** para funcionar — normalmente representada na cor azul em diagramas.  
- Alguns serviços, como o **AWS Lambda**, podem ser configurados como **públicos ou privados**.

---

## ⚙️ Características do recurso

- **Isolamento de rede:** fornece um ambiente seguro para hospedar aplicativos e dados.  
- **Controle de tráfego:** permite definir regras de segurança para o tráfego **inbound** e **outbound** usando **Security Groups** e **Network ACLs**.  
- **Suporte a sub-redes:** pode conter **sub-redes públicas ou privadas**, adequadas para diferentes cargas de trabalho.  
- **Controle de endereçamento IP:** é possível **definir o intervalo de endereços IP** das sub-redes.  
- **Conectividade:** integração com redes locais via **VPNs** ou **conexões dedicadas**, estendendo a infraestrutura on-premises para a nuvem AWS.