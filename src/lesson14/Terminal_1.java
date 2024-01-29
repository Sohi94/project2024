package lesson14;

public class Terminal_1 extends Flights {
    private final String to_go_city_name = "Miami";

    public static void main(String[] args) {
        Terminal_1 miami = new Terminal_1();


        System.out.println("Flights to: " + miami.to_go_city_name);
        miami.traveller_type_Adult(1);
        miami.departing_day(2);
        miami.arrival_date(11);
        miami.total_travel_time(1);
        miami.ticket_info();
        miami.flight_number();
       // miami.stop_number(1);
    }

    void flight_number() {
        System.out.println("flight_number: "+ super.flight_number);
    }

    @Override
    public void ticket_info() {
        super.arrival_Airport();
        super.departing_Airport();
        super.name_Airline();
        super.ticket_price("adult");
        super.class_type2();
        super.typeOfTrip_2side();

    }


}