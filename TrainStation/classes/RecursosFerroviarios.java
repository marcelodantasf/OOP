public class RecursosFerroviarios {
    private Vagao vagao;
    private Locomotiva locomotiva;
    private Trem trem;

    public void setVagoes(Vagao vagao){
        this.vagao = vagao;
    }

    public Vagao getVagao(){
        return vagao;
    }

    public void setLocomotiva(Locomotiva locomotiva){
        this.locomotiva = locomotiva;
    }

    public Locomotiva getLocomotiva(){
        return locomotiva;
    }

    public void setTrem(Trem trem){
        this.trem = trem;
    }

    public Trem getTrem(){
        return trem;
    }
}