package de.denwae.workshop.spring.conventional.songs;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

public interface SongAPI {

    CompleteSongDTO createSong(String name, Duration duration, List<UUID> artists);
    CompleteSongDTO findSong(UUID id);
    void deleteSong(UUID id);
}
