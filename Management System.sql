--Create table statements

CREATE DATABASE IF NOT EXISTS ManagementSystem;

USE ManagementSystem;

CREATE TABLE IF NOT EXISTS Available_Stock
(
		`modelCode` varchar(20) NOT NULL,
		`qtyInHand` int(11) NOT NULL,
		`reOrderLevel` int(11) NOT NULL DEFAULT '10',
		PRIMARY KEY (`modelCode`)
);

CREATE TABLE IF NOT EXISTS Bill
(
		Bill_Number varchar(10) NOT NULL,
        Customer_ID varchar(10) NOT NULL,
        Time time NOT NULL,
        Date date NOT NULL
);

CREATE TABLE IF NOT EXISTS Current_Employee
(
		`EmpID` int(11) NOT NULL,
		`EmpName` varchar(50) NOT NULL,
		`DOB` date NOT NULL,
		`EmpAddress` varchar(50) NOT NULL,
		`EmpEmail` varchar(50) NOT NULL,
		`EmpPhone` int(10) NOT NULL,
		`JobID` char(5) NOT NULL,
		`JobS_date` date NOT NULL,
		PRIMARY KEY(`EmpID`)
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

CREATE TABLE IF NOT EXISTS Daily_Attendance
(
		`EmpID` int(11) NOT NULL,
		`Date` date NOT NULL,
		`Shift_sTime` time NOT NULL,
		`Shift_eTime` time NOT NULL,
		`EntryTime` time NOT NULL,
		`ExitTime` timestamp NOT NULL,
		PRIMARY KEY (`EmpID`)
);

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
        Other_cost		float,
        Tot_inc         float,
        Tot_cost        float,
        Tot_prof        float,
        PRIMARY KEY(Day, Month, Year)
);

CREATE TABLE IF NOT EXISTS Distribution_Item
(
		Vendor_ID		varchar(10),
		Item_ID			varchar(10),
		Qty				int,
		Item_Costs		int,
		Day             int,
		Month           varchar(10),
		Year            int,
		PRIMARY KEY(Vendor_ID, Item_ID)
);


CREATE TABLE IF NOT EXISTS Financial_Reports
(
		Month_issued	char(10),
		Year_issued		int,
		Total_revenue	float,
		Total_costs		float,
		Total_profit	float,
		PRIMARY KEY(Month_issued, Year_issued)
);

CREATE TABLE IF NOT EXISTS Item
(
		`shippingID` varchar(10) NOT NULL,
		`itemID` varchar(10) NOT NULL,
		`itemName` varchar(50) NOT NULL,
		`brand` varchar(50) NOT NULL,
		`modelCode` varchar(20) NOT NULL,
		`sellingPrice` double NOT NULL,
		`manufactureDate` varchar(20) NOT NULL,
		`warrantyPeriod` int(11) NOT NULL,
		`discount` decimal(10,0) NOT NULL,
		`status` varchar(10) NOT NULL DEFAULT 'not sold',
		PRIMARY KEY (`itemID`)
);

CREATE TABLE IF NOT EXISTS Job
(
		`JobID` char(5) NOT NULL,
		`JobName` varchar(20) NOT NULL,
		PRIMARY KEY (`JobID`)
);

CREATE TABLE IF NOT EXISTS Loyalty_customer
(
        customer_Id varchar(10) NOT NULL,
        loyalty_level varchar(20) NOT NULL,
        loyalty_discount double(10,0) NOT NULL
);

CREATE TABLE IF NOT EXISTS Monthly_Attendance
(
		`EmpID` int(11) NOT NULL,
		`Month` varchar(10) NOT NULL,
		`WorkingHours` int(11) NOT NULL,
		`OtHours` int(11) NOT NULL,
		PRIMARY KEY (`EmpID`)
);

CREATE TABLE IF NOT EXISTS Monthly_Salary
(
		`EmpID` int(11) NOT NULL,
		`Month` varchar(10) NOT NULL,
		`Salary` double NOT NULL,
		PRIMARY KEY (`EmpID`)
);

