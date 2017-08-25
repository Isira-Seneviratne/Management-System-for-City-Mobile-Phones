CREATE DATABASE ManagementSystem;



USE ManagementSystem;



CREATE TABLE Financial_Reports

(

	Month_issued	char(10),

	Year_issued		int,

	Total_revenue	float,

	Total_costs		float,

	Total_profit	float,

	PRIMARY KEY(Month_issued, Year_issued)

);



CREATE TABLE Bill

(
	
);



CREATE TABLE Payment

(
	
);



CREATE TABLE Sold_Item
(
	
);



CREATE TABLE Warranty
(
	
);



CREATE TABLE Replace_Item
(
	
);



CREATE TABLE Repair_Item
(
	
);



CREATE TABLE Shipping_rec

(

	Shipping_ID	varchar(10),

	Vendor_ID	varchar(10),

	Item_ID	varchar(10),

	ship_type		string,

	item_cost		float,

	Shipping_Cost	float,

	PRIMARY KEY(Vendor_ID, Item_ID)
	

);



CREATE TABLE Vendor

(
	Vendor_ID	varchar(10),

	Vendor_name	varchar(10),

	Address		string,

	Email		string,

	Telephone	int,

	Shipping_Cost_ph	float,

	PRIMARY KEY(Vendor_ID)


);



CREATE TABLE Distribution_Item

(

	Vendor_ID	varchar(10),

	Item_ID		varchar(10),

	Qty		int,

	Item_Costs	int,

	PRIMARY KEY(Vendor_ID, Item_ID)

);



CREATE TABLE Device

(
	
);



CREATE TABLE Device_Storage

(
	
);



CREATE TABLE Overtime

(
	
);



CREATE TABLE HR

(
	
);



CREATE TABLE Order_Details

(

	);