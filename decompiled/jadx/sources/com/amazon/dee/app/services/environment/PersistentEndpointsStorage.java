package com.amazon.dee.app.services.environment;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.EndpointsBundleKeys;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.dee.app.metrics.MetricsConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/dee/app/services/environment/PersistentEndpointsStorage;", "", "persistentStorageFactory", "Lcom/amazon/alexa/protocols/storage/PersistentStorage$Factory;", "<init>", "(Lcom/amazon/alexa/protocols/storage/PersistentStorage$Factory;)V", "storage", "Lcom/amazon/alexa/protocols/storage/PersistentStorage;", MetricsConstants.Method.CACHE_GET, "Lcom/amazon/dee/app/services/environment/Endpoints;", MetricsConstants.Method.CACHE_PUT, "", EndpointsBundleKeys.ENDPOINTS, MetricsConstants.Method.CACHE_CLEAR, "StorageKey", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentEndpointsStorage {

    @NotNull
    private static final String ENDPOINTS_STORAGE_NAMESPACE = "environment.endpoints";

    @NotNull
    private static final String TAG = "PersistentEndpointsStorage";

    @NotNull
    private final PersistentStorage storage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/dee/app/services/environment/PersistentEndpointsStorage$StorageKey;", "", "<init>", "()V", "SCHEMA_VERSION", "", "ALEXA_API_URL", "WEBSITE_API_URL", "WEBSITE_URL", "RETAIL_DOMAIN", "RETAIL_URL", "AWS_REGION", "SKILLS_STORE_URL", "BOB_DISPATCH_URL", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StorageKey {

        @NotNull
        public static final String ALEXA_API_URL = "endpoints.alexaApiUrl";

        @NotNull
        public static final String AWS_REGION = "endpoints.awsRegion";

        @NotNull
        public static final String BOB_DISPATCH_URL = "endpoints.bobDispatchUrl";

        @NotNull
        public static final StorageKey INSTANCE = new StorageKey();

        @NotNull
        public static final String RETAIL_DOMAIN = "endpoints.retailDomain";

        @NotNull
        public static final String RETAIL_URL = "endpoints.retailUrl";

        @NotNull
        public static final String SCHEMA_VERSION = "endpoints.version";

        @NotNull
        public static final String SKILLS_STORE_URL = "endpoints.skillsStoreUrl";

        @NotNull
        public static final String WEBSITE_API_URL = "endpoints.websiteApiUrl";

        @NotNull
        public static final String WEBSITE_URL = "endpoints.websiteUrl";

        private StorageKey() {
        }
    }

    public PersistentEndpointsStorage(@NotNull PersistentStorage.Factory factory) {
        factory.getClass();
        PersistentStorage create = factory.create(ENDPOINTS_STORAGE_NAMESPACE);
        create.getClass();
        this.storage = create;
    }

    public final void clear() {
        this.storage.edit().remove(StorageKey.SCHEMA_VERSION).remove(StorageKey.ALEXA_API_URL).remove(StorageKey.WEBSITE_API_URL).remove(StorageKey.WEBSITE_URL).remove(StorageKey.RETAIL_DOMAIN).remove(StorageKey.RETAIL_URL).remove(StorageKey.AWS_REGION).remove(StorageKey.SKILLS_STORE_URL).remove(StorageKey.BOB_DISPATCH_URL).commit();
    }

    @Nullable
    public final Endpoints get() {
        if (this.storage.contains(StorageKey.SCHEMA_VERSION) && Intrinsics.areEqual(Endpoints.CURRENT_SCHEMA_VERSION, this.storage.getString(StorageKey.SCHEMA_VERSION))) {
            return new Endpoints(this.storage.getString(StorageKey.ALEXA_API_URL), this.storage.getString(StorageKey.WEBSITE_API_URL), this.storage.getString(StorageKey.WEBSITE_URL), this.storage.getString(StorageKey.RETAIL_DOMAIN), this.storage.getString(StorageKey.RETAIL_URL), this.storage.getString(StorageKey.AWS_REGION), this.storage.getString(StorageKey.SKILLS_STORE_URL), this.storage.getString(StorageKey.BOB_DISPATCH_URL));
        }
        return null;
    }

    public final void put(@NotNull Endpoints endpoints) {
        endpoints.getClass();
        Objects.toString(endpoints);
        this.storage.edit().set(StorageKey.SCHEMA_VERSION, Endpoints.CURRENT_SCHEMA_VERSION).set(StorageKey.ALEXA_API_URL, endpoints.getAlexaApiUrl()).set(StorageKey.WEBSITE_API_URL, endpoints.getWebsiteApiUrl()).set(StorageKey.WEBSITE_URL, endpoints.getWebsiteUrl()).set(StorageKey.RETAIL_DOMAIN, endpoints.getRetailDomain()).set(StorageKey.RETAIL_URL, endpoints.getRetailUrl()).set(StorageKey.AWS_REGION, endpoints.getAwsRegion()).set(StorageKey.SKILLS_STORE_URL, endpoints.getSkillsStoreUrl()).set(StorageKey.BOB_DISPATCH_URL, endpoints.getBobDispatchUrl()).commit();
    }
}
