public class Jugador {
    private String nombre;
    private int pTurno=0;
    private int pTotal=0;
    private boolean isHuman;
        public void addPTurno(int puntos){
          this.pTurno += puntos;
        }
}
