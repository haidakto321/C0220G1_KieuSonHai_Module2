-- task 16
delete nv from nhanvien as nv
left join hopdong as hd on nv.idnhanvien=hd.idnhanvien
where not exists (
	select count(hd.idhopdong) as count from hopdong as hd
    right join nhanvien as nv on nv.idnhanvien=hd.idnhanvien
    -- where count=0
    group by nv.hoten
	order by count 
    );
    
delete from nhanvien where not exists (
select  nhanvien.idnhanvien from hopdong 
where hopdong.NgayLamHopDong between '2017-01-01' and '2019-12-31' and hopdong.IDNhanVien=nhanvien.idnhanvien);


    
-- task 17 done
update khachhang 
set idloaikhach=5 
where idloaikhach=4 and hoten in(
select hoten
from (
	select kh.hoten
	from khachhang as kh
	join hopdong as hd on hd.idkhachhang=kh.idkhachhang
	where hd.tongtien>10000 and year(hd.ngaylamhopdong)='2019') as temp
    );
 
 -- task 18
 delete khachhang, hopdongchitiet,hopdong
 from khachhang 
 join hopdong on khachhang.IDKhachHang=hopdong.IDKhachHang
 join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
 where not exists (
	select  hopdong.IDHopDong 
    where year(hopdong.ngaylamhopdong)>'2016' and khachhang.IDKhachHang=hopdong.IDKhachHang);
 
 -- task 19 
 update dichvudikem
 set gia=gia*2
 where exists(
 select count(hopdongchitiet.IDHopDongChiTiet) from hopdongchitiet 
 group by IDDichVuDiKem
 -- neu dung where bo len tren se k dc
  having count(hopdongchitiet.IDHopDongChiTiet)>10
 );
 
 -- c2
 update dichvudikem 
 join (select dichvudikem.TenDichVuDiKem as ten_dvdk
 group by dichvudikem.IDDichVuDiKem
 having count(hopdongchitiet.IDDichVuDiKem)>3) as temp 
 set dichvudikem.gia=dichvudikem.gia *2 
 where  dichvudikem.tendichvudikem=temp.tendichvudikem;
-- task 20
select idnhanvien as idnhanvien,null as idkhachhang, hoten, email, sdt, ngaysinh, diachi from nhanvien 
union all
select null as idnhanvien, idkhachhang as idkhachhang, hoten, email, sdt, ngaysinh, diachi from khachhang