package Proveedores;


/**
* Proveedores/ProveedorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Proveedor.idl
* sbado 10 de noviembre de 2018 08H57' COT
*/

public interface ProveedorOperations 
{
  boolean insertarProveedor (String nombre, String direccion, String telefono, int empresa_ruc);
  boolean actualizarProveedor (int ruc_prov, String nombre, String direccion, String telefono, int empresa_ruc);
  boolean eliminarProveedor (int ruc_prov);
  String consultarProveedor (int ruc_prov);
  void shoutdown ();
} // interface ProveedorOperations
