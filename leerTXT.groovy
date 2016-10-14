class LeerArchivo{

	static LeerArchivoTexto(String nombre){
		def expresionTipoDato = "/bool|byte|char|double|float|int|long|short|string|date|object|var|datetime|ToString|ToInt|ToBool|ToChar|ToDouble|ToFloat|ToLong|ToShort|ToLongDateString|ToShortDateString|BigInteger|BigDecimal/g";
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
				def texto = line.toString()
				//def texto = line.substring(0).split(" ");	
				if (line != null){
					if (expresionTipoDato =~ texto) {
						println(i + "- " + texto + " -> " + "Tipo de dato");
					}	
					else if(expresionOperadorCondicional =~ texto){
						println(i + "- " + texto + " -> " + "Operador Condicional");
					}
					else if (expresionCiclo =~ texto) {
						println(i + "- " + texto + " -> " + "Ciclo");
					}
					else if (expresionCondicion =~ texto) {
						println(i + "- " + texto + " -> " + "Condicional");
					}
					else if (expresionClase =~ texto) {
						println(i + "- " + texto + " -> " + "Clase");
					}
					else if (expresionModificadorProteccion =~ texto) {
						println(i + "- " + texto + " -> " + "Modificador de proteccion");					
					}
					else if (expresionIdentificador =~ texto) {
						println(i + "- " + texto + " -> " + "Identificador");
					}
					else if (expresionMetodo =~ texto) {
						println(i + "- " + texto + " -> " + "Metodo");
					}
					else if (expresionOperadorAsignacion =~ texto) {
						println(i + "- " + texto + " -> " + "Operador de Asignacion");
					}
					else if (expresionOperadorRacional =~ texto) {
						println(i + "- " + texto + " -> " + "Operador Racional");
					}
					else if (expresionImpresor =~ texto) {
						println(i + "- " + texto + " -> " + "Impresor");
					}
					else if (expresionFuncion =~ texto) {
						println(i + "- " + texto + " -> " + "Funcion");
					}
					/*else if (expresionObjeto =~ texto) {
						println(i + "- " + texto + " -> " + "Objeto");
					}*/
					else if (expresionAsignador =~ texto) {
						println(i + "- " + texto + " -> " + "Asignador");
					}
					else if (expresionRetorno =~ texto) {
						println(i + "- " + texto + " -> " + "Retorno");
					}
					else if (expresionNull =~ texto) {
						println(i + "- " + texto + " -> " + "Nulo");
					}
					else{
						println(i + "- " + texto + " -> desconocido");
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