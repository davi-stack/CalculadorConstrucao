package vigas;

public class PerfilEnrijecido {
	 double h; // medida h em mm
	 double b;//medida b em mm
	 double d;//medida d em mm
	 double i;//medida da chapa, espessura em mm
	 double tamanho;//comprimento da peça em mm
	 double pesoPorMetro; // peso maximo suportado em Kg/m
	 double cargaMax = pesoPorMetro *tamanho/1000;
	}