CREATE TABLE IF NOT EXISTS Past_Employee
(
		`EmpID` int(11) NOT NULL,
		`EmpName` varchar(50) NOT NULL,
		`DOB` date NOT NULL,
		`EmpAddress` varchar(50) NOT NULL,
		`EmpEmail` varchar(50) NOT NULL,
		`EmpPhone` int(10) NOT NULL,
		`JobID` char(5) NOT NULL,
		`JobS_date` date NOT NULL,
		`JobE_date` date NOT NULL,
		PRIMARY KEY (`EmpID`)
);

CREATE TABLE IF NOT EXISTS Payment
(
		`bill_number` varchar(10) NOT NULL,
		`payment_type` tinyint(1) NOT NULL,
		`special_discount` double NOT NULL,
		`net_amount` double NOT NULL,
		`amount_paid` double NOT NULL,
		`balance` double NOT NULL
);

CREATE TABLE IF NOT EXISTS Phone_Repair
(
		`repairID` int(100) NOT NULL AUTO_INCREMENT,
		`itemName` varchar(20) NOT NULL,
		`modelCode` varchar(50) NOT NULL,
		`problem` varchar(200) NOT NULL,
		`EmpID` int(11) NOT NULL,
		`repairDueDate` varchar(20) NOT NULL,
		`EstimatedCost` double NOT NULL,
		`RequestDate` varchar(20) NOT NULL,
		PRIMARY KEY (`repairID`)
);

CREATE TABLE IF NOT EXISTS Repair_Checkout
(
		`repairID` int(100) NOT NULL,
		`Service_Charges` int(11) NOT NULL,
		`repair_Cost` int(11) NOT NULL,
		`status` varchar(50) NOT NULL,
		`checkout_ID` int(11) NOT NULL,
		PRIMARY KEY (`checkout_ID`)
);

CREATE TABLE IF NOT EXISTS Repair_Customer
(
		`cust_id` int(100) NOT NULL AUTO_INCREMENT,
		`name` varchar(40) NOT NULL,
		`email` varchar(50) NOT NULL,
		`phone` int(10) NOT NULL,
		`address` varchar(50) NOT NULL,
		PRIMARY KEY (`cust_id`)
);

