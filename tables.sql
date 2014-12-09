CREATE TABLE nasdaq_daily_prices ( 
exchange VARCHAR(35) ,
stock_symbol VARCHAR(35) , 
date VARCHAR(35) , 
stock_price_open DOUBLE , 
stock_price_high DOUBLE , 
stock_price_low DOUBLE, 
stock_price_close DOUBLE, 
stock_volume BIGINT, 
stock_price_adj_close DOUBLE
) engine=InnoDB;

create table stock_volume ( stock_symbol VARCHAR(35) , total_stock_volume int) engine innodb;
