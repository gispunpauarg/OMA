import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.SwaggerParseResult;
import io.swagger.v3.oas.models.OpenAPI;
import org.apache.commons.lang3.StringUtils;

public class API {
	
	private String especificacion;
	private Metrica version;
	private Metrica numRecursos;
	private Metrica numRecursosLectura;
	private Metrica numRecursosPost;
	private Metrica numRecursosDelete;
	private Metrica pesoRecursosLectura;
	private Metrica pesoRecursosPost;
	private Metrica pesoRecursosDelete;
	private Metrica longRutaMaxima;
	private Metrica longRutaPromedio;
	private Metrica numParametros;
	private Metrica numParametrosObligatorios;
	private Metrica numParametrosOpcionales;
	private Metrica promedioParametros;
	
	public API(String especificacion) {
		this.especificacion = especificacion;
		SwaggerParseResult result = new OpenAPIParser().readLocation(this.especificacion, null, null);
		OpenAPI openAPI = result.getOpenAPI();
		if (result.getMessages() != null) {
			result.getMessages().forEach(System.err::println);
		}
		if (openAPI != null) {
			int contRecursos[] = {0};
			int contGet[] = {0};
			int contPost[] = {0};
			int contDelete[] = {0};
			int maxRuta[] = {0};
			double sumaRuta[] = {0};
			int contParametros[] = {0};
			int contParametrosObligatorios[] = {0};
			int contParametrosOpcionales[] = {0};
			openAPI.getPaths().forEach((key, item) -> {
				String ruta=key;
				char[] carRuta = ruta.toCharArray();
				int longitud = 0;
				for (int c = 0; c < carRuta.length; c++) {
					if (carRuta[c] == '/') { 
						longitud++;
						sumaRuta[0]++;
					}
				}
				if (longitud > maxRuta[0]) {
					maxRuta[0] = longitud;
				}
				contRecursos[0]++;
				if (item.getGet() != null) {
					contGet[0]++;
					if (item.getGet().getParameters() != null) {
						contParametros[0] = contParametros[0] + StringUtils.countMatches(item.getGet().getParameters().toString(), "name: ");
						contParametrosObligatorios[0] = contParametrosObligatorios[0] + StringUtils.countMatches(item.getGet().getParameters().toString(), "required: true");
						contParametrosOpcionales[0] = contParametrosOpcionales[0] + StringUtils.countMatches(item.getGet().getParameters().toString(), "required: false");
		            }
				}
				if (item.getPost() != null) {
					contPost[0]++;
					if (item.getPost().getParameters() != null) {
						contParametros[0] = contParametros[0] + StringUtils.countMatches(item.getPost().getParameters().toString(), "name: ");
						contParametrosObligatorios[0] = contParametrosObligatorios[0] + StringUtils.countMatches(item.getPost().getParameters().toString(), "required: true");
						contParametrosOpcionales[0] = contParametrosOpcionales[0] + StringUtils.countMatches(item.getPost().getParameters().toString(), "required: false");
					}
				}
				if (item.getDelete() != null) {
					contDelete[0]++;
					if (item.getDelete().getParameters() != null) {
						contParametros[0] = contParametros[0] + StringUtils.countMatches(item.getDelete().getParameters().toString(), "name: ");
						contParametrosObligatorios[0] = contParametrosObligatorios[0] + StringUtils.countMatches(item.getDelete().getParameters().toString(), "required: true");
						contParametrosOpcionales[0] = contParametrosOpcionales[0] + StringUtils.countMatches(item.getDelete().getParameters().toString(), "required: false");
						}
					}
				if (item.getHead() != null) {
					if (item.getHead().getParameters() != null) {
						contParametros[0] = contParametros[0] + StringUtils.countMatches(item.getHead().getParameters().toString(), "name: ");
						contParametrosObligatorios[0] = contParametrosObligatorios[0] + StringUtils.countMatches(item.getHead().getParameters().toString(), "required: true");
						contParametrosOpcionales[0] = contParametrosOpcionales[0] + StringUtils.countMatches(item.getHead().getParameters().toString(), "required: false");
					}
				}
				if (item.getPatch() != null) {
					if (item.getPatch().getParameters() != null) {
						contParametros[0] = contParametros[0] + StringUtils.countMatches(item.getPatch().getParameters().toString(), "name: ");
						contParametrosObligatorios[0] = contParametrosObligatorios[0] + StringUtils.countMatches(item.getPatch().getParameters().toString(), "required: true");
						contParametrosOpcionales[0] = contParametrosOpcionales[0] + StringUtils.countMatches(item.getPatch().getParameters().toString(), "required: false");
					}
				}
				if (item.getPut() != null) {
					if (item.getPut().getParameters() != null) {
						contParametros[0] = contParametros[0] + StringUtils.countMatches(item.getPut().getParameters().toString(), "name: ");
						contParametrosObligatorios[0] = contParametrosObligatorios[0] + StringUtils.countMatches(item.getPut().getParameters().toString(), "required: true");
						contParametrosOpcionales[0] = contParametrosOpcionales[0] + StringUtils.countMatches(item.getPut().getParameters().toString(), "required: false");
					}
				}
			});
			this.version = new Metrica(openAPI.getInfo().getVersion());
			this.numRecursos = new Metrica(contRecursos[0]);
			this.numRecursosLectura = new Metrica(contGet[0]);
			this.numRecursosPost = new Metrica(contPost[0]);
			this.numRecursosDelete = new Metrica(contDelete[0]);
			this.pesoRecursosLectura = new Metrica((contGet[0]*1.0/contRecursos[0])*100);
			this.pesoRecursosPost = new Metrica((contPost[0]*1.0/contRecursos[0])*100);
			this.pesoRecursosDelete = new Metrica((contDelete[0]*1.0/contRecursos[0])*100);
			this.longRutaMaxima = new Metrica(maxRuta[0]);
			this.longRutaPromedio = new Metrica(sumaRuta[0]/contRecursos[0]);
			this.numParametros = new Metrica(contParametros[0]);
			this.numParametrosObligatorios = new Metrica(contParametrosObligatorios[0]);
			this.numParametrosOpcionales = new Metrica(contParametrosOpcionales[0]);
			this.promedioParametros = new Metrica((contParametros[0]*1.0)/contRecursos[0]);
		}
		else {
			this.version = new Metrica(null);
			this.numRecursos = new Metrica(null);
			this.numRecursosLectura = new Metrica(null);
			this.numRecursosPost = new Metrica(null);
			this.numRecursosDelete = new Metrica(null);
			this.pesoRecursosLectura = new Metrica(null);
			this.pesoRecursosPost = new Metrica(null);
			this.pesoRecursosDelete = new Metrica(null);
			this.longRutaMaxima = new Metrica(null);
			this.longRutaPromedio = new Metrica(null);
			this.numParametros = new Metrica(null);
			this.numParametrosObligatorios = new Metrica(null);
			this.numParametrosOpcionales = new Metrica(null);
			this.promedioParametros = new Metrica(null);
		}
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	public Metrica getVersion() {
		return version;
	}

	public void setVersion(Metrica version) {
		this.version = version;
	}

	public Metrica getNumRecursos() {
		return numRecursos;
	}

	public void setNumRecursos(Metrica numRecursos) {
		this.numRecursos = numRecursos;
	}

	public Metrica getNumRecursosLectura() {
		return numRecursosLectura;
	}

	public void setNumRecursosLectura(Metrica numRecursosLectura) {
		this.numRecursosLectura = numRecursosLectura;
	}

	public Metrica getNumRecursosPost() {
		return numRecursosPost;
	}

	public void setNumRecursosPost(Metrica numRecursosPost) {
		this.numRecursosPost = numRecursosPost;
	}

	public Metrica getNumRecursosDelete() {
		return numRecursosDelete;
	}

	public void setNumRecursosDelete(Metrica numRecursosDelete) {
		this.numRecursosDelete = numRecursosDelete;
	}

	public Metrica getPesoRecursosLectura() {
		return pesoRecursosLectura;
	}

	public void setPesoRecursosLectura(Metrica pesoRecursosLectura) {
		this.pesoRecursosLectura = pesoRecursosLectura;
	}

	public Metrica getPesoRecursosPost() {
		return pesoRecursosPost;
	}

	public void setPesoRecursosPost(Metrica pesoRecursosPost) {
		this.pesoRecursosPost = pesoRecursosPost;
	}

	public Metrica getPesoRecursosDelete() {
		return pesoRecursosDelete;
	}

	public void setPesoRecursosDelete(Metrica pesoRecursosDelete) {
		this.pesoRecursosDelete = pesoRecursosDelete;
	}

	public Metrica getLongRutaMaxima() {
		return longRutaMaxima;
	}

	public void setLongRutaMaxima(Metrica longRutaMaxima) {
		this.longRutaMaxima = longRutaMaxima;
	}

	public Metrica getLongRutaPromedio() {
		return longRutaPromedio;
	}

	public void setLongRutaPromedio(Metrica longRutaPromedio) {
		this.longRutaPromedio = longRutaPromedio;
	}

	public Metrica getNumParametros() {
		return numParametros;
	}

	public void setNumParametros(Metrica numParametros) {
		this.numParametros = numParametros;
	}

	public Metrica getNumParametrosObligatorios() {
		return numParametrosObligatorios;
	}

	public void setNumParametrosObligatorios(Metrica numParametrosObligatorios) {
		this.numParametrosObligatorios = numParametrosObligatorios;
	}

	public Metrica getNumParametrosOpcionales() {
		return numParametrosOpcionales;
	}

	public void setNumParametrosOpcionales(Metrica numParametrosOpcionales) {
		this.numParametrosOpcionales = numParametrosOpcionales;
	}

	public Metrica getPromedioParametros() {
		return promedioParametros;
	}

	public void setPromedioParametros(Metrica promedioParametros) {
		this.promedioParametros = promedioParametros;
	}
	
}
