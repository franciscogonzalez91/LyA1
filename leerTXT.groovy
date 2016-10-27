class LeerArchivo{
    static LeerArchivoTexto(String nombre){
        def expresionTipoDato = "^(bool|byte|char|double|float|int|long|short|string|date|object|var|datetime|ToString|ToInt|ToBool|ToChar|ToDouble|ToFloat|ToLong|ToShort|ToLongDateString|ToShortDateString|BigInteger|BigDecimal)*";
        def expresionOperadorCondicional = "^(true|false)*"
        def expresionCiclo = "^(for|while|dowhile|loop|foreach)*"
        def expresionCondicion = "^(if|else|try|catch|switch|case|break|default)*" 
        def expresionClase = "^(class|random|convert|console)*"
        def expresionModificadorProteccion = "^(public|protected|private)*"
        def expresionIdentificador = ".|;"
        def expresionMetodo = "^(main)*"
        def expresionImpresor = "^(println)*"
        def expresionOperadorAsignacion = "^(=)*"
        def expresionOperadorRacional = "^(==|<=|>=)*"
        def expresionOperadorMatematico = "^([-+/*])*"
        def expresionFuncion = "^(void)*"
        def expresionObjeto = "^(object)*"
        def expresionAsignador = "^(set)*"
        def expresionRetorno = "^(return)*"
        def expresionNull = "^(null)*"


        def i=1
        new File(nombre).eachLine { line ->
            if(line != ""){
                def texto = line.toString()
                def input = texto.toString();
                print i + " "
                if (line != null){                    
                    if(String.valueOf(input).matches(expresionTipoDato)){
                        print input + " > " + "Tipo de Dato" + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionOperadorCondicional)){
                        print input + " > " + "Operador Condicional"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionCiclo)){
                        print input + " > " + "Ciclo"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionCondicion)){
                        print input + " > " + "Condicional"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionClase)){
                        print input + " > " + "Clase"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionModificadorProteccion)){
                        print input + " > " + "Modificador de Proteccion"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionIdentificador)){
                        print input + " > " + "Identificador"  + "\n"
                    }
                     else if(String.valueOf(input).matches(expresionMetodo)){
                        print input + " > " + "Metodo"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionImpresor)){
                        print input + " > " + "Impresion"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionOperadorAsignacion)){
                        print input + " > " + "Operador de Asignacion"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionOperadorRacional)){
                        print input + " > " + "Operador Racional"  + "\n"
                    }
                    else if(String.valueOf(input).matches(expresionOperadorMatematico)){ //("[-+*/]")){
                        print input + " > " + "Operador Aritmetico"  + "\n"
                    }                    
                    else{
                        print input + " > " + "Error" + "\n";
                    }
                }
            }
            i++
        }
    }
    static void main(String[] args) {
        LeerArchivoTexto("C:\\Users\\Francisco\\Documents\\Repositorios\\LyA1\\LyA1\\lexico.txt"); 
    }
}