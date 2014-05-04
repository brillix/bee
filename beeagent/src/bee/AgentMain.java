package bee;



import  bee.DAL;



public class AgentMain {

    static DAL query1 = new  DAL();
	public static void main( String args[] )
	 {
		//query1.GetQuery("select 1 from dual");
	//	System.out.print(query1.RunQuery("oracle.jdbc.driver.OracleDriver","select FILE_NAME as FILEN,BYTES as SIZEB from dba_data_files","jdbc:oracle:thin:@localhost:1521:xe","system","test123")+"\n");

		System.out.print(query1.RunQuery("oracle.jdbc.driver.OracleDriver","select open_mode from v$database","jdbc:oracle:thin:@localhost:1521:xe","system","test123"));		

		//System.out.print(query1.RunQueryGetString("com.mysql.jdbc.Driver","select 1 as RESULT","jdbc:mysql://localhost:3306/mysql","root","test123"));
	 }

}
