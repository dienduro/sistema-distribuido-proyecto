package Comprobante_De_Venta;

/**
* Comprobante_De_Venta/ComprobanteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Comprobantes.idl
* viernes 9 de noviembre de 2018 00H19' COT
*/

public final class ComprobanteHolder implements org.omg.CORBA.portable.Streamable
{
  public Comprobante_De_Venta.Comprobante value = null;

  public ComprobanteHolder ()
  {
  }

  public ComprobanteHolder (Comprobante_De_Venta.Comprobante initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Comprobante_De_Venta.ComprobanteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Comprobante_De_Venta.ComprobanteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Comprobante_De_Venta.ComprobanteHelper.type ();
  }

}