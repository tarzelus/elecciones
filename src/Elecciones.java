import java.util.Scanner;
import java.util.*;
import java.io.*;



public class Elecciones {

	public static void main (String args[]) throws IOException{

		Scanner sc = new Scanner(System.in);

//-------------------------------------------habitante------------------------------------------------	
		
		String DNI, nombre, apellido, fecha_naci;
		Habitante habitante = new Habitante();

		System.out.print("\n-------------introduce los datos del habitante------------------");	

		//comprueba que el DNI inglresado tiene el numero de caracteres que tiene que tener un DNI
		do{
	
		System.out.print("\ningresa el numero del DNI con letra (8 numeros y 1 letra): ");
		DNI = sc.next();
		habitante.setDni(DNI);
		} while (DNI.length() >9 || DNI.length() < 9);

		System.out.print("\ningresa el Nombre del habitante: ");
		nombre = sc.next();
		habitante.setNombre(nombre);

		System.out.print("\ningresa el apellido del hahbitante: ");
		apellido = sc.next();
		habitante.setApellido(apellido);

		System.out.print("\ningresa la fecha de nacimiento del habitante: ");
		fecha_naci = sc.next();
		habitante.setFecha_naci(fecha_naci);

//-------------------------------------------Inmueble------------------------------------------------	


		String direccion, provincia, localidad, fecha_construc;
		int cod_postal;

		Inmueble inmueble = new Inmueble();

		System.out.print("\n-------------Datos del inmueble------------------");	


		System.out.print("\ningresa la dirección del inmueble: ");
		direccion = sc.nextLine();
		inmueble.setDireccion(direccion);

		System.out.print("\ningresa el nombre de la provivncia del inmueble: ");
		provincia = sc.next();
		inmueble.setProvincia(provincia);

		System.out.print("\ningresa la localidad del inmueble: ");
		localidad = sc.next();
		inmueble.setLocalidad(localidad);

		System.out.print("\nIngresa el  codigo postal del inmueble:  ");
		cod_postal = sc.nextInt();
		inmueble.setCod_postal(cod_postal);

		System.out.print("\nIngresa la fecha de construccion del inmueble ");
		fecha_construc = sc.next();
		inmueble.setFecha_construc(fecha_construc);

//-------------------------------------------Espacio Publico------------------------------------------------

		String direccione, tipo, localidade;

		EspacioPublico espaciopublico = new EspacioPublico();
		
		System.out.print("\n-------------Espacio publico------------------");

		System.out.print("\ningresa el tipo de espacio publico ");
		tipo = sc.next();
		espaciopublico.setTipo(tipo);

	
		System.out.print("\ningresa la localidad del espacio publico: ");
		localidade = sc.next();
		espaciopublico.setLocalidad(localidad);	
	
		System.out.print("\ningresa la direccion del espacio publico ");
		direccione = sc.next();
		espaciopublico.setDireccion(direccione);




//-----------------------------------------Ayuntamiento---------------------------------------------
		

 		String localidada,alcalde,govierno,cod_postala;		
 		int populacion,censo;
		double extension;
		 
		Ayuntamiento ayuntamiento = new Ayuntamiento();

		System.out.print("\n-------------Ayuntamiento------------------");

		System.out.print("\ningresa la localidad del ayuntamiento: ");
		localidada = sc.next();
		ayuntamiento.setLocalidad(localidada);	
	
		System.out.print("\ningresa el nombre del alcalde: ");
		alcalde = sc.next();
		ayuntamiento.setAlcalde(alcalde);

		System.out.print("\ningresa el partido del alcalde: ");
		govierno = sc.next();
		ayuntamiento.setGovierno(govierno);

		System.out.print("\ningresa el codigo postal que abarcarca el ayuntamiento: ");
		cod_postala = sc.next();
		ayuntamiento.setGovierno(cod_postala);

		System.out.print("\nIngresa la extensio de los terrenos del ayuntamientos: ");
		extension = sc.nextDouble();
		ayuntamiento.setExtension(extension);

		System.out.print("\ningresa la populacion de la ciudad:  ");
		populacion = sc.nextInt();
		ayuntamiento.setPopulacion(populacion);

		System.out.print("\ningresa la censo de la ciudad:  ");
		censo = sc.nextInt();
		ayuntamiento.setCenso(censo);



//-----------------------------------------partidos---------------------------------------------


//lectura del fichero listadosPartidos.txt y guardarlos en un arraylist para imprimirlos


System.out.print("\n-------------partidos------------------\n");	


		String nombrefichero = "listadosPartidos.txt";
		String ruta ="/home/zubiri/Proyectosjava/elecciones/src";
	

		String salida;
		int i = 0;

		try 
		{	
		//lectura del fichero	
			File archivo = new File(ruta, nombrefichero);
			FileReader leer = new FileReader (archivo);
			BufferedReader bf = new BufferedReader(leer);
			
						

			int num = 0;

			
			do{
				// se le da valor a la variable de salida de tipo string de la linea que lee
				salida = bf.readLine();
				//conversion del valor del string salida a array 
				ArrayList <String> sep = new ArrayList <String>(Arrays.asList(salida.split(",")));
					
							
				Partido part = new Partido();
				part.setNombre(sep.get(0));
				part.setLider(sep.get(1));
				part.setIdeologia(sep.get(2));
				part.setCant_militantes(Integer.parseInt(sep.get(3)));
				part.setPrevias_elecciones(Integer.parseInt(sep.get(4)));
			num = num + 1;

			System.out.print("\n---------------partido "+num +"------------------");	
			System.out.println("\nEste es el nombre del partido: " + part.getNombre());
			System.out.println("\nLider del partido: " + part.getLider());
			System.out.println("\nIdeologia del partido: " + part.getIdeologia());
			System.out.println("\nCantidad de milistantes: " + part.getCant_militantes());
			System.out.println("\nPrevias elecciones: " + part.getPrevias_elecciones());
			

			}while (salida != null) ;
				
					
				

   					
							
			
		}
		 catch (FileNotFoundException e) 
		{
           		 System.out.println(e.getMessage());
        	}	





//-------------------------------------impresion de los datos----------------------------------------

		System.out.print("\n-------------Estos son los datos del habitante------------------");	

		
			System.out.println("\nEl Numero del DNI es: " + habitante.correcto());
			System.out.println("\nEl nombre Del habitante es : " + habitante.getNombre());
			System.out.println("\nEl apellido del habitante: " + habitante.getApellido());
			System.out.println("\nla fecha de nacimiento del habitante es: " + habitante.getFecha_naci());

		
		System.out.print("\n-------------Estos son los datos del habitante------------------");	

			System.out.println("\nLa direccion del inmueble: " + inmueble.getDireccion());
			System.out.println("\nProvincia del inmueble : " + inmueble.getProvincia());
			System.out.println("\nLocalidad del inmueble: " + inmueble.getLocalidad());
			System.out.println("\nCódigo postal del inmueble: " + inmueble.getCod_postal());
			System.out.println("\nFecha de construcción del inmueble: " + inmueble.getFecha_construc());

		System.out.print("\n-------------Estos son los datos del espacio publico------------------");	

			System.out.println("\nEste es el tipo de espacio publico que es: " + espaciopublico.getTipo());
			System.out.println("\nLocalidad del espacio publico: " + espaciopublico.getLocalidad());
			System.out.println("\nLa direccion del espacio publico: " + espaciopublico.getDireccion());

	
	
			



	}
}
