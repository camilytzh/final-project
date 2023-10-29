package persistence;

import controller.UniversityController;
import model.University;

public class DataInitializer {
	
	public static UniversityController loadUniversity()
	{
		University university =  new University();
		UniversityController univController = new UniversityController(university);
		return univController;
	}
	// dos profesores de cada uno, full time y part time
	// seis estudiantes
	// cuatro cursos
	
	/*
	public static Bank loadBank(){
        Bank myBank = new Bank("Bancolombia");
        loadClientsIntoBank(myBank);
        loadAdminsIntoBank(myBank);
        return myBank;
    }

    private static void loadClientsIntoBank(Bank bank){
        Client client1 = new Client("Felipe Jimenez", "f.jimenez", "12345");
        Client client2 = new Client("Juan Castiblanco", "juan.castiblanco", "00000");
        bank.registerClient(client1);
        bank.registerClient(client2);
    }

    private static void loadAdminsIntoBank(Bank bank){
        Admin admin1 = new Admin("CristianoRonaldo", "siuuu");
        bank.registerAdmin(admin1);
    }
    */
}
