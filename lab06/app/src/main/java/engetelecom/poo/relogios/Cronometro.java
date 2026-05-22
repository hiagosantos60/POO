package engetelecom.poo.relogios;

public interface Cronometro {
    public boolean setModoProgressivo(int h, int m, int s);
    public boolean setModoRegressivo(int h, int m, int s);
    public boolean setModoRelogio();
}
