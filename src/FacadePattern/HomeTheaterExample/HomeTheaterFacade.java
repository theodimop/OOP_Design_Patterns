package FacadePattern.HomeTheaterExample;

/**
 * Created by theo on 7/4/16.
 */
public
class HomeTheaterFacade implements DomesticEntertainemt{

    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLight theaterLight;
    private Screen screen;
    private PopCornPopper popCornPopper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             TheaterLight theaterLight,
                             Screen screen,
                             PopCornPopper popCornPopper){

        this.amplifier=amplifier;
        this.tuner=tuner;
        this.dvd =dvd;
        this.cd = cd;
        this.projector=projector;
        this.theaterLight=theaterLight;
        this.screen=screen;
        this.popCornPopper=popCornPopper;
    }

    @Override
    public void watchMovie(String movie){
        System.out.println("Get Ready to watch a movie...");

        //1. Make popcorn
        popCornPopper.on();
        popCornPopper.pop();

        //2. Dim lights
        theaterLight.dim(10);

        //3. Put screen down
        screen.down();

        //4. Enable projector
        projector.on();
        projector.wideScreenMode();

        //5. Enable the Amplifier
        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setSurroundSound();
        amplifier.setVolume(15);

        dvd.on();
        dvd.play(movie);


    }
    @Override
    public void endMovie(){

        System.out.println("Shutting down movie theater...");
        popCornPopper.off();
        theaterLight.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();

    }
    @Override
    public void listenToCd(String compactDisk){
        System.out.println("Get Ready to listen music...");

        amplifier.on();
        amplifier.setStereoSound();
        amplifier.setVolume(10);

        cd.on(compactDisk);
        cd.play();

    }
    @Override
    public void endCd(){
        System.out.println("Shutting down cd...");

        amplifier.off();
        cd.off();

    }
    @Override
    public void listenToRadio(){
        throw new UnsupportedOperationException();
    }
    @Override
    public void endRadio(){
        throw new UnsupportedOperationException();
    }

}
