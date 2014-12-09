// ORM class for table 'stock_volume'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Dec 08 22:19:51 PST 2014
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

public class stock_volume extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String stock_symbol;
  public String get_stock_symbol() {
    return stock_symbol;
  }
  public void set_stock_symbol(String stock_symbol) {
    this.stock_symbol = stock_symbol;
  }
  public stock_volume with_stock_symbol(String stock_symbol) {
    this.stock_symbol = stock_symbol;
    return this;
  }
  private Double total_stock_volume;
  public Double get_total_stock_volume() {
    return total_stock_volume;
  }
  public void set_total_stock_volume(Double total_stock_volume) {
    this.total_stock_volume = total_stock_volume;
  }
  public stock_volume with_total_stock_volume(Double total_stock_volume) {
    this.total_stock_volume = total_stock_volume;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof stock_volume)) {
      return false;
    }
    stock_volume that = (stock_volume) o;
    boolean equal = true;
    equal = equal && (this.stock_symbol == null ? that.stock_symbol == null : this.stock_symbol.equals(that.stock_symbol));
    equal = equal && (this.total_stock_volume == null ? that.total_stock_volume == null : this.total_stock_volume.equals(that.total_stock_volume));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof stock_volume)) {
      return false;
    }
    stock_volume that = (stock_volume) o;
    boolean equal = true;
    equal = equal && (this.stock_symbol == null ? that.stock_symbol == null : this.stock_symbol.equals(that.stock_symbol));
    equal = equal && (this.total_stock_volume == null ? that.total_stock_volume == null : this.total_stock_volume.equals(that.total_stock_volume));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.stock_symbol = JdbcWritableBridge.readString(1, __dbResults);
    this.total_stock_volume = JdbcWritableBridge.readDouble(2, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.stock_symbol = JdbcWritableBridge.readString(1, __dbResults);
    this.total_stock_volume = JdbcWritableBridge.readDouble(2, __dbResults);
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
    JdbcWritableBridge.writeString(stock_symbol, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(total_stock_volume, 2 + __off, 8, __dbStmt);
    return 2;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(stock_symbol, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(total_stock_volume, 2 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.stock_symbol = null;
    } else {
    this.stock_symbol = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.total_stock_volume = null;
    } else {
    this.total_stock_volume = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.stock_symbol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock_symbol);
    }
    if (null == this.total_stock_volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.total_stock_volume);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.stock_symbol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock_symbol);
    }
    if (null == this.total_stock_volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.total_stock_volume);
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
    __sb.append(FieldFormatter.escapeAndEnclose(stock_symbol==null?"null":stock_symbol, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_stock_volume==null?"null":"" + total_stock_volume, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(stock_symbol==null?"null":stock_symbol, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total_stock_volume==null?"null":"" + total_stock_volume, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null")) { this.stock_symbol = null; } else {
      this.stock_symbol = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_stock_volume = null; } else {
      this.total_stock_volume = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stock_symbol = null; } else {
      this.stock_symbol = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total_stock_volume = null; } else {
      this.total_stock_volume = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    stock_volume o = (stock_volume) super.clone();
    return o;
  }

  public void clone0(stock_volume o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("stock_symbol", this.stock_symbol);
    __sqoop$field_map.put("total_stock_volume", this.total_stock_volume);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("stock_symbol", this.stock_symbol);
    __sqoop$field_map.put("total_stock_volume", this.total_stock_volume);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("stock_symbol".equals(__fieldName)) {
      this.stock_symbol = (String) __fieldVal;
    }
    else    if ("total_stock_volume".equals(__fieldName)) {
      this.total_stock_volume = (Double) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("stock_symbol".equals(__fieldName)) {
      this.stock_symbol = (String) __fieldVal;
      return true;
    }
    else    if ("total_stock_volume".equals(__fieldName)) {
      this.total_stock_volume = (Double) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
