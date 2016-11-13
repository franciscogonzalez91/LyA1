import static java.lang.String.format;
import java.io.*;


class Leer {    
    static Reconocer(String Archivo){
        /*Inicio y Fin expresiones*/
        def regInicio = "^("
        def regFinal = ")\$"

        /*Espacios, tabuladores, etc*/
        def regAsignador = "->"
        def regEspacio = "\\s"
        def regCorIzqSyntaxis = "\\["
        def regCorDerSyntaxis = "\\]"
        def regMinimoUno = "+"
        def regOpcional = "*"
        def regTipoDato = "byte|int|long|float|double|string|bool"
        def regParIzq = "("
        def regParDer = ")"
        def regPuntoComa = ";"

        /*Palabras Reservadas*/
        def palabReservClase = "Clase"
        def palabReservDef = "Def:"
        def palabraReservImprimir = "Imprimir"
        def palabReservModificadoresProteccion = "Protec|Pub|Priv"

        /*Ids*/
        def regId = "[a-zA-Z]+[0-9]"

        /*Expresiones ya completas*/
        def regSintaxisAsignacion = regInicio + regId + regOpcional + regEspacio + regOpcional + regAsignador + regEspacio + regOpcional + regId + regOpcional + regFinal;
        def regSintaxisClase = regInicio + palabReservClase + regEspacio + regMinimoUno + regParIzq + palabReservModificadoresProteccion + regParDer + regMinimoUno + regEspacio + regMinimoUno + regParIzq + regId + regOpcional + regParDer +  regCorIzqSyntaxis + regParIzq + regParIzq + regId  + regMinimoUno + regParDer + regMinimoUno + regEspacio + regMinimoUno + regParIzq + regTipoDato + regParDer + regMinimoUno + regParDer + regOpcional + regEspacio + regOpcional + regParIzq + regPuntoComa + regMinimoUno + regEspacio + regOpcional + regParIzq + regId + regOpcional + regParDer + regMinimoUno + regEspacio + regMinimoUno + regParIzq + regTipoDato + regMinimoUno + regParDer + regMinimoUno + regParDer  + regOpcional + regCorDerSyntaxis + regFinal;
        def regSintaxisDef = regInicio + palabReservDef + regEspacio + regMinimoUno + regId + regOpcional + regFinal;        
        def regSintaxisImpresion = regInicio + palabraReservImprimir + regEspacio + regOpcional + regId + regOpcional + regFinal
        
        //def regAsignacionString = "^(([a-zA-Z0-9]+ ?)+?\s*->\s*\"([a-zA-Z0-9]+ ?)\"+?)$"
        /*def regAsignacion = "/^(([a-zA-Z0-9]+ ?)+?\s*->\s*([a-zA-Z0-9]+ ?)+?)$/"
        def regClase = "/^(Clase\s+(Protec|Pub|Priv)+\s+([a-zA-Z]+[0-9]*)\[((byte|int|long|float|double|string|bool|)+\s+([a-zA-Z]+[0-9]*))+\s*(;+\s*(byte|int|long|float|double|string|bool)+\s+(([a-zA-Z]+[0-9]*)+))*\\])+$/"
        def regComparacion = "/^([a-zA-Z0-9]+\s*<->\s*[a-zA-Z0-9]+)$/"
        def redDefinicion = "/^(Def: [a-zA-Z]+[0-9]*)/$"
        def regFuncion = "Func"
        def regIf = "/^(Sicumple \[(\s)*([a-zA-Z]+[0-9]*)\\] Entonces)$/"
        def regElseIf = "/^(Sino \[(\s)*([a-zA-Z]+[0-9]*)\\] Entonces)$/"
        def regElse = "/^(Sinocumple)$/"
        /*def regFinalizar = "Finzaliza"*/
        //def regImprimir = "/^(Imprimir [a-zA-Z0-9]+)$/\"*/"
        def regOper = "^Oper:\\s*(([a-zA-Z]+[0-9]*\\s*->)+\\s*(\\(*[a-zA-Z0-9]+\\s*[\\/\\-\\+\\*]\\s*[a-zA-Z0-9]+\\)*)*\\s*([\\/\\-\\+\\*]*)(\\s*\\(*[a-zA-Z0-9]+\\s*[\\/\\-\\+\\*]\\s*[a-zA-Z0-9]+\\)*))\$" 
        //println("/^(Clase\\s+(Protec|Pub|Priv)+\\s+([a-zA-Z]+[0-9]*)\\[((byte|int|long|float|double|string|bool)+\\s+([a-zA-Z]+[0-9]*))+\\s*(;+\\s*(byte|int|long|float|double|string|bool)+\\s+(([a-zA-Z]+[0-9]*)+))*\\])+\$/")
        //println(regSintaxisClase)
        //def regClass = "^Clase\\s+(Protec|Pub|Priv)+\\s+([a-zA-Z]+[0-9]*)+\\[((byte|int|long|float|double|string|bool)+\\s+([a-zA-Z]+[0-9]*)+)*\\s*(;+\\s*(byte|int|long|float|double|string|bool)+\\s+(([a-zA-Z]+[0-9]*)+))*\\]\$"
        

        new File(Archivo).eachLine {line ->
            println(line);       
            if(line != null){
                def texto = line.toString().trim();
                if(line!=""){
                    if(texto =~ regSintaxisAsignacion) {
                        println("Es una asignacion" + " -> " + texto)
                    }
                    else if(texto =~ regSintaxisClase){
                        println("Es una Clase" + " -> " + texto)
                    }
                    else if(texto =~ regSintaxisDef){
                        println("Es una definicion" + " -> " + texto)
                    }                    
                    else if(texto =~ regSintaxisImpresion){
                        println("Es una Impresion" + " -> " + texto)
                    }
                    else if(texto =~ regOper){
                        println("Es una operacion aritmetica" + " -> " + texto)
                    }
                    else{
                        println("Ninguno")
                    }
                }
            }
        }
    }

    static void main(String[] args) {
        Reconocer("C:\\Users\\Francisco\\Documents\\Repositorios\\LyA1\\LyA1\\ejemplo.txt");
    }
}