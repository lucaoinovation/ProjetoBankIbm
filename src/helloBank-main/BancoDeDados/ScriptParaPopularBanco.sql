use hellobank;
INSERT INTO clientes(cpf,data_nascimento,email,endereco,nome,telefone) VALUES("897.274.600-20","1995-10-12","Efrain@gmail.com","2128 Arron Smith Drive-Honolulu, HI 96818","Efrain K. Johnson","(95) 2863-5354");
INSERT INTO clientes(cpf,data_nascimento,email,endereco,nome,telefone) VALUES("309.403.640-69","1998-11-08","AllieJones@gmail.com","2411 Patterson Street-Houston, TX 77002","Allie J. Jones","(79) 3577-3992");
INSERT INTO clientes(cpf,data_nascimento,email,endereco,nome,telefone) VALUES("543.828.870-46","1988-01-12","MauriceToler@gmail.com","2764 Anmoore Road-Queens, NY 11423","Maurice L. Toler","(24) 3483-1181");
INSERT INTO clientes(cpf,data_nascimento,email,endereco,nome,telefone) VALUES("644.474.210-20","1992-05-03","GeraldSanchez@gmail.com","609 Coleman Avenue-Palm Springs, CA 92262","Gerald N. Sanchez","(45) 2661-2834");
INSERT INTO clientes(cpf,data_nascimento,email,endereco,nome,telefone) VALUES("191.830.270-76","2001-06-11","FlorenceDorsey@gmail.com","3525 Florence Street-Dallas, TX 75202","Florene P. Dorsey","(96) 2264-5697");
INSERT INTO clientes(cpf,data_nascimento,email,endereco,nome,telefone) VALUES("332.924.320-14","1975-07-02","DennisCook@gmail.com","4973 Swick Hill Street-Metairie, LA 70001","Dennis G. Cook","(63) 2422-1266");

INSERT INTO contas(agencia,numero_conta,saldo,tipo_conta,cliente_idcliente) values(1965,799222,0.0,"Poupança",1);
INSERT INTO contas(agencia,numero_conta,saldo,tipo_conta,cliente_idcliente) values(0446,01201476,0.0,"Corrente",2);
INSERT INTO contas(agencia,numero_conta,saldo,tipo_conta,cliente_idcliente) values(0027,11042503,0.0,"Poupança",3);
INSERT INTO contas(agencia,numero_conta,saldo,tipo_conta,cliente_idcliente) values(6530,19977331,0.0,"Corrente",4);
INSERT INTO contas(agencia,numero_conta,saldo,tipo_conta,cliente_idcliente) values(6334,02935848,0.0,"Poupança",5);
INSERT INTO contas(agencia,numero_conta,saldo,tipo_conta,cliente_idcliente) values(6696,12322334,0.0,"Corrente",6);

INSERT INTO transacoes(data,valor,conta_idconta) values("2022-10-12",80.33,1);
INSERT INTO transacoes(data,valor,conta_idconta) values("2022-10-12",100.23,2);
INSERT INTO transacoes(data,valor,conta_idconta) values("2022-10-12",40,3);
INSERT INTO transacoes(data,valor,conta_idconta) values("2022-10-12",45.90,4);
INSERT INTO transacoes(data,valor,conta_idconta) values("2022-10-12",18.90,5);
INSERT INTO transacoes(data,valor,conta_idconta) values("2022-10-12",23.78,6);


