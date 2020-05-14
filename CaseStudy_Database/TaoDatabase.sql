 -- create database furama_resort;
create table NhanVien (
IDNhanVien int primary key,
HoTen int,
IDViTri int,
IDTrinhDo int,
IDBoPhan int,
NgaySinh date,
SoCMTND varchar(45),
Luong varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45)
);
alter table nhanvien add foreign key (IDViTri) references vitri(IDViTri);
alter table nhanvien add foreign key (IDTrinhDo) references trinhdo(IDTrinhDo);
alter table nhanvien add foreign key (IDBoPhan) references bophan(IDBoPhan);
alter table nhanvien modify HoTen varchar(45);

create table ViTri(
IDViTri int primary key,
TenViTri varchar(45)
);

create table TrinhDo(
IDTrinhDo int primary key,
TrinhDo varchar(45)
);
create table BoPhan(
IDBoPhan int primary key,
TenBoPhan varchar(45)
);

create table HopDong(
IDHopDong int primary key,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int
);
alter table hopdong add foreign key(IDNhanVien) references nhanvien(IDNhanVien);
alter table hopdong add foreign key(IDKhachHang) references khachhang(IDKhachHang);
alter table hopdong add foreign key(IDDichVu) references dichvu(IDDichVu);


create table HopDongChiTiet(
IDHopDongChiTiet int primary key,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int
);
alter table hopdongchitiet add foreign key (IDDichVuDiKem) references dichvudikem(IDDichVuDiKem);
alter table hopdongchitiet add foreign key (IDHopDong) references hopdong(IDHopDong);

create table DichVuDiKem(
IDDichVuDiKem int primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45)
);

create table DichVu(
IDDichVu int primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IDKieuThue varchar(45),
IDLoaiDichVu int,
TrangThai varchar(45)
);
alter table dichvu modify IDKieuThue int;
 alter table dichvu add foreign key (IDKieuThue) references kieuthue(IDKieuThue);
alter table dichvu add foreign key (IDLoaiDichVu) references loaidichvu(IDLoaiDichVu);

create table KieuThue(
IDKieuThue int primary key,
TenKieuThue varchar(45),
Gia int
);
create table LoaiDichVu(
IDLoaiDichVu int primary key,
TenLoaiDichVu varchar(45)
);

create table KhachHang(
IDKhachHang int primary key,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMTND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45)
);
alter table khachhang add foreign key (IDLoaiKhach) references loaikhach(IDLoaiKhach);

create table LoaiKhach(
IDLoaiKhach int primary key,
TenLoaiKhach varchar(45)
);