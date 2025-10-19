# Amazon Route 53

## 💡 Conceito
O **Amazon Route 53** é o **serviço de DNS (Domain Name System)** da AWS.  
Sua principal função é **converter nomes de domínio em endereços IP**, permitindo que os usuários acessem recursos na internet ou dentro da própria AWS de forma simples e eficiente.

---

## ⚙️ Funcionalidades principais
Além da conversão de nomes, o Route 53 oferece recursos importantes para **gerenciar o tráfego de rede** e a **resolução de nomes DNS**:
- **Resolução de nomes DNS internos:** converte nomes de recursos hospedados na AWS em seus **endereços IP internos** dentro da VPC.  
- **Gerenciamento de tráfego:** direciona o tráfego de usuários de forma inteligente, com base em políticas de roteamento (geográfico, por latência, failover etc.).  

---

## 🌐 Integração
O Route 53 pode ser usado junto a outros serviços da AWS, como:
- **Elastic Load Balancer (ELB)** — para distribuir o tráfego entre instâncias.  
- **CloudFront** — para entregar conteúdo globalmente.  
- **S3** — para hospedar sites estáticos com domínio personalizado.