package projetbiblioj

class TypeDocument {

	String intitule;
    static constraints = {
    }

	@Override
	public String toString() {
		return "[intitule=" + intitule + "]";
	}

}