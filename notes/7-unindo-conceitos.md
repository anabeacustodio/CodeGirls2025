# UNINDO CONCEITOS

**EC2** é um serviço da amazon que fornece capacidade de computação escalável na nuvem da AWS através de máquinas virtuais conhecidas como **instâncias**.

**EBS** é um serviço para fornecer armazenamento em bloco fiável (também conhecido como volumes ou discos rígidos). Foi concedido para ser utilizado com instâncias do EC2.

Quando falamos sobre infraestrutura, isto tem a ver com o disco de servidor virtual, vale lembrar que quando falamos de infraestrutura estamos falando do modelo de cloud. Neste caso estamos falando sobre o modelo **iaas**.

**Snapshots EBS** - serviço de backup nativo do AWS que faz backup dos volumes do EBS em um determinado momento. E é possível configurar a frequência com que os snapshots são tirados. 
Os instantâneos do EBS armazenam os volumes do EBS no AWS S3, em uma matriz de armazenamento diferente de onde estão os volumes o EBS.
Para fins de recuperação de desastres (DR), os instantâneos do EBS podem ser armazenados em ma região remota.

Podemos também otimizar o armazenamento em SSD para operações de leitura/gravação com uso intensivo de i/o

*Qual diferença entre imagem e o snapshot?*
Ami faz o backup de um servidor inteiro incluindo todos os volumes EBS anexados; snapchot é uma cópia pontual de um determinado volume, vc pode tirar snapshots de seus volumes EBS e salva-los no armazenamento S3.

Conclusão: os snapshots são cópias em pontos no tempo de um volume do amazon EBS, armazenadas no amazon S3. Eles podem ser usados para criar um volume do amazon EBS, aumentar a durabilidade de dados e fornecer um mecanismo de backup e restauração para volumes do EBS.

---

## 1. O que é o Amazon S3 de verdade?
	•	O S3 (Simple Storage Service) é um serviço de armazenamento em nuvem da AWS.
	•	Ele não está no seu computador — é como um “disco rígido infinito” na nuvem.
	•	Você cria um bucket (que é como uma pasta principal), e dentro dele pode armazenar arquivos de qualquer tipo (Excel, imagens, vídeos, PDFs, backups etc).
	•	Os arquivos ficam disponíveis de forma segura, durável e acessível via internet, usando a conta AWS e permissões configuradas.

**Então, o usuário não salva na máquina local, e sim faz upload do arquivo (ex.: via aplicação web, API, CLI ou console da AWS) para esse bucket no S3.**

## 2. O que acontece quando o arquivo cai no S3?
	•	O S3 pode ser configurado para disparar eventos automaticamente.
	•	Exemplo:
“Sempre que alguém fizer upload de um arquivo .xlsx neste bucket → chamar a função Lambda XYZ”.

Isso é feito via configuração de event notifications.

## 3. O papel da AWS Lambda
	•	A Lambda é uma função serverless.
	•	Um exemplo de uma das funções dela é poder pegar o arquivo Excel do S3, abrir e converter para CSV.
	•	Você escreve o código (em Python, Node.js, etc).
	•	Esse código roda automaticamente toda vez que o trigger do S3 acontecer.
	•	A Lambda não precisa de servidor ativo 24/7 — você só paga pelo tempo de execução.

*Exemplo real:*
	•	Upload de planilha.xlsx no S3.
	•	Lambda é disparada.
	•	Lambda lê o arquivo, converte em planilha.csv.
	•	Lambda salva o CSV de volta no S3 ou envia para outro destino (como o EC2).

## 4. O papel do Amazon EC2 + EBS
	•	O EC2 é como um computador/servidor virtual rodando na AWS.
	•	O EBS é o “HD/SSD” desse servidor. Ele persiste dados mesmo que você desligue/reinicie a instância EC2.

*No fluxo:*
	•	Depois da conversão feita pelo Lambda, o arquivo CSV pode ser:
	•	Salvo de novo no S3 (mais comum, porque o S3 é barato e escalável).
	•	Ou enviado para o EC2, se você precisa que um sistema/serviço rodando lá utilize esse arquivo.
	•	No EC2, como você tem o EBS acoplado, o arquivo fica guardado e pode ser acessado/consultado a qualquer momento.
    	•	Exemplo: você roda uma aplicação de BI, ou uma API que consulta esses arquivos CSV no EBS.

## Resumindo com um exemplo concreto
	1.	Usuário sobe planilha.xlsx → no bucket S3.
	2.	O S3 dispara evento → ativa função Lambda.
	3.	A Lambda executa código → converte planilha.xlsx em planilha.csv.
	4.	O resultado pode ir para:
	•	S3 novamente (se você quiser armazenar lá para consultas futuras).
	•	EC2/EBS (se sua aplicação rodando em EC2 precisar consumir esse CSV diretamente).
	5.	Você, no EC2, pode abrir/consultar esse CSV como faria em qualquer servidor local, já que o EBS funciona como um disco rígido.

**Ponto importante:**
Na prática, geralmente se deixa os arquivos no S3 e o EC2 acessa direto de lá quando precisa. O EBS é mais útil para aplicações e bancos que precisam de disco rápido e persistente. Mas depende do caso de uso.

*Em resumo:*
	•	Se for processamento pesado contínuo → EC2/EBS.
	•	Se for apenas armazenar e disponibilizar dados processados → S3 é melhor.