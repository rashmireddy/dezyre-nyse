// ORM class for table 'nasdaq_daily_prices'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Dec 17 23:21:11 PST 2014
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class nasdaq_daily_prices extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String exchange;
  public String get_exchange() {
    return exchange;
  }
  public void set_exchange(String exchange) {
    this.exchange = exchange;
  }
  public nasdaq_daily_prices with_exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }
  private String stock_symbol;
  public String get_stock_symbol() {
    return stock_symbol;
  }
  public void set_stock_symbol(String stock_symbol) {
    this.stock_symbol = stock_symbol;
  }
  public nasdaq_daily_prices with_stock_symbol(String stock_symbol) {
    this.stock_symbol = stock_symbol;
    return this;
  }
  private String date;
  public String get_date() {
    return date;
  }
  public void set_date(String date) {
    this.date = date;
  }
  public nasdaq_daily_prices with_date(String date) {
    this.date = date;
    return this;
  }
  private Double stock_price_open;
  public Double get_stock_price_open() {
    return stock_price_open;
  }
  public void set_stock_price_open(Double stock_price_open) {
    this.stock_price_open = stock_price_open;
  }
  public nasdaq_daily_prices with_stock_price_open(Double stock_price_open) {
    this.stock_price_open = stock_price_open;
    return this;
  }
  private Double stock_price_high;
  public Double get_stock_price_high() {
    return stock_price_high;
  }
  public void set_stock_price_high(Double stock_price_high) {
    this.stock_price_high = stock_price_high;
  }
  public nasdaq_daily_prices with_stock_price_high(Double stock_price_high) {
    this.stock_price_high = stock_price_high;
    return this;
  }
  private Double stock_price_low;
  public Double get_stock_price_low() {
    return stock_price_low;
  }
  public void set_stock_price_low(Double stock_price_low) {
    this.stock_price_low = stock_price_low;
  }
  public nasdaq_daily_prices with_stock_price_low(Double stock_price_low) {
    this.stock_price_low = stock_price_low;
    return this;
  }
  private Double stock_price_close;
  public Double get_stock_price_close() {
    return stock_price_close;
  }
  public void set_stock_price_close(Double stock_price_close) {
    this.stock_price_close = stock_price_close;
  }
  public nasdaq_daily_prices with_stock_price_close(Double stock_price_close) {
    this.stock_price_close = stock_price_close;
    return this;
  }
  private Long stock_volume;
  public Long get_stock_volume() {
    return stock_volume;
  }
  public void set_stock_volume(Long stock_volume) {
    this.stock_volume = stock_volume;
  }
  public nasdaq_daily_prices with_stock_volume(Long stock_volume) {
    this.stock_volume = stock_volume;
    return this;
  }
  private Double stock_price_adj_close;
  public Double get_stock_price_adj_close() {
    return stock_price_adj_close;
  }
  public void set_stock_price_adj_close(Double stock_price_adj_close) {
    this.stock_price_adj_close = stock_price_adj_close;
  }
  public nasdaq_daily_prices with_stock_price_adj_close(Double stock_price_adj_close) {
    this.stock_price_adj_close = stock_price_adj_close;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof nasdaq_daily_prices)) {
      return false;
    }
    nasdaq_daily_prices that = (nasdaq_daily_prices) o;
    boolean equal = true;
    equal = equal && (this.exchange == null ? that.exchange == null : this.exchange.equals(that.exchange));
    equal = equal && (this.stock_symbol == null ? that.stock_symbol == null : this.stock_symbol.equals(that.stock_symbol));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.stock_price_open == null ? that.stock_price_open == null : this.stock_price_open.equals(that.stock_price_open));
    equal = equal && (this.stock_price_high == null ? that.stock_price_high == null : this.stock_price_high.equals(that.stock_price_high));
    equal = equal && (this.stock_price_low == null ? that.stock_price_low == null : this.stock_price_low.equals(that.stock_price_low));
    equal = equal && (this.stock_price_close == null ? that.stock_price_close == null : this.stock_price_close.equals(that.stock_price_close));
    equal = equal && (this.stock_volume == null ? that.stock_volume == null : this.stock_volume.equals(that.stock_volume));
    equal = equal && (this.stock_price_adj_close == null ? that.stock_price_adj_close == null : this.stock_price_adj_close.equals(that.stock_price_adj_close));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof nasdaq_daily_prices)) {
      return false;
    }
    nasdaq_daily_prices that = (nasdaq_daily_prices) o;
    boolean equal = true;
    equal = equal && (this.exchange == null ? that.exchange == null : this.exchange.equals(that.exchange));
    equal = equal && (this.stock_symbol == null ? that.stock_symbol == null : this.stock_symbol.equals(that.stock_symbol));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.stock_price_open == null ? that.stock_price_open == null : this.stock_price_open.equals(that.stock_price_open));
    equal = equal && (this.stock_price_high == null ? that.stock_price_high == null : this.stock_price_high.equals(that.stock_price_high));
    equal = equal && (this.stock_price_low == null ? that.stock_price_low == null : this.stock_price_low.equals(that.stock_price_low));
    equal = equal && (this.stock_price_close == null ? that.stock_price_close == null : this.stock_price_close.equals(that.stock_price_close));
    equal = equal && (this.stock_volume == null ? that.stock_volume == null : this.stock_volume.equals(that.stock_volume));
    equal = equal && (this.stock_price_adj_close == null ? that.stock_price_adj_close == null : this.stock_price_adj_close.equals(that.stock_price_adj_close));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.exchange = JdbcWritableBridge.readString(1, __dbResults);
    this.stock_symbol = JdbcWritableBridge.readString(2, __dbResults);
    this.date = JdbcWritableBridge.readString(3, __dbResults);
    this.stock_price_open = JdbcWritableBridge.readDouble(4, __dbResults);
    this.stock_price_high = JdbcWritableBridge.readDouble(5, __dbResults);
    this.stock_price_low = JdbcWritableBridge.readDouble(6, __dbResults);
    this.stock_price_close = JdbcWritableBridge.readDouble(7, __dbResults);
    this.stock_volume = JdbcWritableBridge.readLong(8, __dbResults);
    this.stock_price_adj_close = JdbcWritableBridge.readDouble(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.exchange = JdbcWritableBridge.readString(1, __dbResults);
    this.stock_symbol = JdbcWritableBridge.readString(2, __dbResults);
    this.date = JdbcWritableBridge.readString(3, __dbResults);
    this.stock_price_open = JdbcWritableBridge.readDouble(4, __dbResults);
    this.stock_price_high = JdbcWritableBridge.readDouble(5, __dbResults);
    this.stock_price_low = JdbcWritableBridge.readDouble(6, __dbResults);
    this.stock_price_close = JdbcWritableBridge.readDouble(7, __dbResults);
    this.stock_volume = JdbcWritableBridge.readLong(8, __dbResults);
    this.stock_price_adj_close = JdbcWritableBridge.readDouble(9, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(exchange, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stock_symbol, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_open, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_high, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_low, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_close, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(stock_volume, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_adj_close, 9 + __off, 8, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(exchange, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stock_symbol, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_open, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_high, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_low, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_close, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(stock_volume, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(stock_price_adj_close, 9 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.exchange = null;
    } else {
    this.exchange = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stock_symbol = null;
    } else {
    this.stock_symbol = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date = null;
    } else {
    this.date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_open = null;
    } else {
    this.stock_price_open = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_high = null;
    } else {
    this.stock_price_high = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_low = null;
    } else {
    this.stock_price_low = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_close = null;
    } else {
    this.stock_price_close = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_volume = null;
    } else {
    this.stock_volume = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_adj_close = null;
    } else {
    this.stock_price_adj_close = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.exchange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, exchange);
    }
    if (null == this.stock_symbol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock_symbol);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.stock_price_open) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_open);
    }
    if (null == this.stock_price_high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_high);
    }
    if (null == this.stock_price_low) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_low);
    }
    if (null == this.stock_price_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_close);
    }
    if (null == this.stock_volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stock_volume);
    }
    if (null == this.stock_price_adj_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_adj_close);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.exchange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, exchange);
    }
    if (null == this.stock_symbol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock_symbol);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.stock_price_open) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_open);
    }
    if (null == this.stock_price_high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_high);
    }
    if (null == this.stock_price_low) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_low);
    }
    if (null == this.stock_price_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_close);
    }
    if (null == this.stock_volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stock_volume);
    }
    if (null == this.stock_price_adj_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.stock_price_adj_close);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(exchange==null?"null":exchange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_symbol==null?"null":stock_symbol, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_open==null?"null":"" + stock_price_open, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_high==null?"null":"" + stock_price_high, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_low==null?"null":"" + stock_price_low, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_close==null?"null":"" + stock_price_close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_volume==null?"null":"" + stock_volume, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_adj_close==null?"null":"" + stock_price_adj_close, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(exchange==null?"null":exchange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_symbol==null?"null":stock_symbol, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_open==null?"null":"" + stock_price_open, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_high==null?"null":"" + stock_price_high, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_low==null?"null":"" + stock_price_low, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_close==null?"null":"" + stock_price_close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_volume==null?"null":"" + stock_volume, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_adj_close==null?"null":"" + stock_price_adj_close, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.exchange = null; } else {
      this.exchange = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stock_symbol = null; } else {
      this.stock_symbol = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_open = null; } else {
      this.stock_price_open = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_high = null; } else {
      this.stock_price_high = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_low = null; } else {
      this.stock_price_low = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_close = null; } else {
      this.stock_price_close = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_volume = null; } else {
      this.stock_volume = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_adj_close = null; } else {
      this.stock_price_adj_close = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.exchange = null; } else {
      this.exchange = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stock_symbol = null; } else {
      this.stock_symbol = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_open = null; } else {
      this.stock_price_open = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_high = null; } else {
      this.stock_price_high = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_low = null; } else {
      this.stock_price_low = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_close = null; } else {
      this.stock_price_close = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_volume = null; } else {
      this.stock_volume = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_adj_close = null; } else {
      this.stock_price_adj_close = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    nasdaq_daily_prices o = (nasdaq_daily_prices) super.clone();
    return o;
  }

  public void clone0(nasdaq_daily_prices o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("exchange", this.exchange);
    __sqoop$field_map.put("stock_symbol", this.stock_symbol);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("stock_price_open", this.stock_price_open);
    __sqoop$field_map.put("stock_price_high", this.stock_price_high);
    __sqoop$field_map.put("stock_price_low", this.stock_price_low);
    __sqoop$field_map.put("stock_price_close", this.stock_price_close);
    __sqoop$field_map.put("stock_volume", this.stock_volume);
    __sqoop$field_map.put("stock_price_adj_close", this.stock_price_adj_close);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("exchange", this.exchange);
    __sqoop$field_map.put("stock_symbol", this.stock_symbol);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("stock_price_open", this.stock_price_open);
    __sqoop$field_map.put("stock_price_high", this.stock_price_high);
    __sqoop$field_map.put("stock_price_low", this.stock_price_low);
    __sqoop$field_map.put("stock_price_close", this.stock_price_close);
    __sqoop$field_map.put("stock_volume", this.stock_volume);
    __sqoop$field_map.put("stock_price_adj_close", this.stock_price_adj_close);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("exchange".equals(__fieldName)) {
      this.exchange = (String) __fieldVal;
    }
    else    if ("stock_symbol".equals(__fieldName)) {
      this.stock_symbol = (String) __fieldVal;
    }
    else    if ("date".equals(__fieldName)) {
      this.date = (String) __fieldVal;
    }
    else    if ("stock_price_open".equals(__fieldName)) {
      this.stock_price_open = (Double) __fieldVal;
    }
    else    if ("stock_price_high".equals(__fieldName)) {
      this.stock_price_high = (Double) __fieldVal;
    }
    else    if ("stock_price_low".equals(__fieldName)) {
      this.stock_price_low = (Double) __fieldVal;
    }
    else    if ("stock_price_close".equals(__fieldName)) {
      this.stock_price_close = (Double) __fieldVal;
    }
    else    if ("stock_volume".equals(__fieldName)) {
      this.stock_volume = (Long) __fieldVal;
    }
    else    if ("stock_price_adj_close".equals(__fieldName)) {
      this.stock_price_adj_close = (Double) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("exchange".equals(__fieldName)) {
      this.exchange = (String) __fieldVal;
      return true;
    }
    else    if ("stock_symbol".equals(__fieldName)) {
      this.stock_symbol = (String) __fieldVal;
      return true;
    }
    else    if ("date".equals(__fieldName)) {
      this.date = (String) __fieldVal;
      return true;
    }
    else    if ("stock_price_open".equals(__fieldName)) {
      this.stock_price_open = (Double) __fieldVal;
      return true;
    }
    else    if ("stock_price_high".equals(__fieldName)) {
      this.stock_price_high = (Double) __fieldVal;
      return true;
    }
    else    if ("stock_price_low".equals(__fieldName)) {
      this.stock_price_low = (Double) __fieldVal;
      return true;
    }
    else    if ("stock_price_close".equals(__fieldName)) {
      this.stock_price_close = (Double) __fieldVal;
      return true;
    }
    else    if ("stock_volume".equals(__fieldName)) {
      this.stock_volume = (Long) __fieldVal;
      return true;
    }
    else    if ("stock_price_adj_close".equals(__fieldName)) {
      this.stock_price_adj_close = (Double) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
