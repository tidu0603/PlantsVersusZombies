package remake.entities.stuffs;

public class HeadlessSun extends Sun {

  public HeadlessSun(int x, int y) {
    super(x, y);
  }

  @Override
  public void SpecialMoves() {
    if (position.y == visualMode.GameDim.height - getImage().getHeight(null)) {
      dy = 0;
      LoopCounter++;
    }
  }
}
