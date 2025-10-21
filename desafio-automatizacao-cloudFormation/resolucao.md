# Desafio - Infraestrutur Automatizada com AWS CLoudFormation

## 🧩 Descrição do Desafio
Este laboratório teve como objetivo **implementar uma infraestrutura automatizada com AWS CloudFormation**.  
O foco foi compreender como o serviço pode criar e configurar **recursos interligados de forma automática**, utilizando um **template pronto (LAMP Stack)** como base.  

O entregável consiste em um repositório organizado contendo **anotações, insights e aprendizados práticos**, que servirão de apoio para estudos futuros e novas implementações.

Para o desenvolvimento do desafio, foi escolhido o template LAMP Stack, estudado em aula.

---

## 🧱 LAMP Stack – Template Utilizado

O **sample template LAMP Stack** é um exemplo clássico de infraestrutura automatizada na AWS.  
A sigla **LAMP** representa:

- **L**inux → Sistema operacional base (usado nas instâncias EC2)  
- **A**pache → Servidor web responsável por hospedar a aplicação  
- **M**ySQL → Banco de dados relacional  
- **P**HP → Linguagem de backend executada no servidor web  

Esse template cria automaticamente:

- Uma **instância EC2** configurada com Apache, PHP e dependências da aplicação  
- Um **banco de dados MySQL (RDS)** conectado à aplicação  
- **Security Groups** configurando o tráfego HTTP, SSH e MySQL  
- **Outputs** com o endereço público do servidor e o endpoint do banco de dados  
- Parâmetros personalizáveis, como tipo de instância, nome do banco, usuário e senha  

---

## 🔧 Etapas da Implementação

1. Acessar o console do **AWS CloudFormation**  
2. Selecionar o **template pronto (sample LAMP Stack)**  
3. Preencher os parâmetros solicitados (nome da stack, credenciais do DB, tipo de instância EC2, etc.)  
4. Confirmar as configurações e criar a stack  
5. Acompanhar o progresso na aba “Events” até o status mudar para **CREATE_COMPLETE**  
6. Acessar o **Output** da stack para verificar o endpoint público da aplicação  

---

## 🧠 Insights e Aprendizados

- O CloudFormation **automatiza tarefas repetitivas** e reduz erros humanos em ambientes complexos.  
- O uso de templates facilita **recriar ambientes idênticos** em diferentes regiões ou contas.  
- Parâmetros tornam os templates **reutilizáveis e personalizáveis**.  
- É possível usar **CloudFormation StackSets** para replicar stacks em múltiplas contas.  
- O entendimento da **estrutura YAML e/ou JSON** é essencial para editar ou criar templates personalizados.  

✳️ **Resumindo:**  
Neste desafio, foi possível compreender como o CloudFormation pode ser utilizado para criar **infraestruturas completas e automatizadas**, utilizando templates prontos como o LAMP Stack — uma das bases mais utilizadas para aplicações web na AWS e tornando o processo mais rápido, seguro e escalável — representando um passo importante no conceito de **Infraestrutura como Código (IaC)**.