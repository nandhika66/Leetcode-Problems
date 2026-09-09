# Write your MySQL query statement below
select * , (
    case when x + y > z and x + z > y and y + z > x then "Yes"
    else "No" end
) as triangle from triangle;