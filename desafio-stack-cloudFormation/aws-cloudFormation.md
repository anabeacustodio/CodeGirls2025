## 🧱 O que é o AWS CloudFormation
“Um construtor automático de infraestrutura”.
Em vez de criar recursos manualmente pelo console (como EC2, S3, RDS, etc.), você escreve um arquivo de instruções (chamado template) dizendo o que quer que seja criado — e o CloudFormation cuida do como.
Isso é o que chamamos de Infraestrutura como Código (IaC).
👉 Ou seja, toda sua infraestrutura pode ser descrita num arquivo versionado, revisado e reutilizado.

---

## 🧩 Como ele funciona
1.	Você escreve um template — em JSON ou YAML — com todos os recursos desejados.
2.	Faz o upload desse template no CloudFormation.
3.	O serviço cria uma “stack” (pilha), que é o conjunto desses recursos.
4.	Se você precisar alterar algo, atualiza o template e o CloudFormation faz as mudanças automaticamente.
5.	Quando terminar, exclui a stack, e o CloudFormation remove todos os recursos associados (a menos que você defina o contrário com uma política).

---

## Principais conceitos
| Conceito | Descrição |
|----------|------------------|
| **Template** | O arquivo que descreve todos os recursos (infraestrutura). |
| **Stack** | A execução prática do template — ou seja, os recursos criados. |
| **Resources** | Onde você define cada item da sua infraestrutura (ex.: instância EC2, bucket S3, etc.). |
| **Parameters** | Campos de entrada que deixam o template mais flexível (por exemplo, escolher o nome de um bucket). |
| **Outputs** | Valores exibidos ao final da criação (ex.: o nomw do bucket ou o endpoint). |
| **Policies** | Regras sobre o que deve acontecer quando a stack for excluída ou atualizada. |