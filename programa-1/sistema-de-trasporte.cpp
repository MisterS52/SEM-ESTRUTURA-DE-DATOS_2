#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Tren
{
public:
    string nombre;
    int lieade_tren;
    string calles;
    int Hore_entrada;
    int Hora_salida;
    bool trabordar;

    // Constructor por defecto
    Tren() {}

    // Constructor con todos los parámetros
    Tren(string n, int i, string d, int vm, int nv, bool es)
    {
        nombre = n;
        lieade_tren = i;
        calles = d;
        Hore_entrada = vm;
        Hora_salida = nv;
        trabordar = es;
    }
};
class Mbuss
{
public:
    string nombre;
    int nBuss;
    string calles;
    int Hore_entrada;
    int Hora_salida;
    bool comTren;

    Mbuss(){}
    Mbuss(string n, int i, string d, int vm, int nv, bool es)
    {
        nombre = n;
        nBuss = i;
        calles = d;
        Hore_entrada = vm;
        Hora_salida = nv;
        comTren = es;
    }

};

int main() {
    // Creando una lista de objetos Tren
    vector<Tren> listaTrenes;
    vector<Mbuss> listaMbuss;

    // Agregando trenes a la lista
    Tren tren1("juarez", 2, "Americana, 44160 Guadalajara, Jalisco",6,9, true);
    Tren tren2("CUCEI", 3, " Calz. Revolucion 1459-1451, La Loma, 44410 Guadalajara, Jal.", 6, 9, false);
    Mbuss buss1("Estadio Jalisco", 1,"Calz. Independencia Norte, Monumental, 44320 Guadalajara, Jal.",6,11,false);
    listaTrenes.push_back(tren1);
    listaTrenes.push_back(tren2);
    listaMbuss.push_back(buss1);

    // Accediendo a los datos de un tren
  cout << "\nNombre de la estacion: " << listaTrenes[0].nombre <<"\nDeque linea es: "<<listaTrenes[0].lieade_tren<<"\nDomicilio: "<<listaTrenes[0].calles
    <<"\nEl servicio comiensa: "<<listaTrenes[0].Hore_entrada<<" AM\n"<<"El sevicio termina: "<<listaTrenes[0].Hora_salida<<" PM\n"<<"Se puede transbordar: "
    <<(listaTrenes[0].trabordar ? "Si" : "No")<< endl;

  cout << "\nNombre de la estacion: " << listaTrenes[1].nombre <<"\nDeque linea es: "<<listaTrenes[1].lieade_tren<<"\nDomicilio: "<<listaTrenes[1].calles
    <<"\nEl servicio comiensa: "<<listaTrenes[1].Hore_entrada<<" AM\n"<<"El sevicio termina: "<<listaTrenes[1].Hora_salida<<" PM\n"<<"Se puede transbordar: "
    <<(listaTrenes[1].trabordar ? "Si" : "No")<< endl;

  cout << "\nNombre de la estacion: " << listaMbuss[0].nombre <<"\nDeque linea buss es: "<<listaMbuss[0].nBuss<<"\nDomicilio: "<<listaMbuss[0].calles
    <<"\nEl servicio comiensa: "<<listaMbuss[0].Hore_entrada<<" AM\n"<<"El sevicio termina: "<<listaMbuss[0].Hora_salida<<" PM\n"<<"Comparte estacion con tren: "
    <<(listaMbuss[0].comTren? "Si" : "No")<< endl;


    return 0;
}
