import java.util.Vector;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tabel implements Element {
	String nume;
	
	Tabel() { }
	Tabel(String nume) {
		this.nume = nume;
	}
	
	@XmlElement
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void add(Element e) {

		
	}

	public void remove(Element e) {
		
	}

	public Element getElement(int i) {
		return null;
	}

	public Vector<Element> getElement() {
		return null;
	}

	public void print() {
		
	}

	public void accept(Visitor v) {
		v.visitTabel(this);
	}

	public void save(Visitor v) {
		v.visitTabel(this);
	}

}
