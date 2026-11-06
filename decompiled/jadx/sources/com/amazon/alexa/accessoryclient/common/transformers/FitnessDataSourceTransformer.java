package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.io.Source;
import com.amazon.alexa.accessory.protocol.Fitness;
import com.amazon.alexa.accessory.repositories.fitness.FitnessDataSource;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/FitnessDataSourceTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/repositories/fitness/FitnessDataSource;", "()V", "CONTINUATION_TOKEN_KEY", "", "DATA_FORMAT_KEY", "FITNESS_DATA_SOURCE_KEY", "SHA_256_KEY", Constants.LOG_TAG, "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", FitnessDataSourceTransformer.FITNESS_DATA_SOURCE_KEY, "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FitnessDataSourceTransformer implements BundleTransformer<FitnessDataSource> {

    @NotNull
    private static final String CONTINUATION_TOKEN_KEY = "continuationToken";

    @NotNull
    private static final String DATA_FORMAT_KEY = "dataFormatNumber";

    @NotNull
    private static final String FITNESS_DATA_SOURCE_KEY = "fitnessDataSource";

    @NotNull
    public static final FitnessDataSourceTransformer INSTANCE = new FitnessDataSourceTransformer();

    @NotNull
    private static final String SHA_256_KEY = "sha256";

    @NotNull
    private static final String TAG = "FitnessDataSourceTransformer:";

    private FitnessDataSourceTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public FitnessDataSource fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        SourceTransformer sourceTransformer = SourceTransformer.INSTANCE;
        Bundle bundle2 = bundle.getBundle(FITNESS_DATA_SOURCE_KEY);
        bundle2.getClass();
        return new FitnessDataSource(sourceTransformer.fromBundle2(bundle2), Fitness.FitnessDataFormat.forNumber(bundle.getInt(DATA_FORMAT_KEY)), bundle.getByteArray(SHA_256_KEY), bundle.getByteArray(CONTINUATION_TOKEN_KEY));
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull FitnessDataSource fitnessDataSource) {
        fitnessDataSource.getClass();
        Bundle bundle = new Bundle();
        bundle.putBundle(FITNESS_DATA_SOURCE_KEY, SourceTransformer.INSTANCE.toBundle((Source) fitnessDataSource));
        bundle.putInt(DATA_FORMAT_KEY, fitnessDataSource.getFormat().getNumber());
        bundle.putByteArray(SHA_256_KEY, fitnessDataSource.getSha256Checksum());
        bundle.putByteArray(CONTINUATION_TOKEN_KEY, fitnessDataSource.getContinuationToken());
        return bundle;
    }
}
