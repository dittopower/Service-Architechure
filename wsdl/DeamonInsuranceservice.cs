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
[System.ServiceModel.ServiceContractAttribute(Namespace="http://www.qut.com/DeamonInsurance", ConfigurationName="DeamonInsurance")]
public interface DeamonInsurance
{
    
    [System.ServiceModel.OperationContractAttribute(Action="urn:DeamonInsuranceIntf-DeamonInsurance#Coverage")]
    [System.ServiceModel.DataContractFormatAttribute(Style=System.ServiceModel.OperationFormatStyle.Rpc)]
    [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
    int Coverage(int customerid);
}