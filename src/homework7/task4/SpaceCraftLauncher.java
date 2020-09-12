package homework7.task4;

public class SpaceCraftLauncher {
    public static void main(String[] args) throws InterruptedException {
        Shuttle shuttle = new Shuttle();
        Souz souz = new Souz();
        SpaceX spaceX = new SpaceX();
        Cosmodrome cosmodrome = new Cosmodrome();
        if (shuttle.preStartCheckSystem()){
            cosmodrome.start(shuttle);
        }
        if (souz.preStartCheckSystem()){
            cosmodrome.start(souz);
        }
        if (spaceX.preStartCheckSystem()){
            cosmodrome.start(spaceX);
        }
    }
}
