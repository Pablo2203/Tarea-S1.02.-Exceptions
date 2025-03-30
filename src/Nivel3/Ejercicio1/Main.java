package Nivel3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cinema cinema=new Cinema();
        cinema.start();
//Clase Principal
//
//Tendrá el main de la aplicación donde se instanciará un objeto de la clase "Cine" y llamará a su método "iniciar".
//

    }
}

//Tendrá el main de la aplicación donde se instanciará un objeto de la clase "Cine" y llamará a su método "iniciar".
//
//

//Una famosa empresa de cines nos ha pedido que desarrollemos una aplicación para la reserva de asientos en sus cines.
// La aplicación será utilizada por los vendedores/as a la hora de vender las entradas.
//
//Funcionamiento
//La aplicación una vez se haya iniciado, preguntará al usuario cuántas filas y cuántos asientos por fila tiene la
// sala de cine. Una vez introducidos estos datos, se mostrará el siguiente menú:
//
//1.- Mostrar todas las butacas reservadas.
//
//2.- Mostrar las butacas reservadas por una persona.
//
//3.- Reservar un sillón.
//
//4.- Anular la reserva de un sillón.
//
//5.- Anular todas las reservas de una persona.
//
//0.- Salir.
//
//
//La aplicación tendrá las siguientes clases:
//
//Clase Principal
//
//Tendrá el main de la aplicación donde se instanciará un objeto de la clase "Cine" y llamará a su método "iniciar".
//
//
//Clase Butaca
//
//Tendrá los datos de un sillón:
//
//Atributos:
//
//Número de fila.
//
//Número de asiento.
//
//Persona que reserva el sillón.
//
//Métodos:
//
//Constructor con todos sus parámetros.
//
//Getters por todos los atributos.
//
//Equals: devolverá que dos butacas son iguales si la fila y el asiento son iguales.
//
//toString: devolverá un String con el siguiente formato: “Fila: 5, Asiento: 20, Persona: Maria Febrer”
//
//
//Clase Cine
//
//Contendrá los atributos y el método de inicialización.
//
//Atributos:
//
//Número de filas del cine.
//
//Número de asientos por cada fila.
//
//Un objeto de la clase "GestioButaques"
//
//Un objeto de la clase "GestioCine"
//Métodos:
//
//Constructor: no recibirá parámetros. Inicializará el objeto de la clase "GestioButaques" y "GestioCine".
// Llamará al método "pedir Datos Iniciales" que inicializará el número de filas y de asientos.
//
//iniciar: empezará la aplicación. Llamará al método "menu" y en función del número devuelto, llamará al
// método correspondiente de la clase "GestioCine".
//
//"pedirDatosIniciales": Pedirá al usuario el número de filas y asientos y los guardará en los atributos correspondientes
//Clase GestioCine:
//
//Contendrá la lógica para la gestión de las operaciones del cine.
//
//Atributos:
//
//Un objeto de la clase "Cine"
//
//Métodos:
//
//"Constructor": Recibirá como parámetro un objeto de la clase "Cine" y lo asignará al atributo correspondiente.
//
//"menu": Mostrará las opciones del menú principal al usuario, le pedirá el número de la opción escogida y lo devolverá.
//
//"mostrarButacas": Muestra todas las butacas reservadas.
//
//"mostrarButacasPersona": Pide el nombre de la persona que ha hecho la reserva y muestra todas las butacas reservadas
// por esa persona
//
//"reservarButaca": Pide al usuario un número de fila (llamada al método "introducirFila"), un número de asiento
// (llamada al método "introducirAsiento"), el nombre de la persona que hace la reserva (llama al método "introducirPersona")
//  y reserva el sillón.
//
//"anularReserva": Pide al usuario un número de fila (llamada al método "introducirFila"), un número de asiento (llamada
// al método "introducirAsiento") y elimina la reserva del sillón.
//
//"anularReservaPersona": Pide al usuario el nombre de la persona (llamada al método "introducirPersona") y elimina las
// butacas reservadas por la persona introducida.
//
//"introducirPersona": Pide al usuario el nombre de la persona y lo devuelve si es correcto. Si contiene números, lanza una
// excepción personalizada "ExcepcionNomPersonaIncorrecte"
//
//"introducirFila": Pide el número de fila, si éste está entre 1 y el número de filas totales, lo devuelve. Si no, lanza
// una excepción personalizada "ExcepcioFilaIncorrecta"
//
//"introducirAsiento": Pide el asiento, si el número está entre 1 y el número total de asientos, lo devuelve. Si no, lanza
// una excepción personalizada "ExcepcioSeientIncorrecte"
//
//
//Clase GestioButacas
//
//Contendrá un ArrayList de butacas y los métodos necesarios para añadir, eliminar y buscar las butacas en ArrayList.
//
//Atributos:
//
//sillones: ArrayList de sillones.
//
//Métodos:
//
//Constructor: No recibirá parámetros e inicializará el ArrayList de butacas.
//
//getButacas: Devolverá el atributo sillones.
//
//"añadirButaca": será el encargado de añadir una butaca al ArrayList de butacas. Recibirá como parámetro un objeto de la
// clase "Butaca" y lo añadirá a ArrayList. Si la fila y el asiento de la butaca recibida como parámetro coinciden con el
// de una butaca que ya se encuentre en ArrayList (se utilizará el método "buscarButaca"), se lanzará la excepción personalizada
//  "ExcepcioButacaOcupada".
//
//"eliminarButaca": será el encargado de eliminar una butaca del ArrayList de butacas. Recibirá como parámetros el número de fila
// y el asiento y lo eliminará del ArrayList. Si la fila y el asiento no coinciden con el de un sillón reservado (se utilizará el
// método "buscarButaca"), lanzará una excepción personalizada "ExcepcioButacaLibre".
//
//"buscarButaca": Buscar en el ArrayList de butacas, la butaca que coincida con los datos recibidos como parámetro (fila y asiento).
// Si la encuentra, devolverá la posición de la butaca a ArrayList y, si no la encuentra, devolverá -1.