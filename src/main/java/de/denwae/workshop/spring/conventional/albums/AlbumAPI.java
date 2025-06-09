package de.denwae.workshop.spring.conventional.albums;

import java.util.List;
import java.util.UUID;

public interface AlbumAPI {

    CompleteAlbumDTO createAlbum(String name, Integer releaseYear, List<UUID> songs);
    CompleteAlbumDTO findAlbum(UUID id);
    void deleteAlbum(UUID id);
}
