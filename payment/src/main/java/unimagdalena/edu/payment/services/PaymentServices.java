package unimagdalena.edu.payment.services;

import java.util.List;
import unimagdalena.edu.payment.entities.Payment;

public interface PaymentServices {
    Payment create(Payment payment);

    Payment findById(Integer id);

}