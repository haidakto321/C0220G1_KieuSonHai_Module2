-- task 2
select * from nhanvien 
where hoten like ('%H%' or '%T%' or '%K%') and char_length(hoten) <= 15;

-- task 3
SELECT TIMESTAMPDIFF(YEAR, NgaySinh, CURDATE()) 
from khachhang as age;

select * from khachhang
where ((year(curdate())- year(NgaySinh)) between '18' and '50') and (DiaChi in ('Đà Nẵng' , 'Quảng Trị'));

-- task 4 
select hoten, count(hopdong.IDKhachHang) 'SoLanDatPhong' from khachhang 
join hopdong on khachhang.IDKhachHang=hopdong.IDKhachHang
where khachhang.IDLoaiKhach='5'
order by SoLanDatPhong;

-- task 5
select kh.IDKhachHang, kh.hoten,lk.TenLoaiKhach, hd.IDHopDong, dv.tendichvu, hd.ngaylamhopdong, hd.NgayKetThuc, sum(dv.ChiPhiThue+dvdk.DonVi*dvdk.Gia) as tongtien
from khachhang as kh
left join loaikhach as lk on kh.IDLoaiKhach=lk.IDLoaiKhach
left join hopdong as hd on kh.IDKhachHang=hd.IDKhachHang
left join dichvu as dv on dv.IDDichVu=hd.IDDichVu
left join loaidichvu as ldv on ldv.IDLoaiDichVu=dv.IDLoaiDichVu
left join dichvudikem as dvdk on hd.IDDichVu=dvdk.IDDichVuDiKem
left join hopdongchitiet as hdct on hd.IDHopDong=hdct.IDHopDong
group by hd.IDHopDong;

-- task 6
select dv.IDDichVu, dv.TenDichVu,dv.DienTich, dv.ChiPhiThue,ldv.TenLoaiDichVu
from dichvu as dv
join loaidichvu as ldv on dv.idloaidichvu = ldv.idloaidichvu
left join hopdong as hd on dv.IDDichVu=hd.IDDichVu
where (month(hd.ngaylamhopdong)  between 1 and 3) and year(hd.ngaylamhopdong)='2019';
-- where exists
-- 	(select * from hopdong where ((month(ngaylamhopdong)='1' or '2' or '3') and year(ngaylamhopdong)='2019'));

-- task 7
select dv.IDDichVu, dv.TenDichVu, dv.DienTich, dv.SoNguoiToiDa, dv.ChiPhiThue, ldv.TenLoaiDichVu
from dichvu as dv
join loaidichvu as ldv on dv.idloaidichvu=ldv.idloaidichvu
left join hopdong as hd on hd.iddichvu=dv.iddichvu
where year(hd.ngaylamhopdong)='2018' and not exists(select * from hopdong where year(hd.ngaylamhopdong) <> 2019);

-- task 8
-- cach 1
select khachhang.hoten
from khachhang
group by HoTen;
-- cach 2
select distinct hoten
from khachhang;
-- cach 3
select kh1.hoten
from khachhang as kh1
where not exists (select 1 from khachhang as kh2 where kh1.hoten=kh2.hoten and kh1.idkhachhang>kh2.idkhachhang);
-- cach 4 sai
select kh1.hoten
from khachhang as kh1
left join khachhang as kh2 on kh1.hoten=kh2.hoten and kh1.idkhachhang>kh2.idkhachhang
where kh2.hoten=null; 
-- cach 5
select khachhang.HoTen 
from khachhang union select  khachhang.HoTen from khachhang;
-- task 9
select month(ngaylamhopdong) as Thang, count(hd.IDHopDong) as 'So lan thue'
from hopdong as hd
group by Thang 
order by thang;

-- task 10
select hd.IDHopDong, hd.NgayLamHopDong, hd.NgayKetThuc, hd.TienDatCoc,count(hdct.IDHopDongChiTiet) as SoLuongDichVuDiKem
from hopdong as hd
join hopdongchitiet as hdct on hd.idhopdong=hdct.idhopdong
group by hd.IDHopDong