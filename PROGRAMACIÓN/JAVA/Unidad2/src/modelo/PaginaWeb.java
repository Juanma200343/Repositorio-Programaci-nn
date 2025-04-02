package modelo.BoletinListaYSet;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class PaginaWeb {

	private String url;
	private LocalTime fecha ;
	/**
	 * @param url
	 * @param fecha
	 */
	protected PaginaWeb(String url, LocalTime fecha) {
		super();
		this.url = url;
		this.fecha = fecha;
	}
	
	protected String getUrl() {
		return url;
	}
	
	protected void setUrl(String url) {
		this.url = url;
	}
	
	protected LocalTime getFecha() {
		return fecha;
	}
	
	protected void setFecha(LocalTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(fecha, other.fecha);
	}

	@Override
	public String toString() {
		return "PaginaWeb [url=" + url + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
