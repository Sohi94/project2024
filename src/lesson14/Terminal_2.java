package lesson14;

public class Terminal_2 extends Flights {
    private String to_go_city_name = "Orlando";

    public static void main(String[] args) {
        Terminal_2 orlando = new Terminal_2();


        System.out.println("Flights to: " + orlando.to_go_city_name);

        orlando.flight_number();
        orlando.ticket_info();
        orlando.about_flight();

        orlando.departing_day(2);
        orlando.arrival_date(11);
        orlando.total_travel_time(0);


    }
    void flight_number() {
        System.out.println("flight_number: " + super.flight_number);
    }

    void about_flight() {
        super.name_Airline();
        super.departing_Airport();
        super.arrival_Airport();
        super.month(12);
    }

    @Override
    public void ticket_info() {

        super.typeOfTrip_2side();
        super.class_type2();
        super.traveller_type_Adult(1);
        super.ticket_price("adult");
        super.traveller_type_infant(2, 1);
        super.ticket_price("infant");

    }

}
