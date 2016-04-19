using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Data.SqlClient;

namespace DeamonSupplier
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "DeamonSupplier" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select DeamonSupplier.svc or DeamonSupplier.svc.cs at the Solution Explorer and start debugging.
    public class DeamonSupplier : IDeamonSupplier
    {

        /*
         * Takes a part requestby name and returns an amount of days for the product to be shipped.
         */
        public int Delay(string part)
        {
            Random rant = new Random();
            return rant.Next(2, 28);
        }

        /*
         * Takes a part requestby name and returns an amount of days for the product to be shipped.
         */
        public bool Order(string part)
        {
            SqlConnection con = new SqlConnection("Data Source=fastapps04.qut.edu.au;Initial Catalog=n8857954; User ID=n8857954; Password=apple");
            con.Open();
            string sql = "INSERT INTO [n8857954].[SupplierOrders] ([Part]) VALUES ('" + part +"')";
            SqlCommand command = new SqlCommand(sql, con);
            int changed = command.ExecuteNonQuery();
            System.Console.WriteLine(changed);
            con.Close();
            return true;
        }
    }
}
