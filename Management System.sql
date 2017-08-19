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

CREATE TABLE Vendor
(
	
);

CREATE TABLE Distribution
(
	
);

CREATE TABLE Distribution_Item
(
	
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