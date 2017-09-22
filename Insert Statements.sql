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

INSERT INTO `Daily_Finances` (`Day`,`Month`,`Year`,`Rep_inc`,`Rep_cost`,`Rep_prof`,`Sales_inc`,`Sales_cost`,`Sales_prof`,`Dis_inc`,`Dis_cost`,`Dis_prof`,`HR_cost`,`Other_cost`,`Tot_inc`,`Tot_cost`,`Tot_prof`) VALUES (19,'September',2017,300,300,0,300,300,300,0,0,0,300,50,600,950,-350),
(22,'September',2017,300,300,0,0,0,0,0,0,0,300,50,300,650,-350);

INSERT INTO `Financial_Reports`
(`Month_issued`,`Year_issued`,`Total_revenue`,`Total_costs`,`Total_profit`) VALUES
('August',2017,400,60,340),
('September',2017,900,1500,-600);
