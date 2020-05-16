package ru.mike;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties
public class DataModel
{
        public String id;
        public Double firstSide;
        public Double secondSide;
        public Double thirdSide;

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public Double getFirstSide() {
                return firstSide;
        }

        public void setFirstSide(Double firstSide) {
                this.firstSide = firstSide;
        }

        public Double getSecondSide() {
                return secondSide;
        }

        public void setSecondSide(Double secondSide) {
                this.secondSide = secondSide;
        }

        public Double getThirdSide() {
                return thirdSide;
        }

        public void setThirdSide(Double thirdSide) {
                this.thirdSide = thirdSide;
        }
}
