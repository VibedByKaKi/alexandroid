package com.amazon.comms.models.sip;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes20.dex */
public class AudioMediaConfiguration {
    private AcousticEchoCancellation acousticEchoCancellation;
    private AutomaticGainControl automaticGainControl;
    private NoiseReduction noiseReduction;
    private ResidualEchoSuppression residualEchoSuppression;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AudioMediaConfigurationBuilder {
        private AcousticEchoCancellation acousticEchoCancellation;
        private AutomaticGainControl automaticGainControl;
        private NoiseReduction noiseReduction;
        private ResidualEchoSuppression residualEchoSuppression;

        public AudioMediaConfigurationBuilder acousticEchoCancellation(AcousticEchoCancellation acousticEchoCancellation) {
            this.acousticEchoCancellation = acousticEchoCancellation;
            return this;
        }

        public AudioMediaConfigurationBuilder automaticGainControl(AutomaticGainControl automaticGainControl) {
            this.automaticGainControl = automaticGainControl;
            return this;
        }

        public AudioMediaConfiguration build() {
            return new AudioMediaConfiguration(this.automaticGainControl, this.noiseReduction, this.acousticEchoCancellation, this.residualEchoSuppression);
        }

        public AudioMediaConfigurationBuilder noiseReduction(NoiseReduction noiseReduction) {
            this.noiseReduction = noiseReduction;
            return this;
        }

        public AudioMediaConfigurationBuilder residualEchoSuppression(ResidualEchoSuppression residualEchoSuppression) {
            this.residualEchoSuppression = residualEchoSuppression;
            return this;
        }

        public String toString() {
            String valueOf = String.valueOf(this.automaticGainControl);
            String valueOf2 = String.valueOf(this.noiseReduction);
            return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("AudioMediaConfiguration.AudioMediaConfigurationBuilder(automaticGainControl=", valueOf, ", noiseReduction=", valueOf2, ", acousticEchoCancellation="), String.valueOf(this.acousticEchoCancellation), ", residualEchoSuppression=", String.valueOf(this.residualEchoSuppression), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public AudioMediaConfiguration(AutomaticGainControl automaticGainControl, NoiseReduction noiseReduction, AcousticEchoCancellation acousticEchoCancellation, ResidualEchoSuppression residualEchoSuppression) {
        this.automaticGainControl = automaticGainControl;
        this.noiseReduction = noiseReduction;
        this.acousticEchoCancellation = acousticEchoCancellation;
        this.residualEchoSuppression = residualEchoSuppression;
    }

    public static AudioMediaConfigurationBuilder builder() {
        return new AudioMediaConfigurationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AudioMediaConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioMediaConfiguration)) {
            return false;
        }
        AudioMediaConfiguration audioMediaConfiguration = (AudioMediaConfiguration) obj;
        if (!audioMediaConfiguration.canEqual(this)) {
            return false;
        }
        AutomaticGainControl automaticGainControl = getAutomaticGainControl();
        AutomaticGainControl automaticGainControl2 = audioMediaConfiguration.getAutomaticGainControl();
        if (automaticGainControl != null ? !automaticGainControl.equals(automaticGainControl2) : automaticGainControl2 != null) {
            return false;
        }
        NoiseReduction noiseReduction = getNoiseReduction();
        NoiseReduction noiseReduction2 = audioMediaConfiguration.getNoiseReduction();
        if (noiseReduction != null ? !noiseReduction.equals(noiseReduction2) : noiseReduction2 != null) {
            return false;
        }
        AcousticEchoCancellation acousticEchoCancellation = getAcousticEchoCancellation();
        AcousticEchoCancellation acousticEchoCancellation2 = audioMediaConfiguration.getAcousticEchoCancellation();
        if (acousticEchoCancellation != null ? !acousticEchoCancellation.equals(acousticEchoCancellation2) : acousticEchoCancellation2 != null) {
            return false;
        }
        ResidualEchoSuppression residualEchoSuppression = getResidualEchoSuppression();
        ResidualEchoSuppression residualEchoSuppression2 = audioMediaConfiguration.getResidualEchoSuppression();
        return residualEchoSuppression != null ? residualEchoSuppression.equals(residualEchoSuppression2) : residualEchoSuppression2 == null;
    }

    public AcousticEchoCancellation getAcousticEchoCancellation() {
        return this.acousticEchoCancellation;
    }

    public AutomaticGainControl getAutomaticGainControl() {
        return this.automaticGainControl;
    }

    public NoiseReduction getNoiseReduction() {
        return this.noiseReduction;
    }

    public ResidualEchoSuppression getResidualEchoSuppression() {
        return this.residualEchoSuppression;
    }

    public int hashCode() {
        AutomaticGainControl automaticGainControl = getAutomaticGainControl();
        int hashCode = automaticGainControl == null ? 43 : automaticGainControl.hashCode();
        NoiseReduction noiseReduction = getNoiseReduction();
        int hashCode2 = ((hashCode + 59) * 59) + (noiseReduction == null ? 43 : noiseReduction.hashCode());
        AcousticEchoCancellation acousticEchoCancellation = getAcousticEchoCancellation();
        int i = hashCode2 * 59;
        int hashCode3 = acousticEchoCancellation == null ? 43 : acousticEchoCancellation.hashCode();
        ResidualEchoSuppression residualEchoSuppression = getResidualEchoSuppression();
        return ((i + hashCode3) * 59) + (residualEchoSuppression != null ? residualEchoSuppression.hashCode() : 43);
    }

    public void setAcousticEchoCancellation(AcousticEchoCancellation acousticEchoCancellation) {
        this.acousticEchoCancellation = acousticEchoCancellation;
    }

    public void setAutomaticGainControl(AutomaticGainControl automaticGainControl) {
        this.automaticGainControl = automaticGainControl;
    }

    public void setNoiseReduction(NoiseReduction noiseReduction) {
        this.noiseReduction = noiseReduction;
    }

    public void setResidualEchoSuppression(ResidualEchoSuppression residualEchoSuppression) {
        this.residualEchoSuppression = residualEchoSuppression;
    }

    public String toString() {
        String valueOf = String.valueOf(getAutomaticGainControl());
        String valueOf2 = String.valueOf(getNoiseReduction());
        return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("AudioMediaConfiguration(automaticGainControl=", valueOf, ", noiseReduction=", valueOf2, ", acousticEchoCancellation="), String.valueOf(getAcousticEchoCancellation()), ", residualEchoSuppression=", String.valueOf(getResidualEchoSuppression()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public AudioMediaConfiguration() {
    }
}
