package mx.uv;

public class AppPrueba {
    public static void main( String[] args )
   
    {

         //Datos u = new Datos("diego", "julio", "asd", "1", 4, 0, 0, 0);
         //Datos u = DAO.iniciarSesion("diego1", "asd");
        if(DAO.existe("diego", "asd")){
            System.out.println("existe//");
            //System.out.println(u.toString());
        }else{
            System.out.println("no existe");
        }

    }
    
}
