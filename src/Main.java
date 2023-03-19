import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final int FILAS = 100;
        final int COLUMNAS = 3;
        String vinilos [][] = new String [FILAS][COLUMNAS];
        agregarVinilo(vinilos, "Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "Iron Maiden", "Killers", "1981");
        agregarVinilo(vinilos, "Iron Maiden", "The number of the beast", "1982");
        agregarVinilo(vinilos, "AC-DC", "Back in black", "1980");
        agregarVinilo(vinilos, "AC-DC", "Highway to Hell", "1979");
        agregarVinilo(vinilos, "AC-DC", "Who made who", "1986");
        agregarVinilo(vinilos, "Judas Priest", "British steel", "1980");
        agregarVinilo(vinilos, "Judas Priest", "Painkiller", "1990");
        agregarVinilo(vinilos, "Judas Priest", "Defenders of the faith", "1984");
        agregarVinilo(vinilos, "Kiss", "Destroyer", "1976");
        System.out.println("Espacio máximo colección: "+vinilos.length);
        //mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);
        //String artista = "AC-DC";
        //System.out.println("Buscar artista: "+artista);
        //mostrarBusquedaArtista(vinilos,artista);
        //buscarArtista(vinilos, "AC-DC");
        mostrarColeccion(vinilos);

    }

    public static int totalVinilos(String m[][]){

        return 0;
    }
    public static String [][] agregarVinilo(String m[][], String grupo, String album, String año) {
        for (int i = 0; i < 100; i++) {
            if (m[i][0] == null && m[i][1] == null && m[i][2] == null) {
                m[i][0] = grupo;
                m[i][1] = album;
                m[i][2] = año;
                //System.out.println(m[i][0] + ", " + m[i][1] + ", " + m[i][2]);
                return m;
            }
        }
        return m;
    }

    public static boolean buscarArtista(String m[][], String artista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inrgese artista a buscar");
        int contador = 0;
        //String temp = sc.nextLine();
        for (int i = 0; i < 100 ; i++) {
            System.out.println(m[i][0]);
            contador += 1;
            System.out.println(contador);
        }
        return false;
    }
    public static void mostrarColeccion(String m[][]) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] != null) {
                    System.out.print(m[i][j]+", ");
                }
                else {
                    return;
                }

            }
            System.out.println(" ");
        }
    }
    public static void mostrarTotal(String m[][]) {
    }
    public static void mostrarDisponibles(String m[][]) {
        int contador = 0;
        for (int i = 0; i < 100; i++) {
            if (m[i][0] != null) {

            }else {
                contador= contador+1;
            }
        }
        System.out.println("hay "+ contador+ " espacios disponibles");
    }
    public static int disponibles(String m[][]) {
        return 0;
    }

    public static void mostrarBusquedaArtista(String m[][], String artista) {

    }
}
