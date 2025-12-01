# Write your MySQL query statement below
#SELECT * FROM Customers LEFT JOIN Orders ON Customers.id = Orders.customerID;
SELECT c.name as Customers FROM Customers c LEFT JOIN Orders o ON c.id = o.customerID WHERE o.customerID IS null;