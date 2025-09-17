# Infraestrutura Global & Conceitos Fundamentais

## CAPEX X OPEX

A Amazon Web Services (AWS) é tipicamente classificada como OPEX (despesa operacional), pois a maioria das empresas paga pelos serviços de nuvem conforme o uso, em vez de fazer um grande investimento inicial em hardware e infraestrutura (CAPEX). Isso permite flexibilidade e evita custos de manutenção de data centers, mas gera despesas recorrentes que aparecem no fluxo de caixa mensal.

Cloud opex - não necessita grande infraestrutura para iniciar projeto.
Pricing flexível: pagamento por uso - clientes pagam apenas pelos recursos q consomem.
Grande variedade de serviços: computação, armazenamento, banco de dados, serviços especializados como machine Learning, iot e analise de dados

**Resumindo...**
Capex = quando compro o servidor
OPEX = uso operacionalmente e pago pelo mesmo

## Mode de negócio AWS
Pública: maior risco de privacidade
Privada: alto investimento, custo continuo d operação
Híbrida: segurança, controle total

SaaS (use) - software como serviço exemplo Netflix - email, com, erp (software)
Paas (construa) - plataforma como serviço exemplo web (plataforma)
IaaS (migre) - software como serviço exemplo segurança, sistema de cache (infraestrutura)

## Rede global de data centers

Regiões (Regions): projetada para ser isolada das outras regiões, proporciona maior tolerância a falhas e estabilidade possível. São áreas geográficas contendo varias Availability Zones, logo, uma região é composta por 2 ou mais zonas de disponibilidade.
 
Zonas de Disponibilidade (Availability Zones): Se cada região é independente das demais, o que significa que os recursos são exclusivos da região escolhida em que esta sendo provisionado os recursos. Isto contribui para a maior tolerância de falhas e não há replicação automática entre regiões, isto deve ser habilitado pelo administrador da conta. Os recursos são grupos de 2 ou mais data centers independentes fisicamente, mas conectados logicamente, para garantir alta disponibilidade.

**Aws abrange mais de 105 zonas de disponibilidade em 33 regiões geográficas por todo o mundo**

**Pontos para levar em consideração quando for escolher uma região: compliance, disponibilidade de serviços, custo, latência.**

##Serviços Gerenciados

A AWS é uma plataforma de nuvem conhecida pela sua alta escalabilidade e robusta infraestrutura, capaz de suportar sistemas de grande porte e alta demanda, como Amazon.com, Netflix, tiktok
 
## Questions

Para que serve a solução AWS Snowball?
R: Serve para a transferência segura de grandes volumes de dados (terabytes e petabytes) e da nuvem da Amazon Web Services (aws).

O que é uma region na AWS?
R: é uma área geográfica do mundo onde a aws agrupa seus data centers e outros recursos computacionais.

O que é latência em relação à escolha de uma região da AWS?
R: é o atraso na comunicação entre um usuário ou dispositivo e a infraestrutura da aws.