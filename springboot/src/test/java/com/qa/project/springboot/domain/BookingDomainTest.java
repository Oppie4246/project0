package com.qa.project.springboot.domain;

import com.qa.project.persistence.domain.BookingDomain;
import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.domain.PropertyDomain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class BookingDomainTest {

        @Mock
        private PropertyDomain property;

        @Mock
    private BuyerDomain buyer;
    private Timestamp time;

    private BookingDomain booking;

    @BeforeEach
    void setUp(){
        time = new Timestamp(System.currentTimeMillis());
        booking = new BookingDomain(1L, buyer, property, time);
    }

    @Test
    void testDefaultConstructor(){
        BookingDomain defaultBooking = new BookingDomain();
                assertNotNull(defaultBooking);
    }
    
}
