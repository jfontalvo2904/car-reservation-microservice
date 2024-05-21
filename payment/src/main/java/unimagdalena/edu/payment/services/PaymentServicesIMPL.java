package unimagdalena.edu.payment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.entities.Payment;
import com.example.prueba.repositories.PaymentRepository;

@Service
public class PaymentServicesImp implements PaymentServices {
    @Autowired
    private PaymentRepository paymentRepo;

    @Override
    public Payment create(Payment payment) {
        return paymentRepo.save(payment);
    }

    @Override
    public Payment findById(Integer id) {
        Optional<Payment> paymentopt = paymentRepo.findById(id);
        return paymentopt.orElse(null);
    }

}