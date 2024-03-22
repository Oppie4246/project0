package com.qa.project.springboot.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.domain.BookingDomain;
import com.qa.project.persistence.domain.PropertyDomain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookingDomainTest {

    @Mock
    private PropertyDomain property;

    @Mock
    private BuyerDomain buyer;
    private Timestamp time;
    private BookingDomain booking;

    @BeforeEach
    void setUp() {
        time = new Timestamp(System.currentTimeMillis());
        booking = new BookingDomain(1L, buyer, property, time);
    }

    @Test
    void testDefaultConstructor() {
        BookingDomain defaultBooking = new BookingDomain();
        assertNotNull(defaultBooking);
    }

    @Test
    void testAllArgumentConstructor() {
        assertNotNull(booking);
        assertEquals(1L, booking.getId());
        assertEquals(buyer, booking.getBuyer());
        assertEquals(property, booking.getProperty());
        assertEquals(time, booking.getTime());
    }

    @Test
    void testGetId() {
        assertEquals(1L, booking.getId());
    }

    @Test
    void testGetBuyer() {
        assertEquals(buyer, booking.getBuyer());
    }

    @Test
    void testGetProperty() {
        assertEquals(property, booking.getProperty());
    }

    @Test
    void testGetTime() {
        assertEquals(time, booking.getTime());
    }

    @Test
    void testSetId() {
        booking.setId(2L);
        assertEquals(2L, booking.getId());
    }

    @Test
    void testSetBuyer() {
        BuyerDomain newBuyer = mock(BuyerDomain.class);
        booking.setBuyer(newBuyer);
        assertEquals(newBuyer, booking.getBuyer());
    }

    @Test
    void testSetProperty() {
        PropertyDomain newProperty = mock(PropertyDomain.class);
        booking.setProperty(newProperty);
        assertEquals(newProperty, booking.getProperty());
    }

    @Test
    void testSetTime() {
        booking.setTime(time);
        assertEquals(time, booking.getTime());
    }
}


