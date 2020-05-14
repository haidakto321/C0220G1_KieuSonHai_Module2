INSERT INTO `furama_resort`.`vitri` (`IDViTri`, `TenViTri`) VALUES ('1', 'Lễ tân');
INSERT INTO `furama_resort`.`vitri` (`IDViTri`, `TenViTri`) VALUES ('2', 'Quản lý');
INSERT INTO `furama_resort`.`vitri` (`IDViTri`, `TenViTri`) VALUES ('3', 'Bảo vệ');
INSERT INTO `furama_resort`.`vitri` (`IDViTri`, `TenViTri`) VALUES ('4', 'Kỹ Thuật');
UPDATE `furama_resort`.`vitri` SET `TenViTri` = 'Phục vụ' WHERE (`IDViTri` = '2');
UPDATE `furama_resort`.`vitri` SET `TenViTri` = 'Chuyên viên' WHERE (`IDViTri` = '3');
UPDATE `furama_resort`.`vitri` SET `TenViTri` = 'Giám sát' WHERE (`IDViTri` = '4');
INSERT INTO `furama_resort`.`vitri` (`IDViTri`, `TenViTri`) VALUES ('5', 'Quản lý');
INSERT INTO `furama_resort`.`vitri` (`IDViTri`, `TenViTri`) VALUES ('6', 'Giám đốc');


INSERT INTO `furama_resort`.`trinhdo` (`IDTrinhDo`, `TrinhDo`) VALUES ('1', 'Đại học');
INSERT INTO `furama_resort`.`trinhdo` (`IDTrinhDo`, `TrinhDo`) VALUES ('2', 'Cao đẳng');
INSERT INTO `furama_resort`.`trinhdo` (`IDTrinhDo`, `TrinhDo`) VALUES ('3', 'Trung Cấp');
INSERT INTO `furama_resort`.`trinhdo` (`IDTrinhDo`, `TrinhDo`) VALUES ('4 ', 'Cao học');
INSERT INTO `furama_resort`.`trinhdo` (`IDTrinhDo`, `TrinhDo`) VALUES ('5', 'Phổ thông');
DELETE FROM `furama_resort`.`trinhdo` WHERE (`IDTrinhDo` = '5');


INSERT INTO `furama_resort`.`bophan` (`IDBoPhan`, `TenBoPhan`) VALUES ('1', 'Lễ tân');
INSERT INTO `furama_resort`.`bophan` (`IDBoPhan`, `TenBoPhan`) VALUES ('2', 'Nhà bếp');
INSERT INTO `furama_resort`.`bophan` (`IDBoPhan`, `TenBoPhan`) VALUES ('3', 'Bảo vệ');
INSERT INTO `furama_resort`.`bophan` (`IDBoPhan`, `TenBoPhan`) VALUES ('4', 'Kĩ thuật');
INSERT INTO `furama_resort`.`bophan` (`IDBoPhan`, `TenBoPhan`) VALUES ('5', 'Quản lý');
UPDATE `furama_resort`.`bophan` SET `TenBoPhan` = 'Sale - Marketing' WHERE (`IDBoPhan` = '1');
UPDATE `furama_resort`.`bophan` SET `TenBoPhan` = 'Hành chính' WHERE (`IDBoPhan` = '2');
UPDATE `furama_resort`.`bophan` SET `TenBoPhan` = 'Phục vụ' WHERE (`IDBoPhan` = '3');
UPDATE `furama_resort`.`bophan` SET `TenBoPhan` = 'Quản lý' WHERE (`IDBoPhan` = '4');
DELETE FROM `furama_resort`.`bophan` WHERE (`IDBoPhan` = '5');




