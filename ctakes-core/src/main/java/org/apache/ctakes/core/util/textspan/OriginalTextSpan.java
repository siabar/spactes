package org.apache.ctakes.core.util.textspan;

import org.apache.uima.cas.text.AnnotationFS;

import javax.annotation.concurrent.Immutable;

/**
 * Holder for begin and end text span offsets within a containing sentence
 */
@Immutable
public final class OriginalTextSpan implements TextSpan {

   final private int _begin;
   final private int _end;

   /**
    * @param annotation     -
    * @param sentenceOffset begin span offset of the containing sentence
    */
   public OriginalTextSpan( final AnnotationFS annotation, final int sentenceOffset ) {
      this( annotation.getBegin(), annotation.getEnd());
   }


   /**
    * @param begin begin offset within the containing sentence
    * @param end   end offset within the containing sentence
    */
   public OriginalTextSpan( final int begin, final int end ) {
      _begin = begin;
      _end = end;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public int getBegin() {
      return _begin;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public int getEnd() {
      return _end;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public int getWidth() {
      return _end - _begin;
   }

   /**
    * NOTE: TextSpans are begin inclusive end exclusive.
    * So, 1 is subtracted from the end when comparing to another begin
    *
    * @param textSpan another textspan
    * @return true if there is overlap between the two text spans
    */
   @Override
   public boolean overlaps( final TextSpan textSpan ) {
      return !(textSpan.getEnd() - 1 < _begin) && !(textSpan.getBegin() > _end - 1);
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public boolean contains( TextSpan textSpan ) {
      return _begin <= textSpan.getBegin() && textSpan.getEnd() <= _end;
   }

   /**
    * @return a representation of the text span offsets as: begin,end
    */
   @Override
   public String toString() {
      return getBegin() + "," + getEnd();
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public boolean equals( final Object other ) {
      return other instanceof TextSpan && ((TextSpan)other).getBegin() == _begin && ((TextSpan)other).getEnd() == _end;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public int hashCode() {
      return 1000 * _end + _begin;
   }

}
