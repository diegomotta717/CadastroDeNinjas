-- Migracao para adicionar coluna de ranking na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN JUTSU VARCHAR(255);

