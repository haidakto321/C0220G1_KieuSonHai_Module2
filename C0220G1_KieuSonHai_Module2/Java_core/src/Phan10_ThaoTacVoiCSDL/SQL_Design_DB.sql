create database codegym;

create table codegym.tai_khoan_james (
	tai_khoan varchar(30) primary key not null,
    mat_khau varchar(30)
);

create table codegym.giang_vien (
	id_giang_vien int not null,
    ten_giang_vien varchar(50),
    nam_sinh char(4),
    
    primary key (id_giang_vien)
);

create table codegym.loai_lop (
	id_loai_lop int primary key not null,
    ten_loai_lop varchar(50)
);

create table codegym.lop (
	id_lop int primary key not null,
    ten_lop varchar(50),
    id_loai_lop int,
    foreign key (id_loai_lop) references loai_lop(id_loai_lop)
);

create table codegym.hoc_vien (
	id_hoc_vien int not null primary key,
    ten_hoc_vien varchar(50),
    nam_sinh char(4),
    tai_khoan varchar(30),
    id_lop int,
    
    foreign key (tai_khoan) references tai_khoan_james (tai_khoan),
	foreign key (id_lop) references lop (id_lop)
);

create table codegym.giangvien_day_lop (
	id_lop int,
    id_giang_vien int,
    
    primary key (id_lop, id_giang_vien),
    foreign key (id_lop) references lop (id_lop),
    foreign key (id_giang_vien) references giang_vien(id_giang_vien)
);

INSERT INTO `codegym`.`loai_lop` (`id_loai_lop`, `ten_loai_lop`) VALUES ('1', 'fulltime');
INSERT INTO `codegym`.`loai_lop` (`id_loai_lop`, `ten_loai_lop`) VALUES ('2', 'halftime');

INSERT INTO `codegym`.`lop` (`id_lop`, `ten_lop`, `id_loai_lop`) VALUES ('1', 'C0220G1', '1');
INSERT INTO `codegym`.`lop` (`id_lop`, `ten_lop`, `id_loai_lop`) VALUES ('2', 'C1020', NULL);

select tblLop.id_lop, tblLop.ten_lop, tblLoaiLop.ten_loai_lop
from codegym.lop tblLop
 inner join codegym.loai_lop tblLoaiLop on tblLop.id_loai_lop = tblLoaiLop.id_loai_lop;

select tblLop.id_lop, tblLop.ten_lop, tblLoaiLop.ten_loai_lop
from codegym.lop tblLop
 left join codegym.loai_lop tblLoaiLop on tblLop.id_loai_lop = tblLoaiLop.id_loai_lop;
 
select tblLop.id_lop, tblLop.ten_lop, tblLoaiLop.ten_loai_lop
from codegym.loai_lop tblLoaiLop
 right outer join codegym.lop tblLop on tblLop.id_loai_lop = tblLoaiLop.id_loai_lop;
 
select *
from codegym.lop
order by id_lop;

-- xoa khoa ngoai
alter table codegym.lop
drop foreign key lop_ibfk_1;

-- tham chieu den chinh no
create table codegym.test (
	id_lop int primary key not null,
    id_lop_2 int,
    foreign key (id_lop_2) references test(id_lop)
);
