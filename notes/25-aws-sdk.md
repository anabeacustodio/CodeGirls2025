# AWS SDK (Software Development Kit)

O **AWS SDK** permite que desenvolvedores interajam com os serviços da AWS diretamente em suas linguagens de programação preferidas.  
Com ele, é possível integrar a infraestrutura em nuvem dentro de aplicativos de forma programática.

### 🌐 Suporte a várias linguagens
O SDK está disponível para linguagens como:
- Python (boto3)
- JavaScript (Node.js)
- Java
- .NET
- PHP
- Go
- Ruby

### ⚙️ Funcionalidades principais
- Criação, configuração e exclusão de recursos AWS diretamente pelo código.  
- Integração com serviços como S3, EC2, DynamoDB, Lambda e muito mais.  
- Autenticação e gerenciamento simplificados via credenciais AWS.  

### 💡 Exemplo simples (Python – boto3)
```python
import boto3

s3 = boto3.client('s3')
response = s3.list_buckets()

for bucket in response['Buckets']:
    print(bucket["Name"])