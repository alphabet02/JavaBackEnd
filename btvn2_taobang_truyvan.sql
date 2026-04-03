CREATE DATABASE QuanLySach
use QuanLySach

CREATE TABLE TacGia(
	MaTacGia int auto_increment,
	TenTacGia 	varchar(100),
	QuocTich varchar(50),
	
	primary key(MaTacGia)
);


CREATE TABLE Sach(
	MaSach int auto_increment,
	TieuDe varchar(200),
	NamXuatBan int,
	MaTacGia int,
	
	primary key(MaSach)
	
);

ALTER TABLE Sach ADD CONSTRAINT FK_MaTacGia	FOREIGN KEY (MaTacGia) REFERENCES TacGia(MaTacGia)


INSERT INTO TacGia (MaTacGia, TenTacGia,QuocTich)
VALUES
(1, 'Nguyễn Nhật Ánh', 'Việt Nam'),
(2, 'Haruki Murakami', 'Nhật Bản'),
(3, 'J.K. Rowling', 'Anh')



INSERT INTO Sach (MaSach, TieuDe, NamXuatBan, MaTacGia)
VALUES
(1, 'Mắt Biếc', 1990, 1),
(2, 'Tôi thấy hoa vàng trên cỏ xanh', 2005, 1),
(3, 'Rừng Na Uy', 1987, 2),
(4, 'Harry Potter và Hòn đá Phù thủy', 1997, 3)


1.	Lấy danh sách tất cả sách trong hệ thống.
SELECT * FROM Sach
2.	Lấy danh sách tất cả tác giả có quốc tịch là "Việt Nam".
SELECT TenTacGia FROM TacGia
WHERE QuocTich = "Việt Nam"

3.	Lấy tên sách và tên tác giả tương ứng (JOIN 2 bảng).
SELECT TieuDe, TenTacGia
FROM Sach s JOIN TacGia t on s.MaTacGia = t.MaTacGia

4.	Lấy danh sách các sách xuất bản sau năm 1990.
SELECT TieuDe FROM Sach
WHERE NamXuatBan > 1990
5.	Đếm số lượng sách của mỗi tác giả.
SELECT Count(DISTINCT MaSach) as SoLuongSach, TenTacGia 
FROM Sach s JOIN TacGia t on s.MaTacGia = t.MaTacGia 
Group By TenTacGia

6.	Tìm tác giả có nhiều sách nhất.
SELECT Count(DISTINCT MaSach) as SoLuongSach, TenTacGia 
FROM Sach s JOIN TacGia t on s.MaTacGia = t.MaTacGia 
Group By TenTacGia 
ORDER BY SoLuongSach DESC
LIMIT  1


