package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ManipulandoDatas {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date tipo1 = new Date();
		Date tipo2 = new Date(System.currentTimeMillis());
		Date tipo3 = new Date(0L);
		Date tipo4 = new Date(1000L * 60L * 60L * 5L);
		
		Date exemplo1 = sdf1.parse("25/06/2018");
		Date exemplo2 = sdf2.parse("25/06/2018 15:42:07");
		Date exemplo3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		// Formatos de Datas para Consultas ou emergências
		
		System.out.println("tipo1: " + tipo1); // dia da semana, mês, dia do mês, Hora(atual do seu computador) e Ano
		System.out.println("tipo2: " + tipo2); // dia da semana, mês, dia do mês, Hora(atual do seu computador) e Ano
		System.out.println("tipo3: " + tipo3); // Início da contagem
		System.out.println("tipo4: " + tipo4); // adicionado tempo...
		System.out.println("exemplo1: " + exemplo1); // e assim por diante...
		System.out.println("exemplo2: " + exemplo2);
		System.out.println("exemplo3: " + exemplo3);
		
		System.out.println("-------------");
		
		System.out.println("tipo1: " + sdf2.format(tipo1));
		System.out.println("tipo2: " + sdf2.format(tipo2));
		System.out.println("tipo3: " + sdf2.format(tipo3));
		System.out.println("tipo4: " + sdf2.format(tipo4));
		System.out.println("exemplo1: " + sdf2.format(exemplo1));
		System.out.println("exemplo2: " + sdf2.format(exemplo2));
		System.out.println("exemplo3: " + sdf2.format(exemplo3));
		
		System.out.println("-------------");
		
		System.out.println("tipo1: " + sdf3.format(tipo1));
		System.out.println("tipo2: " + sdf3.format(tipo2));
		System.out.println("tipo3: " + sdf3.format(tipo3));
		System.out.println("tipo4: " + sdf3.format(tipo4));
		System.out.println("exemplo1: " + sdf3.format(exemplo1));
		System.out.println("exemplo2: " + sdf3.format(exemplo2));
		System.out.println("exemplo3: " + sdf3.format(exemplo3));
		
	}

}
