package FacadePattern.HomeTheaterExample;

/**
 * Created by theo on 7/4/16.
 * Facade Pattern Test.
 *Facade Pattern provides an unified interface to a set of
 * interfaces in subsystem. Facade defines a higher level
 * interfaces that makes the subsystem easier to USE!
 */
public class MainHomeTheaterFacade {

    public static void main(String args[]){

        DvdPlayer dvdPlayer=new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Tuner tuner = new Tuner();

        Amplifier amplifier= new Amplifier(tuner,dvdPlayer,cdPlayer);
        dvdPlayer.setAmplifier(amplifier);
        cdPlayer.setAmplifier(amplifier);
        tuner.setAmplifier(amplifier);

        Projector projector=new Projector(dvdPlayer);
        Screen screen= new Screen();
        TheaterLight theaterLight=new TheaterLight();
        PopCornPopper popCornPopper=new PopCornPopper();



        HomeTheaterFacade homeTheater= new HomeTheaterFacade(amplifier,
                tuner,dvdPlayer,cdPlayer,projector,theaterLight,screen,
                popCornPopper);

        //Watch a movie simply...
        //
        homeTheater.watchMovie("2012");
        homeTheater.endMovie();


        homeTheater.listenToCd("Sampanis!");
        homeTheater.endCd();
    }
}
