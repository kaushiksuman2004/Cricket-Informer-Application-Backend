package com.crick.cricket_informer_backend.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.cricket_informer_backend.Helper.Match;
import com.crick.cricket_informer_backend.Service.MatchService;


@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

    @Autowired
    private MatchService matchService;
    
    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<List<Match>>(this.matchService.getAllMatches(), HttpStatus.OK);
    }
    
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }

}
