CREATE DATABASE IF NOT EXISTS ManagementSystem;

USE ManagementSystem;

CREATE TABLE IF NOT EXISTS Daily_Finances
(
        Day             int,
        Month           varchar(10),
        Year            int,
        Rep_inc         float,
        Rep_cost        float,
        Rep_prof        float,
        Sales_inc       float,
        Sales_cost      float,
        Sales_prof      float,
        Dis_inc         float,
        Dis_cost        float,
        Dis_prof        float,
        HR_cost         float,
        Other_cost	float,
        Tot_inc         float,
        Tot_cost        float,
        Tot_prof        float,
        PRIMARY KEY(Day, Month, Year)
);

CREATE TABLE IF NOT EXISTS Financial_Reports
(
	Month_issued	char(10),
	Year_issued	int,
	Total_revenue	float,
	Total_costs	float,
	Total_profit	float,
	PRIMARY KEY(Month_issued, Year_issued)
);

CREATE TABLE IF NOT EXISTS Bill
(
	Bill_Number varchar(10) NOT NULL,
        Customer_ID varchar(10) NOT NULL,
        Time time NOT NULL,
        Date date NOT NULL
);

CREATE TABLE IF NOT EXISTS Customer
(
        `customer_id` varchar(10) DEFAULT NULL,
        `fname` varchar(50) DEFAULT NULL,
        `lname` varchar(50) DEFAULT NULL,
        `phone_num1` int(10) DEFAULT NULL,
        `phone_num2` int(10) DEFAULT NULL,
        `gender` varchar(10) DEFAULT NULL,
        `address` varchar(100) DEFAULT NULL,
        `city` varchar(50) DEFAULT NULL,
        `tot_spent_money` double DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS Warranty
(
	
);

CREATE TABLE IF NOT EXISTS Replace_Item
(
	previous_item_code varchar(10) NOT NULL,
        new_Item_code varchar(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS Repair_Item
(
	
);

CREATE TABLE IF NOT EXISTS Shipping_rec
(
	Shipping_ID	varchar(10),
	Vendor_ID	varchar(10),
	Item_ID         varchar(10),
	ship_type	varchar(10),
	item_cost	float,
	Shipping_Cost	float,
	Day             int,
	Month           varchar(10),
	Year            int,
	PRIMARY KEY(Vendor_ID, Item_ID)
);

CREATE TABLE IF NOT EXISTS Vendor
(
	Vendor_ID	        varchar(10),
	Vendor_name	        varchar(10),
	Address		        varchar(30),
	Email		        varchar(20),
	Telephone	        int,
	Shipping_Cost_ph	float,
	PRIMARY KEY(Vendor_ID)
);

CREATE TABLE IF NOT EXISTS Distribution_Item
(
	Vendor_ID	varchar(10),
	Item_ID		varchar(10),
	Qty		int,
	Item_Costs	int,
	Day             int,
	Month           varchar(10),
	Year            int,
	PRIMARY KEY(Vendor_ID, Item_ID)
);

CREATE TABLE IF NOT EXISTS Device
(
	
);

CREATE TABLE IF NOT EXISTS Device_Storage
(
	
);

CREATE TABLE IF NOT EXISTS Overtime
(
	
);

CREATE TABLE IF NOT EXISTS HR
(
	
);

CREATE TABLE IF NOT EXISTS Order_Details
(
        
);

CREATE TABLE IF NOT EXISTS Item
(
        item_code varchar(10),
        item_name varchar(50),
        brand varchar(50),
        manufacture_date date,
        warranty_period int(11),
        discount double,
        selling_price double,
        status varchar(20) DEFAULT 'not sold'
);

CREATE TABLE IF NOT EXISTS Payment
(
        customer_Id varchar(10),
        loyalty_level varchar(20),
        loyalty_discount double(10,0)
);

CREATE TABLE IF NOT EXISTS Vendor
(
        Vendor_ID varchar(10) DEFAULT '',
        Vendor_name varchar(10),
        Address varchar(10),
        Email varchar(10),
        Telephone int(11),
        Shipping_Cost_ph float,
        PRIMARY KEY (Vendor_ID)
);

CREATE TABLE IF NOT EXISTS Stock_item
(
        shippingID varchar(10) NOT NULL,
        itemID int(11) NOT NULL,
        itemName varchar(50) NOT NULL,
        brand varchar(50) NOT NULL,
        modelCode varchar(20) NOT NULL,
        sellingPrice double NOT NULL,
        manufactureDate varchar(50) NOT NULL,
        warrantyPeriod int(11) NOT NULL,
        PRIMARY KEY (shippingID,itemID)
);

CREATE TABLE IF NOT EXISTS Sold_item
(
        item_code varchar(10) NOT NULL,
        bill_number varchar(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS Loyalty_customer
(
        customer_Id varchar(10) NOT NULL,
        loyalty_level varchar(20) NOT NULL,
        loyalty_discount double(10,0) NOT NULL
);

CREATE TABLE IF NOT EXISTS Reorder
(
        reOrderID int(11) NOT NULL,
        vendorID int(11) NOT NULL,
        modelCode varchar(50) NOT NULL,
        Quantity int(11) NOT NULL,
        totalCost double NOT NULL,
        requestedDate date NOT NULL,
        PRIMARY KEY (reOrderID)
);
