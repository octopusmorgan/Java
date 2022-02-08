package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
	public static void main(String[] args) {
		String[] arreglo = {"Mau","Sofi","Sam","Abril"};
		System.out.println(arreglo[0]);
		
		ArrayList<String> cars = new ArrayList<String>();	
		
		cars.add("Toyota");//.add Añade elementos a la lista
		cars.add("Nissan");
		cars.add("Fiat");
		cars.add("Volvo");
		
		System.out.println(cars);
		
		System.out.println(cars.get(1));//obtenemos el valor guardado en el indice 
		
		cars.set(0,"BMW");//sustituye el valor en un inidice 
		System.out.println(cars);
		
		cars.remove(0);//elimina el valor de la lista
		System.out.println(cars);
		
		System.out.println(cars.size());
		
		//for para mostrar los datos del arreglo
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		//foreach para morstrar los datos guardados
		for (String  i : cars) {
			System.out.println(i);
		}
		
		Collections.sort(cars);
		for(String i:cars) {
			System.out.println(i); 
		}
			
		
		
	}
}
