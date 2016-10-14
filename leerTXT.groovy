class LeerArchivo{

	static LeerArchivoTexto(String nombre){
		def expresionTipoDato = "/bool|byte|char|double|float|int|long|short|string|date|object|var/g";
		def expresionOperadorCondicional = "/true|false/g"
		def expresionCiclo = "/(for|while|dowhile|loop|foreach)/g"
		def expresionCondicion = "/(if|else|try|catch|switch|case|break|default)/g" 
		def expresionClase = "/(class|random|convert|console)/g"
		def expresionModificadorProteccion = "/(public|protected|private)/g"
		def expresionIdentificador = "/(;|.)/g"
		def expresionMetodo = "/main/g"
		def expresionImpresor = "/println/g"
		def expresionOperadorAsignacion = "/(=)/g"
		def expresionOperadorRacional = "/(==|<=|>=)/g"
		def expresionFuncion = "/void/g"
		//def expresionObjeto = "/object/g"
		def expresionAsignador = "/set/g"
		def expresionRetorno = "/return/g"
		def expresionNull = "/null/g"


		def i=1
		new File(nombre).eachLine { line ->
			if(line != ""){
				def texto = line.substring(0).split(" ");	
				if (line != null){
					if (expresionTipoDato =~ line) {
						println(i + "- " + texto[0] + " -> " + "Tipo de dato");
					}	
					else if(expresionOperadorCondicional =~ texto[0]){
						println(i + "- " + texto[0] + " -> " + "Operador Condicional");
					}
					else if (expresionCiclo =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Ciclo");
					}
					else if (expresionCondicion =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Condicional");
					}
					else if (expresionClase =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Clase");
					}
					else if (expresionModificadorProteccion =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Modificador de proteccion");					
					}
					else if (expresionIdentificador =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Identificador");
					}
					else if (expresionMetodo =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Metodo");
					}
					else if (expresionOperadorAsignacion =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Operador de Asignacion");
					}
					else if (expresionOperadorRacional =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Operador Racional");
					}
					else if (expresionImpresor =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Impresor");
					}
					else if (expresionFuncion =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Funcion");
					}
					/*else if (expresionObjeto =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Objeto");
					}*/
					else if (expresionAsignador =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Asignador");
					}
					else if (expresionRetorno =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Retorno");
					}
					else if (expresionNull =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Nulo");
					}
					else{
						println(i + "- " + texto[0] + " -> desconocido");
					}
					i++;
				}
			}					
		}
	}

	static void main(String[] args) {
		LeerArchivoTexto("lexico.txt"); 
	}
}