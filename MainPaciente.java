import java.util.Scanner;// libreria
 class MainPaciente {// clase
    public static void main(String[] args) {// funcion prrincipal

        Scanner op = new Scanner(System.in);// leer datos
        String c, a;// variables
        int b;//variables int
       

        Paciente x = new Paciente();//objeto creacion

        System.out.println("tu nombre es ");//pedir datos 
        a = op.next();//guardar variables
        x.nombre = a;//dale valor al objeto 
        System.out.println("tu apellido es ");//pedir datos 
        c= op.next();//guardar variables
        x.apellido = c;//dale valor al objeto 
        System.out.println("cual es tu nss");//pedir datos 
        b = op.nextInt();
        x.nss = b;
            x.mostrarNombre();// para mostrar datos 
            x.mostrarNss();
}}