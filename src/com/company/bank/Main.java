package com.company.bank;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Ridwan Bolanle Abdulfatah", "0173430210");
        bankAccount.depositeFunds(80.00);
        bankAccount.withdrawFunds(12.00);

    }

    public static String getDurationString(int minutes, int seconds) {
        int timeInSeconds;
        int hour, newMinutes, newSeconds, remainder;

        if (minutes < 0 || seconds < 0)
            return "you've entered an invalid hour or minute";

        else if (minutes > 0 && seconds > 0) {

            timeInSeconds = (minutes * 60);
            timeInSeconds += seconds;


            hour = timeInSeconds / 3600;
            remainder = timeInSeconds%3600;
            System.out.println(remainder + " is the current remainder");
            newMinutes = remainder/60;
            newSeconds = remainder % 60;
            System.out.println(newSeconds + " is the seconds");

            String time = (hour + "hours " + newMinutes + "minutes " + newSeconds + "seconds");
            return time;
        }

        return "you've entered an invalid hour or minute";

    }
}
