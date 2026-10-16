package payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    
    @GetMapping("/api/payments/status")
    public String getStatus() {
        return "Payments Service is Running";
    }

}