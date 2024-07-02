package com.crick.cricket_informer_backend.Service;

import java.util.List;
import java.util.Map;

import com.crick.cricket_informer_backend.Helper.Match;

public interface MatchService {
    
    // get all matches
    public List<Match> getAllMatches();

    // get live matches
    public List<Match> getLiveMatches();

    // get cwc2023 point table
    public List<List<String>> getPointTable();
    
}