INSERT INTO `furama_resort`.`nhanvien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('1', 'Mai An', '2', '2', '3', '1996-05-12', '233216701', '9.000.000', '0349851291', 'maian01@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`nhanvien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('2', 'Thái Hà', '1', '1', '1', '1990-07-22', '190312934', '11.000.000', '0905187314', 'thaiha@gmail.com', 'Quảng Nam');
INSERT INTO `furama_resort`.`nhanvien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('3', 'Quốc Thái', '3', '3', '2', '1993-11-11', '204034123', '14.000.000', '0984122958', 'quocthai@gmail.com', 'Quảng Trị');
INSERT INTO `furama_resort`.`nhanvien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('4', 'Nguyễn Kim', '2', '2', '1', '1989-02-21', '187098345', '8.000.000', '045123598', 'nguyekim@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`nhanvien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('5', 'Ngọc Yến', '3', '3', '2', '1996-01-05', '231098489', '8.000.000', '031945124', 'ngocyen@gmail.com', 'Quảng Ngãi');

INSERT INTO `furama_resort`.`loaikhach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES ('01', 'Normal');
INSERT INTO `furama_resort`.`loaikhach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES ('02', 'Silver');
INSERT INTO `furama_resort`.`loaikhach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES ('03', 'Gold');
INSERT INTO `furama_resort`.`loaikhach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES ('04', 'Diamond');
UPDATE `furama_resort`.`loaikhach` SET `TenLoaiKhach` = 'Member' WHERE (`IDLoaiKhach` = '1');
UPDATE `furama_resort`.`loaikhach` SET `TenLoaiKhach` = 'Plantinium' WHERE (`IDLoaiKhach` = '4');
INSERT INTO `furama_resort`.`loaikhach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES ('5', 'Diamond');



INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('001', '2', 'Khách Một', '1988-03-04', '7123324819', '043567901', 'kh1@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('002', '3', 'Khách Hai', '1984-11-07', '1903045124', '090310495', 'kh2@gmail.com', 'Quảng Trị');
INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('003', '1', 'Khách Ba', '1990-01-02', '321546120', '045012467', 'kh3@gmail.com', 'Quảng Trị');
INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('004', '4', 'Khách Bốn ', '1989-12-12', '324967125', '090512496', 'kh4@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('005', '1', 'Khách Năm', '1991-07-05', '312541965', '090519607', 'kh5@gmail.com', 'Quảng Ngãi');
INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('6', '5', 'Khách Sáu', '1979-04-03', '213456091', '034903264', 'kh6@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('7', '5', 'Khách Bảy', '1975-11-19', '314546122', '090451261', 'kh7@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('8', '5', 'Khách Tám', '1968-07-05', '213956316', '090516237', 'kh8@gmail.com', 'Vinh');
INSERT INTO `furama_resort`.`khachhang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMTND`, `SDT`, `Email`, `DiaChi`) VALUES ('9', '3', 'Khách Bảy', '1957-01-09', '435964491', '094295756', 'khcl7@gmail.com', 'Quảng Nam');


INSERT INTO `furama_resort`.`kieuthue` (`IDKieuThue`, `TenKieuThue`, `Gia`) VALUES ('1', 'Hour', '10');
INSERT INTO `furama_resort`.`kieuthue` (`IDKieuThue`, `TenKieuThue`, `Gia`) VALUES ('2', 'Day', '200');
INSERT INTO `furama_resort`.`kieuthue` (`IDKieuThue`, `TenKieuThue`, `Gia`) VALUES ('3', 'Week ', '1300');
INSERT INTO `furama_resort`.`kieuthue` (`IDKieuThue`, `TenKieuThue`, `Gia`) VALUES ('4', 'Month', '35000');

INSERT INTO `furama_resort`.`dichvudikem` (`IDDichVuDiKem`, `TenDichVuDiKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('01', 'Massage', '50', 1, 'yes');
INSERT INTO `furama_resort`.`dichvudikem` (`IDDichVuDiKem`, `TenDichVuDiKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('02', 'Karaoke', '25', 1, 'yes');
INSERT INTO `furama_resort`.`dichvudikem` (`IDDichVuDiKem`, `TenDichVuDiKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('03', 'Food', '10', 1, 'yes');
INSERT INTO `furama_resort`.`dichvudikem` (`IDDichVuDiKem`, `TenDichVuDiKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('04', 'Water', '2', 1, 'yes');
INSERT INTO `furama_resort`.`dichvudikem` (`IDDichVuDiKem`, `TenDichVuDiKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('05', 'Rent car', '25', 1, 'yes');

INSERT INTO `furama_resort`.`loaidichvu` (`IDLoaiDichVu`, `TenLoaiDichVu`) VALUES ('1', 'Villa');
INSERT INTO `furama_resort`.`loaidichvu` (`IDLoaiDichVu`, `TenLoaiDichVu`) VALUES ('2', 'House');
INSERT INTO `furama_resort`.`loaidichvu` (`IDLoaiDichVu`, `TenLoaiDichVu`) VALUES ('3', 'Room');

INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('001', 'SVVL-1234', '300', '3', '8', '500', '3', '1', 'Available');
INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('002', 'SVVL-1235', '300', '3', '8', '500', '2', '1', 'Available');
INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('003', 'SVVL-1236', '350', '4', '10', '600', '3', '1', 'Available');
INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('004', 'SVHO-2345', '150', '3', '6', '350', '2', '2', 'Available');
INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('005', 'SVHO-2346', '150', '3', '6', '350', '3', '2', 'Available');
INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('006', 'SVHO-2347', '100', '2', '4', '250', '3', '2', 'Available');
INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('007', 'SVRO-3456', '40', '1', '2', '40', '1', '3', 'Available');
INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('008', 'SVRO-3457', '40', '1', '3', '45', '1', '3', 'Available');
INSERT INTO `furama_resort`.`dichvu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES ('009', 'SVRO-3458', '40', '1', '3', '45', '2', '3', 'Available');

INSERT INTO `furama_resort`.`hopdong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('01', '1', '1', '4', '2019-02-04', '2019-02-11', '100', '500');
INSERT INTO `furama_resort`.`hopdong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('02', '3', '4', '3', '2019-05-07', '2019-06-07', '500', '14000');
INSERT INTO `furama_resort`.`hopdong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('03', '1', '6', '2', '2019-02-11', '2019-02-18', '200', '1500');
INSERT INTO `furama_resort`.`hopdong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('04', '1', '6', '1', '2020-01-21', '2020-01-28', '200', '1600');
INSERT INTO `furama_resort`.`hopdong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('05', '1', '7', '5', '2019-11-11', '2019-12-11', '500', '14000');
INSERT INTO `furama_resort`.`hopdong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) VALUES ('6', '1', '3', '2', '2018-02-15', '2018-02-22', '200', '1500');
INSERT INTO `furama_resort`.`hopdong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`) VALUES ('7', '2', '9', '4', '2019-10-10', '2019-11-10', '500');
UPDATE `furama_resort`.`hopdong` SET `IDKhachHang` = '8' WHERE (`IDHopDong` = '7');



INSERT INTO `furama_resort`.`hopdongchitiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) VALUES ('1', '1', '2', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) VALUES ('2', '2', '3', '3');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) VALUES ('3', '3', '1', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) VALUES ('4', '4', '5', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) VALUES ('5', '5', '4', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) VALUES ('6', '6', '2', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) VALUES ('7', '7', '3', '1');

