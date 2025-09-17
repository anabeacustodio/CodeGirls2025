# Configuração da conta AWS

Na criação de toda conta cloud você terá uma conta principal(root) com super permissões ao seu workspace. É altamente recomendado não usar o usuário raiz(root) para tarefas diárias. Proteja as credenciais do usuário raiz e use-as para executar as tarefas que somente ele pode executar (apagar conta, apagar usuários, informações de cobrança)
Para começar precisa: e-mail, número de telefone, cartão de crédito (para verificação)
 
Usuário do IAM (core-coração-responsável pela adm) - segundo usuário para usar a aws no dia a dia

# IAM (Identity and Access Management)

## Conta root
- Criada automaticamente ao abrir a conta AWS.  
- Deve ser usada apenas para tarefas críticas (ex.: apagar conta, verificação de cobrança).  

## Usuários IAM
- Criados para uso diário, com permissões limitadas.  
- É possível aplicar **políticas e grupos** para controlar o que cada usuário pode ou não fazer.  

## Práticas de segurança
1. Criar conta root e depois guardar.  
2. Não compartilhar dados da conta 
3. Configurar alertas de gastos e ficar atento ao e-mail com as cobranças.  
4. Ativar **MFA (autenticação multifator)**.
5. Estabelecer barreiras de proteção para permissões. 

## Formas de acesso
- **Console AWS** (navegador/plataforma).  
- **AWS CLI** - Comand Line Interface (linha de comando).  
- **CloudShell** (terminal integrado no console).