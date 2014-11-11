import java.util.Scanner;


public class Habitante {

			
		public String Dni;
		public String Nombre;
		public String Apellido;
		public String Fecha_naci;
		
//--------------------DNI--------------------------------	
		



		public String getDni()
		{
			return Dni;
		
		}
		
		public void  setDni(String DNI1)
		{
			Dni=DNI1;
		}


    //comprobacion del final del DNI sea contenga letra  

		public String correcto () 
		{
			
		
			if(!Dni.endsWith("a-z") || !Dni.endsWith("A-Z")) 
			{	
				
				Dni="\nEl DNI necesita letra";
			 }

		return Dni;
 		}




		
//--------------------nombre--------------------------------

		public String getNombre()
		{
			return Nombre;

			
		}
		
		public void  setNombre(String nombre1)
		{
			Nombre=nombre1;
		}

	
	
//---------------------apellido-------------------------------

		public String getApellido()
		{
			return Apellido;
		}
		
		public void  setApellido(String apellido1)
		{
			Apellido=apellido1;
		}



//--------------------fecha de nacimiento ------------------------

		public String getFecha_naci()
		{
			return Fecha_naci;
		}
		
		public void  setFecha_naci(String fecha_naci1)
		{
			Fecha_naci=fecha_naci1;
		}



	}

