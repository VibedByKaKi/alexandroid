package com.amazon.alexa.client.metrics.minerva;

import android.content.Context;
import com.amazon.alexa.auth.TokenProvider;
import com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration;
import com.amazon.minerva.client.thirdparty.api.AmazonMinerva;
import com.amazon.minerva.client.thirdparty.api.AmazonMinervaAndroidClientBuilder;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MinervaMetricsProvider {
    private static final String REGION = "us-east-1";
    private final Lazy<MetricsClientConfiguration> clientConfiguration;
    private final Context context;
    private final TokenProvider tokenProvider;

    @Inject
    public MinervaMetricsProvider(Context context, TokenProvider tokenProvider, Lazy<MetricsClientConfiguration> lazy) {
        this.context = context;
        this.tokenProvider = tokenProvider;
        this.clientConfiguration = lazy;
    }

    public AmazonMinerva get() {
        return AmazonMinervaAndroidClientBuilder.standard(this.context).withRegion("us-east-1").withDeviceType(this.clientConfiguration.get().getMetricsDeviceType()).withOAuthProvider(new MinervaOAuthProvider(this.context, this.tokenProvider)).withChildProfileVerifier(new DefaultChildProfileVerifier()).withUserControlVerifier(new DefaultUserControlVerifier()).build();
    }
}
