# Amazon Machine Image (AMI)

- Imagem pré-configurada para inicializar instâncias como o sistema operativo, o servidor de aplicações e as aplicações. 
- Criada a partir de instâncias em execução ou paradas. Isto permite-lhe capturar um instantâneo do seu ambiente configurado.
- Pode ser **pública** (modelos publicados pela aws) ou **privada** (você pode criar sua própria AMI privada para segurança e personalização).
- Tipos de AMI: Amazon Linux, Windows e outros. Escolhe-se uma AMI com base nos requisitos de aplicação e do sistema.

## Vantagens
- Facilita a replicação de ambientes.  
- Possibilita personalização (instalar softwares, aplicar configs, salvar como AMI).  
- Usada para consistência em produção e escalabilidade.  
- Elas fornecem uma base para a criação de ambientes consistentes e reproduzíveis na nuvem.