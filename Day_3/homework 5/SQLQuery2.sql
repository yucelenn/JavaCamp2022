--Select
--ANSII
Select ContactName,CompanyName,City from Customers

Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'Berlin' 

--case insensitive
select * from Products where CategoryID = 1 or CategoryID = 3

select * from Products where CategoryID = 1 and UnitPrice >= 10

select * from Products order by CategoryID,ProductName

select * from Products where CategoryID = 1 order by UnitPrice desc            --ascending artan ,descending düşen
--say(bir kolon ,bir satır gelir)
select count(*) from Products where CategoryID = 2
--her grup elemanı için ayrıca count hesaplanacak group by sayesinde
select CategoryId,count(*) from Products where UnitPrice>20 group by CategoryID having count(*) < 10

SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID=Categories.CategoryID
where Products.UnitPrice>10
--inner joinlerde eşleşen datalar getirilir. İki tabloda da eşleşiyorsa getirir.

--DTO data transformation object

--solda olup sağda olmayanları da getir.
select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

