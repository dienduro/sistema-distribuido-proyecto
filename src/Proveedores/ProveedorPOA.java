package Proveedores;


/**
* Proveedores/ProveedorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Proveedor.idl
* s�bado 10 de noviembre de 2018 08H57' COT
*/

public abstract class ProveedorPOA extends org.omg.PortableServer.Servant
 implements Proveedores.ProveedorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarProveedor", new java.lang.Integer (0));
    _methods.put ("actualizarProveedor", new java.lang.Integer (1));
    _methods.put ("eliminarProveedor", new java.lang.Integer (2));
    _methods.put ("consultarProveedor", new java.lang.Integer (3));
    _methods.put ("shoutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Proveedores/Proveedor/insertarProveedor
       {
         String nombre = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         int empresa_ruc = in.read_long ();
         boolean $result = false;
         $result = this.insertarProveedor (nombre, direccion, telefono, empresa_ruc);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Proveedores/Proveedor/actualizarProveedor
       {
         int ruc_prov = in.read_long ();
         String nombre = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         int empresa_ruc = in.read_long ();
         boolean $result = false;
         $result = this.actualizarProveedor (ruc_prov, nombre, direccion, telefono, empresa_ruc);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Proveedores/Proveedor/eliminarProveedor
       {
         int ruc_prov = in.read_long ();
         boolean $result = false;
         $result = this.eliminarProveedor (ruc_prov);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Proveedores/Proveedor/consultarProveedor
       {
         int ruc_prov = in.read_long ();
         String $result = null;
         $result = this.consultarProveedor (ruc_prov);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Proveedores/Proveedor/shoutdown
       {
         this.shoutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Proveedores/Proveedor:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Proveedor _this() 
  {
    return ProveedorHelper.narrow(
    super._this_object());
  }

  public Proveedor _this(org.omg.CORBA.ORB orb) 
  {
    return ProveedorHelper.narrow(
    super._this_object(orb));
  }


} // class ProveedorPOA
