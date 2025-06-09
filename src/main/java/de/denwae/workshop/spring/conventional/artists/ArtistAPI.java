package de.denwae.workshop.spring.conventional.artists;

import java.util.UUID;

public interface ArtistAPI {

    CompleteArtistDTO createArtist(String name, Integer formationYear, Status status, String biography);
    CompleteArtistDTO findArtist(UUID id);
    void deleteArtist(UUID id);
}
