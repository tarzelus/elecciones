import java.util.Scanner;


public class Ayuntamiento {




		private String Localidad;		
		private String Alcalde;
		private String Govierno;	
		private int Populacion;
		private int Censo;
		private String Cod_postal;
		private double Extension;

		
	
		
//--------------------localidad--------------------------------	
		public String getLocalidad()
		{
			return Localidad;
		}
		
		public void  setLocalidad(String localidad1)
		{
			Localidad=localidad1;
		}


//---------------------alcalde-------------------------------

		public String getAlcalde()
		{
			return Alcalde;
		}
		
		public void  setAlcalde(String alcalde1)
		{
			Alcalde=alcalde1;
		}


//--------------------govierno--------------------------------

		public String getGovierno()
		{
			return Govierno;
		}
		
		public void  setGovierno(String govierno1)
		{
			Govierno=govierno1;
		}


	
//---------------------populacion-------------------------------

		public int getPopulacion()
		{
			return Populacion;
		}
		
		public void  setPopulacion(int populacion1)
		{
			Populacion=populacion1;
		}



//--------------------censo------------------------

		public int getaCenso()
		{
			return Censo;
		}
		
		public void  setCenso(int censo1)
		{
			Censo=censo1;
		}


//--------------------extension------------------------

		public double getExtension()
		{
			return Extension;
		}
		
		public void  setExtension(double extension1)
		{
			Extension=extension1;
		}



//--------------------cod_postal ------------------------

		public String getCod_postal()
		{
			return Cod_postal;
		}
		
		public void  setCod_postal(String cod_postal1)
		{
			Cod_postal=cod_postal1;
		}



	
}
