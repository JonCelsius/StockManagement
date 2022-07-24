# STOCK MANAGEMENT APP

** This is intended to be an application for a store management. **
*It will receive orders from the Orders System (another app), in order to track the stock management. *

Mainly it will be a REST Web Server which will receive requests for stock management. 
1.	Orders system sends requests about received orders from customers. 
2.	Orders system can send request to get information about available stock of a product.
3.	Supplier system sends requests with stock supplying information. 
4.	Manager (from a web page) sends request to add new products into the system. 
5.	The Manager can perform any modifications with stock and products. Manual adjustments of quantity and so on. 

## Functional requirements 
1.	The system must allow adding new categories, manufacturers, products and product stock.
2.	The system must allow modifying current product stock quantity.
3.	The system must allow modifying product price.
4.	The system should be able to check available stock. 
5.	The system must allow saving new orders taking into consideration that the available stock has been already checked.
6.	By adding a new order, the customer should be checked for existence. If it doesn’t exist, the system must add the new customer. 
7.	The system must adjust the quantity of the existing stock for the current saved order.
8.	The system must remove stock if the quantity is 0;
9.	The system should adjust category rating once a week based on weekly orders.
10.	The system should adjust manufacturer rating once a week based on weekly orders.
