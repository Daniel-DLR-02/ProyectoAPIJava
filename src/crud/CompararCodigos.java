package crud;

import java.util.Comparator;

import model.ElementoDeOcio;

public class CompararCodigos implements Comparator<ElementoDeOcio> {

	@Override
	public int compare(ElementoDeOcio e1,ElementoDeOcio e2) {
		
		int codigo1= e1.getCodigo();
		int codigo2= e2.getCodigo();
		
		if(codigo1>codigo2)
			return 1;
		else
			if(codigo1<codigo2)
				return -1;
			else 
				return 0;
	}

	
}
