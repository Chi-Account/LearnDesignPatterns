package chi.learndesignpatterns.facadepattern;

import chi.learndesignpatterns.facadepattern.facade.HomeTheaterFacade;
import chi.learndesignpatterns.facadepattern.subsystem.Amplifier;
import chi.learndesignpatterns.facadepattern.subsystem.CdPlayer;
import chi.learndesignpatterns.facadepattern.subsystem.DvdPlayer;
import chi.learndesignpatterns.facadepattern.subsystem.PopcornPopper;
import chi.learndesignpatterns.facadepattern.subsystem.Projector;
import chi.learndesignpatterns.facadepattern.subsystem.Screen;
import chi.learndesignpatterns.facadepattern.subsystem.TheaterLights;
import chi.learndesignpatterns.facadepattern.subsystem.Tuner;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper);

        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}
