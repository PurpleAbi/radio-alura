import com.aluracursos.radioalura.models.Podcast;
import com.aluracursos.radioalura.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mysong = new Song();
        mysong.setFileName("Anita No!");
        mysong.setArtistName("The Do");
        mysong.setFileType("mp3");
        mysong.setAlbumName("Shake Shook Shaken");
        mysong.setMusicGender("Indie");

        Podcast mypodcast = new Podcast();
        mypodcast.setFileName("Episodio 16: María Laura Palacios");
        mypodcast.setHosts("Entre programadoras");
        mypodcast.setFileType("mv4");
        mypodcast.setTopic("Cami charló junto a María Laura Palacios, Co-fundadora del Club de Chicas Programadoras y CEO de G&L Group. Cuenta con una amplia experiencia laboral y un historial de emprendimientos que salieron adelante como CODESA S.A y AGRO PUMA.");
        mypodcast.setPartOfSeries(true);

        for (int i = 0; i < 5000 ; i++) {
            mysong.play();
        }

        for (int i = 0; i < 50 ; i++) {
            mysong.like();
        }

        for (int i = 0; i < 1000 ; i++) {
            mypodcast.play();
        }

        for (int i = 0; i < 100 ; i++) {
            mypodcast.like();
        }

        System.out.println("Your song '" + mysong.getFileName() + "' has been played a total of " + mysong.getTotalPlays() + " times.");
        System.out.println("And has a total of " + mysong.getTotalLikes() + " likes.");

        System.out.println("Your podcast '" + mypodcast.getFileName() + "' has been played a total of " + mypodcast.getTotalPlays() + " times.");
        System.out.println("And has a total of " + mypodcast.getTotalLikes() + " likes.");
    }
}
