CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,           -- ID único e automático
    nome VARCHAR(100) NOT NULL,      -- Obrigatório, máximo 100 chars
    email VARCHAR(255) UNIQUE NOT NULL -- Único e obrigatório
);

CREATE TABLE tarefa (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    descricao TEXT,                  -- Texto longo sem limite
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Data automática
    status VARCHAR(20) CHECK (status IN ('PENDENTE', 'EM_ANDAMENTO', 'CONCLUIDA')),
                                     -- Só aceita esses valores
    usuario_id INTEGER REFERENCES usuario(id) -- Chave estrangeira
);

-- Teste
-- Inserir um usuário de exemplo
INSERT INTO usuario (nome, email) 
VALUES ('João Silva', 'joao.silva@gmail.com');

-- Inserir uma tarefa para o usuário exemplo
INSERT INTO tarefa (titulo, descricao, status, usuario_id)
VALUES ('Estudar Spring Boot', 'Criar projeto gestão de tarefas', 'PENDENTE', 1);
