package Empresa;


/**
* Empresa/_EmpresasStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Empresa.idl
* martes 23 de octubre de 2018 15H26' COT
*/

public class _EmpresasStub extends org.omg.CORBA.portable.ObjectImpl implements Empresa.Empresas
{

  public boolean insertarEmpresas (String nombre, String direccion, String telefono, String propietario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarEmpresas", true);
                $out.write_wstring (nombre);
                $out.write_wstring (direccion);
                $out.write_wstring (telefono);
                $out.write_wstring (propietario);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarEmpresas (nombre, direccion, telefono, propietario        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarEmpresas

  public boolean actualizarEmpresas (int ruc, String nombre, String apellido, String telefono, String propietario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarEmpresas", true);
                $out.write_long (ruc);
                $out.write_wstring (nombre);
                $out.write_wstring (apellido);
                $out.write_wstring (telefono);
                $out.write_wstring (propietario);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarEmpresas (ruc, nombre, apellido, telefono, propietario        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarEmpresas

  public boolean eliminarEmpresas (int ruc)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarEmpresas", true);
                $out.write_long (ruc);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarEmpresas (ruc        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarEmpresas

  public String consultarEmpresas (int ruc)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarEmpresas", true);
                $out.write_long (ruc);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarEmpresas (ruc        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarEmpresas

  public void shoutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shoutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shoutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shoutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Empresa/Empresas:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _EmpresasStub
