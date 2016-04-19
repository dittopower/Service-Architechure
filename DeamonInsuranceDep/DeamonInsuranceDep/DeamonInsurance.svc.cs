using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Data.SqlClient;

namespace DeamonInsuranceDep
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "DeamonInsurance" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select DeamonInsurance.svc or DeamonInsurance.svc.cs at the Solution Explorer and start debugging.
    public class DeamonInsurance : IDeamonInsurance
    {
        public int Coverage(int customerid)
        {
            
            SqlConnection con = new SqlConnection("Data Source=fastapps04.qut.edu.au;Initial Catalog=n8857954; User ID=n8857954; Password=apple");
            con.Open();

            string sql = "SELECT coverage FROM insurance where id = '" + customerid + "'";
            SqlCommand command = new SqlCommand(sql, con);
            SqlDataReader reader = command.ExecuteReader();

            int contribution = 0;
            if (reader.Read())
            {
                contribution = reader.GetInt32(0);
            }
            reader.Close();
            con.Close();
            return contribution;
        }
    }
}
