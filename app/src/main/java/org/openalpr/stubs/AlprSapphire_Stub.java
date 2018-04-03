/*
 * Stub for class org.openalpr.AlprSapphire
 * Generated by Sapphire Compiler (sc).
 */
package org.openalpr.stubs;


public final class AlprSapphire_Stub extends org.openalpr.AlprSapphire implements sapphire.common.AppObjectStub {

    sapphire.policy.SapphirePolicy.SapphireClientPolicy $__client = null;
    boolean $__directInvocation = false;

    public AlprSapphire_Stub () {
        super();
    }


    public void $__initialize(sapphire.policy.SapphirePolicy.SapphireClientPolicy client) {
        $__client = client;
    }

    public void $__initialize(boolean directInvocation) {
        $__directInvocation = directInvocation;
    }

    public Object $__clone() throws CloneNotSupportedException {
        return super.clone();
    }



    // Implementation of saveImage(String, byte[], int)
    public boolean saveImage(java.lang.String $param_String_1, byte[] $param_arrayOf_byte_2, int $param_int_3) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.saveImage( $param_String_1,  $param_arrayOf_byte_2,  $param_int_3);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public boolean org.openalpr.AlprSapphire.saveImage(java.lang.String,byte[],int)";
                $__params.add($param_String_1);
                $__params.add($param_arrayOf_byte_2);
                $__params.add($param_int_3);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ((java.lang.Boolean) $__result).booleanValue();
    }

    // Implementation of recognizeImage(String, String, String, String, String, int, Configuration.ProcessEntity)
    public org.openalpr.model.Results recognizeImage(java.lang.String $param_String_1, java.lang.String $param_String_2, java.lang.String $param_String_3, java.lang.String $param_String_4, java.lang.String $param_String_5, int $param_int_6, sapphire.common.Configuration.ProcessEntity $param_Configuration$ProcessEntity_7) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.recognizeImage( $param_String_1,  $param_String_2,  $param_String_3,  $param_String_4,  $param_String_5,  $param_int_6,  $param_Configuration$ProcessEntity_7);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public org.openalpr.model.Results org.openalpr.AlprSapphire.recognizeImage(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,sapphire.common.Configuration$ProcessEntity)";
                $__params.add($param_String_1);
                $__params.add($param_String_2);
                $__params.add($param_String_3);
                $__params.add($param_String_4);
                $__params.add($param_String_5);
                $__params.add($param_int_6);
                $__params.add($param_Configuration$ProcessEntity_7);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ((org.openalpr.model.Results) $__result);
    }

    // Implementation of migrateObject(InetSocketAddress)
    public void migrateObject(java.net.InetSocketAddress $param_InetSocketAddress_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.migrateObject( $param_InetSocketAddress_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void org.openalpr.AlprSapphire.migrateObject(java.net.InetSocketAddress)";
                $__params.add($param_InetSocketAddress_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
