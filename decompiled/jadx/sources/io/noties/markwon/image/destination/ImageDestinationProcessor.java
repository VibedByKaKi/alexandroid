package io.noties.markwon.image.destination;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class ImageDestinationProcessor {
    @NonNull
    public static ImageDestinationProcessor noOp() {
        return new NoOp();
    }

    @NonNull
    public abstract String process(@NonNull String str);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NoOp extends ImageDestinationProcessor {
        private NoOp() {
        }

        @Override // io.noties.markwon.image.destination.ImageDestinationProcessor
        @NonNull
        public String process(@NonNull String str) {
            return str;
        }
    }
}
