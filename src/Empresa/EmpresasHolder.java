package Empresa;

/**
* Empresa/EmpresasHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Empresa.idl
* jueves 25 de octubre de 2018 12H40' COT
*/

public final class EmpresasHolder implements org.omg.CORBA.portable.Streamable
{
  public Empresa.Empresas value = null;

  public EmpresasHolder ()
  {
  }

  public EmpresasHolder (Empresa.Empresas initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Empresa.EmpresasHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Empresa.EmpresasHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Empresa.EmpresasHelper.type ();
  }

}
