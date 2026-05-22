package engetelecom.poo.relogios;

public abstract class RelogioDigital extends Relogio implements Cronometro {

    public static final int MODO_RELOGIO = 1;
    public static final int MODO_PROGRESSIVO = 2;
    public static final int MODO_REGRESSIVO = 3;

    protected int modo;
    protected int h_cont;
    protected int m_cont;
    protected int s_cont;

    public RelogioDigital() {
        this.setModoRelogio();
    }

    @Override
    public boolean setModoRelogio() {
        this.modo = MODO_RELOGIO;
        return setHorario();
    }

    @Override
    public boolean setModoProgressivo(int h, int m, int s) {
        this.modo = MODO_PROGRESSIVO;
        this.h_cont = h;
        this.m_cont = m;
        this.s_cont = s;

        return setHorarioManual(0, 0, 0);
    }

    @Override
    public boolean setModoRegressivo(int h, int m, int s) {
        this.modo = MODO_REGRESSIVO;
        return setHorarioManual(h, m, s);
    }

    @Override
    public void avancarTempo() {
        if (this.modo == MODO_REGRESSIVO) {
            if (this.horas > 0 || this.minutos > 0 || this.segundos > 0) {
                this.segundos--;
                if (this.segundos < 0) {
                    this.segundos = 59;
                    this.minutos--;
                    if (this.minutos < 0) {
                        this.minutos = 59;
                        this.horas--;
                    }
                }
            }
        } 
        else if (this.modo == MODO_PROGRESSIVO) {
            if (this.horas == this.h_cont && this.minutos == this.m_cont && this.segundos == this.s_cont) return;
            super.avancarTempo(); // vai passar o tempo até chegar no que o usuário informou 
        } 
        else if (this.modo == MODO_RELOGIO) {
            super.avancarTempo();
        }
    }

    
}