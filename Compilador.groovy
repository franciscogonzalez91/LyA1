import static java.lang.String.format;
import java.io.*;


class Leer {    
    static Reconocer(String Archivo){
        //def regAsignacionString = "^(([a-zA-Z0-9]+ ?)+?\s*->\s*\"([a-zA-Z0-9]+ ?)\"+?)$"
        /*def regAsignacion = "/^(([a-zA-Z0-9]+ ?)+?\s*->\s*([a-zA-Z0-9]+ ?)+?)$/"
        def regClase = "/^(Clase (Protec|Pub|Priv) ([a-zA-Z]+[0-9]*)\[\])$/"
        def regComparacion = "/^([a-zA-Z0-9]+\s*<->\s*[a-zA-Z0-9]+)$/"
        def redDefinicion = "/^(Def: [a-zA-Z]+[0-9]*)/$"
        def regFuncion = "Func"
        def regIf = "/^(Sicumple \[(\s)*([a-zA-Z]+[0-9]*)\] Entonces)$/"
        def regElseIf = "/^(Sino \[(\s)*([a-zA-Z]+[0-9]*)\] Entonces)$/"
        def regElse = "/^(Sinocumple)$/"
        /*def regFinalizar = "Finzaliza"
        //def regImprimir = "/^(Imprimir [a-zA-Z0-9]+)$/"*/
        //def regModProtec = "/^Priv$|^Protec$|^Pub$/"*/
        def regOper = "^Oper:\\s*(([a-zA-Z]+[0-9]*\\s*->)+\\s*(\\(*[a-zA-Z0-9]+\\s*[\\/\\-\\+\\*]\\s*[a-zA-Z0-9]+\\)*)*\\s*([\\/\\-\\+\\*]*)(\\s*\\(*[a-zA-Z0-9]+\\s*[\\/\\-\\+\\*]\\s*[a-zA-Z0-9]+\\)*))\$" 
        
        new File(Archivo).eachLine {line ->
            println(line);        
            if(line != null){
                def texto = line.toString();
                if(line!=""){
                    if(texto =~ regOper){
                        println("Es operacion Matematica" + " -> " + texto)
                    }
                    else{
                        println("Ninguno")
                    }
                }
            }
        }
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        def input = br.readLine()

        if(input =~ regOper){
            println("Es operacion Matematica" + " -> " + input)
        }    
        else{
            println("Ninguno")
        }*/
    }

    static void main(String[] args) {
        Reconocer("C:\\Users\\Francisco\\Documents\\Repositorios\\LyA1\\LyA1\\ejemplo.txt");
    }
}