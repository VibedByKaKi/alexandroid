package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.repositories.fitness.FitnessDataAvailableNotification;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/FitnessDataAvailableNotificationTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/repositories/fitness/FitnessDataAvailableNotification;", "()V", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "fitnessDataAvailableNotification", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FitnessDataAvailableNotificationTransformer implements BundleTransformer<FitnessDataAvailableNotification> {

    @NotNull
    public static final FitnessDataAvailableNotificationTransformer INSTANCE = new FitnessDataAvailableNotificationTransformer();

    private FitnessDataAvailableNotificationTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public FitnessDataAvailableNotification fromBundle(@NotNull Bundle bundle) {
        bundle.getClass();
        FitnessDataAvailableNotification fitnessDataAvailableNotification = FitnessDataAvailableNotification.INSTANCE;
        fitnessDataAvailableNotification.getClass();
        return fitnessDataAvailableNotification;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull FitnessDataAvailableNotification fitnessDataAvailableNotification) {
        fitnessDataAvailableNotification.getClass();
        return new Bundle();
    }
}
