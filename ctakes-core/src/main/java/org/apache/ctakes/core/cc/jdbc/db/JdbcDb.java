package org.apache.ctakes.core.cc.jdbc.db;


import org.apache.ctakes.core.cc.jdbc.table.JdbcTable;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author SPF , chip-nlp
 * @version %I%
 * @since 3/12/2019
 */
public interface JdbcDb {

   /**
    * @param table new table to register.
    */
   void addTable( final JdbcTable<?> table );

   /**
    * @return all registered tables.
    */
   Collection<JdbcTable<?>> getTables();

   /**
    * @param dataClass class of data.
    * @return all registered tables that handle that type of data.
    */
   default <T> Collection<JdbcTable<T>> getTables( final Class<T> dataClass ) {
      final Collection<JdbcTable<T>> tables = new ArrayList<>();
      for ( JdbcTable<?> table : getTables() ) {
         final Class<?> dataType = table.getDataType();
         if ( dataType != null && dataType.isAssignableFrom( dataClass ) ) {
            tables.add( (JdbcTable<T>)table );
         }
      }
      return tables;
   }

   /**
    * Close each table.
    *
    * @throws SQLException -
    */
   default void close() throws SQLException {
      for ( JdbcTable<?> table : getTables() ) {
         table.close();
      }
   }

}