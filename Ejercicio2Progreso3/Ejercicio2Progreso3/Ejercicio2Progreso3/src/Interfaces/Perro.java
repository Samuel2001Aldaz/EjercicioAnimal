package Interfaces;

public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String tipoAnimal() {
        return "Perro";
    }

    @Override
    public String comunicarse() {
        return "GUAUS!!";
    }
}
