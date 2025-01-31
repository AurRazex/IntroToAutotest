package Lesson6.weather.dayWeatherAlarms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Date",
    "EpochDate",
    "Alarms",
    "MobileLink",
    "Link"
})

public class DayWeatherAlarm {

    @JsonProperty("Date")
    private String date;
    @JsonProperty("EpochDate")
    private Integer epochDate;
    @JsonProperty("Alarms")
    private List<Alarm> alarms;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("EpochDate")
    public Integer getEpochDate() {
        return epochDate;
    }

    @JsonProperty("EpochDate")
    public void setEpochDate(Integer epochDate) {
        this.epochDate = epochDate;
    }

    @JsonProperty("Alarms")
    public List<Alarm> getAlarms() {
        return alarms;
    }

    @JsonProperty("Alarms")
    public void setAlarms(List<Alarm> alarms) {
        this.alarms = alarms;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return mobileLink;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(String link) {
        this.link = link;
    }

}
