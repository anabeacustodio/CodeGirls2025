# ☁️ Desafio AWS CloudFormation

## 🎯 Descrição do Desafio
Este laboratório tem como objetivo implementar sua **primeira Stack** com **AWS CloudFormation**.  
O entregável é um repositório organizado contendo anotações e insights adquiridos durante a prática, servindo como material de apoio para estudos e futuras implementações.

---

## 🧩 Objetivos de Aprendizagem
Ao concluir este desafio, você será capaz de:
- Criar e gerenciar stacks utilizando o AWS CloudFormation.  
- Entender o funcionamento de templates em JSON e YAML.  
- Automatizar a criação de recursos AWS de forma segura e reprodutível.  

---

## 🧩 Exemplo de Template  
```yaml
Resources:
  S3BucketRegistros:
    Type: AWS::S3::Bucket
    Properties:
      AccessControl: Private
      DeletionPolicy: Retain
      LifecycleConfiguration:
        Rules:
          - Id: RemoverArquivosAntigos
            Status: Enabled
            ExpirationInDays: 30
  S3BucketBackups:
    Type: AWS::S3::Bucket
    Properties:
      AccessControl: Private
      DeletionPolicy: Retain
```

## 🧾 Explicando o exemplo de template
- Resources: É a seção principal - todo emplate precisa dela. Nela você define quais recursos quer criar.

- S3BucketRegistros: É o nome lógico do recurso, escolhido por você (não é o nome real do bucket na AWS). Serve para o CloudFormation daber qual recurso é qual dentro do temlate.

- Type: AWS::S3::Bucket: Indica o tipo de recurso que será criado. Cada tipo segue uma convenção:
`AWS::<Serviço>::<Recruso>`
Exemplo:
•	AWS::EC2::Instance -> cria uma instância EC2
•	AWS::S3::Bucket -> cria um bucket S3

- Properties: Aqui ficam as configurações específicas do recurso. Cada tipo (EC2, S3, etc.) tem suas próprias propriedades.
No exemplo:
•	AccessControl: Private -> define que o bucket será privado.
•	DeletionPolicy: Retain -> impede que o bucket e seus dados sejam apagados caso a stack seja deletada.
•	LifecycleConfiguration -> define uma política de cilco de vida, ou seja, o que fazer com ojetos antigos (nesse caso, apagar após 30 dias).

- S3BucketBackups: Cria um segundo bucket S3 (para backups), com configuração parecida. Você pode definir quanrtos recursos quiser na mesma stak - banco de dados, VPCs, funções Lambda, etc.

## 💬 Insights e Aprendizados
•	CloudFormation economiza tempo e evita erros humanos ao criar recursos manualmente.
•	É possível controlar versões da infraestrutura e reutilizar templates com pequenas adaptações.
•	A política Retain é essencial quando o recurso armazena dados importantes.
•	Templates YAML são mais legíveis e intuitivos do que JSON.