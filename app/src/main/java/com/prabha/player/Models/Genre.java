package com.prabha.player.Models;

/**
 * Created by Prabha Raj on 8/10/2018.
 */

public class Genre {

    public long _genreId;
    public String _genreName;
    public String _genreAlbumArt;
    public int _noOfAlbumsInGenre;

    public Genre(long _genreId, String _genreName, String _genreAlbumArt, int _noOfAlbumsInGenre) {
        this._genreId = _genreId;
        this._genreName = _genreName;
        this._genreAlbumArt = _genreAlbumArt;
        this._noOfAlbumsInGenre = _noOfAlbumsInGenre;
    }

}
