package com.stackroute.MuzixSQL.service;

import com.stackroute.MuzixSQL.domain.Track;
import com.stackroute.MuzixSQL.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService
{
    private TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository)
    {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track)
    {
        Track savedTrack= trackRepository.save(track);
        return savedTrack;
    }

    @Override
    public List<Track> getAllTracks()
    {
        return trackRepository.findAll();
    }
}
