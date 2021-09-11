package com.dev.hrpayroll.services;

import com.dev.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Arthur", 500.0, days);
    }
}
