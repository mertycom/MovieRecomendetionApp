package com.bilgeadam.utility;

import com.bilgeadam.repository.model.EGenre;
import com.bilgeadam.repository.model.Movie;
import com.bilgeadam.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class DataImpl {

    private final MovieService movieService;

@PostConstruct
public void initData(){

    List<Movie> movies=List.of(Movie.builder().title("D�nyan�n En K�t� �nsan�").directors(List.of("Joachim Trier")).country("Norve�".toUpperCase(Locale.ENGLISH)).genre(List.of(EGenre.DRAMA,EGenre.ROMANTIK))
                    .year(2022).ranked(8.3).time(120).usersRanked(Map.of("256sasasf",8.0,"125das",9.0)).build(),

            Movie.builder().title("The Big Lebowski").directors(List.of("Ethan Coen", "Joel Coen")).country("Amerika".toUpperCase(Locale.ENGLISH)).genre(List.of(EGenre.AKSIYON,EGenre.KARAMIZAH))
                    .year(1998).ranked(8.6).time(117).build(),
            Movie.builder().title("Barton Fink").directors(List.of("Ethan Coen", "Joel Coen")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.GERILIM,EGenre.GIZEM)).year(1991).ranked(8.8).time(116).build(),
            Movie.builder().title("Miller's Crossing").directors(List.of("Ethan Coen", "Joel Coen")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.AKSIYON,EGenre.SUC))
                    .year(1990).ranked(8.2).time(115).build(),
            Movie.builder().title("Fargo").directors(List.of("Ethan Coen", "Joel Coen")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.GERILIM,EGenre.SUC))
                    .year(1996).ranked(8.0).time(98).build(),
            Movie.builder().title("Orada olmayan adam").directors(List.of("Ethan Coen", "Joel Coen")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.GERILIM,EGenre.SUC))
                    .year(2001).ranked(8.4).time(116).build(),
            Movie.builder().title("Nerdesin be birader?").directors(List.of("Ethan Coen", "Joel Coen")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.KOMEDI))
                    .year(2000).ranked(7.8).time(107).build(),
            Movie.builder().title("Ihtiyarlara yer yok").directors(List.of("Ethan Coen", "Joel Coen")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.GERILIM,EGenre.SUC))
                    .year(2007).ranked(9.1).time(122).build(),
            Movie.builder().title("Ciddi bir adam").directors(List.of("Ethan Coen", "Joel Coen")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.DRAMA,EGenre.KARAMIZAH))
                    .year(2007).ranked(7.9).time(106).build(),
            Movie.builder().title("R�zg�rli Vadi ").directors(List.of("Hayao Miyazaki")).country("Japonya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.ANIME))
                    .year(1984).ranked(9.3).time(117).build(),
            Movie.builder().title("R�zgar Y�kseliyor").directors(List.of("Hayao Miyazaki")).country("Japonya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.ANIME))
                    .year(2013).ranked(9.2).time(126).build(),
            Movie.builder().title("Y�r�yen sato").directors(List.of("Hayao Miyazaki")).country("Japonya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.ANIME))
                    .year(2004).ranked(9.4).time(119).build(),
            Movie.builder().title("Ruhlarin Ka�isi").directors(List.of("Hayao Miyazaki")).country("Japonya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.ANIME))
                    .year(2001).ranked(8.9).time(125).build(),
            Movie.builder().title("Prenses Mononoke").directors(List.of("Hayao Miyazaki")).country("Japonya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.ANIME))
                    .year(1997).ranked(9.4).time(125).build(),
            Movie.builder().title("G�kteki kale").directors(List.of("Hayao Miyazaki")).country("Japonya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.ANIME))
                    .year(1986).ranked(9.0).time(125).build(),
            Movie.builder().title("K���k cadi Kiki").directors(List.of("Hayao Miyazaki")).country("Japonya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.ANIME))
                    .year(1986).ranked(8.5).time(103).build(),
            Movie.builder().title("Aski Yakala").directors(List.of("Ben Palmer")).country("�ngiltere".toUpperCase())
                    .genre(List.of(EGenre.ROMANTIK,EGenre.ROMANTIKKOMEDI))
                    .year(2015).ranked(7.9).time(103).build(),
            Movie.builder().title("Cashback").directors(List.of("Sean Ellis")).country("�ngiltere".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.ROMANTIK))
                    .year(2006).ranked(7.8).time(102).build(),
            Movie.builder().title("Bir Konusabilse").directors(List.of("Sofia Coppola")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.KOMEDI,EGenre.DRAMA))
                    .year(2003).ranked(7.8).time(102).build(),
            Movie.builder().title("Submarine").directors(List.of("Richard Ayoade")).country("Ingiltere".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.KOMEDI,EGenre.ROMANTIK))
                    .year(2010).ranked(7.6).time(97).build(),
            Movie.builder().title("�ikolata").directors(List.of("Lasse Hallstr�m")).country("Ingiltere".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.ROMANTIK,EGenre.ROMANTIKKOMEDI))
                    .year(2000).ranked(7.5).time(121).build(),
            Movie.builder().title("Wristcutters: A Love Story").directors(List.of("Goran Dukic")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.KARAMIZAH,EGenre.FANTASTIK))
                    .year(2000).ranked(8.1).time(88).build(),
            Movie.builder().title("Kan d�k�lecek").directors(List.of("Paul Thomas Anderson")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.DRAMA,EGenre.SUC))
                    .year(2000).ranked(8.8).time(158).build(),
            Movie.builder().title("Coda").directors(List.of("Sian Heder")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.DRAMA))
                    .year(2000).ranked(8.1).time(111).build(),
            Movie.builder().title("Dune ��l Gezegeni").directors(List.of("Denis Villeneuve")).country("Kanada".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.BILIMKURGU))
                    .year(2020).ranked(8.8).time(111).build(),
            Movie.builder().title("Blade Runner 2049").directors(List.of("Denis Villeneuve")).country("Kanada".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.BILIMKURGU))
                    .year(2017).ranked(9.0).time(164).build(),
            Movie.builder().title("Arrival").directors(List.of("Denis Villeneuve")).country("Kanada".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.GIZEM,EGenre.BILIMKURGU))
                    .year(2017).ranked(8.8).time(116).build(),
            Movie.builder().title("Enemy").directors(List.of("Denis Villeneuve")).country("Kanada".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.GIZEM,EGenre.GERILIM))
                    .year(2017).ranked(8.1).time(91).build(),
            Movie.builder().title("Novecento").directors(List.of("Bernardo Bertolucci")).country("Italya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.DRAMA,EGenre.TARIHI))
                    .year(1976).ranked(8.7).time(317).build(),
            Movie.builder().title("�alinmis g�zellik").directors(List.of("Bernardo Bertolucci")).country("Italya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.DRAMA))
                    .year(1996).ranked(7.7).time(118).build(),
            Movie.builder().title("��lde �ay").directors(List.of("Bernardo Bertolucci")).country("Italya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.DRAMA))
                    .year(1990).ranked(8.2).time(138).build(),
            Movie.builder().title("The Last Emperor").directors(List.of("Bernardo Bertolucci")).country("Italya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.BIYOGRAFI,EGenre.TARIHI))
                    .year(1987).ranked(8.9).time(163).build(),
            Movie.builder().title("Konformist").directors(List.of("Bernardo Bertolucci")).country("Italya".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.BIYOGRAFI,EGenre.TARIHI))
                    .year(1970).ranked(8.1).time(113).build(),
            Movie.builder().title("Swiss Army Man").directors(List.of("Dan Kwan", "Daniel Scheinert")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.KARAMIZAH,EGenre.FANTASTIK))
                    .year(2016).ranked(7.8).time(97).build(),
            Movie.builder().title("D�s�s").directors(List.of("Tarsem Singh")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.KARAMIZAH,EGenre.FANTASTIK))
                    .year(2006).ranked(9.2).time(117).build(),
            Movie.builder().title("The Doors").directors(List.of("Oliver Stone")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.MUZIKAL,EGenre.BIYOGRAFI))
                    .year(2006).ranked(8.8).time(140).build(),
            Movie.builder().title("B�y�k Budapeste Oteli").directors(List.of("Wes Anderson")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK,EGenre.KOMEDI))
                    .year(2014).ranked(9.3).time(99).build(),
            Movie.builder().title("K�pek Adas�").directors(List.of("Wes Anderson")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.ANIMASYON))
                    .year(2018).ranked(8.7).time(101).build(),
            Movie.builder().title("Moonrise Kingdom").directors(List.of("Wes Anderson")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.FANTASTIK))
                    .year(2012).ranked(9.2).time(94).build(),
            Movie.builder().title("The Thirteenth Floor").directors(List.of("Josef Rusnak")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.BILIMKURGU))
                    .year(1999).ranked(8.8).time(100).build(),
            Movie.builder().title("Her �eyi Bitirmeyi D���n�yorum").directors(List.of("Charlie Kaufman")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.GIZEM))
                    .year(2020).ranked(8.8).time(134).build(),
            Movie.builder().title("Fallen Angels").directors(List.of("Wong Kar Wai")).country("�in".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.DRAMA))
                    .year(1995).ranked(8.7).time(99).build(),
            Movie.builder().title("In Mood For Love").directors(List.of("Wong Kar Wai")).country("�in".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.ROMANTIK))
                    .year(2000).ranked(9.5).time(98).build(),
            Movie.builder().title("2046").directors(List.of("Wong Kar Wai")).country("�in".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.ROMANTIK))
                    .year(2004).ranked(8.8).time(129).build(),
            Movie.builder().title("Benim Ask Pastam").directors(List.of("Wong Kar Wai")).country("�in".toUpperCase())
                    .genre(List.of(EGenre.ROMANTIK,EGenre.ROMANTIKKOMEDI))
                    .year(2007).ranked(8.0).time(95).build(),
            Movie.builder().title("Chungking Ekspresi").directors(List.of("Wong Kar Wai")).country("�in")
                    .genre(List.of(EGenre.ROMANTIK,EGenre.ROMANTIKKOMEDI))
                    .year(1994).ranked(9.1).time(102).build(),
            Movie.builder().title("Atesten kalbe akildan dumana").directors(List.of("Guy Ritchie")).country("Ingiltere".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.SUC,EGenre.KARAMIZAH))
                    .year(1998).ranked(9.0).time(107).build(),
            Movie.builder().title("Yedinci Muhur").directors(List.of("Ingmar Bergman")).country("Isvec".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.SUC,EGenre.KARAMIZAH))
                    .year(1957).ranked(9.1).time(96).build(),
            Movie.builder().title("Persona").directors(List.of("Ingmar Bergman")).country("Isvec".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.GIZEM))
                    .year(1966).ranked(9.2).time(85).build(),
            Movie.builder().title(" Pulp Fiction").directors(List.of("Quentin Tarantino")).country("Amerika".toUpperCase(Locale.ENGLISH))
                    .genre(List.of(EGenre.SUC, EGenre.AKSIYON))
                    .year(1994).ranked(9.2).time(154).build()
    );

    movieService.saveAll(movies);


}

}
