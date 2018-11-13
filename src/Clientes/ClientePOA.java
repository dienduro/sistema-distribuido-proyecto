package Clientes;



public abstract class ClientePOA extends org.omg.PortableServer.Servant
 implements Clientes.ClienteOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarCliente", new java.lang.Integer (0));
    _methods.put ("actualizarCliente", new java.lang.Integer (1));
    _methods.put ("eliminarCliente", new java.lang.Integer (2));
    _methods.put ("consultarCliente", new java.lang.Integer (3));
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
       case 0:  // Clientes/Cliente/insertarCliente
       {
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         int empresa_ruc = in.read_long ();
         boolean $result = false;
         $result = this.insertarCliente (nombre, apellido, empresa_ruc);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Clientes/Cliente/actualizarCliente
       {
         int id_cliente = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         int empresa_ruc = in.read_long ();
         boolean $result = false;
         $result = this.actualizarCliente (id_cliente, nombre, apellido, empresa_ruc);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Clientes/Cliente/eliminarCliente
       {
         int id_cliente = in.read_long ();
         boolean $result = false;
         $result = this.eliminarCliente (id_cliente);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Clientes/Cliente/consultarCliente
       {
         int id_cliente = in.read_long ();
         String $result = null;
         $result = this.consultarCliente (id_cliente);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Clientes/Cliente/shoutdown
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
    "IDL:Clientes/Cliente:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Cliente _this() 
  {
    return ClienteHelper.narrow(
    super._this_object());
  }

  public Cliente _this(org.omg.CORBA.ORB orb) 
  {
    return ClienteHelper.narrow(
    super._this_object(orb));
  }


} // class ClientePOA
