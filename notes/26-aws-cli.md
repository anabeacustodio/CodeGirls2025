# AWS CLI (Command Line Interface)

A **AWS CLI** é uma ferramenta de linha de comando usada para **gerenciar e automatizar recursos da AWS**.  
Ideal para administradores e desenvolvedores que precisam de agilidade e controle direto do ambiente.

### 🧭 Funções principais
- Executar comandos para criar, listar ou excluir recursos AWS.
- Automatizar tarefas com scripts.
- Interagir com todos os serviços AWS suportados pela conta.

### ⚙️ Exemplos de comandos
```bash
# Verificar a versão instalada
aws --version

# Listar buckets S3
aws s3 ls

# Criar uma instância EC2
aws ec2 run-instances --image-id ami-0abcdef1234567890 --instance-type t2.micro