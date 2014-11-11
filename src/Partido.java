import java.util.Scanner;


public class Partido {



		private String Nombre;		
		private String Lider;		
		private String Ideologia;
		private int Cant_militantes;	
		private int Previas_elecciones;


//--------------------nombre--------------------------------

		public String getNombre()
		{
			return Nombre;
		}
		
		public void  setNombre(String nombre1)
		{
			Nombre=nombre1;
		}



		
	
		
//--------------------lider--------------------------------

		public String getLider()
		{
			return Lider;
		}
		
		public void  setLider(String lider1)
		{
			Lider=lider1;
		}


//---------------------ideologia-------------------------------

		public String getIdeologia()
		{
			return Ideologia;
		}
		
		public void  setIdeologia(String ideologia1)
		{
			Ideologia=ideologia1;
		}


//--------------------cant_militantes--------------------------------

		public int getCant_militantes()
		{
			return Cant_militantes;
		}
		
		public void  setCant_militantes(int cant_militantes1)
		{
			Cant_militantes=cant_militantes1;
		}


//---------------------previas_votaciones-------------------------------

		public int getPrevias_elecciones()
		{
			return Previas_elecciones;
		}
		
		public void  setPrevias_elecciones(int previas_elecciones1)
		{
			Previas_elecciones=previas_elecciones1;
		}




	
}
