package interfejs;

import java.util.GregorianCalendar;

import valuta.Kurs;

public interface MenajcnicaInterfejs {

	public void dodajKurs(String naziv, String skracenica, GregorianCalendar datum, double prodajniKurs, double kupovniKurs, double srednjiKurs);
	public void obrisiKurs(String naziv, String skracenica, GregorianCalendar datum);
	public Kurs pronadjiKurs(String naziv, String skracenica, GregorianCalendar datum);
}
