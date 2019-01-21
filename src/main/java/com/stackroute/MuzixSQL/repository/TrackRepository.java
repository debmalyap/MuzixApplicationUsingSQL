package com.stackroute.MuzixSQL.repository;

import com.stackroute.MuzixSQL.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track,Integer>
{
    //CRUD operations present in JpaRepository//
}
