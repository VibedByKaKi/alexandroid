package com.amazon.dee.app.services.metrics.kinesis;

import com.amazon.dee.app.build.GradleBuild;
import com.amazon.dee.app.dependencies.ApplicationScope;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/DefaultKinesisEnvironment;", "Lcom/amazon/dee/app/services/metrics/kinesis/KinesisEnvironment;", "gradleBuild", "Lcom/amazon/dee/app/build/GradleBuild;", "<init>", "(Lcom/amazon/dee/app/build/GradleBuild;)V", "getKinesisMetricsStreamName", "", "getKinesisMetricsIdentityPoolId", "getKinesisMetricsAwsRegion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes5.dex */
public final class DefaultKinesisEnvironment implements KinesisEnvironment {

    @NotNull
    private final GradleBuild gradleBuild;

    @Inject
    public DefaultKinesisEnvironment(@NotNull GradleBuild gradleBuild) {
        gradleBuild.getClass();
        this.gradleBuild = gradleBuild;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.KinesisEnvironment
    @NotNull
    public String getKinesisMetricsAwsRegion() {
        return this.gradleBuild.getMetricsAwsKinesisRegion();
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.KinesisEnvironment
    @NotNull
    public String getKinesisMetricsIdentityPoolId() {
        return this.gradleBuild.getMetricsAwsKinesisCognitoIdentityPoolId();
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.KinesisEnvironment
    @NotNull
    public String getKinesisMetricsStreamName() {
        return this.gradleBuild.getMetricsAwsKinesisStreamName();
    }
}
