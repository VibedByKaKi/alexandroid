package io.reactivex.rxjava3.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MissingBackpressureException extends RuntimeException {
    public static final String DEFAULT_MESSAGE = "Could not emit value due to lack of requests";
    private static final long serialVersionUID = 8517344746016032542L;

    public MissingBackpressureException() {
    }

    public static MissingBackpressureException createDefault() {
        return new MissingBackpressureException(DEFAULT_MESSAGE);
    }

    public MissingBackpressureException(String str) {
        super(str);
    }
}
