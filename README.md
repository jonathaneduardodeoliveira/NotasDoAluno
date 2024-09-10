Aplicativo de Gerenciamento de Notas de Alunos
Este projeto é um aplicativo desenvolvido em Java para o gerenciamento de notas de alunos. Ele permite que secretarias cadastrem novos alunos, professores registrem notas e alunos consultem suas próprias notas.
Estrutura do Projeto
O projeto é organizado em pacotes e classes conforme abaixo:
Pacote org.example.NotasDoAluno
Main: Classe principal que inicializa o aplicativo e exibe o menu principal.
Pacote org.example.NotasDoAluno.modelo
Aluno: Representa um aluno, com funcionalidades para consultar e atualizar a nota.
Professor: Representa um professor, com funcionalidades para cadastrar notas.
Secretaria: Representa a secretaria, com funcionalidades para cadastrar novos alunos.

Pacote org.example.NotasDoAluno.servico
Usuario: Classe abstrata base para Aluno, Professor e Secretaria.
AplicativoDeNotas: Gerencia os dados dos alunos e inicializa o banco de dados de alunos.
Funcionalidades

Secretaria:
Cadastra novos alunos no sistema.

Professor:
Cadastra e atualiza notas de alunos.

Aluno:
Consulta suas próprias notas e as notas dos colegas com base na condição do colega.
Usuários e Senhas
Ao rodar o aplicativo, você precisará inserir o usuário e senha corretos para acessar as funcionalidades. Aqui estão os usuários e senhas:
Secretaria:
Usuário: ada
Senha: b3
Professor:
Usuário: rocha
Senha: b3
Aluno:
Usuário: jonathan
Senha: b3
Instruções de Instalação
1. 
Clone o repositório
git clone https://github.com/jonathaneduardodeoliveira/NotasDoAluno.git
Testando o Aplicativo com IntelliJ IDEA
1. 
Importar o Projeto:
Abra o IntelliJ IDEA.
Selecione "Open" e navegue até o diretório do projeto.
Selecione o diretório e clique em "OK" para importar o projeto.
2. 
Configurar o JDK:
Vá para "File" > "Project Structure".
Em "Project Settings" > "Project", selecione o JDK adequado.
3. 
Executar o Aplicativo:
Clique com o botão direito do mouse na classe Main e selecione "Run 'Main.main()'".
O aplicativo será iniciado na janela de execução.
Testar Funcionalidades:
Siga as instruções no menu principal para testar as funcionalidades de Secretaria, Professor e Aluno.
Notas sobre os Commits
Peço desculpas pelos commits muito simples enviados anteriormente. Como estou aprendendo, encontrei alguns problemas com o Git durante os commits. No entanto, todos os problemas foram resolvidos, e aprendi bastante com essas experiências.
Contribuindo
Se você deseja contribuir para este projeto ou tem dúvidas sobre o código, sinta-se à vontade para entrar em contato comigo. Estou aberto a sugestões e feedbacks.
Contato
Para dúvidas ou sugestões, você pode entrar em contato comigo pelo e-mail jonathan.mega2@gmail.com.
Obrigado por conferir o projeto! Espero que você ache útil e interessante. Qualquer feedback é bem-vindo.