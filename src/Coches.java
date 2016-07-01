import java.util.Comparator;

public class Coches implements Comparable<Coches> {


    Long id;
    String matricula, marca, modelo;
    Integer año;


    public Coches(Long id, String matricula, String marca, String modelo, Integer año) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int compareTo(Coches otroCoche) {
        return this.matricula.compareTo(otroCoche.matricula);

    }
    @Override
    public String toString () {
        return "Coches{" +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", id=" + id +
                '}'+ System.lineSeparator();
    }
}
    class CarComparatorByAño implements Comparator<Coches>
    {

        @Override
        public int compare(Coches coches, Coches otroCoche)
        {
            if (coches.getAño() > otroCoche.getAño())
            {
                return 1;
            }
            else if (coches.getAño()< otroCoche.getAño())
            {
                return -1;
            }
            else return 0;
        }

    }

