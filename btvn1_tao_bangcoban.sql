CREATE DATABASE BaiTapTaoBang
USE BaiTapTaoBang

1. Tạo bảng SinhVien
CREATE TABLE SinhVien(
	MaSV char(10),
	HoTen varchar(50),
	NgaySinh date,
	GioiTinh bit,
	
	PRIMARY KEY (MaSV)
)
DROP TABLE SinhVien


2. Tao Bang Lop

CREATE TABLE Lop(
	MaLop char(10),
	TenLop varchar(50),
	SiSo int
	
	PRIMARY KEY (MaLop)
)

ALTER TABLE Lop ADD PRIMARY KEY (MaLop);

3. tao bang MonHoc
CREATE TABLE MonHoc(
	MaMH char(10),
	TenMH varchar(100),
	SoTinChi int
);
DROP TABLE MonHoc;

4. them khoa chinh cho bang sinh vien


5. Tao Bang khoa co khoa chinh va rang buoc notnull
CREATE TABLE  Khoa( 
	MaKhoa char(10),
	TenKhoa varchar(50) NOT NULL,
	
	PRIMARY KEY (MaKhoa)
)

6. Bang NhanVien
CREATE TABLE NhanVien( 
	ID int auto_increment,
	HoTen varchar(50),
	ChucVu varchar(30),
	
	PRIMARY KEY (ID)
)

7. tao bang sinhvien
CREATE TABLE SinhVien ( 
	MaSV char(10),
	HoTen varchar(50),
	MaLop char(10),
	
	PRIMARY KEY (MaSV)
)


ALTER TABLE SinhVien ADD CONSTRAINT FK_SinhVien_Lop_MaLop FOREIGN KEY(MaLop) REFERENCES Lop(MaLop)

8. tao bang monhoc
CREATE TABLE MonHoc( 
	MaMH char(10),
	TenMH char(50),
	MaKhoa char(10),
	
	PRIMARY KEY (MaMH)
)
ALTER TABLE MonHoc ADD CONSTRAINT FK_MonHoc_Khoa FOREIGN KEY (MaKhoa) REFERENCES Khoa(MaKhoa)

9. tao bang diem co 2 khoa ngoai
CREATE TABLE Diem(
	MaSV char(10),
	MaMH char (10),
	DiemSo float
)
ALTER TABLE Diem ADD CONSTRAINT FK_Diem_SinhVien FOREIGN KEY (MaSV) REFERENCES SinhVien(MaSv)
ALTER TABLE Diem ADD CONSTRAINT FK_Diem_MonHoc FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)



10. them rang buoc check gioi tinh 
ALTER TABLE SinhVien ADD COLUMN GioiTinh char(1)
ALTER TABLE SinhVien ADD CONSTRAINT CHK_GioiTinh CHECK (GioiTinh IN ('M','F'))


11. them rang buoc check so tin chi
ALTER TABLE MonHoc ADD COLUMN SoTinChi int 
ALTER TABLE MonHoc ADD CONSTRAINT CHK_SoTinChi CHECK(SoTinChi > 0)



12. tao bang user , moi email la gia tri doc nhat 
CREATE TABLE Users(
    UserID int PRIMARY KEY,
    Username varchar(30) UNIQUE,
    Email varchar(50) UNIQUE
)

13. tao bang tai khoan voi set default ngày tạo
CREATE TABLE TaiKhoan (
    ID int,
    NgayTao date DEFAULT (CURRENT_DATE), #neu khong nhap ngay tao thi SQL se tu dong set ngay hom nay
    
    PRIMARY KEY (ID)
)


14. tao bang luong nhan vien roi check luong
ALTER TABLE NhanVien ADD Luong decimal(10,2)
ALTER TABLE NhanVien ADD CONSTRAINT CHK_Luong CHECK(Luong >=0)

15. tao bang dang ky
CREATE TABLE DangKy(
    MaSV char(10),
    MaMH char(10),
    NgayDangKy date,
    PRIMARY KEY (MaSV, MaMH)
)
ALTER TABLE DangKy ADD CONSTRAINT FK_DangKy_SinhVien FOREIGN KEY DangKy(MaSV) REFERENCES SinhVien(MaSV)


16. tao bang chitiethoadon
CREATE TABLE ChiTietHoaDon (
    MaHD char(10),
    MaSP char(10),
    SoLuong int,
    PRIMARY KEY (MaHD, MaSP)
);

17.tao bang PhanCong
CREATE TABLE PhanCong (
    MaNhanVien char(10),
    MaDuAn char(10),
    NgayThamGia DATE,
    PRIMARY KEY (MaNhanVien, MaDuAn)
);


18. rang buoc ngay sinh
ALTER TABLE SinhVien ADD COLUMN NgaySinh Date
ALTER TABLE SinhVien ADD CONSTRAINT CHK_NgaySinh CHECK(NgaySinh < CURRENT_DATE())


19. mat khau phai dai > 6 ky tu
ALTER TABLE TaiKhoan 
ADD COLUMN Pass VARCHAR(50),
ADD CONSTRAINT CHK_Password CHECK (LENGTH(Pass) >= 6);



20. tao bang sp gia phai >= 1000 va hang phai >= 0
CREATE TABLE SanPham ( 
	Gia int,
	SoLuong int
)
ALTER TABLE SanPham ADD CONSTRAINT CHK_Gia CHECK (Gia >= 10000),
ADD CONSTRAINT CHK_SoLuong CHECK (SoLuong >=0)







