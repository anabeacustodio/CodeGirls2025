# Serviços de Armazenamento e CDN

## Amazon S3
O **Amazon S3** é um serviço de **armazenamento de objetos em nuvem** da AWS, ideal para **armazenar, organizar e recuperar grandes volumes de dados** de forma segura e escalável.

### Características:
- **Armazenamento de objetos:** cada objeto é armazenado em um **Bucket**.  
- **Buckets:** contêineres para objetos com **nome globalmente único**.  
- **Classes de armazenamento:** S3 Standard, S3 Intelligent-Tiering, S3 Glacier, entre outras, para otimizar custo e desempenho.  
- **Durabilidade e disponibilidade:** 99,999999999% de durabilidade e 99,99% de disponibilidade.  
- **Segurança:** criptografia em repouso e em trânsito, controle de acesso granular via políticas e ACLs.

### Políticas de acesso:
- Criadas via **IAM (Identity and Access Management)**.  
- Definidas em **JSON** com chave e valor, permitindo regras exclusivas de acesso.  
- Garantem que apenas entidades autorizadas possam acessar os dados.

---

## Amazon Glacier
- Tipo de armazenamento do S3, **durável e de baixo custo** para dados raramente acessados.  
- Acesso aos dados em **3 a 5 horas** (recuperação padrão).  
- Usos comuns: fotos, dados científicos, arquivos de saúde, arquivamento regulatório.  
- Preço: US$0,01/GB (recuperações padrão) + US$0,05 por 1.000 solicitações.  
- Duração mínima de armazenamento:  
  - **S3 Glacier:** 90 dias  
  - **S3 Glacier Deep Archive:** 180 dias  

---

## AWS Snow Family
Para **transferência e processamento de grandes volumes de dados (petabytes)**.

### SnowBall
- Dispositivo de **computação e armazenamento de borda**.  
- Usado para **migração de dados em larga escala** e armazenamento local.

### SnowBall Edge
- Transporte mais rápido que a internet via **operadora regional**.  
- Dispositivo resistente com **etiquetas E Ink** para envio seguro.

### Snowmobile
- Versão **ultra grande escala** do SnowBall.  
- Capacidade: até **100 petabytes**.  
- Ideal para transferir enormes volumes de dados físicos para a nuvem.

---

## Amazon CloudFront
O **CloudFront** é uma **CDN (Content Delivery Network)** que **faz cache de recursos estáticos** (imagens, vídeos, CSS, JS) próximos aos usuários finais, reduzindo **latência** e melhorando o **desempenho**.

### Como funciona:
- Os recursos são armazenados em **POP (pontos de presença)** estratégicos.  
- A primeira vez que o recurso é solicitado, ele vem do servidor de origem; nas próximas vezes, vem do **cache mais próximo**.  

### Exemplo:
- Um site de e-commerce distribui imagens de produtos via CloudFront.  
- O usuário acessa o POP mais próximo, garantindo **carregamento rápido**.  