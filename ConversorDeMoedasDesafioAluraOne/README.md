<h1>

 Challenge Back End ONE
  
</h1>

Para criar o Conversor de Moedas com interação textual via console e integração com uma API de câmbio, segui os seguintes passos:
<p>
Passo 1: Configuração do Projeto
 <p>
Crie um novo projeto Java e configure-o, neste trabelho foi desenvolvido no Intellij, com a opção do Buld system (maven), por causa das dependências do Gson, mais informações em https://github.com/google/gson.
</p>
</p>
<p>
Passo 2: Escolha da API de Câmbio
 <p>
Escolha uma API de câmbio para obter as taxas de conversão em tempo real. Por exemplo, você pode usar a API da Open Exchange Rates ou a CurrencyLayer. Nesse desafio utilizei a API do Exchange para isso bastou registrar-se no site https://app.exchangerate-api.com/, e registre-se na API para obter uma chave de acesso (API key).
</p>
</p>
<p>
Passo 3: Estrutura do Projeto
 <p>
Crie a estrutura básica do projeto, que pode incluir as seguintes classes:
  
•	Principal: Para interação com o usuário.

•	RequestApi: Interface para a API e para obter taxas de câmbio da API selecionada.

</p>
Certifique-se de que você tenha as seguintes dependências em seu projeto:

•	Gson: Para fazer parsing do JSON retornado pela API de conversão de moedas.
•	Java HTTP Client: Para fazer requisições HTTP.

</p>
<p>

Passo 4: Implementação da Interação com o Usuário
</p>
<p>
Na classe Principal, implemente a interação com o usuário via console. Crie um menu com as opções de conversão de moeda, e permita que o usuário selecione uma opção e insira os valores a serem convertidos.
</p>

<p>
Passo 5: Implementação do Conversor de Moedas
 </p>
 <p>
Na classe RequestApi, implemente a lógica para converter as moedas. Use a classe responsável pela integração com a API de câmbio para obter as taxas de conversão em tempo real.
  
</p>
<p>
Passo 6: Implementação da Integração com a API de Câmbio
 
</p>
Implemente a classe responsável por fazer solicitações para a API de câmbio selecionada. Use a chave de acesso (API key) fornecida pela API para autenticação e obtenha as taxas de câmbio em tempo real.
</p>
