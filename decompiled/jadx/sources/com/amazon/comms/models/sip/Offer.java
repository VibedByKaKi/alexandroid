package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonInclude;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes20.dex */
public class Offer {
    private BundlePolicy bundlePolicy;
    private List<MediaStream> mediaStreams;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum BundlePolicy {
        MAXBUNDLE,
        MAXCOMPAT,
        BALANCED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class OfferBuilder {
        private BundlePolicy bundlePolicy;
        private List<MediaStream> mediaStreams;

        public Offer build() {
            return new Offer(this.mediaStreams, this.bundlePolicy, 0);
        }

        public OfferBuilder bundlePolicy(BundlePolicy bundlePolicy) {
            this.bundlePolicy = bundlePolicy;
            return this;
        }

        public OfferBuilder mediaStreams(List<MediaStream> list) {
            this.mediaStreams = list;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Offer.OfferBuilder(mediaStreams=", String.valueOf(this.mediaStreams), ", bundlePolicy=", String.valueOf(this.bundlePolicy), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private Offer(List<MediaStream> list, BundlePolicy bundlePolicy) {
        this.mediaStreams = list;
        this.bundlePolicy = bundlePolicy;
    }

    public static OfferBuilder builder() {
        return new OfferBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Offer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        if (!offer.canEqual(this)) {
            return false;
        }
        List<MediaStream> mediaStreams = getMediaStreams();
        List<MediaStream> mediaStreams2 = offer.getMediaStreams();
        if (mediaStreams != null ? !mediaStreams.equals(mediaStreams2) : mediaStreams2 != null) {
            return false;
        }
        BundlePolicy bundlePolicy = getBundlePolicy();
        BundlePolicy bundlePolicy2 = offer.getBundlePolicy();
        return bundlePolicy != null ? bundlePolicy.equals(bundlePolicy2) : bundlePolicy2 == null;
    }

    public BundlePolicy getBundlePolicy() {
        return this.bundlePolicy;
    }

    public List<MediaStream> getMediaStreams() {
        return this.mediaStreams;
    }

    public int hashCode() {
        List<MediaStream> mediaStreams = getMediaStreams();
        int hashCode = mediaStreams == null ? 43 : mediaStreams.hashCode();
        BundlePolicy bundlePolicy = getBundlePolicy();
        return ((hashCode + 59) * 59) + (bundlePolicy != null ? bundlePolicy.hashCode() : 43);
    }

    public void setBundlePolicy(BundlePolicy bundlePolicy) {
        this.bundlePolicy = bundlePolicy;
    }

    public void setMediaStreams(List<MediaStream> list) {
        this.mediaStreams = list;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Offer(mediaStreams=", String.valueOf(getMediaStreams()), ", bundlePolicy=", String.valueOf(getBundlePolicy()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public Offer() {
    }

    public /* synthetic */ Offer(List list, BundlePolicy bundlePolicy, int i) {
        this(list, bundlePolicy);
    }
}
