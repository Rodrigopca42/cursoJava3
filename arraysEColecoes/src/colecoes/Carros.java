package colecoes;



public class Carros {
    public static void main(String[] args) {
        
       UsuarioCarros carro1 = new UsuarioCarros();
        carro1.modelo = "Prisma";
        carro1.fabricante = "GM";
        carro1.ano = 2018;
        carro1.valor = 15200.00f;

        UsuarioCarros carro2 = new UsuarioCarros();
        carro2.modelo = "Jeta";
        carro2.fabricante = "VolksWagen";
        carro2.ano = 2019;
        carro2.valor = 35000.00f;

        UsuarioCarros carro3 = new UsuarioCarros();
        carro3.modelo = "Civic";
        carro3.fabricante = "Honda";
        carro3.ano = 2022;
        carro3.valor = 85000.00f;


    }
}
