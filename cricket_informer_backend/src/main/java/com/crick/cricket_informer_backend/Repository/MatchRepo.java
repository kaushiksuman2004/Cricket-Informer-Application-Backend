package com.crick.cricket_informer_backend.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crick.cricket_informer_backend.Helper.Match;

@Repository
public interface MatchRepo extends JpaRepository<Match, Integer> {
    
    // Fetch match by team heading
    Optional<Match> findByTeamHeading(String teamHeading);
    
}
