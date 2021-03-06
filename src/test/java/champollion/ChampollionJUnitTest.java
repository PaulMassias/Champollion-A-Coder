package champollion;

import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ChampollionJUnitTest {
	Enseignant untel;
	UE uml, java;
        Intervention i;
        Date d;
		
	@BeforeEach
	public void setUp() {
		untel = new Enseignant("untel", "untel@gmail.com");
		uml = new UE("UML");
		java = new UE("Programmation en java");	
                i = new Intervention(new Date(),2,13);
       
	}
	

	@Test
	public void testNouvelEnseignantSansService() {
		assertEquals(0, untel.heuresPrevues(),
                        "Un nouvel enseignant doit avoir 0 heures prévues");
	}
	
	@Test
	public void testAjouteHeures() {
                // 10h TD pour UML
		untel.ajouteEnseignement(uml, 0, 10, 0);

		assertEquals(10, untel.heuresPrevuesPourUE(uml),
                        "L'enseignant doit maintenant avoir 10 heures prévues pour l'UE 'uml'");

                // 20h TD pour UML
                untel.ajouteEnseignement(uml, 0, 20, 0);
                
		assertEquals(10 + 20, untel.heuresPrevuesPourUE(uml),
                         "L'enseignant doit maintenant avoir 30 heures prévues pour l'UE 'uml'");		
		
	}
        
        @Test
        public void testAjouteIntervention(){
            untel.ajouteIntervention(i);
            
            assertEquals(1,untel.compterIntervention(),
                    "L'enseignant doit avoir 1 intervention");
        }
	
        
        @Test
        public void testHeuresPrevues(){
            untel.ajouteEnseignement(uml, 0, 10, 0);
            
            ArrayList <ServicePrevu> listeServ =new ArrayList();
            listeServ=untel.getEnseignements();
            ServicePrevu SP=listeServ.get(0);
            UE ue=SP.getUe();
            assertEquals("UML",ue.getIntitule(),"L'UE du service doit être celle ajoutée");
            assertEquals(1,listeServ.size(),"La liste doit contenir un seul enseignement");
            assertEquals(10,untel.heuresPrevues(),"L'enseignant doit avoir un équivalent TD de 10 heures");
            
        }
}
