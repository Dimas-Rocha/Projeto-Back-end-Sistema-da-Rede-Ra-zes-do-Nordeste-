package integration.payment;



import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MockPaymentGateway implements PaymentGateway {

    @Override
    public PaymentResponse solicitarPagamento(PaymentRequest request) {

        return PaymentResponse.builder()
                .status(PaymentStatus.APROVADO)
                .transactionId(UUID.randomUUID().toString())
                .mensagem("Pagamento aprovado pelo gateway mock.")
                .build();
    }

}