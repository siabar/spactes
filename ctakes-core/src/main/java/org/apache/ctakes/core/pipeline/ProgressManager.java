package org.apache.ctakes.core.pipeline;

import javax.swing.*;
import javax.swing.event.ChangeListener;

/**
 * @author SPF , chip-nlp
 * @version %I%
 * @since 1/4/2019
 */
public enum ProgressManager {
   INSTANCE;

   public static ProgressManager getInstance() {
      return INSTANCE;
   }

   private String _name;
   private final BoundedRangeModel _model;

   ProgressManager() {
      _model = new DefaultBoundedRangeModel();
   }

   public void initializeProgress( final String name, final int max ) {
      _name = name;
      _model.setRangeProperties( 0, 0, 0, max, false );
   }

   public String getName() {
      if ( _name == null || _name.trim().isEmpty() ) {
         return "Progress";
      }
      return _name;
   }

   public void updateProgress( final int value ) {
      if ( value <= _model.getValue() ) {
         return;
      }
      if ( _model.getMaximum() < value ) {
         _model.setMaximum( value );
      }
      _model.setValue( value );
   }

   public BoundedRangeModel getModel() {
      return _model;
   }

   public void addListener( final ChangeListener listener ) {
      _model.addChangeListener( listener );
   }

   public void removeListener( final ChangeListener listener ) {
      _model.removeChangeListener( listener );
   }

//
//   private final Map<String, BoundedRangeModel> _progressMap;
//
//
//   ProgressManager() {
//      _progressMap = new HashMap<>();
//   }
//
//   public void initializeProgress( final String name, final Object object, final int max ) {
//      initializeProgress( createHashName( name, object ), max );
//   }
//
//   private void initializeProgress( final String name, final int max ) {
//      final BoundedRangeModel model = _progressMap.computeIfAbsent( name, n -> new DefaultBoundedRangeModel() );
//      model.setValue( 0 );
//      model.setMaximum( max );
//   }
//
//   public void updateProgress( final String name, final Object object, final int value ) {
//      updateProgress( createHashName( name, object ), value );
//   }
//
//   private void updateProgress( final String name, final int value ) {
//      final BoundedRangeModel model = _progressMap.computeIfAbsent( name, n -> new DefaultBoundedRangeModel() );
//      if ( model.getMaximum() < value ) {
//         model.setMaximum( value );
//      }
//      model.setValue( value );
//   }
//
//   public void removeProgress( final String name, final Object object ) {
//      removeProgress( createHashName( name, object ) );
//   }
//
//   private void removeProgress( final String name ) {
//      _progressMap.remove( name );
//   }
//
//   static private String createHashName( final String name, final Object object ) {
//      return name + "_" + object.hashCode();
//   }


}
