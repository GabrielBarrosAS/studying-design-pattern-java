package com.example.designpatterns.state.notUsingPattern;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment {

    @Builder.Default
    private Status status = Status.PENDING;

    public void approvePayment() {

        if (status.equals(Status.PENDING)) {
            System.out.println("O status do pagamento mudou para: aprovado");
            status = Status.APPROVED;
        }

        if (status.equals(Status.APPROVED))
            System.out.println("Não é possível aprovar um pedido duas vezes");

        if (status.equals(Status.REFUSED))
            System.out.println("Não é possível aprovar um pedido recusado");

        if (status.equals(Status.SENT))
            System.out.println("Não é possível aprovar um pedido enviado");

    }

    public void refusePayment() {

        if (status.equals(Status.PENDING)) {
            System.out.println("O status do pagamento mudou para: recusado");
            status = Status.REFUSED;
        }

        if (status.equals(Status.APPROVED))
            System.out.println("Não é possível recusar um pedido aprovado");

        if (status.equals(Status.REFUSED))
            System.out.println("Não é possível recusar um pedido duas vezes");

        if (status.equals(Status.SENT))
            System.out.println("Não é possível recusar um pedido enviado");

    }

    public void sendProducts() {

        if (status.equals(Status.PENDING))
            System.out.println("Não é possível enviar um pedido pendente");

        if (status.equals(Status.APPROVED)) {
            System.out.println("O status do pagamento mudou para: enviado");
            status = Status.SENT;
        }

        if (status.equals(Status.REFUSED))
            System.out.println("Não é possível enviar um pedido recusado");

        if (status.equals(Status.SENT))
            System.out.println("Não é possível recusar enviar um pedido duas vezes");

    }

}
