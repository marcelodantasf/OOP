public class RecursosFerroviarios {
    private Vagao vagoes;
    private Locomotiva locomotivas;
    private Trem trens;

    public void setVagoes(Vagao vagoes) {
        this.vagoes = vagoes;
    }

    public Vagao getVagao() {
        return vagoes;
    }

    public void setLocomotiva(Locomotiva locomotivas) {
        this.locomotivas = locomotivas;
    }

    public Locomotiva getLocomotiva() {
        return locomotivas;
    }

    public void setTrem(Trem trens) {
        this.trens = trens;
    }

    public Trem getTrem() {
        return trens;
    }

    public RecursosFerroviarios(Vagao vagoes) {
        this.vagoes = vagoes;
    }

    public RecursosFerroviarios(Locomotiva locomotivas) {
        this.locomotivas = locomotivas;
    }

    public RecursosFerroviarios(Trem trens) {
        this.trens = trens;
    }
}