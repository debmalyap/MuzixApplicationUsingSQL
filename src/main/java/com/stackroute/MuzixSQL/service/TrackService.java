package com.stackroute.MuzixSQL.service;

import com.stackroute.MuzixSQL.domain.Track;

import java.util.List;

public interface TrackService
{
    public Track saveTrack(Track track);

    public List<Track> getAllTracks();

}
