package com.amazon.alexa.matter.client.coral;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.client.coral.auth.CoralServiceAuthConfiguration;
import com.amazon.alexa.matter.client.coral.auth.DefaultAuthConfiguration;
import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.dee.app.http.CoralService;
import com.dee.app.metrics.MetricsConstants;
import java.util.function.Function;
import org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class CoralServiceClient {

    @NonNull
    private final CoralService mCoralService;

    @NonNull
    protected final MatterLogger mLogger;

    @NonNull
    private final String mName;

    public CoralServiceClient(@NonNull String str, @NonNull CoralService coralService, @NonNull MatterLogger matterLogger) {
        this.mName = str;
        this.mCoralService = coralService;
        this.mLogger = matterLogger;
    }

    @NonNull
    private CoralService.Request decorate(@NonNull CoralService.Request request, @NonNull Operation<?, ?> operation) {
        CoralService.Request withOwnerIdentifier = request.withVerboseNetworkMetrics(true).withOwnerIdentifier(OwnerIdentifier.SMART_HOME_MATTER);
        CoralService.Request.Metadata metadata = withOwnerIdentifier.getMetadata();
        metadata.setDomain(this.mName);
        metadata.setMetricsSource(MetricsConstants.Source.NATIVE_CORAL);
        metadata.setOperationName(operation.getName());
        return withOwnerIdentifier;
    }

    @NonNull
    public <T, U> CoralService.Call<U> get(@NonNull Operation<T, U> operation, @NonNull T t, @NonNull CoralServiceAuthConfiguration coralServiceAuthConfiguration) {
        this.mLogger.debug("Creating GET request: " + operation.getName());
        return (CoralService.Call<U>) coralServiceAuthConfiguration.apply(decorate(this.mCoralService.request(operation.getPath(t)), operation)).get().as(operation.getResponseClass());
    }

    @NonNull
    public <T, U> CoralService.Call<U> post(@NonNull Operation<T, U> operation, @NonNull T t, @NonNull CoralServiceAuthConfiguration coralServiceAuthConfiguration) {
        this.mLogger.debug("Creating POST request: " + operation.getName());
        return (CoralService.Call<U>) coralServiceAuthConfiguration.apply(decorate(this.mCoralService.request(operation.getPath(t)), operation)).post(t).as(operation.getResponseClass());
    }

    @NonNull
    public <T, U> CoralService.Call<U> put(@NonNull Operation<T, U> operation, @NonNull T t, @NonNull CoralServiceAuthConfiguration coralServiceAuthConfiguration) {
        this.mLogger.debug("Creating PUT request: " + operation.getName());
        return (CoralService.Call<U>) coralServiceAuthConfiguration.apply(decorate(this.mCoralService.request(operation.getPath(t)), operation)).put(t).as(operation.getResponseClass());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Operation<T, U> {

        @NonNull
        private final String mName;

        @NonNull
        private final Function<T, String> mPathGenerator;

        @NonNull
        private final Class<U> mResponseClass;

        public Operation(@NonNull String str, @NonNull Function<T, String> function, @NonNull Class<U> cls) {
            this.mName = str;
            this.mPathGenerator = function;
            this.mResponseClass = cls;
        }

        @NonNull
        public String getName() {
            return this.mName;
        }

        @NonNull
        public String getPath(@NonNull T t) {
            return this.mPathGenerator.apply(t);
        }

        @NonNull
        public Class<U> getResponseClass() {
            return this.mResponseClass;
        }

        public Operation(@NonNull String str, @NonNull String str2, @NonNull Class<U> cls) {
            this(str, new LocaleUtils$$ExternalSyntheticLambda2(str2, 4), cls);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$new$0(String str, Object obj) {
            return str;
        }
    }

    @NonNull
    public <T, U> CoralService.Call<U> get(@NonNull Operation<T, U> operation, @NonNull T t) {
        return get(operation, t, new DefaultAuthConfiguration());
    }

    @NonNull
    public <T, U> CoralService.Call<U> post(@NonNull Operation<T, U> operation, @NonNull T t) {
        return post(operation, t, new DefaultAuthConfiguration());
    }

    @NonNull
    public <T, U> CoralService.Call<U> put(@NonNull Operation<T, U> operation, @NonNull T t) {
        return put(operation, t, new DefaultAuthConfiguration());
    }
}
