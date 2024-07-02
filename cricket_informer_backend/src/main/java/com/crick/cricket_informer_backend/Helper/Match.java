package com.crick.cricket_informer_backend.Helper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cricket_match")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    private MatchStatus status;

    private Date date = new Date();

    // Set the match status according to textComplete
    public void setMatchStatus(){
        if (this.textComplete.isBlank()) {
            this.status = MatchStatus.LIVE;
        } else {
            this.status = MatchStatus.COMPLETED;
        }
    }
}
