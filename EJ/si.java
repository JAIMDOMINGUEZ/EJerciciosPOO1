public class si{
    public static void main(String args[]){
        //if(1>0)
          //  System.out.println("hola");
        String menu ="";
        char x = (char)(Math.random()*26);
        switch(x){
            case 'a'://Directores
                menu += "Menu del director\n";
            case 'r'://Responsables
                menu += "Menu del responsable\n";
            case 'd'://docentes
                menu += "Menu del maestro\n";
            case 't'://tutor
                menu += "Menu del tutor\n";
            case 'e'://estudiantes
                menu += "Menu del alumno\n";
            default://otro
                menu += "Menu del visitante\n";
        }
    }
    
}