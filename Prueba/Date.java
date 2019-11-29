
public class Date {
	private Integer dia;
	private Integer mes;
	private Integer anio;
	private boolean biciesto;
	
	public boolean isBiciesto() {
		return biciesto;
	}
	

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		if (dia > 0 && dia <= 31)
			this.dia = dia;
		else
			this.dia = 1;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		if (mes > 0 && mes <= 12)
			this.mes = mes;
		else
			this.mes = 1;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		if (anio > 0)
			this.anio = anio;
		else
			this.anio = 2018;
	}

	public void defAnioBiciesto() {
		this.biciesto = true;
		if (anio % 4 != 0) {
			this.biciesto = false;
			//System.out.println("El Anio No Es Biciesto");
		}

	}
		
	public void logica() {
			
		if(this.dia > 30 && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
			mes+=1;
			this.dia=this.dia-30;
		}else {
			if(this.dia > 31 && this.mes != 2 ) {
				this.mes+=1;
				this.dia=this.dia-31;
			}
			
			if(this.biciesto==true  && this.mes ==2  ) {
				if(this.dia>29 ) {
					this.mes+=1;
					this.dia=this.dia-29;// para evitar complejidades se realiza esta asignacion
				}	
			}else {
				if(this.dia>28 && this.mes == 2 ) {
					this.mes+=1;
					this.dia=this.dia-28;// para evitar complejidades se realiza esta asignacion
				}
			}
		}

		if(this.mes>12) {
			this.anio+=1;
		this.mes = this.mes -12;	
		}
	}

	public void logicaInvertida() {
		if(this.dia ==0) {
			this.mes = this.mes -1 ;
			//
			if(this.mes<=0) {
				this.mes=12;
				this.anio -=1; 
			}
			if(this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
				
				this.dia = 30;
				
			}else {
				if(this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
					
					this.dia = 31;
					
				}else {
					if(this.biciesto==true  && this.mes ==2  ) {
						this.dia=29;
					
				}else {
						this.dia = 28;
					
				}
				}
				
				
			}
			if(this.anio <= 0 ) this.anio = 1;
		}//dia == 0 ???

	}
	
	public void aumentar() {
		this.dia +=1; 
	}
	
	public void disminuir() {
		this.dia =this.dia -1;; 
	}
	@Override
	public String toString() {
		return "Date [dia=" + this.dia + ", mes=" + this.mes + ", anio=" + this.anio + ", biciesto=" + this.biciesto + "]";
	}
	
	
}
