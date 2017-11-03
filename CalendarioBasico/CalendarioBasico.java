public class CalendarioBasico
{
	// declarando variables dia mes y año
	private int dia;
	private int mes;
	private int ano;

		/**
		*constructor de clase CalendarioBasico
		*/

	public CalendarioBasico()
	{
		dia = 1;
		mes = 1;
		ano = 1;
	}
	/**
	*Fijamos fecha nueva
	*/
		public void fijarFecha(int nuevoDia, int nuevoMes,int nuevoAnio)
	{
		dia = nuevoDia;
		mes = nuevoMes;
		ano = nuevoAnio;
	}
	/**
	*metodo para obtener la fecha
	*/
	public String obtenerFecha()
	{
		String textoADevolver = "";
		String parte1 = dia + "";
		String parte2 = mes + "";
		String parte3 = ano + "";
		if (parte1.length() < 2) {
		parte1 = "0" +parte1;
		}
		if (mes< 10) {
		parte2 = "0" + parte2;
		}
		if (ano < 10) {
		parte3 = "0" + parte3;
		}
		textoADevolver = parte1 + "-" + parte2 + "-" +parte3;
		return textoADevolver;
	}

	/**
	*avanzar un dia en la fecha
	*/
	public void avanzarFecha()
	{
	dia = dia + 1;
		if (dia == 31) {
		dia = 1;
		mes = mes + 1;
		if (mes == 13) {
			ano =ano + 1;
			}
		}
	}












}