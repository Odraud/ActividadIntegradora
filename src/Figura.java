class Figura {

    public static String forma;//Se declara un atributo String llamado forma
    public static double base;//Se declara un atributo double llamado base
    public static double altura;//Se declara un atributo double llamado altura

    //Se declara un Constructor y sus atributos
    public Figura(String forma,double base,double altura){
        this.forma = forma;
        this.base = base;
        this.altura = altura;
    }

    //Se declara un metodo de nombre areaCuadrado que recibe los datos double base y altura, para sacar el area del cuadrado
    public double areaCuadrado(double base, double altura){
        double area = base * altura;
        return area;
    }

    //Se declara un metodo de nombre perimetroCuadrado que recibe los datos double altura, para sacar el perimetro del cuadrado
    public double perimetroCuadrado(double altura){
        double perimetro = altura * 4;
        return perimetro;
    }

    //Se declara un metodo de nombre areaTriangulo que recibe los datos double base y altura, para sacar el area del Triangulo
    public double areaTriangulo(double base, double altura){
        double area = (base * altura)/2;
        return area;
    }
    //Se declara un metodo de nombre perimetroTriangulo que recibe los datos double base, para sacar el perimetro del Triangulo
    public double perimetroTriangulo(double base){
        double perimetro = base * 3;
        return perimetro;
    }
    //Se declara un metodo imprimirCuadrado, para imprimir los datos del area y perimetro del cuadrado
    public void imprimirCuadrado(double areaC,double periC){
        System.out.println(String.format("El area del cuadrado es: [%.1f]",areaC));
        System.out.println(String.format("El perimetro del cuadrado es: [%.1f]",periC));
    }
    //Se declara un metodo imprimirTriangulo, para imprimir los datos del area y perimetro del triangulo
    public void imprimirTriangulo(double areaT,double periT){
        System.out.println(String.format("El area del Triangulo es: [%.1f]",areaT));
        System.out.println(String.format("El perimetro del Triangulo es: [%.1f]",periT));
    }

    public static void main(String []args){
        Figura cuadrado = new Figura("Cuadrado",6,6);
        double areaC = cuadrado.areaCuadrado(base,altura);
        double periC = cuadrado.perimetroCuadrado(altura);
        cuadrado.imprimirCuadrado(areaC,periC);
        Figura triangulo = new Figura("Triangulo",12,2);
        double areaT = triangulo.areaTriangulo(base,altura);
        double periT = triangulo.perimetroTriangulo(altura);
        triangulo.imprimirTriangulo(areaT,periT);

    }
}
