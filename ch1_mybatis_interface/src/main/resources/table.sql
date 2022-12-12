create table tb_brand(
                         id int primary key auto_increment,
                         brand_name varchar(20),
                         company_name varchar(20),
                         ordered int,
                         description varchar(100),
                         status int
);

insert into tb_brand(brand_name, company_name, ordered, description, status)
values ('三只松鼠','三只松鼠股份有限公司',5,'好吃不上火',0),
       ('华为','华为技术股份有限公司',5000,'华为致力于把数字世界带入每个人、每个家庭、每个组织，构建万物互联的智能世界',1),
       ('小米','小米科技股份有限公司',50,'are you OK',1) ;

select * from tb_brand;