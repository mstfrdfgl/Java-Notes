package org.example.list;

public class EnumExample {
    public static void main(String[] args) {
        // Enum elemanları üzerinde döngü
        for (Days day : Days.values()) {
            System.out.println(day + " " + day.getDescription()); // Günleri yazdırma
        }

        // Enum ile if-else yapısı kullanma
        Days today = Days.MONDAY; // Bugünü belirleme

        switch (today) {
            case SUNDAY:
                System.out.println("It's Sunday! Time to relax.");
                break;
            case MONDAY:
                System.out.println("It's Monday! A new week begins.");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday! Keep going.");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday! We're halfway through.");
                break;
            case THURSDAY:
                System.out.println("It's Thursday! Almost the weekend.");
                break;
            case FRIDAY:
                System.out.println("It's Friday! The weekend is near.");
                break;
            case SATURDAY:
                System.out.println("It's Saturday! Enjoy your day off.");
                break;
        }
    }
}
