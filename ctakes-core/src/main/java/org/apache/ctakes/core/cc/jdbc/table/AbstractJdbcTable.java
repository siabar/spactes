package org.apache.ctakes.core.cc.jdbc.table;


import javax.annotation.concurrent.NotThreadSafe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author SPF , chip-nlp
 * @version %I%
 * @since 3/12/2019
 */
@NotThreadSafe
abstract public class AbstractJdbcTable<T> implements JdbcTable<T> {

   static private final int DEFAULT_BATCH_LIMIT = 100;

   private final String _tableName;
   private final PreparedStatement _preparedStatement;
   private int _batchLimit = DEFAULT_BATCH_LIMIT;
   private int _batchIndex = 0;

   public AbstractJdbcTable( final Connection connection, final String tableName ) throws SQLException {
      _tableName = tableName;
      final String sql = createRowInsertSql();
      _preparedStatement = connection.prepareStatement( sql );
   }

   /**
    * {@inheritDoc}
    */
   @Override
   final public String getTableName() {
      return _tableName;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   final public PreparedStatement getPreparedStatement() {
      return _preparedStatement;
   }

   /**
    * @param limit batch size limit after which the batch is written to the db table.  Max 10,000.
    */
   final public void setBatchLimit( final int limit ) {
      if ( limit > 0 && limit <= 10000 ) {
         _batchLimit = limit;
      }
   }

   /**
    * @return batch size limit after which the batch is written to the db table.
    */
   final public int getBatchLimit() {
      return _batchLimit;
   }

   /**
    * @return true if the statement batch was written.
    * @throws SQLException -
    */
   protected boolean writeRow() throws SQLException {
      final PreparedStatement statement = getPreparedStatement();
      statement.addBatch();
      _batchIndex++;
      if ( _batchIndex >= _batchLimit ) {
         _batchIndex = 0;
         statement.executeBatch();
         statement.clearBatch();
         return true;
      }
      return false;
   }

}
