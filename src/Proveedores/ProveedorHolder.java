package Proveedores;

/**
* Proveedores/ProveedorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Proveedor.idl
* sbado 10 de noviembre de 2018 08H57' COT
*/

public final class ProveedorHolder implements org.omg.CORBA.portable.Streamable
{
  public Proveedores.Proveedor value = null;

  public ProveedorHolder ()
  {
  }

  public ProveedorHolder (Proveedores.Proveedor initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Proveedores.ProveedorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Proveedores.ProveedorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Proveedores.ProveedorHelper.type ();
  }

}
