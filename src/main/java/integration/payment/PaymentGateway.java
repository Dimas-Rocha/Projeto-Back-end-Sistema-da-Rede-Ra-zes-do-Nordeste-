package integration.payment;



public interface PaymentGateway {

    PaymentResponse solicitarPagamento(PaymentRequest request);

}