CREATE TABLE IF NOT EXISTS Replace_Item
(
		previous_item_code varchar(10) NOT NULL,
        new_Item_code varchar(10) NOT NULL
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

CREATE TABLE IF NOT EXISTS Salary_Rate
(
		`JobID` char(5) NOT NULL,
		`dailyRate` double NOT NULL,
		`otRate` double NOT NULL,
		PRIMARY KEY (`JobID`)
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

CREATE TABLE IF NOT EXISTS User_Account
(
	  `EmpID` int(11) NOT NULL,
	  `Name` varchar(50) NOT NULL,
	  `UserName` varchar(10) NOT NULL,
	  `Password` varchar(10) NOT NULL,
	  `Email` varchar(50) NOT NULL,
	  PRIMARY KEY (`EmpID`),
	  UNIQUE KEY `UserName` (`UserName`)
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

DELIMITER //
CREATE TRIGGER `ffs` AFTER DELETE ON `item`
 FOR EACH ROW
 BEGIN
  declare codez integer;
  declare qty integer;
  select OLD.modelCode INTO @codez;
  
  
  select qtyInHand INTO @qty from availablestock WHERE availablestock.modelCode = @codez;
  IF (@qty > 1) THEN
    UPDATE availablestock
    SET qtyInHand = qtyInHand - 1
    WHERE availablestock.modelCode = @codez;
    
  ELSE  
    DELETE FROM availablestock WHERE availablestock.modelCode = @codez; 
  END IF;
END
//
DELIMITER ;

--Insert table statements

INSERT INTO Available_Stock (`modelCode`, `qtyInHand`, `reOrderLevel`) VALUES
('L0xAf', 3, 10);

INSERT INTO Customer (`customer_id`, `fname`, `lname`, `phone_num1`, `phone_num2`, `gender`, `address`, `city`, `tot_spent_money`) VALUES
('123', 'tg', 'gt', 123, 321, 'male', '1b', 'pil', 1000),
('hr', 'hg', 'hf', 546, 21, 'male', 'hh', 'thdg', NULL),
('CI00000001', 'tg', 'tg', 123, 123, 'male', 'jk', 'fg', NULL),
('CI00000001', 'tg', 'tg', 123, 123, 'male', 'ma', 'gt', NULL),
('CI00000001', 'tg', 'gbtg', 1234, 1456, 'male', 'as', 'fd', NULL);

INSERT INTO Item (`shippingID`, `itemID`, `itemName`, `brand`, `modelCode`, `sellingPrice`, `manufactureDate`, `warrantyPeriod`, `discount`, `status`) VALUES
('SH0001', 'IT10000001', 'J7 Prime', 'Samsung', 'L0xAf', 30000, 'Sep 3, 2017', 7, '0', 'not sold'),
('SH0001', 'IT10000002', 'J7 Prime', 'Samsung', 'L0xAf', 30000, 'Sep 17, 2017', 365, '0', 'not sold'),
('SH0002', 'IT10000003', 'J7 Prime', 'Samsung', 'L0xAf', 30000, 'Sep 3, 2017', 30, '0', 'not sold');

INSERT INTO Phone_Repair (`repairID`, `itemName`, `modelCode`, `problem`, `EmpID`, `repairDueDate`, `EstimatedCost`, `RequestDate`) VALUES
(2, 'kdfkd', '', 'dcdcd', 0, '2 Sep 2017', 12, '2 Sep 2017'),
(3, 'kdfkd', '', 'dcdcd', 0, '2 Sep 2017', 12, '2 Sep 2017'),
(4, 'kdfkd', '', 'dcdcd', 0, '2 Sep 2017', 12, '2 Sep 2017'),
(5, 'kdfkd', '', 'dcdcd', 0, '2 Sep 2017', 12, '2 Sep 2017'),
(6, 'kdfkd', '', 'dcdcd', 0, '2 Sep 2017', 12, '2 Sep 2017');

INSERT INTO `Daily_Finances`
(`Day`,`Month`,`Year`,`Rep_inc`,`Rep_cost`,`Rep_prof`,`Sales_inc`,`Sales_cost`,`Sales_prof`,`Dis_inc`,`Dis_cost`,`Dis_prof`,`HR_cost`,`Other_cost`,`Tot_inc`,`Tot_cost`,`Tot_prof`) VALUES
(19,'September',2017,300,300,0,300,300,0,0,0,0,300,50,600,950,-350),
(22,'September',2017,500,300,200,0,0,0,0,0,0,300,50,500,650,-150),
(23,'September',2017,600,350,0,0,0,0,0,0,0,0,100,600,450,150);

INSERT INTO `Financial_Reports`
(`Month_issued`,`Year_issued`,`Total_revenue`,`Total_costs`,`Total_profit`) VALUES
('August',2017,400,60,340),
('September',2017,1200,2000,-800);

INSERT INTO Shipping_Rec (`shippingID`, `vendorID`, `recDate`, `modelCode`, `Qty`, `shipCost`, `itemCost`, `type`) VALUES
('SH0001', 'V0001', '2 Sep 2017', 'L0xAf', 12, 5000, 30000, 'Vendor'),
('SH0002', 'V0001', '14 Aug 2017', 'L0xAf', 42, 5000, 60000, 'Vendor'),
('SH0003', NULL, '15 Sep 2017', 'L0xAf', 12, NULL, 30000, 'Retail');

INSERT INTO Vendor (`vendorID`, `vendorName`, `address`, `email`, `phone`, `shipCostPh`) VALUES
( 'V0001', 'Amazin', '12, Galle rd, Colombo 3', 'amazin@gmail.com', '0112594028', 300),
( 'V0002', 'Appule', '142, Chakkindarama rd, Colombo 6', 'appule@gmail.com', '0112839204', 400),
( 'V0003', 'Macrosoft', '7, 5th lane, Colombo 7', 'macrosoft@gmail.com', '0112483927', 250);
