import java.util.Scanner;


public class Inmueble {



		
		private String Direccion;
		private String Provincia;
		private String Localidad;
		private int Cod_postal;
		private String Fecha_construc;
		
//--------------------direccion--------------------------------	
		public String getDireccion()
		{
			return Direccion;
		}
		
		public void  setDireccion(String direccion1)
		{
			Direccion = direccion1;
		}



//--------------------provincia--------------------------------

		public String getProvincia()
		{
			return Provincia;
		}
		
		public void  setProvincia(String provincia1)
		{
			Provincia = provincia1;
		}


	
//---------------------localidad-------------------------------

		public String getLocalidad()
		{
			return Localidad;
		}
		
		public void  setLocalidad(String localidad1)
		{
			Localidad = localidad1;
		}



//--------------------cod_postal ------------------------

		public int getCod_postal()
		{
			return Cod_postal;
		}
		
		public void  setCod_postal(int cod_postal1)
		{
			Cod_postal = cod_postal1;
		}



//--------------------fecha de construccion ------------------------

		public String getFecha_construc()
		{
			return Fecha_construc;
		}
		
		public void  setFecha_construc(String fecha_construc1)
		{
			Fecha_construc = fecha_construc1;
		}



	
}
