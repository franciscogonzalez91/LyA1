class LeerArchivo{

	static LeerArchivoTexto(String nombre){
		def expresionTipoDato = "/bool|byte|char|double|float|int|long|short|string|date/g";
		def expresionCondicionBooleana = "/true|false/g"
		def i=0
		new File(nombre).eachLine { line ->
			if(line != ""){
				def texto = line.substring(0).split(",");	
				if (texto != null){
					if (expresionTipoDato =~ texto[0]) {
						println(i + "- " + texto[0] + "->" + "Tipo de dato");
					}	
					else if(expresionCondicionBooleana =~ texto[0]){
						println(i + "- " + texto[0] + "->" + "Codicion booleana");
					}
					else{
						println(i + "- " + texto[0] + "->desconocido");
					}
					i++;
				}
			}					
		}
	}

	static void main(String[] args) {
		LeerArchivoTexto("/home/frank/lexico.txt"); 
	}
}