package Aplication;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Plantilla {
	
	String nombre;
	String canthamburguesas;
	int montoham;
	String cantpizza;
	int montopiz;
	String canttac;
	int montotac;
	
	String cantali;
	int montoali;
	
	String cantemp;
	int montoemp;
	
	String cantpapas;
	int montopapas;
	
	
	String cantcoca;  
	int montococa; 
	
	String cantpep; 
	int montopep; 
	
	String cantspr;  
	int montospr; 
	
	String cantfan;  
	int montofan; 
	
	String cantmtn;  
	int montomtn; 
	
	String cantdr;  
	int montodr;
	
	
	
	String cantbr; 
	int montobr;
	
	String cantga; 
	int montoga; 
	
	String cantch; 
	int montoch; 
	
	String canthe; 
	int montohe; 
	
	String cantap; 
	int montoap; 
	
	String cantchu;
	int montochu;
	
	int total;
	
	String fecha;
	
	Document documento;
	FileOutputStream archivo;
	Paragraph titulo;
	
	
	
	
	public Plantilla(String nombre, 
					
					String canthamburguesas, int montoham, 
					String cantpizza, int montopiz, 
					String canttac, int montotac, 
					String cantali, int montoali, 
					String cantemp, int montoemp, 
					String cantpapas, int montopapas,
					
					String cantcoca,  int montococa, 
					String cantpep,  int montopep, 
					String cantspr,  int montospr, 
					String cantfan,  int montofan, 
					String cantmtn,  int montomtn, 
					String cantdr,  int montodr,
					
					
					String cantbr, int montobr, 
					String cantga, int montoga, 
					String cantch, int montoch, 
					String canthe, int montohe, 
					String cantap, int montoap, 
					String cantchu, int montochu,
					
					int total,
					
					String fecha) {
		
		this.nombre = nombre;
		
		this.canthamburguesas = canthamburguesas;
		this.montoham = montoham;
		
		this.cantpizza= cantpizza;
		this.montopiz = montopiz;
		
		this.canttac = canttac;
		this.montotac = montotac;
		
		this.cantali = cantali;
		this.montoali = montoali;
		
		this.cantemp = cantemp;
		this.montoemp = montoemp;
		
		this.cantpapas = cantpapas;
		this.montopapas = montopapas;
		
		//
		this.cantcoca =  cantcoca;
		this.montococa =  montococa;
		
		this.cantpep = cantpep;  
		this.montopep = montopep;
		
		this.cantspr = cantspr; 
		this.montospr = montospr ;
		
		this.cantfan = cantfan;  
		this.montofan = montofan;
		
		this.cantmtn = cantmtn;  
		this.montomtn = montomtn; 
		
		this.cantdr = cantdr ;  
		this.montodr = montodr;
		
		
		this.cantbr = cantbr;
		this.montobr = montobr;
		this. cantga =cantga;
		this.montoga =montoga; 
		this.cantch =cantch;
		this.montoch =montoch; 
		this.canthe =canthe;
		this.montohe =montohe; 
		this.cantap =cantap;
		this.montoap =montoap;
		this.cantchu =cantchu; 
		this.montochu = montochu;
		
		this.total = total;
		
		this.fecha = fecha;
		
		
		documento = new Document();
		titulo = new Paragraph("FRIEDFOOD");
	}
	
	
	public void crearPlantilla() {
		try {
			
			archivo = new FileOutputStream (nombre + ".pdf");
			PdfWriter.getInstance(documento, archivo);
			documento.open();
			titulo.setAlignment(1);
		

			
			documento.add(titulo);
			
			documento.add(Chunk.NEWLINE);
			documento.add(new Paragraph("Nombre: " + nombre));
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			
			
			if(montoham > 0) {
				
				documento.add(new Paragraph("Hamburguesas: " + canthamburguesas + "........................"+montoham+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			
			if(montopiz > 0) {
				
				documento.add(new Paragraph("Pizza: " + cantpizza + "........................"+montopiz+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			if(montotac > 0) {
				
				documento.add(new Paragraph("Taco: " + canttac + "........................"+montotac+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			
			if(montoali > 0) {
				
				documento.add(new Paragraph("Alitas Picantes: " + cantali + "........................"+montoali+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			
			if(montoemp > 0) {
				
				documento.add(new Paragraph("Empanadas: " + cantemp + "........................"+montoemp+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			if(montopapas > 0) {
				
				documento.add(new Paragraph("Papas: " + cantpapas + "........................"+montopapas+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			
			
			///////////////////////////////////////////////////////////////////
			if(montococa > 0) {
				
				documento.add(new Paragraph("Coca Cola: " + cantcoca + "........................"+montococa+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			if(montopep > 0) {
				
				documento.add(new Paragraph("Pepsi: " + cantpep + "........................"+montopep+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}	
			
			
			if(montospr > 0) {
				
				documento.add(new Paragraph("Sprite: " + cantspr + "........................"+montospr+" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			if(montofan  > 0) {
				
				documento.add(new Paragraph("Fanta: " + cantfan  + "........................"+montofan  +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			if(montomtn > 0) {
				
				documento.add(new Paragraph("Mtn Dew Zero: " + cantmtn   + "........................"+montomtn   +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			if(montodr  > 0) {
				
				documento.add(new Paragraph("Dr Pepper: " + montodr    + "........................"+montodr    +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			
			///////////////////////////////////////////////

			if(montobr   > 0) {
				
				documento.add(new Paragraph("Brownie: " + cantbr     + "........................"+montobr     +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			
			if(montoga   > 0) {
				
				documento.add(new Paragraph("Galleta: " + cantga    + "........................"+montoga     +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}

			if(montoch   > 0) {
	
				documento.add(new Paragraph("Cheescake: " + montoch      + "........................"+montoch     +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}

			
			
			if(montohe   > 0) {
	
				documento.add(new Paragraph("Helado: " + canthe     + "........................"+montohe     +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}

			
			
			
			if(montoap   > 0) {
	
				documento.add(new Paragraph("Apple pie: " + cantap     + "........................"+montoap     +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}

			
			if(montochu   > 0) {
	
				documento.add(new Paragraph("Churros: " + cantchu     + "........................"+montochu     +" RD$"));
				//documento.add(Chunk.NEWLINE);
			}
			
			
			
			documento.add(new Paragraph("______________________________________________________________________________"));
			
			documento.add(new Paragraph("Monto: "+ total));
			
			documento.add(Chunk.NEWLINE);
			
			documento.add(new Paragraph("FriedFood"));
			
			documento.add(Chunk.NEWLINE);
			documento.add(Chunk.NEWLINE);
			
			documento.add(new Paragraph("FriedFood"));
			documento.add(new Paragraph("Fecha: " + fecha ));
			
			documento.close();
			
			System.out.println("Se ha creado el PDF.");
			
		}catch(FileNotFoundException e){
			System.err.println(e.getMessage());
		}catch(DocumentException e){
			System.err.println(e.getMessage());
		}
	}
	
	
	
}
