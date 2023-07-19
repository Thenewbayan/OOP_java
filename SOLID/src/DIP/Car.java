package DIP;

public class Car {
    private iEngine engine;
  
    public Car(iEngine engine) {//теперь можно добавлять любые экземпляры которые реализуют интерфейс iEngine
      this.engine = engine;
    }
  
    public void start() {
      this.engine.start();
    }
  }