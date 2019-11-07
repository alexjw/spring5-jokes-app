package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {

    private final ChuckNorrisQuotes chuckNorris;

    public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorris) {
        this.chuckNorris = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorris.getRandomQuote();
    }
}
