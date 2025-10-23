package com.codefirstgirls.menu;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDiscount {
  private final LocalDate currentTime = LocalDate.from(LocalTime.now());
  private final LocalDate startTime = LocalDate.from(LocalTime.of(12, 0));
  private final LocalDate endTime = LocalDate.from(LocalTime.of(13, 30));

 public int getDiscount(){
    if(currentTime.isBefore(startTime)){
      return 10;
    } else if (currentTime.isAfter(startTime) && currentTime.isBefore(endTime)) {
      return 15;
    }
    else {
      return 0;
    }
  }
}
