package mx.uv;

public class Datos {
    private int id;
    private String usuario;
    private String pokemon;
    private String contrasena;
    private String mascota;
    private int vida;
    private int energia;
    private int hambre;
    private int suciedad;

    public Datos() {
        this.id=0;
    }

    public Datos(String usuario, String vida, String energia, String suciedad, String hambre) {
        this.usuario = usuario;
        this.vida=Integer.parseInt(vida);
        this.energia=Integer.parseInt(energia);
        this.suciedad=Integer.parseInt(suciedad);
        this.hambre=Integer.parseInt(hambre);
    }

    public Datos(String usuario, String pokemon, String contrasena, String mascota, int vida, int energia, int hambre, int suciedad) {
        this.usuario = usuario;
        this.pokemon = pokemon;
        this.contrasena = contrasena;
        this.mascota = mascota;
        this.vida = vida;
        this.energia = energia;
        this.hambre = hambre;
        this.suciedad = suciedad;
    }

    public Datos(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getSuciedad() {
        return suciedad;
    }

    public void setSuciedad(int suciedad) {
        this.suciedad = suciedad;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", pokemon='" + pokemon + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", mascota='" + mascota + '\'' +
                ", vida=" + vida +
                ", energia=" + energia +
                ", hambre=" + hambre +
                ", suciedad=" + suciedad +
                '}';
    }
}
