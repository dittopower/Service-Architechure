﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.34014
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------



[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
[System.ServiceModel.ServiceContractAttribute(Namespace="http://www.qut.com/DeamonSupplier", ConfigurationName="DeamonSupplier")]
public interface DeamonSupplier
{
    
    [System.ServiceModel.OperationContractAttribute(Action="urn:DeamonSupplierIntf-DeamonSupplier#Delay")]
    [System.ServiceModel.XmlSerializerFormatAttribute(Style=System.ServiceModel.OperationFormatStyle.Rpc)]
    [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
    int Delay(string part);
    
    [System.ServiceModel.OperationContractAttribute(Action="urn:DeamonSupplierBoolf-DeamonSupplier#Order")]
    [System.ServiceModel.XmlSerializerFormatAttribute(Style=System.ServiceModel.OperationFormatStyle.Rpc)]
    [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
    string Order(string part);
}