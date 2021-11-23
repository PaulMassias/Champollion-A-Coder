package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe
    // Relie enseignant a UE avec un certain noombre d'heures définies
    private int volume_CM;
    private int volume_TD;
    private int volume_TP;
    private Enseignant prof;
    private UE UEconcerné;
    
    
    public ServicePrevu(Enseignant professeur,UE matière){
        prof=professeur;
        UEconcerné=matière;
    }

}
