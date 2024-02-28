package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.BookingDao;
import com.upgrad.hirewheels.dao.UserDAO;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingDao bookingDao;
    @Autowired
    UserDAO userDAO;

    /**
     * This method adds booking for a particular vehicle in the database. While adding the booking,
     * the booking amount should be deducted from the wallet balance of the user.
     * @param booking
     * @return
     */
    @Override
    public Booking addBooking(Booking booking) {
        User user = booking.getUsers();
        if (user.getWalletMoney() < booking.getAmount()){
            System.out.println("Insufficient Balance. Please check with Admin.");
        }else {
            user.setWalletMoney(user.getWalletMoney() - booking.getAmount());
            userDAO.save(user);
        }
        Booking savedBooking = bookingDao.save(booking);
        return savedBooking;
    }
}
