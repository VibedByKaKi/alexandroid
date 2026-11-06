package io.reactivex.rxjava3.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class QueueOverflowException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Queue overflow due to illegal concurrent onNext calls or a bug in an operator";
    private static final long serialVersionUID = 8517344746016032542L;

    public QueueOverflowException() {
        this(DEFAULT_MESSAGE);
    }

    public QueueOverflowException(String str) {
        super(str);
    }
}
