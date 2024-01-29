package lesson14;

import java.util.Objects;

public abstract class Flights {

    protected int id = 1;
    protected String adult;
    protected String child;
    protected String infant;
     int flight_number = 5;
    // protected String flight_schedule;
    // protected String stop_airport;
    protected void departing_Airport() {
        System.out.println("departing_Airport name: "+"Newark (EWR - Liberty Intl.)");

    }
    protected void name_Airline() {
        System.out.println("Airline_type: "+"American Airline");

    }
    protected void arrival_Airport() {
        System.out.println("arrival_Airport name: "+"Newark (EWR - Liberty Intl.)");

    }
    protected int stop_number = 0;

    public int departing_day(int day) {


        switch (day) {
            case 1:
                System.out.println("departing_day: "+"Monday");
                break;
            case 2:
                System.out.println("departing_day: "+"Tuesday");
                break;
            case 3:
                System.out.println("departing_day: "+"Wednesday");
                break;
            case 4:
                System.out.println("departing_day: "+"Thursday");
                break;
            case 5:
                System.out.println("departing_day: "+"Friday");
                break;
            case 6:
                System.out.println("departing_day: "+"Saturday");
                break;
            case 7:
                System.out.println("departing_day: "+"Sunday");
                break;
            default:
                System.out.println("wrong insert");
        }
        return day;
    }

    public int arrival_date(int date) {
        if (date >= 1 & date <= 31) {
            System.out.println("arrival_date: " + date);
        }
        return date;
    }

    public int total_travel_time(int stop) {
        if (stop == 0) {
            System.out.println("total_Travel_Time: " + "9hours");
        }else if (stop == 1) {
                System.out.println("total_Travel_Time: " + "10hours");
            }

        return stop;
    }

    public String ticket_price(String traveller) {

        if (traveller == "adult") {
            System.out.println("ticket price for: " + traveller + " $ 150");
        }else if (Objects.equals(traveller, "child")) {
            System.out.println("ticket price: " + traveller + " $ 50");
        }else if (traveller == "infant") {
            System.out.println("ticket price: " + traveller + " 25");
        }
        return traveller;
    }

    //TRIP_TYPE
    public void typeOfTrip_2side() {
        System.out.println("Ticket for:  ROUND TRIP");
    }

    public void typeOfTrip_1side() {
        System.out.println("Ticket for:  One-way");
    }

    public void typeOfTrip_3more() {
        System.out.println("Ticket for:  multi-city");
    }

    // CLASS_TYPE
    public void class_type1() {
        System.out.println("your class type is:  ECONOMY");
    }

    public void class_type2() {
        System.out.println("your class type is:  PREMIUM ECONOMY");
    }

    public void class_type3() {
        System.out.println("your class type is:  BUSINESS CLASS");
    }

    public void class_type4() {
        System.out.println("your class type is:  FIRST CLASS");
    }

    //TRAVELLER NUMBER
    public int traveller_type_Adult(int num) {
        System.out.println("ADULT number: " + num);
        return num;
    }


    public int traveller_type_child(int childAge, int num) {
        if (childAge >= 2 & childAge <= 17) {
            System.out.println("childAge: " + childAge + " " + "child number: " + num);
        }
        return num;
    }

    public int traveller_type_infant(int infantAge, int num) {
        if (infantAge >= 2 & infantAge <= 17) {
            System.out.println("infat number: " + num + "infantAge: " + infantAge);
        }
        return num;
    }

    // super.arrival_Airport();
     public abstract void ticket_info();

    public int month(int monthNum) {


        switch (monthNum) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");

                break;
            default:
                System.out.println("wrong insert");
        }
        return monthNum;
    }





}

