package ejercicio16;

public class Persona {
    private double imc;
    private String nombre;
    private int edad;
    private String dni;
    private String sexo = "H";
    private double peso;
    private double altura;
    private final String SEXO_MASCULINO = "hombre";
    private final String SEXO_FEMENINO = "mujer";
    private final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Persona(String nombre,int edad,double peso,double altura,String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = comprobarSexo(sexo);
        this.dni=generarDNI();
    }
    public Persona(String nombre, int edad,String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni=generarDNI();
    }
    public Persona(){

    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculo(){
        altura = altura/100;
        double Resultado = (peso/(Math.pow(altura,2)));
        return Resultado;
    }
    public int medirIMC(){
        if (calculo()<20){
            imc = -1;
        }else{
            if (calculo()>=20 && calculo()<=25){
                imc = 0;
            }else {
                imc = 1;
            }
        }
        return (int) imc;
    }

    public void mostrarIMC(){
        switch (medirIMC()){
            case -1:
                System.out.println("estas en tu peso ideal");
            case 0:
                System.out.println("estas por debajo tu peso ideal");
            case 1:
                System.out.println("tienes sobrepeso");
            default:
                System.out.println("sin respuesta");
        }
    }
    public boolean EsMayorDeEdad(){
        boolean me = (edad>18||edad<18)?true:false;
        return me;
    }

    public String comprobarSexo(String sexo) {
        return (sexo == "F") ? SEXO_FEMENINO : SEXO_MASCULINO;
    }

    public String generarDNI() {
        int num = (int) (100000000 * Math.random());
        int resto = num % 23;
        return this.dni = "" + num + "" + letras[resto];

    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", DNI=" + dni +
                ", Sexo=" + sexo +
                ", Peso=" + peso +
                ", Altura=" + altura ;
    }

}
