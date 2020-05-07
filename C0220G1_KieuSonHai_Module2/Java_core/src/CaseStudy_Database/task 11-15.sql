-- task 11
select kh.HoTen, dvdk.TenDichVuDiKem
from dichvudikem as dvdk
right join hopdongchitiet as hdct on hdct.iddichvudikem=dvdk.iddichvudikem
right join hopdong as hd on hd.idhopdong=hdct.idhopdong
right join khachhang as kh on kh.idkhachhang=hd.idkhachhang
right join loaikhach as lk on kh.IDLoaiKhach=lk.IDLoaiKhach
where lk.TenLoaiKhach='Diamond' and (kh.DiaChi='Vinh' or 'Quảng Ngãi');

-- task 12
select hd.idhopdong, nv.hoten as nhanvien, kh.hoten as khachhang, kh.sdt as 'Sdt khach hang', dv.tendichvu, hdct.soluong as 'So luong dich vu di kem', hd.TienDatCoc
from khachhang as kh 
left join hopdong as hd on kh.idkhachhang=hd.idkhachhang
left join nhanvien as nv on nv.idnhanvien=hd.idnhanvien
left join dichvu as dv on hd.iddichvu=dv.iddichvu
left join hopdongchitiet as hdct on hdct.idhopdong=hd.idhopdong
where (month(hd.ngaylamhopdong) in ('10','11','12') and month(hd.ngaylamhopdong) not in ('1','2','3','4','5','6')) and year(hd.ngaylamhopdong)='2019'
group by dv.tendichvu;

-- task 13
select dvdk.tendichvudikem, count(hdct.idhopdongchitiet) as solansudung
from dichvudikem as dvdk
left join hopdongchitiet as hdct on dvdk.iddichvudikem=hdct.iddichvudikem
-- nên dùng IDDichVuDiKem vì ten có thể trùng
group by dvdk.tendichvudikem
having solansudung=
(
select count(hdct.idhopdongchitiet) as solansudung
from dichvudikem as dvdk
left join hopdongchitiet as hdct on dvdk.iddichvudikem=hdct.iddichvudikem
group by dvdk.tendichvudikem
order by solansudung desc 
limit 1
);

-- task 14
select hdct.idhopdong, ldv.TenLoaiDichVu, dvdk.tendichvudikem, count(hdct.idhopdongchitiet) as solansudung
from dichvudikem as dvdk
left join hopdongchitiet as hdct on dvdk.iddichvudikem=hdct.iddichvudikem
left join hopdong as hd on hd.idhopdong=hdct.IDHopDong
left join dichvu as dv on dv.IDDichVu=hd.IDDichVu
left join loaidichvu as ldv on ldv.IDLoaiDichVu=dv.IDLoaiDichVu
group by dvdk.tendichvudikem
having solansudung=(
select count(hdct.idhopdongchitiet) as solansudung
from dichvudikem as dvdk
left join hopdongchitiet as hdct on dvdk.iddichvudikem=hdct.iddichvudikem
group by dvdk.tendichvudikem
order by solansudung  
limit 1
)
;
  
-- task 15
select nv1.IDNhanVien, nv1.HoTen, td.trinhdo, bp.TenBoPhan, nv1.SDT, nv1.DiaChi, count(hd.IDHopDong) as SoHopDong
from nhanvien as nv1 
left join hopdong as hd on nv1.idnhanvien=hd.idnhanvien
left join bophan as bp on bp.idbophan=nv1.idbophan
left join trinhdo as td on td.idtrinhdo=nv1.idtrinhdo
where year(hd.ngaylamhopdong) in ('2018','2019') 
group by nv1.hoten
having  (
select count(hd.IDHopDong) 
from nhanvien as nv 
left join hopdong as hd on nv.idnhanvien=hd.idnhanvien
left join bophan as bp on bp.idbophan=nv.idbophan
-- where nv.IDNhanVien=nv1.IDNhanVien
group by nv.hoten
having count(hd.IDHopDong) <=3
order by count(hd.IDHopDong) 
) 