package com.prabha.player.Models;

/**
 * Created by Prabha Raj on 8/10/2018.
 */

public class Artist {

    public long  _artistId;
    public String _artistName;
    public String _artistAlbumArt;
    public int _noOfTracksByArtist;
    public int _noOfAlbumsByArtist;

    public Artist(long _artistId, String _artistName, String _artistAlbumArt, int _noOfTracksByArtist, int _noOfAlbumsByArtist) {
        this._artistId = _artistId;
        this._artistName = _artistName;
        this._artistAlbumArt = _artistAlbumArt;
        this._noOfTracksByArtist = _noOfTracksByArtist;
        this._noOfAlbumsByArtist = _noOfAlbumsByArtist;
    }


}
