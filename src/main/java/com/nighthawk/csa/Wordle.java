package com.nighthawk.csa;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.ArrayList;
import java.util.Random;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
public class Wordle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   private String char1;
   private String char2;
   private String char3;
   private String char4;
   private String char5;


    /* Initializer used when setting database from an API */
    public Wordle(String char1, String char2, String char3, String char4, String char5) {
        this.char1 = char1;
        this.char2 = char2;
        this.char3 = char3;
        this.char4 = char4;
        this.char5 = char5;
    }

    /* A custom getter to return age from dob calculation */
    public String word() {







        return "";
    }

}
