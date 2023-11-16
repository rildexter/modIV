// Aguarda o evento DOMContentLoaded, indicando que o HTML foi totalmente carregado
document.addEventListener('DOMContentLoaded', function () {
    // Caminho para o arquivo JSON
    const arquivoJSON = 'dados.json';

    // Faz uma requisição assíncrona usando a Fetch API para obter o conteúdo do arquivo JSON
    fetch(arquivoJSON)
        .then(response => response.json()) // Converte a resposta para o formato JSON
        .then(data => {
            // Manipula os dados do JSON chamando a função exibirListaFilmes
            exibirListaFilmes(data);
        })
        .catch(error => {
            // Trata qualquer erro ocorrido durante a requisição ou conversão do JSON
            console.error('Erro ao carregar o JSON:', error);
        });

    // Função para exibir a lista de filmes na página
    function exibirListaFilmes(filmes) {
        // Obtém a referência do elemento HTML onde a lista de filmes será exibida
        const listaDiv = document.getElementById('filme-lista');

        // Itera sobre cada objeto filme no array de filmes
        filmes.forEach(filme => {
            // Cria um novo elemento div para representar um item de filme
            const filmeItem = document.createElement('div');
            filmeItem.classList.add('filme-item'); // Adiciona a classe CSS 'filme-item'

            // Cria um elemento div para o título do filme e define o conteúdo com o nome do filme
            const titulo = document.createElement('div');
            titulo.classList.add('filme-titulo'); // Adiciona a classe CSS 'filme-titulo'
            titulo.textContent = filme.nome_filme;

            // Cria um elemento div para as informações do filme e define o conteúdo usando dados do filme
            const info = document.createElement('div');
            info.classList.add('filme-info'); // Adiciona a classe CSS 'filme-info'
            info.innerHTML = `<strong>Ano:</strong> ${filme.ano_filme}, <strong>Diretor:</strong> ${filme.diretor}, <strong>Gênero:</strong> ${filme.genero}`;

            // Adiciona os elementos criados ao elemento filmeItem
            filmeItem.appendChild(titulo);
            filmeItem.appendChild(info);

            // Adiciona o elemento filmeItem à listaDiv para exibição na página
            listaDiv.appendChild(filmeItem);
        });
    }
});

