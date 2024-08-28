package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BokingResponsePojo {

    private BookingPojo booking;

    public BokingResponsePojo() {
    }

    public BokingResponsePojo(BookingPojo booking) {
        this.booking = booking;
    }

    public BookingPojo getBooking() {
        return booking;
    }

    public void setBooking(BookingPojo booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "BokingResponsePojo{" +
                "booking=" + booking +
                '}';
    }
}
