package org.example.list;

public enum Days {
    SUNDAY("Day of rest"),
    MONDAY("Start of the work week"),
    TUESDAY("Second day of the work week"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost there"),
    FRIDAY("End of the work week"),
    SATURDAY("Weekend fun");

    private final String description; // Gün açıklaması

    // Enum yapıcı
    Days(String description) {
        this.description = description;
    }

    // Açıklama alma metodu
    public String getDescription() {
        return description;
    }
}




