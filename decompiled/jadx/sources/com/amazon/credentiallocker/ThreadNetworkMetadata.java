package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@Generated
@XmlName("ThreadNetworkMetadata")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class ThreadNetworkMetadata {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.ThreadNetworkMetadata");
    private int credentialCount;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected int credentialCount;

        public ThreadNetworkMetadata build() {
            ThreadNetworkMetadata threadNetworkMetadata = new ThreadNetworkMetadata();
            populate(threadNetworkMetadata);
            return threadNetworkMetadata;
        }

        public void populate(ThreadNetworkMetadata threadNetworkMetadata) {
            threadNetworkMetadata.setCredentialCount(this.credentialCount);
        }

        public Builder withCredentialCount(int i) {
            this.credentialCount = i;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThreadNetworkMetadata) {
            return Integer.valueOf(getCredentialCount()).equals(Integer.valueOf(((ThreadNetworkMetadata) obj).getCredentialCount()));
        }
        return false;
    }

    public int getCredentialCount() {
        return this.credentialCount;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), Integer.valueOf(getCredentialCount()));
    }

    public void setCredentialCount(int i) {
        this.credentialCount = i;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCredentialCount(getCredentialCount());
        return builder;
    }

    public String toString() {
        return "ThreadNetworkMetadata(credentialCount=" + String.valueOf(this.credentialCount) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
