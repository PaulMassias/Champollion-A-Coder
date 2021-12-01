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
    
    
    public ServicePrevu(int CM,int TD,int TP, UE ue){
        this.volume_CM=CM;
        this.volume_TD=TD;
        this.volume_TP=TP;
        this.UEconcerné=ue;
    }
    
    
    public int getVolumeCM(){
        return volume_CM;
    }
    
    public int getVolumeTD(){
    return volume_TD;
    }
    
    public int getVolumeTP(){
        return volume_TP;
    }
    
    public UE getUe(){
        return UEconcerné;
    }

}
