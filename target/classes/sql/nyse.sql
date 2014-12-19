create external table nyse(xchange string,
stock_symbol string,
date string,
stock_price_open double,
stock_price_high double,
stock_price_low double,
stock_price_close double,
stock_volume double,
stock_price_adj_close double) ROW FORMAT
DELIMITED FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n' 
STORED AS TEXTFILE
LOCATION '/user/rashmi/nasdaq_daily_prices'; 
