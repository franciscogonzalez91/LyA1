class LeerArchivo{

	static LeerArchivoTexto(String nombre){
		def expresionTipoDato = "/(bool|byte|char|double|float|int|long|short|string|date)/g";
		def expresionOperadorCondicional = "/(true|false)/g"
		def expresionCiclo = "/(for|while|dowhile|loop|foreach)/g"
		def expresionCondicion = "/(if|else|try|catch|switch|case|break|default)/g" 
		def expresionOperadorComparacion = "/(==|<=|>=)/g"

		def i=1
		new File(nombre).eachLine { line ->
			if(line != ""){
				def texto = line.substring(0).split(",");	
				if (texto != null){
					if (expresionTipoDato =~ texto[0]) {
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
					else if (expresionOperadorComparacion =~ texto[0]) {
						println(i + "- " + texto[0] + " -> " + "Operador de comparacion");
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