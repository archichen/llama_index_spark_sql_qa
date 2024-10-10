SELECT 
    c.customer_id,
    c.customer_name,
    COUNT(o.order_id) AS total_orders,
    SUM(o.price) AS total_spent,
    AVG(o.price) AS avg_order_value,
    ROW_NUMBER() OVER (ORDER BY SUM(o.price) DESC) AS rank
FROM 
    customers c
LEFT JOIN 
    orders o ON c.customer_id = o.customer_id
GROUP BY 
    c.customer_id, c.customer_name
HAVING 
    total_spent > 100
ORDER BY 
    total_spent DESC
